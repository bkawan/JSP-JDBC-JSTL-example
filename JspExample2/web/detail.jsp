<%-- 
    Document   : detail
    Created on : Apr 28, 2016, 3:34:49 PM
    Author     : bikeshkawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <a href="index.jsp"><span class="btn btn-primary btn-sm glyphicon glyphicon-backward"> Back</span></a>
            <h1>Detail page </h1>
            <p> Data comming from Session scope from index page Using jsp:getProperty</p>
            <p>Name: <jsp:getProperty name="student" property="firstName"></jsp:getProperty>  <jsp:getProperty name="student" property="lastName"></jsp:getProperty> </p>
            <p>Email: <jsp:getProperty name="student" property="email"/></p>
            <p>Address <jsp:getProperty name="student" property="address"/></p>

            <p>ContactNo: <jsp:getProperty name="student" property="contactNo"/></p>

            <hr>
            <p> Data comming from Session scope from index page Using EL(Expression Language)\${}</p>
            <p>Name: ${student.getFirstName()} ${student.getLastName()} </p>
            <p>Email: ${student.getEmail()} </p>

            <p>Address: ${student.getAddress()} </p>

            <p>ContactNo: ${student.getContactNo()} </p>



        </div>

    </body>
</html>
