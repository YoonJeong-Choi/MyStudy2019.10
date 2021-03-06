<%@page import="MyBatisModelPagingModel.MyBatisPagingBoardTO"%>
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
	MyBatisPagingBoardTO to = (MyBatisPagingBoardTO) request.getAttribute("to");

	String writer = to.getWriter();
	String subject = to.getSubject();
	String seq = to.getSeq();
	String cpage = request.getParameter("cpage");
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/board_write.css">

<script type="text/javascript">
	window.onload = function() {
		// 버튼을 눌렀을 때 비밀번호가 비어있으면 입력 알림창을,
		// 비밀번호가 틀려도 알림창을,
		// 조건을 다 충족하면 다음페이지로 넘어가게 해준다.
		document.getElementById('submit1').onclick = function() {
			if (document.frm.password.value.trim() == '') {
				alert('비밀번호를 입력해주세요.');
				return false;
			}
			document.frm.submit();
		}
	}
</script>
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
		<form action="./deleteOk.do" method="post" name="frm">
			<input type="hidden" name="seq" value="<%=seq%>">
			<input type="hidden" name="action" value="deleteOk">
			<div class="contents_sub">
				<!--게시판-->
				<div class="board_write">
					<table>
						<tr>
							<th class="top">글쓴이</th>
							<td class="top" colspan="3"><input type="text" name="writer"
								value="<%=writer%>" class="board_view_input_mail" maxlength="5"
								readonly /></td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3"><input type="text" name="subject"
								value="<%=subject%>" class="board_view_input" readonly /></td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td colspan="3"><input type="password" name="password"
								value="" class="board_view_input_mail" /></td>
						</tr>
					</table>
				</div>

				<div class="btn_area">
					<div class="align_left">

						<button type="button" class="btn_list btn_txt02"
							style="cursor: pointer;"
							onclick="location.href='./list.do?cpage=<%=cpage%>'">목록</button>
						<!-- 보기버튼을 누르면 글로 다시 돌아간다. -->
						<button type="button" class="btn_list btn_txt02"
							style="cursor: pointer;"
							onclick="location.href='./view.do?seq=<%=seq%>&cpage=<%=cpage%>'">보기</button>
					</div>
					<div class="align_right">
						<button type="button" id="submit1" class="btn_write btn_txt01"
							style="cursor: pointer;">삭제</button>
					</div>
				</div>
				<!--//게시판-->
			</div>
		</form>
	</div>
	<!-- 하단 디자인 -->

</body>
</html>
