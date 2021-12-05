<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="viewusers.jsp">View All Records</a><br/>  
  
<h1>Add New User</h1>  
<form action="adduser.jsp" method="post">  
<table>  
<tr><td>fullName:</td><td><input type="text" name="fullname"/></td></tr>  
<tr><td>username:</td><td><input type="text" name="username"/></td></tr>  
<tr><td>age:</td><td> <input type="date" name="age"/></td></tr>  
<tr><td>Country:</td><td> <input type="text" name="country"/></td></tr>  
<tr><td>Password:</td><td><input type="password" name="password"/><td></tr>
</table>  
</form> 
</body>
</html>