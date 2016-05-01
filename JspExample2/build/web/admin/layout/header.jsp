<%-- 
    Document   : header
    Created on : Apr 28, 2016, 4:18:18 PM
    Author     : bikeshkawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${SITE_URL}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="${SITE_URL}/assets/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../../assets/lib/jquery-1.12.3.min.js" type="text/javascript"></script>
        <link href="${SITE_URL}/assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>

        <title>Student Page</title>
    </head>
    <body>
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
                        <li><a id="linkRegister" href="${SITE_URL}/index.jsp">Public Page</a></li>
                        <li><a id="linkStdList" href="index.jsp">List All</a></li>




                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Contact</a></li>
                        <li><a href="#">About</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <div class="container" style="margin-top: 50px">
