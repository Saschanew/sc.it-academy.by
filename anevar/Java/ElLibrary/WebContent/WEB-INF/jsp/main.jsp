<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Личный кабинет</title>
<style type="text/css">
			form, td {
				font-weight: bolder;
				width: 300px; 
    			background: #3d3d3d;				
			}
			#knopochka{
				background: #2E8B57;
				color: white;
			}
			div{
				margin: 5px;
			}
			
			label, legend, h1, h2, span {color: white;			}
			body {font-family: Roboto;}
			table {margin-left: 150px; border: 0; border-collapse: collapse;}
			.a {height: 250px; margin-top: 30px;}
			h1,h2 {margin-left: 15px;
</style>
</head>
<body vlink="#cecece" alink="#ff0000" >
<table>
<col width="350"> <col width="350">
<tr>
	<td colspan="2">	
		<h1>Библиотека</h1>	
		<h2>Добро пожаловать, <c:out value="${requestScope.user.name}"/></h2>		
	</td>
</tr>
<tr>
	<td>	
	<div>	
			<form name="form2" method="get" action="controller">
			<div class="a">	
			<h3>
			<c:out value="${requestScope.error2}"/>
		</h3>			
						<fieldset>
						<legend>Поиск книг</legend>
						<div>
						<input type="hidden" name="command" value="FIND_BOOKS">
						<input type="text" name="author" id="author" >
						<label for="autor">Автор</label><br>
						</div>
						<div>
						<select name="genre" id="genre">
							<option disabled value=">Выберите жанр" selected>Выберите жанр</option>										
							<option value="Classik">Classik</option>								
							<option value="Fantastic">Fantastic</option>						
						</select>
						<label for="genre">Жанр</label><br>
						</div>
						<div>
						<input type="text" name="year" id="year">
						<label for="year">Год</label><br>
						</div>
						<div>
						<input type="submit" value="Найти" id="knopochka"><br>
						</div>						
						</fieldset>
			</div>				
			</form>			
	</div>
	</td>
	<td>	
			<form name="form3" method="get" action="controller">
				<div class="a">	
						<fieldset>
						<legend>Личные данные</legend>
						<div>
						<input type="hidden" name="command" value="">
						<input type="text" name="name" value="<c:out value="${requestScope.user.name}"/>" id="name" >
						<label for="name">Имя</label><br>
						</div>
						<div>
						<input type="text" name="surname" value="<c:out value="${requestScope.user.surname}"/>" id="surname">
						<label for="surname">Фамилия</label><br>
						</div>
						<div>
						<input type="text" name="email" value="<c:out value="${requestScope.user.email}"/>" id="email">
						<label for="email">e-mail</label><br>
						</div>
						<div>
						<input type="text" name="login" value="<c:out value="${requestScope.user.login}"/>" id="login">
						<label for="login">Login</label><br>
						</div>
						<div>
						<input type="text" name="password" value="<c:out value="${requestScope.user.password}"/>" id="pass">
						<label for="password">Password</label><br>
						</div>						
						<div>
						<input type="submit" value="Изменить" id="knopochka"><br>
						</div>						
						</fieldset>
				</div>					
			</form>	
	</td>
</tr>
</table>		
</body>
</html>