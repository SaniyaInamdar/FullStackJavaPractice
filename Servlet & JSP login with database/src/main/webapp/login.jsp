<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<h1>Login Form</h1>

<%
    String error = request.getParameter("error");
    if(error != null){
%>
<p style="color:red;"><%= error %></p>
<% } %>

<form action="Login" method="post">
    User Name: <input type="text" name="username" required><br><br>
    Password: <input type="password" name="password" required><br><br>
    <button type="submit">Login</button>
</form>
</body>
</html>
