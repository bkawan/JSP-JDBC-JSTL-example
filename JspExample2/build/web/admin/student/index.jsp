<%-- 
    Document   : index
    Created on : Apr 28, 2016, 3:55:58 PM
    Author     : bikeshkawan
--%>
<%@page import="java.io.*,java.util.*,java.sql.*" %>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@include file="../layout/header.jsp" %>
<jsp:useBean  id="studentService" class="com.bk.jspexample2.service.StudentService"/>


<div style="margin-top:20px">
<h1>Students</h1>


    <font size="5" color="green">
    <c:if test="${not empty param.successMsg}"> 
        <c:out value="${param.successMsg}"></c:out>
    </c:if>
    <c:if test="${not empty param.updateSuccess}">
        <c:out value="${param.updateSuccess}"></c:out>
    </c:if>
    <c:if test="${!empty param.deleteSuccess}">
        <c:out value="${param.deleteSuccess}"> </c:out>
    </c:if>
    </font>
  
 

    <h3>List of student </h3>
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
                    <td><a href="edit.jsp?id=${std.getId()}" class=" btn btn-success btn-sm glyphicon glyphicon-pencil">Edit</a> <a id="confirm-delete" href="delete.jsp?id=${std.getId()}" class=" btn btn-danger btn-sm glyphicon glyphicon-trash">Delete</a></td>





                </tr>

            </c:forEach>

        </tbody>

    </table>                         
</div>

<script>
    
     $(document).on("ready", function () {
     $("table tr td #confirm-delete").on("click", function (e) {
                if (!confirm('Are you sure you want to Delete??')) {
                    e.preventDefault();
                    return false;
                }
                return true;

            });
        });
</script>

<%@include file="../layout/footer.jsp" %>