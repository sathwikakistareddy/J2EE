<%@page import="com.sathya.userregistration.UserDao"%> 
<%@ page language="java" contentType="text/html; "%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<title>Insert title here</title> 
</head> 
<body bgcolor="pink"> 
<table border="1"> 
<thead> 
<tr> 
<th>UserId</th> 
<th>UserName</th> 
<th>UserEmail</th> 
<th>UserMobile</th> 
<th>UserLocation</th> 
</tr> 
</thead> 
<tbody> 
<c:forEach items="<%=new UserDao().findAll()%>" var="user"> 
<tr> 
<td>${user.userId}</td> 
<td>${user.userName}</td> 
<td>${user.userEmail}</td> 
<td>${user.userMobile}</td> 
<td>${user.userLocation}</td> 
</tr> 
</c:forEach> 
</tbody> 
</table> 
 
</body> 
</html>

