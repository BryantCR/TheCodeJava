<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Counter</title>
		<link rel="stylesheet" href="style.css" />
		<link rel="stylesheet" href="./css/style.css"/>
	</head>
	<body>
		<ul>
			<c:forEach items="${ codes }" var="code">
				<li><c:out value="${ code }"/></li>	
			</c:forEach>
		</ul>
	</body>
</html>
