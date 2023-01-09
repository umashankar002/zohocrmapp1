<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
	<h1><i>Lead details...</i></h1>
	Id:-${lead.id}<br/>
	First Name:-${lead.firstName}<br/>
	Last Name:-${lead.lastName}<br/>
	Email:-${lead.email}<br/>
	Mobile:-${lead.mobile}<br/>
	Source:-${lead.source}<br/>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${lead.email}"/>
		<input type="submit" value="Send Email"/>
	</form>
	<form action="covertLead" method="post">
		<input type="hidden" name="id" value="${lead.id}"/>
		<input type="submit" value="Convet to Contact"/>
	</form>
	${msg}
<%@ include file="menu.jsp" %>	
</body>
</html>