<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="gymmanage.UserDao,gymmanage.User"%>  
  
<%  
String id=request.getParameter("id");  
User u = UserDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="edituser.jsp" method="post">  
<input type="hidden" name="id" value="<%= u.getId() %>"/>  
<table>  
<tr><td>fullname:</td><td>  
<input type="text" name="fullname" value="<%= u.getFullname()%>"/></td></tr>   
<tr><td>username:</td><td>  
<input type="text" name="username" value="<%= u.getUsername()%>"/></td></tr>  
<tr><td>age:</td><td>  
<input type="date" name="age" value="<%= u.getAge()%>"/></td></tr>  
<tr><td>country:</td><td>  
<input type="text" name="country" value="<%= u.getCountry()%>"/></td></tr>  
<tr><td>Password:</td><td>  
<input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr> 
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
</table>  
</form>  
  
</body>
</html>