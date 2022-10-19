<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h1>Account Registration Form</h1>
  <form action="<%= request.getContextPath() %>/accountServlet" method="post">
   <table style="with: 80%">
    <tr>
     <td>Account Type</td>
     <td><select id="cars" name="accountType">
 			<option value="">Select</option>
  			<option value="admin">admin</option>
  			<option value="user">user</option>
		</select></td>
    </tr>
    <tr>
     <td>Username</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>