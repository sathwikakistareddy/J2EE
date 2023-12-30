<%@ page language="java" contentType="text/html"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html> 
<html> 
<head> 
 
<title>Insert title here</title> 
</head> 
<body bgcolor="aqua"> 
<c:if test="${saveResult==1}"> 
Data Inserted Successfully..${saveResult} 
</c:if> 
<c:if test="${saveResult==0}"> 
Data Insertion Fail....${saveResult} 
<%@include file="add-user.html"  %> 
</c:if> 
 
 
 
</body> 
</html>