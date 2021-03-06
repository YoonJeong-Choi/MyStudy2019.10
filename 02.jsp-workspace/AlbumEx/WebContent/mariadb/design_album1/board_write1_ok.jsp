<%@page import="java.io.IOException"%>
<%@page import="java.io.EOFException"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="AlbumBeans.Design_album01TO"%>
<%@page import="AlbumBeans.Design_album01DAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 이전페이지에서 정보 받아오기
	Design_album01TO to = new Design_album01TO();
	MultipartRequest multi = null;

	try {
		String path = "C:/java/OneDrive/Java/eclipse/jsp-workspace/AlbumEx/WebContent/upload";
		int filesize = 1024 * 1024 * 2;

		multi = new MultipartRequest(request, path, filesize, "utf-8", new DefaultFileRenamePolicy());

		if (multi.getOriginalFileName("upload") == null) {
			to.setFilename_ori("");
			to.setFilename_ch("");
		} else {
			to.setFilename_ori(multi.getOriginalFileName("upload"));
			to.setFilename_ch(multi.getFilesystemName("upload"));
		}

		to.setWriter(multi.getParameter("writer"));
		to.setSubject(multi.getParameter("subject"));
		if (!multi.getParameter("mail1").trim().equals("") && !multi.getParameter("mail2").trim().equals("")) {
			to.setMail(multi.getParameter("mail1") + "@" + multi.getParameter("mail2"));
		} else {
			to.setMail("");
		}

		to.setPassword(multi.getParameter("password"));
		to.setContent(multi.getParameter("content"));
		to.setWip(request.getRemoteAddr());

		// DB 연결
		Design_album01DAO dao = new Design_album01DAO();

		// DB 저장
		int flag = dao.board_write1_ok(to);

		out.println("<script type='text/javascript'>");
		if (flag == 1) {
			out.println("alert('글쓰기 성공')");
			out.println("location.href='board_list1.jsp'");
		} else {
			out.println("alert('글쓰기 실패')");
			out.println("history.back()");
		}
		out.println("</script>");

	} catch (EOFException e) {
		System.out.println("error : " + e.getMessage());
	} catch (IOException e) {
		System.out.println("error : " + e.getMessage());
	}
%>