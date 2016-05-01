<%-- 
    Document   : index
    Created on : Apr 6, 2016, 7:50:56 PM
    Author     : bikeshkawan
--%>


<%@page import="com.bk.jspexample2.dao.StudentDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bk.jspexample2.dao.impl.StudentDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bk.jspexample2.entity.Student" %>
<%@page import="com.bk.jspexample2.validation.validate" %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>

<!-- bean objet-- like student = new Student() -->
<jsp:useBean id="student" class="com.bk.jspexample2.entity.Student" scope="session"/>

<jsp:useBean  id="studentService" class="com.bk.jspexample2.service.StudentService"/>




<%--<jsp:useBean  id="studentService" class="com.bk.jspexample2.service.StudentService"/>
<c:set var="student" value="${studentService.insert(student)}"></c:set>--%>


<!DOCTYPE html>
<html>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">


    <title>JSP Example 2</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <link href="navbar-fixed-top.css" rel="stylesheet">

    <script src="assets/js/ie-emulation-modes-warning.js"></script>

</head>

<body>

    <c:if test="${ !empty param.fname && !empty param.lname && !empty param.email && !empty param.contact && !empty param.address}">
        <sql:setDataSource var="studentData" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/firstjsp" user="root" password="root"></sql:setDataSource>
        <sql:update dataSource="${studentData}" var="result">
            INSERT INTO tbl_students(first_name,last_name,email,contact_no,address) VALUES  (?,?,?,?,?);
             <%--
            <sql:param value="Rocky"></sql:param>
            <sql:param value="Jocky"></sql:param>
            <sql:param value="ro@gmail.com"></sql:param>
            <sql:param value="123213"></sql:param>
            <sql:param value="london"></sql:param>
            --%>

           
            <sql:param value="${param.fname}"></sql:param>
            <sql:param value="${param.lname}"></sql:param>
            <sql:param value="${param.email}"></sql:param>
            <sql:param value="${param.contact}"></sql:param>
            <sql:param value="${param.address}"></sql:param>



        </sql:update>
        <c:if test="${result>=1}">
            <c:redirect url="admin/student/index.jsp">
                <c:param name="successMsg" value="Data inserted successfully"></c:param>
            </c:redirect>
        </c:if>

    </c:if>
    <!----


     String errMessage = null;

     if ("POST".equalsIgnoreCase(request.getMethod())) {
         if (request.getParameter("fname") == null) {

             errMessage = "This is required field";
         } else {

             StudentDAO stdDaoImpl = new StudentDAOImpl();

             Student student = new Student();

             student.setFirstName(request.getParameter("fname"));
             student.setLastName(request.getParameter("lname"));

             student.setEmail(request.getParameter("email"));

             student.setAddress(request.getParameter("address"));
             student.setContactNo(request.getParameter("contact"));

             stdDaoImpl.insert(student);
         }
     }
 

--->


    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand"   href="index.jsp">Registration System JSP Example 2</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li><a id="" href="">Home</a></li>
                    <li><a id="linkRegister" href="#">Register</a></li>
                    <li><a id="linkStdList" href="#">List All</a></li>
                    <li><a id="" href="admin/student/index.jsp">Admin</a></li>




                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Contact</a></li>
                    <li><a href="#">About</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </nav>

    <div class="container">
        <jsp:setProperty name="student" property="id" value="1"/>
        <jsp:setProperty name="student" property="firstName" value="Bikesh"/>

        <jsp:setProperty name="student" property="lastName" value="Kawan"/>

        <jsp:setProperty name="student" property="email" value="bikeshkawang@gmail.com"/>
        <jsp:setProperty name="student" property="address" value="bhaktapur"/>

        <jsp:setProperty name="student" property="contactNo" value="9841709539"/>

        <p>${student.id}</p>
        <p>${student.firstName} ${student.lastName}</p>
        <p>${student.email}</p>
        <p>${student.contactNo}</p>
        <p>${student.address}</p>
        <p><a href="admin/student/edit.jsp?id=${student.id}">Edit</a> <a href="">Delete</a></p>
        <p><a href="detail.jsp?">More Detail...</a></p>




    </div>
    <div class="container">

        <div id="stdList" class="jumbotron" style="display: ">

            <h4> List of Registered People-Static list</h4>
            <table class="table table-bordered table-striped table-hover">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Email</td>
                        <td>Address</td>
                        <td>Contact</td>
                        <td>Action</td>
                    </tr>
                </thead>
                <tbody>




                    <tr>


                        <td>${student.id}</td>
                        <td>${student.firstName} ${student.lastName}</td>
                        <td>${student.email}</td>
                        <td>${student.contactNo}</td>
                        <td>${student.address}</td>
                        <td><a href="">Edit</a> <a href="">Delete</a></td>


                    </tr>

                </tbody>

            </table>
                         <h4> List of Registered People-Dynamic List </h4>
            <table class="table table-bordered table-striped table-hover">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Email</td>
                        <td>Address</td>
                        <td>Contact</td>
                        <td>Action</td>
                    </tr>
                </thead>
                <tbody>




            <c:forEach var="std" items="${studentService.getAll()}">

                <tr>



                    <td>${std.getId()}</td>
                    <td>${std.getFirstName()} ${std.getLastName()}</td>
                    <td>${std.getEmail()}</td>
                    <td>${std.getAddress()}</td>
                    <td>${std.getContactNo()}</td>
                    <td><a href="admin/student/edit.jsp?id=${std.getId()}" class=" btn btn-success btn-sm glyphicon glyphicon-pencil">Edit</a> <a id="confirm-delete" href="admin/sutdent/delete.jsp?id=${std.getId()}" class=" btn btn-danger btn-sm glyphicon glyphicon-trash">Delete</a></td>





                </tr>

            </c:forEach>

                </tbody>

            </table>

        </div>

        <div id="register" class="jumbotron" style="display: none;padding-top:50px">
            <h1> Registration form </h1>


            <form role="form" method="POST" action="">

                <div class="form-group">
                    <label for="name">First Name</label>

                    <input type="text" class="form-control" name="fname" required="required" maxlength="10"/>

                </div>

                <div class="form-group">

                    <label for="lname">Last Name</label>
                    <input  type="text" class="form-control" name="lname"/>
                </div>



                <div class="form-group">

                    <label for="email">Email</label>
                    <input type="email" class="form-control" name="email"/>
                </div>


                <div class="form-group">

                    <label for="address">Address</label>
                    <input type="text" class="form-control" name="address" />

                </div>


                <div class="form-group">
                    <label for="conact">contact </label>
                    <input type="text" class="form-control" name="contact"/>

                </div>


                <div class="form-group">
                    <button type="submit" name="submit">Submit</button>
            </form>



        </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script>

        $(document).on("ready", function () {

            $("#linkRegister").on("click", function () {
                $("#register").slideToggle();
                $("#stdList").hide();


            });
            $("#linkStdList").on("click", function () {
                $("#stdList").slideToggle();
                $("#register").hide();



            });

            $("table tr td #confirm-delete").on("click", function (e) {
                if (!confirm('Are you sure you want to Delete??')) {
                    e.preventDefault();
                    return false;
                }
                return true;

            });

        });
    </script> 





</body>
</html>

