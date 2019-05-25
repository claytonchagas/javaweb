<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- Comentario de JSP --%>
<!-- Comentario html -->
<% String mensagem = "Bem vindo ao JSP!!!"; %>
<% out.println(mensagem); %><br /><br /><%-- variável implícita do JSP --%>
<!-- variável out do tipo JspWritter que possui o método println -->
<!-- imprimimos utilizando scriptlet JSP -->
Seja bem vindo ao JavaServer Pages
<%= mensagem %><br /><br />
<!-- imprimimos utilizando expressões JSP -->
<% System.out.println("Mensagem que sai no console do container"); %>
</body>
</html>