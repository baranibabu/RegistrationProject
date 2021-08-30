<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{background-color:pink;}
</style>
</head>
<body >
<h1 align="center"> Student Registration Form</h1>
<form action="Register"" method="post">
<table align="center">
<tr><td> User Name: </td><td> <input type="text" name="uname"></td></tr>
<tr><td> Password: </td><td> <input type="password" name="password"></td></tr>
<tr><td> Studentid: </td><td> <input type="text" name="studentid"></td></tr>
<tr><td> Degree: </td><td> <input type="text" name="degree"></td></tr>
<tr><td> Branch: </td><td> <input type="text" name="branch"></td></tr>
<tr><td> Email: </td><td> <input type="text" name="email"></td></tr>
<tr><td> Phone: </td><td> <input type="text" name="phone"></td></tr>
<tr><td> </td><td> <input type="submit" value="register"></td></tr>
</table>
</form>
</body>
</html>