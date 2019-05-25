<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dao" class="dao.ClienteDao"></jsp:useBean>
<table>
<c:forEach var="cliente" items="${dao.clientes}">
<tr>
	<td>nome: ${cliente.nome}</td>
	<td>
		<c:if test="${not empty cliente.email}">
			<a href="mailto:${cliente.email}">${cliente.email}</a>
		</c:if>
		
		<c:if test="${empty cliente.email}">
			E-mail não informado
		</c:if>
	</td>
	<td>endereço: ${cliente.endereco}</td>
	<td><c:out value="${dao.clientes[0].nome}"></c:out></td>
	<td><c:out value="${cliente.nome}"></c:out></td>
</tr>
</c:forEach>
</table>
<br />
<c:out value="${dao.clientes[0].nome}"></c:out><br />
<c:out value="${dao.clientes[2].nome}"></c:out><br />
<c:out value="${dao.clientes[1].nome}"></c:out><br />
<c:out value="${dao.clientes[3].nome}"></c:out><br />
<c:out value="${cliente.nome}"></c:out><br />
<c:out value="${dao.clientes[4].nome}" default="não achei ninguém nessa posição!"></c:out><br />
</body>
</html>