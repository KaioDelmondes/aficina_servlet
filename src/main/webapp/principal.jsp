<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem Vindo</title>
</head>
<body>
	<h1>Ol� Usu�rio</h1>
	<%
	String email = (String) request.getAttribute("email");
	out.println("O email: " + email + " � reconhecido pelo sistema e sua sess�o de usu�rio foi iniciada!");
	%>
	<br><br>
	<a href="sair">
		<button>Logout</button>
	</a>
</body>
</html>