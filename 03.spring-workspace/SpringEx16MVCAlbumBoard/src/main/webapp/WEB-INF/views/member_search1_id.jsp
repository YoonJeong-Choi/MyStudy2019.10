<%@page import="com.exam.model1.Design_albumMemberTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Design_albumMemberTO to = (Design_albumMemberTO) session.getAttribute("to");
	String name = to.getName();
	String id = to.getId();
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
</head>

<body>
	<!-- 상단 디자인 -->
	<div class="contents1">
		<!-- 아이디찾기 결과 -->
		<div class="contents_sub">
			<div class="board_write">
				<table>
					<tr>
						<td class="top" colspan="3"><%=name%>님의 id는 <%=id%> 입니다.</td>
					</tr>
				</table>
			</div>
			<div class="btn_area">
				<div class="align_right">
					<input type="button" value="닫기" class="btn_write btn_txt01"
						style="cursor: pointer;" onclick="self.close()" />
				</div>
			</div>
			<!-- // 아이디찾기 결과 -->
		</div>
	</div>
</body>
</html>
