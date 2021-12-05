<%@page import="gymmanage.UserDao"%>  
<jsp:useBean id="u" class="gymmanage.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=UserDao.update(u);  
response.sendRedirect("viewusers.jsp");  
%>  