<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
     <link rel="stylesheet" href="css/font-awesome.min.css">
     <link rel="stylesheet" href="css/aos.css">

     <!-- MAIN CSS -->
     <link rel="stylesheet" href="css/tooplate-gymso-style.css">
</head>
<body data-spy="scroll" data-target="#navbarNav" data-offset="50">
<!-- Servlet code -->
  <%@page import="gymmanage.UserDao,gymmanage.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<h1>Users List</h1>  
  
<%  
List<User>list=UserDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
<!-- end of servlet code -->

    <!-- MENU BAR -->
    <nav class="navbar navbar-expand-lg fixed-top">
        <div class="container">

            <!-- MENU BAR <a class="navbar-brand" href="index.html">Gymso Fitness</a>--> 
            <a href="#" class="navbar-brand" data-aos="fade-up" data-aos-delay="300" data-toggle="modal2" data-target="#admindashboard">Gymso Fitness</a>
            

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-lg-auto">
                    <li class="nav-item">
                        <a href="adduserform.jsp" class="nav-link smoothScroll">Add new user</a>
                    </li>
                     <li class="nav-item">
                        <form action="Logot" method="POST">
                      <input type="submit" value="Logout">
                  </form>
                    </li>
                </ul>

                <ul class="social-icon ml-lg-3">
                    <li><a href="https://fb.com/tooplate" class="fa fa-facebook"></a></li>
                    <li><a href="#" class="fa fa-twitter"></a></li>
                    <li><a href="#" class="fa fa-instagram"></a></li>
                </ul>
            </div>

        </div>
    </nav>


     <!-- HERO -->
  
<table border="1" width="90%" class="table table-dark table-striped">  
<tr><th>Id</th><th>Fullname</th><th>username</th><th>age</th>  
<th>country</th><th>password</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getFullname()}</td><td>${u.getUsername()}</td>  
<td>${u.getAge()}</td><td>${u.getCountry()}</td><td>${u.getPassword()}</td>  
<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>   
  
</body>
</html>