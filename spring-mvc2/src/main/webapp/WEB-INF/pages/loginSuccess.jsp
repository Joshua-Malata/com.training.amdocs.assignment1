<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Success</h1>
	<h2>Welcome ${username}</h2>
	<h3>${userText}</h3>
	<form action = "deletedUser" method = "post">
			Username: <input type = "text" name = "uname" id = "user"/><br>
			<input type = "submit" name = "delete" value = "Delete a User"/>
		</form>

</body>
</html>