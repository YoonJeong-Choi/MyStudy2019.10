<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	request.setCharacterEncoding("utf-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="./zipcodeSearch01.jsp" method="post">
		동 : <input type="text" name="dong"> <input type="submit"
			value="검색">
	</form>

	<hr>

	<!-- dong에대한 값이 있다면 검색시작 -->
	<c:if test="${ not empty param.dong }">

		<sql:query dataSource="jdbc/mariadb2" var="zc"
			sql="select * from zipcode where dong like '%${param.dong}%'" />

		<!-- DB에서 결과가 있다면 실행 -->
		<c:choose>
			<c:when test="${ not empty zc.rows }">
				<table border="1">
					<tr>
						<c:forEach var="column" items="${ zc.columnNames }">
							<td>${column}</td>
						</c:forEach>
					</tr>

					<c:forEach var="result" items="${zc.rows}">
						<tr>
							<td>${result.zipcode}</td>
							<td>${result.sido}</td>
							<td>${result.gugun}</td>
							<td>${result.dong}</td>
							<td>${result.ri}</td>
							<td>${result.bunji}</td>
							<td>${result.seq}</td>
						</tr>

					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				결과가 없습니다.
			</c:otherwise>
		</c:choose>
	</c:if>
</body>
</html>
