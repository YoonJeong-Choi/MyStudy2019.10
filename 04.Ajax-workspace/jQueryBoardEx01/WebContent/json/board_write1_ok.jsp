<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="mysql.model1.BoardTO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="org.json.simple.JSONArray"%>
<%@ page import="org.json.simple.JSONObject"%>

<%
	JSONObject result = new JSONObject();
	result.put("flag", (Integer) request.getAttribute("flag"));

	out.println(result);
%>