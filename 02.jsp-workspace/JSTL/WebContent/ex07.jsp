<%@page import="model1.BookBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	ArrayList<BookBean> bookList = new ArrayList<BookBean>();
	bookList.add(new BookBean("The Secret", "Byren, Rhonda", "Atria Books"));
	bookList.add(new BookBean("The Last Lecture", "Randy Pausch", "hyperion"));

	String[] bookCode = { "소설", "역사", "인문", "정치", "미술", "종교", "여행", "과학", "만화", "건강" };
%>
<!-- ArrayList인 bookList 안에 있는 데이터를 반복문을 이용하여 출력중 -->
<c:set var="list" value="<%=bookList%>" />
<c:forEach items="${list}" var="item">
	${item.title} / ${item.author} / ${item.publisher}<br>
</c:forEach>
<hr>

<!-- 문자열 배열인 bookCode 안에 있는 데이터를 반복문을 이용하여 출력중 -->
<c:set var="code" value="<%=bookCode%>" />
<c:forEach var="item" items="${code}">
	<c:out value="${item}" /> 
</c:forEach>
<br>
<!-- 참고로 JSP에서 선언한 것들을 꼭 JSTL에서 변수에 다시 넣을 필요는 없음 -->
<c:forEach var="item" items="<%=bookCode %>">
	<c:out value="${item}" /> 
</c:forEach>
<hr>

<!-- 반복문을 이용하여 구구단 출력 -->
<c:forEach var="i" begin="2" end="9">
	<c:forEach var="j" begin="1" end="9">
		${i}*${j} = ${i*j} / 
	</c:forEach>
	<br>
</c:forEach>
<hr>

<!-- 반복문을 이용하여 숫자를 출력하는데, 2단계씩 건너뛴다. -->
<c:forEach var="k" begin="1" end="10" step="2">
	${k}
</c:forEach>
<hr>

<!-- /를 기준으로 끊어서 출력해준다. -->
<c:forTokens items="소설/역사/인문/정치/미술/종교/여행/과학/만화/건강" delims="/"
	var="token">
	${token}
</c:forTokens>

