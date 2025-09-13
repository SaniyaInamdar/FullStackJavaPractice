<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
</head>
<body>
<h1 style="color: blue">Login successful</h1>
<p>Welcome, <strong><%= request.getAttribute("username") %></strong>!</p>
</body>
</html>
