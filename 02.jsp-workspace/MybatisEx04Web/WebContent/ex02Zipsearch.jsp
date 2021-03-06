<%@page import="model1.ZipcodeSearchTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.IOException"%>
<%@ page import="java.io.InputStream"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="org.apache.ibatis.io.Resources"%>
<%@ page import="org.apache.ibatis.session.SqlSession"%>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory"%>
<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder"%>

<%
	request.setCharacterEncoding("utf-8");
	StringBuffer sbHtml = null;

	if (request.getParameter("dongSearch") != null) {
		String dongSearch = request.getParameter("dongSearch");

		String resource = "myBatisConfig.xml";
		InputStream is = null;
		SqlSession sqlSession = null;

		sbHtml = new StringBuffer();
		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			sqlSession = sqlSessionFactory.openSession();

			ArrayList<ZipcodeSearchTO> lists = (ArrayList) sqlSession.selectList("selectList2",
					"%" + dongSearch + "%");

			if (lists.isEmpty()) {
				sbHtml.append("검색 결과가 없습니다.");
			} else {
				sbHtml.append("<table width='600' border=1>");

				for (ZipcodeSearchTO to : lists) {
					sbHtml.append("<tr>");

					sbHtml.append("<td>" + to.getZipcode() + "</td>");
					sbHtml.append("<td>" + to.getSido() + "</td>");
					sbHtml.append("<td>" + to.getGugun() + "</td>");
					sbHtml.append("<td>" + to.getDong() + "</td>");
					sbHtml.append("<td>" + to.getRi() + "</td>");
					sbHtml.append("<td>" + to.getBunji() + "</td>");
					sbHtml.append("<td>" + to.getSeq() + "</td>");

					sbHtml.append("</tr>");
				}
				sbHtml.append("</table>");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
			if (is != null) {
				is.close();
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex02Zipsearch.jsp" method="post">
		동을 입력하세요 : <input type="text" name="dongSearch" /> <input
			type="submit" value="검색" />
	</form>
	<hr>
	<%
		if (sbHtml != null) {
			out.println(sbHtml);
		}
	%>
</body>
</html>