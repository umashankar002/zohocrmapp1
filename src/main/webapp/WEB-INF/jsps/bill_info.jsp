<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Info</title>
</head>
<body>
	<h1><i>Bill details...</i></h1>
	First Name:-${bill.firstName}<br/>
	Last Name:-${bill.lastName}<br/>
	Email:-${bill.email}<br/>
	Mobile:-${bill.mobile}<br/>
	Product:-${bill.product}<br/>
	Amount:-${bill.amount}
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${bill.email}"/>
		<input type="submit" value="Send Email"/>
	</form>
<%@ include file="menu.jsp" %>	
</body>
</html>