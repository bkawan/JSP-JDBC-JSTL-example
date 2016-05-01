<%-- 
    Document   : test
    Created on : Apr 29, 2016, 11:13:00 PM
    Author     : bikeshkawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
<c:catch>  
int a=10/0;  
</c:catch>
First Name:<c:out value="${param.fname}"></c:out><br/>  
Last Name:<c:out value="${param.lname}"></c:out> 

<form action="" method="post">  
FirstName:<input type="text" name="fname"/><br/>  
LastName:<input type="text" name="lname"/><br/>  
<input type="submit" value="submit"/>  

<div>


<h1>yahoo .com </h1>  
<hr/>  
<c:import var="data" url="http://www.google.com"></c:import>  
  
<h2>Data is:</h2>  
<c:out value="${data}"></c:out>  
</div>
<div>
    <hr>
<c:forEach var="num" begin="1" end="5">
    <c:out value="${num}"> </c:out><br/>
</c:forEach>
</div>
</form> 
    </body>
</html>
