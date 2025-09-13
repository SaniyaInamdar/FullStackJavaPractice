<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Calculator" method="post">
		<h1>Addition</h1>
		Number 1: <input placeholder="Enter first number" name="num1" type="number" required>
		Number 2 : <input placeholder="Enter second number" name="num2" type="number" required>
		<button type="submit" name="operation" value="add">Add</button>
		<button type="submit" name="operation" value="sub">Sub</button>
		<button type="submit" name="operation" value="mul">Mul</button>
		<button type="submit" name="operation" value="div">Div</button>
	</form>
</body>
</html>