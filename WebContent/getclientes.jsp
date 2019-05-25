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
<ul>
	<%
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		for(Cliente cliente : clientes){
	%>	
			<li>
				<%= cliente.getNome() %>, <%= cliente.getEmail() %>, <%= cliente.getEndereco() %>
			</li>
	<% 
		}
	%>		
</ul>
</body>
</html>