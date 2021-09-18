<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prompt</title>
</head>
<body>
<form action="promptUserServlet" method="post">

Would you like to start a calculation? Enter Y/N:
<input type="text" size=" 1" name="prompt" id="prompt"> 
<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>