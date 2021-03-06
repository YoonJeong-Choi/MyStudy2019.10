<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 배열 선언 -->
	<c:set var="intArr" value="<%=new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }%>" />
	${ intArr[0] }<br>
	${ intArr[3] }<br>
	<hr>
	<!-- 반복문으로 출력 -->
	<c:forEach var="i" items="${ intArr }">
		${ i } 
	</c:forEach>
	<hr>
	<!-- begin과 end를 이용하여 범위 지정 가능 -->
	<c:forEach var="i" items="${ intArr }" begin="2" end="4">
		${ i } 
	</c:forEach>
	<hr>
	<!-- 홍길동, 박문수, 이몽룡의 값을 가진 문자열 배열 선언 후 내용 확인 -->
	<c:set var="names" value='<%=new String[] { "홍길동", "박문수", "이몽룡"} %>' />
	<c:forEach var="name" items="${ names }">
		${ name } /
	</c:forEach>
</body>
</html>
