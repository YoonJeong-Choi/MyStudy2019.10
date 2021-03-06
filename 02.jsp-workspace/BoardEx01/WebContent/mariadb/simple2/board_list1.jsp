<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="javax.naming.Context"%>
<%@ page import="javax.naming.InitialContext"%>
<%@ page import="javax.naming.NamingException"%>
<%@ page import="javax.sql.DataSource"%>

<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>

<%
	request.setCharacterEncoding("utf-8");

	int cpage = 1;
	// 이전페이지에서 받아온 cpage값이 
	if (request.getParameter("cpage") != null && !request.getParameter("cpage").equals("")) {
		// cpage값이 null이면 1페이지가 보이고,
		// cpage값이 정해지면 해당 페이지가 보인다.
		cpage = Integer.parseInt(request.getParameter("cpage"));
	}

	// 한 페이지당 출력 데이터 개수
	int recordPerPage = 10;

	String url = "jdbc:mysql://127.0.0.1:3306/project";
	String user = "project";
	String pass = "123456";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
%>
<%
	// java 코드는 위에서 선언하고, 아래에서 출력만 해준다.
	StringBuffer sbHtml = new StringBuffer();
	int totalRecord = 0;
	try {
		Context initCtx = new InitialContext();
		// 톰캣의 환경설정에 접근
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		// 커넥션 풀링에 접근
		DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb");

		// 커넥션 풀링에서 커넥션을 얻음
		conn = dataSource.getConnection();

		// datediff(구분자, 시작시간, 끝나는시간) 시작시간과 끝나는 시간의 차이를 구해준다.
		// 구분자는 년,월,일,시 등등..필요한걸 넣으면 된다. 지금은 일차이를 구하고싶으니 d를 넣어준다. -> 구분자 넣으니 안된다
		String sql = "select seq, subject, writer, date_format(wdate, '%Y-%m-%d') wdate, hit, datediff(now(), wdate) diff from board1 order by seq desc";

		pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		rs = pstmt.executeQuery();

		// 커서를 제일 마지막으로 옮긴 후 그곳이 몇번째 행인지 읽고, 다시 처음으로 돌아온다.
		rs.last();
		totalRecord = rs.getRow();
		rs.beforeFirst();

		int skip = (cpage - 1) * recordPerPage;
		if (skip != 0) {
			rs.absolute(skip);
		}

		// skip번부터 recordPerPage개(10개)만큼 읽어온다
		for (int i = 0; i < recordPerPage && rs.next(); i++) {
			String seq = rs.getString("seq");
			String subject = rs.getString("subject");
			String writer = rs.getString("writer");
			String wdate = rs.getString("wdate");
			String hit = rs.getString("hit");
			int diff = rs.getInt("diff");

			sbHtml.append("<tr>");
			sbHtml.append("<td>&nbsp;</td>");
			sbHtml.append("<td>" + seq + "</td>");
			// 이부분이 board_view로 넘어가는 부분이다.(제목 누르면 글을 볼수있게 해주는곳)
			// seq를 가지고가서 해당 글을 가져오게 해주자.
			// 그리고 만든지 하루가 지나면 제목 옆의 그림이 사라지게 해주자.
			sbHtml.append("<td class='left'><a href='board_view1.jsp?seq=" + seq + "'>" + subject);
			if (diff == 1) {
				sbHtml.append("</a>&nbsp;<img src='../../images/icon_hot.gif' alt='HOT'>");
			}
			sbHtml.append("</td>");

			sbHtml.append("<td>" + writer + "</td>");
			sbHtml.append("<td>" + wdate + "</td>");
			sbHtml.append("<td>" + hit + "</td>");
			sbHtml.append("<td>&nbsp;</td>");
			sbHtml.append("</tr>");
		}

	} catch (NamingException e) {
		System.out.println("[error1] : " + e.getMessage());
	} catch (SQLException e) {
		System.out.println("error2 : " + e.getMessage());
	} finally {
		if (rs != null) {
			rs.close();
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/board_list.css">
</head>

<body>
	<!-- 상단 디자인 -->
	<div class="con_title">
		<h3>게시판</h3>
		<p>
			HOME &gt; 게시판 &gt; <strong>게시판</strong>
		</p>
	</div>
	<div class="con_txt">
		<div class="contents_sub">
			<div class="board_top">
				<div class="bold">
					총 <span class="txt_orange"><%=totalRecord%></span>건
				</div>
			</div>

			<!--게시판-->
			<div class="board">
				<table>
					<tr>
						<th width="3%">&nbsp;</th>
						<th width="5%">번호</th>
						<th>제목</th>
						<th width="10%">글쓴이</th>
						<th width="17%">등록일</th>
						<th width="5%">조회</th>
						<th width="3%">&nbsp;</th>
					</tr>
					<!-- 게시판 글 시작.DB에서 가져온 글목록을 이곳에 넣어주어야한다. -->
					<!-- 위에 있는 DB에서 빼온 글목록을 이곳에서 출력한다. -->
					<%=sbHtml%>
					<!-- 게시판 글 끝 -->
				</table>
			</div>
			<!--//게시판-->

			<div class="align_right">
				<button type="button" class="btn_write btn_txt01"
					style="cursor: pointer;" onclick="location.href='board_write1.jsp'">쓰기</button>
			</div>
		</div>
	</div>
	<!--//하단 디자인 -->

</body>
</html>
