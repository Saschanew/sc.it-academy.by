<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация</title>
<style type="text/css">
			form {
				font-weight: bolder;
				width: 360px; 
    			background: #3d3d3d;				
			}
			#knopochka{
				background: #2E8B57; font-weight: bolder;
				color: white;
			}
			div{
				margin: 10px;
			}
			.zebra {border-color: red;	background-color: grey;	}
			label, legend, h1, span {color: white;			}
			.main {margin-left: 350px; margin-top: 60px;}
			.a {height: 300px; margin-top: 30px;}
			.b {height: 30px;}
			body {font-family: Roboto;}
</style>
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$('#knopochka').hover(function() {
		        $(this).css({'background-color' : '#008000'});
		    })
		    $('#knopochka').mouseout(function() {
		        $(this).css({'background-color' : '#2E8B57'});
		     })
		})
		
		$(document).ready(function(){
		$("#PasswordReg, #Password2").on("keyup", function(){
				if($("#PasswordReg").val() != $("#Password2").val()){
				$('#PasswordReg').addClass('zebra');
				$('#Password2').addClass('zebra');				
				}else{
				$('#PasswordReg').removeClass('zebra');
				$('#Password2').removeClass('zebra');				
				}
			});
	
	});
	</script>	
</head>
<body vlink="#cecece" alink="#ff0000" >
<div class="main">
		<form name="form3" method="get" action="controller">
			<div class="b">
			<h1>Библиотека</h1>
			</div>
			<div  class="a">
					<fieldset>
					<legend>Регистрация</legend>
					<input type="hidden" name="command" value="Registration">
					<div>					
					<input type="text" name="name" id="name" required><span>*</span>
					<label for="name">Имя</label><br>
					</div>
					<div>
					<input type="text" name="surname" id="surname" required><span>*</span>
					<label for="surname">Фамилия</label><br>
					</div>
					<div>					
					<input type="text" name="adress" id="adress" required><span>*</span>
					<label for="adress">Адрес</label><br>
					</div>
					<div>					
					<input type="text" name="email" id="email" required><span>*</span>
					<label for="email">e-mail</label><br>
					</div>
					<div>					
					<input type="text" name="loginReg" id="loginReg" required><span>*</span>
					<label for="loginReg">Логин</label><br>
					</div>
					<div>
					<input type="password" name="passwordReg" id="PasswordReg" placeholder="Введите пароль" required><span>*</span>
					<label for="passwordReg">Пароль</label><br>
					</div>
					<div>
					<input type="password" name="password2" id="Password2" placeholder="Повторите пароль" required><span>*</span>
					<label for="password2">Повторение пароля</label><br>
					</div>
					<div>
					<input type="submit" value="Зарегистрироваться" id="knopochka"><br>
					</div>					
					</fieldset>
			</div>				
		</form>		
</div>
</body>
</html>