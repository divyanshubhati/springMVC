<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello from JSP!!! <br>
	The result is : <%= request.getAttribute("result") %> <br>
	By using Expression language : ${result} <br>

</body>
</html>