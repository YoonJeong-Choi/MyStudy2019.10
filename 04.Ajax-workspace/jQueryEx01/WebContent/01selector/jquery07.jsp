<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jquery 라이브러리 호출하기 -->
<!-- 개발버전 -->
<!-- <script type="text/javascript" src="./js/jquery-3.4.1.js"></script> -->
<!-- 서비스버전 -->
<!-- <script type="text/javascript" src="./js/jquery-3.4.1.min.js"></script> -->
<!-- CDN 서비스버전 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// > 자손, ' ' 후손
		$('div *').css('color', 'red');
	});
</script>
</head>
<body>
	<div>
		<ul>
			<li>사과</li>
			<li>수박</li>
			<li>딸기</li>
		</ul>
		<ul>
			<li>사과</li>
			<li>수박</li>
			<li>딸기</li>
		</ul>
	</div>
</body>
</html>