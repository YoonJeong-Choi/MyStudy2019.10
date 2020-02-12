﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/board_write.css">
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('searchId').onclick = function() {
			alert( 'searchId()' );	
		};
		
		document.getElementById('searchPasswd').onclick = function() {
			alert( 'searchPasswd()' );	
		};
	};
</script>
</head>

<body>
<!-- 상단 디자인 -->
<div class="contents1"> 
	<div class="con_title"> 
		<p style="margin: 0px; text-align: right">
			<img style="vertical-align: middle" alt="" src="../../images/home_icon.gif" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>
		</p>
	</div> 

	<!-- 로그인 시작 -->
	<form action="board_list1_login_ok" method="">
		<div class="con_title"> 
			<p style="margin: 0px; text-align: right">
				아이디 : <input type="text" name="id" class="board_login_input" maxlength="5"/>
				비밀번호 : <input type="password" name="password" class="board_login_input"/>
				<input type="button" value="로 그 인" class="btn_write btn_txt01" style="cursor: pointer;" />
				<input type="button" value="회원 가입" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='member_write1.jsp'" /> 		
			</p>
		</div>
	</form>
	<div class="con_title"> 
		<p style="margin: 0px; text-align: right">
			<input type="button" id="searchId" value="아이디 찾기" class="btn_write btn_txt01" style="cursor: pointer;" />
			<input type="button" id="searchPasswd" value="비밀번호 찾기" class="btn_write btn_txt01" style="cursor: pointer;" />
		</p>
	</div> 
	<!-- 로그인 끝 -->
	
	<form action="" method="post" name="">
		<div class="contents_sub">
		<!--게시판-->
			<div class="board_write">
				<table>
				<tr>
					<th class="top">아이디</th>
					<td class="top" colspan="3"><input type="text" name="id" value="" class="board_write_input_mail" maxlength="5" /></td>
				</tr>
				<tr>
					<th>이름</th>
					<td colspan="3"><input type="text" name="writer" value="" class="board_write_input" /></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td colspan="3"><input type="password" name="password" value="" class="board_write_input_mail"/></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td colspan="3"><input type="text" name="mail1" value="" class="board_write_input_mail"/> @ <input type="text" name="mail2" value="" class="board_write_input_mail"/></td>
				</tr>
				</table>
				
				<table>	
				<tr>
					<br />
					<td style="text-align:left;border:1px solid #e0e0e0;background-color:f9f9f9;padding:5px">
						<div style="padding-top:7px;padding-bottom:5px;font-weight:bold;padding-left:7px;font-family: Gulim,Tahoma,verdana;">※ 개인정보 수집 및 이용에 관한 안내</div>
						<div style="padding-left:10px;">
							<div style="width:97%;height:95px;font-size:11px;letter-spacing: -0.1em;border:1px solid #c5c5c5;background-color:#fff;padding-left:14px;padding-top:7px;"> 
								 1. 수집 개인정보 항목 : 회사명, 담당자명, 메일 주소, 전화번호, 홈페이지 주소, 팩스번호, 주소 <br />
								 2. 개인정보의 수집 및 이용목적 : 제휴신청에 따른 본인확인 및 원활한 의사소통 경로 확보 <br />
								 3. 개인정보의 이용기간 : 모든 검토가 완료된 후 3개월간 이용자의 조회를 위하여 보관하며, 이후 해당정보를 지체 없이 파기합니다. <br />
								 4. 그 밖의 사항은 개인정보취급방침을 준수합니다.
							</div>
						</div>
						<div style="padding-top:7px;padding-left:5px;padding-bottom:7px;font-family: Gulim,Tahoma,verdana;">
							<input type="checkbox" name="info" value="1" class="input_radio"> 개인정보 수집 및 이용에 대해 동의합니다.
						</div>
					</td>
				</tr>
				</table>
			</div>

			<div class="btn_area">
				<div class="align_left">			
					<input type="button" value="목록" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_list1.jsp'" />
				</div>
				<div class="align_right">			
					<input type="button" value="등록" class="btn_write btn_txt01" style="cursor: pointer;" />					
				</div>	
			</div>	
			<!--//게시판-->
		</div>
	</form>
</div>
<!-- 하단 디자인 -->

</body>
</html>
