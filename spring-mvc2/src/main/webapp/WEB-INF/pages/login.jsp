<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Login</h1>
		<form action = "loginSuccess" method = "post">
			Username: <input type = "text" name = "uname" id = "user"/><br>
			Password: <input type = "password" name = "pwd" id = "pass"/><br>
						
			<input type = "submit" name = "login" value = "Log In"/>
			<input type = "submit" name = "register" value = "Register"/>
			<input type = "submit" name = "delete" value = "Delete"/>
		</form>

</body>
</html>