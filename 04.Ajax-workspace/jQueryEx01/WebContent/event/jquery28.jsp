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
		/* $('h2').on({
			mouseenter : function() {
				$(this).addClass('reverse');
			},
			mouseleave : function() {
				$(this).removeClass('reverse');
			},
		}) */
		$('h2').hover(function() {
			$(this).addClass('reverse');
		}, function() {
			$(this).removeClass('reverse');
		});

		$('button').click(function() {
			console.log(this + " / button click");
		});

	});
</script>
</head>
<body>
<button>버튼</button>
	<h2>Hello jQuery</h2>
	<h2>Hello jQuery</h2>
</body>
</html>