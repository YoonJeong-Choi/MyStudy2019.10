<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<sql:setDataSource
	url="jdbc:mysql://127.0.0.7:3306/employees"
	driver="org.mariadb.jdbc.Driver"
	user="root"
	password="123456"
	var="ds"
 />
<sql:query dataSource="${ds}" var="rs" sql="select * from dept" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="columnName" items="${rs.columnNames}">
		${columnName}<br>
	</c:forEach>
	<hr>
	<c:forEach var="data" items="${rs.rows}">
		${data.deptno} / ${data.dname} / ${data.deptno}<br> 
	</c:forEach>
	<hr>
	<c:forEach var="data" items="${rs.rows}">
		${data["deptno"]} / ${data["dname"]} / ${data["deptno"]}<br> 
	</c:forEach>
</body>
</html>
