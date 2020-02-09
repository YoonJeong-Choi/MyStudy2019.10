<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (session.getAttribute("sess_id") == null) {
		// 만약 세션에 id값이 있다면
		// 즉 이전에 로그인을 해서 이 페이지에 도달한것이라면 페이지를 보여주지만,
		// 그게 아니라 세션의 id값이 없다면 이곳에서 로그인 알림창이 띄워지고
		// 로그인 페이지로 가게된다.
		out.println("<script type='text/javascript'>");
		out.println("alert('로그인을 해야합니다.')");
		out.println("location.href='loginForm.jsp';");
		out.println("</script>");
	} else {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	loginComplete.jsp
	<br> 로그인 성공.
	<hr>
	<a href="logOut.jsp">로그아웃</a>
</body>
</html>
<%
	}
%>

