<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	out.println("start<hr>");

	String data1 = "value2";

	request.setAttribute("data2", "value2");
%>
<jsp:include page="attribute02_sub.jsp">
	<jsp:param value="<%=data1%>" name="data1" />
</jsp:include>
<%
	out.println("<hr>end");
%>
