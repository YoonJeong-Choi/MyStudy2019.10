<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = "C:/java/OneDrive/Java/eclipse/jsp-workspace/MyStudy/WebContent/upload";
	int filesize = 1024 * 1024 * 2;
	String type = "utf-8";
	MultipartRequest multi = new MultipartRequest(request, path, filesize, type,
			new DefaultFileRenamePolicy());
	out.println("전송완료");
%>
