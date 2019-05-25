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
<c:if test="${empty param.nome}">
	Campo nome obrigatório
</c:if>

<c:if test="${not empty param.nome}">
	Obrigado por inserir seu nome ${param.nome}
</c:if>
</body>
</html>