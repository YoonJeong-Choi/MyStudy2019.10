﻿<%@page import="AlbumBeans.Design_album01TO"%>
<%@page import="AlbumBeans.Design_album01DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String seq = request.getParameter("seq");
String cpage = request.getParameter("cpage");
	Design_album01DAO dao = new Design_album01DAO();

	Design_album01TO to = new Design_album01TO();

	to.setSeq(seq);
	to = dao.board_delete1(to);

	String writer = to.getWriter();
	String subject = to.getSubject();
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/board_write.css">
<script type="text/javascript">
	window.onload = function() {
		document.frm.button1.onclick = function() {
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
	<div class="contents1">
		<div class="con_title">
			<p style="margin: 0px; text-align: right">
				<img style="vertical-align: middle" alt=""
					src="../../images/home_icon.gif" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>
			</p>
		</div>

		<form action="board_delete1_ok.jsp" method="post" name="frm">
			<input type="hidden" value="<%=seq%>" name="seq">
			<div class="contents_sub">
				<!--게시판-->
				<div class="board_write">
					<table>
						<tr>
							<th class="top">글쓴이</th>
							<td class="top" colspan="3"><input type="text" name="writer"
								value="<%=writer%>" class="board_view_input_mail"
								maxlength="5" /></td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3"><input type="text" name="subject"
								value="<%=subject%>" class="board_view_input" /></td>
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
							onclick="location.href='board_list1.jsp?cpage=<%=cpage%>'">목록</button>
						<button type="button" class="btn_list btn_txt02"
							style="cursor: pointer;"
							onclick="location.href='board_view1.jsp?seq=<%=seq%>&cpage=<%=cpage%>'">보기</button>
					</div>
					<div class="align_right">
						<button type="button" name="button1" class="btn_write btn_txt01"
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
