<%@page import="dao.ClienteDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.*, dao.*, modelo.*, servlets.*" %>
<table>
	<%
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		for(Cliente cliente : clientes){
	%>	
			<tr>
				<td><%= cliente.getNome() %></td>
				<td><%= cliente.getEmail() %></td>
				<td><%= cliente.getEndereco() %></td>
			</tr>
	<% 
		}
	%>		
</table>
</body>
</html>