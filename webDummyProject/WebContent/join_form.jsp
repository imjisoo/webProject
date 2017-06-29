<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>JUNGDUCK92</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style type="text/css">
#container {
	width: 800px;
	margin: auto;
	margin-top: 10%;
}
.red {
	color: red;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function () {
		
		$("input.pwCheck").change(function () {
			
			var userPw = $("input[name='userPw']").val();
			
			var userPwCheck = $("input[name='userPwCheck']").val();
			
			if (userPw != userPwCheck) {
				
				$("#checkPw").html("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				$("#checkPw").addClass("red");
				
			} else {
				
				$("#checkPw").html("��й�ȣ�� ��ġ�մϴ�");
				$("#checkPw").removeClass("red");
				
			}
			
		});
		
	});
</script>
</head>
<body>
	<div class="w3-container" id="container">
		<header class="w3-container w3-teal"><h1>SIGN UP</h1></header>
		<div class="w3-container w3-margin">
			<form action="join.do" method="post">
				<table class="w3-table">
					<col width="20%"/>
					<col width="80%"/>
					<tr>
						<th>ID</th>
						<td><input type="text" name="userId" size="20" /></td>
					</tr>
					<tr>
						<th>PW</th>
						<td><input type="password" name="userPw" class="pwCheck" /></td>
					</tr>
					<tr>
						<th>PW CHECK</th>
						<td>
							<input type="password" name="userPwCheck" class="pwCheck" />
							<span id="checkPw"></span>
						</td>
					</tr>
					<tr>
						<th>EMAIL</th>
						<td>
							<input type="text" name="userEmailId" />
							@
							<select class="w3-select" name="userEmailAddress">
								<option value="gmail.com">gmail.com</option>
								<option value="naver.com">naver.com</option>
								<option value="daum.net">daum.net</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input class="w3-radio" type="radio" name="userType" value="CUS" /> CUSTOMER
							<input class="w3-radio" type="radio" name="userType" value="VEN" /> VENDOR
							<input class="w3-radio" type="radio" name="userType" value="FAC" /> FAC
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<div class="w3-right-align">
								<input type="submit" value="SIGN UP" />
								<a href="/webDummyProject/" style="text-decoration: none;">
									<input type="button" onclick="javascript:void(0)" value="CANCLE" />
								</a>
							</div>
						</td>
					</tr>
				</table>
			</form>
		</div>
		<footer class="w3-container w3-teal w3-right-align"><h5>@jungduck92</h5></footer>
	</div>
</body>
</html>