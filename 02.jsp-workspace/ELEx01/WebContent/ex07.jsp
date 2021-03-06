<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model1.BoardTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model1.BoardTO"%>
<%
	BoardTO to1 = new BoardTO();
	to1.setSubject("제목1");
	to1.setWriter("작성자1");

	BoardTO to2 = new BoardTO();
	to2.setSubject("제목2");
	to2.setWriter("작성자2");

	BoardTO[] list = { to1, to2 };
	request.setAttribute("list", list);

	ArrayList<BoardTO> list2 = new ArrayList();
	list2.add(to1);
	list2.add(to2);
	request.setAttribute("list2", list2);

	HashMap<String, BoardTO> list3 = new HashMap();
	list3.put("to1", to1);
	list3.put("to2", to2);

	request.setAttribute("list3", list3);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 객체적으로 기술하는 방법 -->
	${ list[0].subject }
	<br> ${ list[1].subject }

	<!-- 이런방식도 가능함 -->
	<br>
	<br> ${ list[0]["subject"] }
	<br> ${ list[1]["subject"] }
	
	<!-- 배열의 범위를 벗어나도 무시당할뿐 에러발생하지않음 -->
	<br> ${ list[5].subject }
	<hr>
	
	<!-- ArrayList안에 있어도 가능 -->
	${ list2[0].subject }
	<br> ${ list2[1].subject }
	<hr>
	
	<!-- HashMap안에 있어도 가능 -->
	${ list3.to1.subject }
	<br> ${ list3.to2.subject }
	<br>
</body>
</html>