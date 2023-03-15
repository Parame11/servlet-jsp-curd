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
  
  <form action="updatedHospital"  method="post">
  <%   Hospital hospital=(Hospital)session.getAttribute("hospitals");
     
  
 %>
  
      Id : <input type="number" name="id" value="<%= hospital.getId()%>"  readonly="readonly"> <br>
      
     Name : <input type="text" name="name" value="<%= hospital.getName()%>"> <br>
      
      Phone : <input type="number"  name="phone" value="<%= hospital.getPhone() %>"> <br>
      
      Website : <input type="email" name="website"  value=" <%= hospital.getWebsite() %>"> <br>
      
      <input type="submit" value="Updated">
      
  
  
  </form>
</body>
</html>