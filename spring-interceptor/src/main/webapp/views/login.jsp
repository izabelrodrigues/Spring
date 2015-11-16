<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
</head>
<body>
	<form action="doLogin" method="post">

		<table border="0">
			<tr>
				<td>Usuário:</td>
				<td><input type="text" id="login" name="login" /></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Entrar" />
	</form>
</body>
</html>