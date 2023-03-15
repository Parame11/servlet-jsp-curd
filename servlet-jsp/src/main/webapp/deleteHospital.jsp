<%@page import="com.jsp.dto.Hospital"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	Hospital hospitals = (Hospital) request.getAttribute("hospitals");
	%>
	<table border="3px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>Phone</th>
			<th>Website</th>
			<th>Edit</th>
			<th>Delete</th>

		</tr>


	
	</table>


</body>
</html>