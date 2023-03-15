<%@page import="com.jsp.dto.Hospital"%>
<%@page import="java.util.List"%>
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
	List<Hospital> list = (List) request.getAttribute("hosptial");
	%>
	<table  border="3px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>Phone</th>
			<th>Website</th>
			<th>Edit</th>
			<th>Delete</th>

		</tr>


		<%
		for (Hospital hospital : list)  {
		%>

		<tr>
			<td><%=hospital.getId()%></td>
			<td><%=hospital.getName()%></td>
			<td><%=hospital.getPhone()%></td>
			<td><%=hospital.getWebsite()%></td>
			
			<td><a href="editHospital?id=<%= hospital.getId()%>">edit</a> </td>
			<td><a href="deleteHospital?id=<%= hospital.getId()%>">delete</a></td>


		</tr>

		<%
		}
		%>
	</table>


</body>
</html>