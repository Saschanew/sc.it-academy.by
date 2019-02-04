<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Главная</title>
<style type="text/css">
			form {
				font-weight: bolder;
				width: 300px; 
    			background: #3d3d3d;				
			}
			#knopochka{
				background: #2E8B57; font-weight: bolder;
				color: white;
			}
			div{
				margin: 5px;
			}
			
			label, legend, h1, span {color: white;			}
			.main {margin-left: 350px; margin-top: 60px;}
			.a {height: 200px; margin-top: 30px;}
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
					<legend>Авторизация</legend>
					<input type="hidden" name="command" value="Authorization">
					<div>					
					<input type="text" name="login" id="log" required><span>*</span>
					<label for="login">Логин</label><br>
					</div>
					<div>
					<input type="password" name="password" id="pass" required><span>*</span>
					<label for="password">Пароль</label><br>
					</div>
					<div>
					<input type="submit" value="Войти" id="knopochka"><br>
					</div>
					<div>
					<a href="controller?command=GO_TO_REGISTRATION">Регистрация</a>
					</div>
					</fieldset>
			</div>				
		</form>		
		<h3>
			<c:out value="${requestScope.error}"/>
		</h3>		
</div>
</body>
</html>