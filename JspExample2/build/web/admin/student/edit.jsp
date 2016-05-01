<%-- 
    Document   : edit
    Created on : Apr 28, 2016, 4:30:16 PM
    Author     : bikeshkawan
--%>
<%@page import="java.io.*,java.util.*,java.sql.*" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@include file="../layout/header.jsp" %>
<jsp:useBean  id="studentService" class="com.bk.jspexample2.service.StudentService"/>
<c:set var="student" value="${studentService.getById(param.id)}"/>

<sql:setDataSource var="studentData" 
                   driver="com.mysql.jdbc.Driver" 
                   url="jdbc:mysql://localhost/firstjsp"
                   user="root"
                   password="root"></sql:setDataSource>
<c:if test="${ !empty param.fname && !empty param.lname && !empty param.email &&  !empty param.contact && !empty param.address}">

        <sql:update dataSource="${studentData}" 
                    var="updateCount">
            UPDATE tbl_students SET first_name=?, last_name=?,email=?,contact_no=?,address=? WHERE id='${param.id}'
            <sql:param value="${param.fname}"></sql:param>
            <sql:param value="${param.lname}"></sql:param>
            <sql:param value="${param.email}"></sql:param>
            <sql:param value="${param.contact}"></sql:param>
            <sql:param value="${param.address}"></sql:param>                
        </sql:update>
    </c:if>
    <c:if test="${updateCount>=1}">
        <c:redirect url="index.jsp">
            <c:param name="updateSuccess" value="Record Update sucessfully"></c:param>

        </c:redirect>
    </c:if>

    <h1> Student Update Form </h1>


    <form role="form" method="POST" action="">

        <div class="form-group">
            <label for="name">First Name</label>
            <input class="form-control" name="fname" value="${student.firstName}"/>
        </div>
        <div class="form-group">
            <label for="name">First Name</label>
            <input class="form-control" name="fname" value="${student.getFirstName()}"/>
        </div>

        <div class="form-group">

            <label for="lname">Last Name</label>
            <input class="form-control" name="lname" value="${student.lastName}"/>
        </div>



        <div class="form-group">

            <label for="email">Email</label>
            <input class="form-control" name="email" value="${student.email}"/>
        </div>


        <div class="form-group">

            <label for="address">Address</label>
            <input  class="form-control" name="address" value="${student.address}"/>

        </div>


        <div class="form-group">
            <label for="conact">contact </label>
            <input  class="form-control" name="contact" value="${student.contactNo}"/>

        </div>


        <div class="form-group">
            <button class="btn btn-success btn-sm "type="submit">Update</button><span> <a href="index.jsp" class="btn btn-danger btn-sm">Cancel</a></span>
    </form>

    <%@include file="../layout/footer.jsp" %>