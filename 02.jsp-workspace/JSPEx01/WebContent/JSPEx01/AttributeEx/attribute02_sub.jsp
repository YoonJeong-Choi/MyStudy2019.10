<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String data1 = request.getParameter("data1");
	String data2 = (String) request.getAttribute("data2");
	String data3 = request.getParameter("data3");

	out.println("My name is attribute02_sub.jsp<br>");
	out.println("sub에서 보여줍니다. data1 : " + data1 + "<br>");
	out.println("sub에서 보여줍니다. data2 : " + data2 + "<br>");
	out.println("sub에서 보여줍니다. data3 : " + data3 + "<br>");
%>
