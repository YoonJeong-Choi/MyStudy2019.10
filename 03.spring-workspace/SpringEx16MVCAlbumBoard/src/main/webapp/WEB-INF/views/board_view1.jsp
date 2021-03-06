﻿<%@page import="com.exam.model1.Design_album01DAO"%>
<%@page import="com.exam.model1.Design_album01TO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<Design_album01TO> toLists = (ArrayList) request.getAttribute("toLists");
	String cpage = (String) request.getAttribute("cpage");

	// 로그인 처리
	// 로그인 설정시 사용할 flag
	int loginflag = 1;

	String id = "";
	if (session.getAttribute("id") == null) {
		// 로그인 세션이 없으면 로그인화면을 보여준다.
	} else if (session.getAttribute("id") != null) {
		// 로그인세션이 있다면 아래로
		loginflag = 0;
		id = (String) session.getAttribute("id");
	}

	// 본문 설정
	String seq = toLists.get(0).getSeq();
	String subject = toLists.get(0).getSubject();
	String writer = toLists.get(0).getWriter();
	String content = toLists.get(0).getContent().replaceAll("\n", "<br>");
	String[] mail = new String[2];
	if (!toLists.get(0).getMail().equals("")) {
		mail = toLists.get(0).getMail().split("@");
	} else {
		mail[0] = "";
		mail[1] = "";
	}
	String filename_ch = "";
	if (!toLists.get(0).getFilename_ch().equals("")) {
		filename_ch = "<img src='./upload/" + toLists.get(0).getFilename_ch()
				+ "' width='900' onerror='' /><br/>";
	}
	String hit = toLists.get(0).getHit();
	String wdate = toLists.get(0).getWdate();

	// 댓글 설정
	String com_writer = "";
	String com_comment = "";
	String com_date = "";
	String cseq = "";

	StringBuffer sbHTML = new StringBuffer();

	for (int i = 1; i < toLists.size(); i++) {
		com_writer = toLists.get(i).getCwriter();
		com_comment = toLists.get(i).getCcontent();
		com_date = toLists.get(i).getCom_date();
		cseq = toLists.get(i).getCseq();

		sbHTML.append("<tr>");
		sbHTML.append("<td class='coment_re' width=''><strong>" + com_writer + "</strong>");
		sbHTML.append(" (" + com_date + ")");
		sbHTML.append("<div class='coment_re_txt'>" + com_comment + "</div></td>");
		if (loginflag == 0) {
			// 댓글삭제부분
			sbHTML.append("<td class='coment_re' width='12%' align='right'>");

			sbHTML.append(
					"<form action='./reply_delete_ok.do' name='delcomment' method='post' onsubmit='return comdel("
							+ cseq + ")'>");

			sbHTML.append("<input type='hidden' name='seq' value='" + seq + "'>");
			sbHTML.append("<input type='hidden' name='cpage' value='" + cpage + "'>");
			sbHTML.append("<input type='hidden' name='cseq' value='" + cseq + "'>");

			sbHTML.append("		<input type='password' id='" + cseq + "pas' name='" + cseq
					+ "password' class='coment_input pR10' value='' />'");
			sbHTML.append(
					"		<input type='image' src='./images/icon_del.gif' alt='삭제' style='vertical-align: middle' />");
			sbHTML.append("</form>");
			sbHTML.append("</td>");

			sbHTML.append("</tr>");
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
<link rel="stylesheet" type="text/css" href="./css/board_view.css">
<script type="text/javascript">
	window.onload = function() {
		<%if (loginflag == 1) {%>
			<jsp:include page="loginJS.jsp"></jsp:include>
		<%} else {%>
			document.cfrm.cbutton.onclick = function() {
				if (document.cfrm.cwriter.value.trim() == '') {
					alert('글쓴이를 입력해 주세요.')
				return false;
				}
				if (document.cfrm.cpassword.value.trim() == '') {
					alert('비밀번호를 입력해 주세요.')
				}
			document.cfrm.submit();
			}
		<%}%>
	}

	var comdel = function(cseq) {
		var x = document.getElementById(cseq + 'pas').value;
		if (x == '') {
			alert('댓글을 삭제하려면 비밀번호를 입력해 주세요.');
			return false;
		}
	}
</script>

</head>

<body>
	<!-- 상단 디자인 -->
	<div class="contents1">
		<div class="con_title">
			<p style="margin: 0px; text-align: right">
				<img style="vertical-align: middle" alt=""
					src="./images/home_icon.gif" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>
			</p>
		</div>
		<!-- 로그인 시작 -->
		<%
			if (loginflag == 1) {
		%>
		<jsp:include page='loginform.jsp' />
		<%
			} else {
				// 로그인이 되어있다면 환영폼보여줌
		%>
		<jsp:include page='afterloginform.jsp'>
			<jsp:param value="<%=id%>" name="id" />
		</jsp:include>
		<%
			}
		%>
		<!-- 로그인 끝 -->
		<div class="contents_sub">
			<!--게시판-->
			<div class="board_view">
				<table>
					<tr>
						<th width="10%">제목</th>
						<td width="60%"><%=subject%></td>
						<th width="10%">등록일</th>
						<td width="20%"><%=wdate%></td>
					</tr>
					<tr>
						<th>글쓴이</th>
						<td><%=writer%></td>
						<th>조회</th>
						<td><%=hit%></td>
					</tr>
					<tr>
						<td colspan="4" height="200" valign="top"
							style="padding: 20px; line-height: 160%">
							<div id="bbs_file_wrap">
								<div>
									<%=filename_ch%><br />
								</div>
							</div> <%=content%>
						</td>
					</tr>
				</table>

				<%
					if (loginflag == 0) {
				%>
				<table>
					<%=sbHTML%>
				</table>

				<form action="./reply_ok.do" method="post" name="cfrm">
					<input type="hidden" value="<%=seq%>" name="seq"> <input
						type="hidden" value="<%=cpage%>" name="cpage">
					<table>
						<tr>
							<td width="94%" class="coment_re">글쓴이 <input type="text"
								name="cwriter" maxlength="5" class="coment_input" />&nbsp;&nbsp;
								비밀번호 <input type="password" name="cpassword"
								class="coment_input pR10" />&nbsp;&nbsp;
							</td>
							<td width="6%" class="bg01"></td>
						</tr>
						<tr>
							<td class="bg01"><textarea name="ccontent" cols="" rows=""
									class="coment_input_text"></textarea></td>
							<td align="right" class="bg01">
								<button id="cbutton" type="button" class="btn_re btn_txt01">댓글등록</button>
							</td>
						</tr>
					</table>
				</form>
				<%
					}
				%>
			</div>
			<div class="btn_area">
				<div class="align_left">
					<button type="button" class="btn_list btn_txt02"
						style="cursor: pointer;"
						onclick="location.href='./list.do?cpage=<%=cpage%>'">목록</button>
				</div>
				<div class="align_right">
					<button type="button" class="btn_list btn_txt02"
						style="cursor: pointer;"
						onclick="location.href='./modify.do?seq=<%=seq%>&cpage=<%=cpage%>'">수정</button>
					<button type="button" class="btn_list btn_txt02"
						style="cursor: pointer;"
						onclick="location.href='./delete.do?seq=<%=seq%>&cpage=<%=cpage%>'">삭제</button>
					<button type="button" class="btn_write btn_txt01"
						style="cursor: pointer;"
						onclick="location.href='./write.do?cpage=<%=cpage%>'">쓰기</button>
				</div>
			</div>
			<!--//게시판-->
		</div>
		<!-- 하단 디자인 -->
	</div>

</body>
</html>
