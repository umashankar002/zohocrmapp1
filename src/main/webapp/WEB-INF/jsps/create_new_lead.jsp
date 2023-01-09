<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
	<h1><i>Create new lead...</i></h1>
	<form action="saveLead" method="post">
		First Name:-<input type="text" name="firstName">
		Last Name:-<input type="text" name="lastName">
		Email:-<input type="email" name="email">
		Mobile:-<input type="number" name="mobile">
		Source:-<select name="source" id="source">
				  <option value="radio">radio</option>
				  <option value="news-paper">news-paper</option>
				  <option value="online">online</option>
				  <option value="friend-zone">friend-zone</option>
				</select>
			<input type="submit" value="save"/> 
	</form>
</body>
</html>