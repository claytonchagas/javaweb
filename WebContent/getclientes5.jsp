<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="dao.ClienteDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<c:forEach var="cliente" items="${clientes}">
		<tr>
			<td>${cliente.nome}</td>
			<td>${cliente.email}</td>
			<td>${cliente.endereco}</td>
			<td><a href="mvc?regra=RegraDeleteClientes&id=${cliente.id}">Delete</a></td>
		</tr>	
	</c:forEach>
</table>
</body>
</html>