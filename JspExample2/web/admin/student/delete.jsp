<%-- 
    Document   : delete
    Created on : Apr 9, 2016, 10:40:21 PM
    Author     : bikeshkawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*,java.sql.*" %>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>

   <c:if test="${!empty param.id}">
        <sql:setDataSource var="studentData"
                           driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/firstjsp"
                           user="root"
                           password="root"></sql:setDataSource>
        <sql:update dataSource="${studentData}" var="deleteCount">
            DELETE FROM tbl_students WHERE id= '${param.id}'
        </sql:update>
        <c:if test="${deleteCount>=1}">
            <c:redirect url="index.jsp">
                <c:param name="deleteSuccess" value="Successfully delete the record of id  ${param.id}"></c:param>
            </c:redirect>
        </c:if>
    </c:if>

<%
//    StudentDAO stdDao = new StudentDAOImpl();
//
//    int id = Integer.valueOf(request.getParameter("id"));
//    Student student = stdDao.getById(id);
//
//    if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
//        response.sendRedirect("index.jsp");
//    }
//    else if (student == null)
//    {
//        response.sendRedirect("index.jsp");
//
//    }else{
//        
//        stdDao.delete(id);
//        response.sendRedirect("index.jsp");
//
//        
//    }
//    
    
%>

