<%@page import="AlbumBeans.Design_album01DAO"%>
<%@page import="AlbumBeans.Design_album01TO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = "C:/Java/OneDrive/Java/eclipse/jsp-workspace/AlbumEx/WebContent/upload";
	int filesize = 1024 * 1024 * 2;
	MultipartRequest multi = new MultipartRequest(request, path, filesize, "utf-8",
			new DefaultFileRenamePolicy());

	Design_album01TO to = new Design_album01TO();
	
	String cpage = multi.getParameter("cpage");

	to.setSeq(multi.getParameter("seq"));
	to.setPassword(multi.getParameter("password"));
	to.setSubject(multi.getParameter("subject"));
	to.setContent(multi.getParameter("content"));

	if (!multi.getParameter("mail1").trim().equals("") && !multi.getParameter("mail2").trim().equals("")) {
		to.setMail(multi.getParameter("mail1") + "@" + multi.getParameter("mail2"));
	} else {
		to.setMail("");
	}

	if (multi.getFile("upload") != null) {
		to.setFilename_ori(multi.getOriginalFileName("upload"));
		to.setFilename_ch(multi.getFilesystemName("upload"));
	} else {
		to.setFilename_ori("");
		to.setFilename_ch("");
	}

	Design_album01DAO dao = new Design_album01DAO();

	int flag = dao.board_modify1_ok(to);
	
	out.println("<script type='text/javascript'>");
	if (flag == 0) {
		out.println("alert('비밀번호를 다시 확인해주세요.');");
		out.println("history.back();");
	} else if (flag == 1) {
		out.println("alert('수정되었습니다.')");
		out.println("location.href='board_view1.jsp?seq=" + to.getSeq() + "&cpage=" + cpage + "'");
	} else {
		out.println("alert('수정에 실패하였습니다.');");
		out.println("history.back();");
	}
	out.println("</script>");
%>