<%@page import="java.util.HashMap"%>
<%@page import="model1.BoardTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- BoardTO to1 = new BoardTO()와 같은 뜻이다 -->
<c:set var="to1" value="<%=new BoardTO()%>" />
<!-- target : 객체 변수 / property : 멤버필드 / value : 값 -->
<c:set target="${ to1 }" property="subject" value="제목1" />
<c:set target="${ to1 }" property="writer">작성자1</c:set>

<c:set var="to2" value="<%=new BoardTO()%>" />
<c:set target="${ to2 }" property="subject" value="제목2" />
<c:set target="${ to2 }" property="writer">작성자2</c:set>

<c:set var="hm" value="<%=new HashMap()%>" />
<c:set target="${ hm }" property="to1" value="${to1 }" />
<c:set target="${ hm }" property="to2" value="${to2 }" />

${to1.subject}
<br>${to1.writer}
<hr>
<!-- HashMap에 넣은 core도 EL로 빼올 수 있다. -->
${ hm.to1.subject }
<br>${ hm.to1.writer }
