<%@ page language="java" contentType="text/html" import="java.util.Date"%> 
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<title>Insert title here</title> 
</head> 
<body bgcolor="aqua"> 
<c:if test="${saveResult==1}"> 
<c:redirect url="http://www.sathyatech.com"/> 
</c:if> 
<c:if test="${saveResult==0}"> 
login fail .....${saveResult} 
</c:if> 
 
</body> 
</html>