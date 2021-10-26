<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Display Date</title>
	</head>
	<body>
		<form action="/login" method = "POST">
			<h2>
				You must train harder!
			</h2>
			<h2>
				What is the code?
			</h2>
			<input type="text" name="guess"  placeholder="Insert the code here" />
			<span> <c:out value="${ error }" /> </span>
			<button type="submit" >Let me in</button>
		</form>	
		<script src="./js/Alert.js"></script>
	</body>
</html>
