<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jquery 라이브러리 호출하기 -->
<!-- 서비스버전 -->
<!-- <script type="text/javascript" src="./js/jquery-3.4.1.min.js"></script> -->
<!-- CDN 서비스버전 -->
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> -->
<!-- 개발버전 -->
<script type="text/javascript" src="../js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.outer').mouseover(function() {
			$('body').append('<h3>MOUSEOVER</h3>');
		}).mouseenter(function() {
			$('body').append('<h3>MOUSEENTER</h3>');
		})
	});
</script>
<style type="text/css">
.outer {
	width: 200px;
	height: 200px;
	background: orange;
	padding: 50px;
	margin: 10px
}

.inner {
	width: 100%;
	height: 100%;
	background: red
}
</style>
</head>
<body>
	<div class="outer">
		<div class="inner"></div>
	</div>
</body>
</html>