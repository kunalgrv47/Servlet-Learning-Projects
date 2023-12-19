<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>

	<%
	String myName = (String)session.getAttribute("name_key");
	%>

	<h3>Welcome : <%= myName %></h3>
	<h3>
		This is <b>Profile Page</b>
	</h3>
	<br>
	<a href="home.jsp">Home</a>
	<a href="aboutus.jsp">About Us</a>

</body>
</html>