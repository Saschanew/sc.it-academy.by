<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Выбранные книги</title>
<style type="text/css">
			form, .mainTable td {
				font-weight: bolder;
				width: 600px; 
    			background: #3d3d3d;				
			}
			#knopochka{
				background: #2E8B57;
				color: white;
			}
			div{
				margin: 15px;
			}
			.tr {color: lightgreen;}
			label, legend, h1, h2, span, .table {color: white;			}
			body {font-family: Roboto;}
			.mainTable {margin-left: 150px; border: 0; border-collapse: collapse;}
			.table {border: 1; bordercolor: #ffffff; border-collapse: collapse;}
			h1,h2 {margin-left: 15px}
			th, td {padding:3px;}			
</style>
</head>
<body vlink="#cecece" alink="#ff0000" >
<table class="mainTable">
<col width="150"> <col width="150">
<tr>
	<td colspan="2">
	<h1>Библиотека</h1>
		<h2>Выбранные книги:</h2>		
	</td >
</tr>
<tr>
	<td colspan="2">
	<div>	
		<table class="table">
		 <tr>
			 <th align="left">Название книги</th>
			 <th align="left">Автор</th> 
			 <th align="left">Год издания</th>
			 <th align="left">Жанр</th>			 
		 </tr>
		 <c:forEach items="${requestScope.books}" var="book">
		 <tr class="tr">
		 	<td>${book.title}</td>
		 	<td>${book.author}</td> 
		 	<td>${book.year}</td> 
		 	<td>${book.genre}</td>
		 </tr>
		 </c:forEach>		 
 	</table>
 	</div>
	</td>
</tr>
</table>
</body>
</html>