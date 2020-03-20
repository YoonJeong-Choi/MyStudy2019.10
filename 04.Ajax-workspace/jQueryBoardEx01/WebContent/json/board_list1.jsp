<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="mysql.model1.BoardTO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="org.json.simple.JSONArray"%>
<%@ page import="org.json.simple.JSONObject"%>

<%
	ArrayList<BoardTO> boardLists = (ArrayList) request.getAttribute("boardLists");

	JSONObject result = new JSONObject();
	result.put("flag", "0");

	JSONArray jsonArray = new JSONArray();
	for (BoardTO to : boardLists) {
		JSONObject obj = new JSONObject();

		obj.put("seq", to.getSeq());
		obj.put("subject", to.getSubject());
		obj.put("writer", to.getWriter());
		obj.put("wdate", to.getWdate());
		obj.put("hit", to.getHit());
		obj.put("wgap", to.getWgap());
		
		jsonArray.add(obj);
	}
	
	result.put("data", jsonArray);
	
	out.println(result);
%>
