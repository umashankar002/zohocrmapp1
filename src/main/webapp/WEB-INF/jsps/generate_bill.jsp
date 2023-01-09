<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Bill</title>
</head>
<body>
	<h1><i>Generating Bill...</i></h1>
	<form action="saveBill" method="post">
		First Name:-<input type="text" name="firstName" Value="${contact.firstName}">
		Last Name:-<input type="text" name="lastName" Value="${contact.lastName}">
		Email:-<input type="email" name="email" Value="${contact.email}">
		Mobile:-<input type="number" name="mobile" Value="${contact.mobile}">
		Product:-<input type="text" name="product">
		Amount:-<input type="text" name="amount">
			<input type="submit" value="GenerateBill"/> 
	</form>
</body>
</html>