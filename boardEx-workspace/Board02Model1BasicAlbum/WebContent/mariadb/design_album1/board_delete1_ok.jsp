<%@page import="AlbumBeans.Design_album01TO"%>
<%@page import="AlbumBeans.Design_album01DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String seq = request.getParameter("seq");
	String password = request.getParameter("password");

	Design_album01TO to = new Design_album01TO();

	to.setSeq(seq);
	to.setPassword(password);

	Design_album01DAO dao = new Design_album01DAO();

	int flag = dao.board_delete1_ok(to);

	out.println("<script type='text/javascript'>");
	
	if (flag == 1) {
		out.println("alert('삭제에 성공했습니다.')");
		out.println("location.href='board_list1.jsp'");
	} else if (flag == 0) {
		out.println("alert('비밀번호를 다시 확인해 주세요.')");
		out.println("history.back()");
	} else {
		out.println("alert('삭제에 실패했습니다.')");
		out.println("history.back()");
	}
	
	out.println("</script>");
%>