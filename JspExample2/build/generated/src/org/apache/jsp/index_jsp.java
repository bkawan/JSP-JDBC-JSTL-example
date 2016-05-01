package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bk.jspexample2.dao.StudentDAO;
import java.util.List;
import java.util.ArrayList;
import com.bk.jspexample2.dao.impl.StudentDAOImpl;
import com.bk.jspexample2.entity.Student;
import com.bk.jspexample2.validation.validate;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_update_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_update_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_param_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_redirect_url.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sql_update_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- bean objet-- like student = new Student() -->\n");
      com.bk.jspexample2.entity.Student student = null;
      synchronized (session) {
        student = (com.bk.jspexample2.entity.Student) _jspx_page_context.getAttribute("student", PageContext.SESSION_SCOPE);
        if (student == null){
          student = new com.bk.jspexample2.entity.Student();
          _jspx_page_context.setAttribute("student", student, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      com.bk.jspexample2.service.StudentService studentService = null;
      synchronized (_jspx_page_context) {
        studentService = (com.bk.jspexample2.service.StudentService) _jspx_page_context.getAttribute("studentService", PageContext.PAGE_SCOPE);
        if (studentService == null){
          studentService = new com.bk.jspexample2.service.StudentService();
          _jspx_page_context.setAttribute("studentService", studentService, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>JSP Example 2</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <link href=\"../../assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"navbar-fixed-top.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <!----\n");
      out.write("\n");
      out.write("\n");
      out.write("     String errMessage = null;\n");
      out.write("\n");
      out.write("     if (\"POST\".equalsIgnoreCase(request.getMethod())) {\n");
      out.write("         if (request.getParameter(\"fname\") == null) {\n");
      out.write("\n");
      out.write("             errMessage = \"This is required field\";\n");
      out.write("         } else {\n");
      out.write("\n");
      out.write("             StudentDAO stdDaoImpl = new StudentDAOImpl();\n");
      out.write("\n");
      out.write("             Student student = new Student();\n");
      out.write("\n");
      out.write("             student.setFirstName(request.getParameter(\"fname\"));\n");
      out.write("             student.setLastName(request.getParameter(\"lname\"));\n");
      out.write("\n");
      out.write("             student.setEmail(request.getParameter(\"email\"));\n");
      out.write("\n");
      out.write("             student.setAddress(request.getParameter(\"address\"));\n");
      out.write("             student.setContactNo(request.getParameter(\"contact\"));\n");
      out.write("\n");
      out.write("             stdDaoImpl.insert(student);\n");
      out.write("         }\n");
      out.write("     }\n");
      out.write(" \n");
      out.write("\n");
      out.write("--->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Fixed navbar -->\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\"   href=\"index.jsp\">Registration System JSP Example 2</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a id=\"\" href=\"\">Home</a></li>\n");
      out.write("                    <li><a id=\"linkRegister\" href=\"#\">Register</a></li>\n");
      out.write("                    <li><a id=\"linkStdList\" href=\"#\">List All</a></li>\n");
      out.write("                    <li><a id=\"\" href=\"admin/student/index.jsp\">Admin</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    <li><a href=\"#\">About</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("student"), "id", "1", null, null, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("student"), "firstName", "Bikesh", null, null, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("student"), "lastName", "Kawan", null, null, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("student"), "email", "bikeshkawang@gmail.com", null, null, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("student"), "address", "bhaktapur", null, null, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("student"), "contactNo", "9841709539", null, null, false);
      out.write("\n");
      out.write("\n");
      out.write("        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.contactNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <p><a href=\"admin/student/edit.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Edit</a> <a href=\"\">Delete</a></p>\n");
      out.write("        <p><a href=\"detail.jsp?\">More Detail...</a></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div id=\"stdList\" class=\"jumbotron\" style=\"display: \">\n");
      out.write("\n");
      out.write("            <h4> List of Registered People-Static list</h4>\n");
      out.write("            <table class=\"table table-bordered table-striped table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>ID</td>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td>Contact</td>\n");
      out.write("                        <td>Action</td>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.contactNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td><a href=\"\">Edit</a> <a href=\"\">Delete</a></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("                         <h4> List of Registered People-Dynamic List </h4>\n");
      out.write("            <table class=\"table table-bordered table-striped table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>ID</td>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td>Contact</td>\n");
      out.write("                        <td>Action</td>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"register\" class=\"jumbotron\" style=\"display: none;padding-top:50px\">\n");
      out.write("            <h1> Registration form </h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form role=\"form\" method=\"POST\" action=\"\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"name\">First Name</label>\n");
      out.write("\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"fname\" required=\"required\" maxlength=\"10\"/>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                    <label for=\"lname\">Last Name</label>\n");
      out.write("                    <input  type=\"text\" class=\"form-control\" name=\"lname\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                    <label for=\"email\">Email</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" name=\"email\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                    <label for=\"address\">Address</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"address\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"conact\">contact </label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"contact\"/>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" name=\"submit\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        $(document).on(\"ready\", function () {\n");
      out.write("\n");
      out.write("            $(\"#linkRegister\").on(\"click\", function () {\n");
      out.write("                $(\"#register\").slideToggle();\n");
      out.write("                $(\"#stdList\").hide();\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("            $(\"#linkStdList\").on(\"click\", function () {\n");
      out.write("                $(\"#stdList\").slideToggle();\n");
      out.write("                $(\"#register\").hide();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(\"table tr td #confirm-delete\").on(\"click\", function (e) {\n");
      out.write("                if (!confirm('Are you sure you want to Delete??')) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    </script> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ !empty param.fname && !empty param.lname && !empty param.email && !empty param.contact && !empty param.address}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_setDataSource_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_update_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_sql_setDataSource_0.setVar("studentData");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost/firstjsp");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("root");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_update_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:update
    org.apache.taglibs.standard.tag.rt.sql.UpdateTag _jspx_th_sql_update_0 = (org.apache.taglibs.standard.tag.rt.sql.UpdateTag) _jspx_tagPool_sql_update_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.UpdateTag.class);
    _jspx_th_sql_update_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_update_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_sql_update_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentData}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_update_0.setVar("result");
    int[] _jspx_push_body_count_sql_update_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_update_0 = _jspx_th_sql_update_0.doStartTag();
      if (_jspx_eval_sql_update_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_update_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_update_0[0]++;
          _jspx_th_sql_update_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_update_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            INSERT INTO tbl_students(first_name,last_name,email,contact_no,address) VALUES  (?,?,?,?,?);\n");
          out.write("             ");
          out.write("\n");
          out.write("\n");
          out.write("           \n");
          out.write("            ");
          if (_jspx_meth_sql_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_update_0, _jspx_page_context, _jspx_push_body_count_sql_update_0))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_update_0, _jspx_page_context, _jspx_push_body_count_sql_update_0))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_update_0, _jspx_page_context, _jspx_push_body_count_sql_update_0))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_update_0, _jspx_page_context, _jspx_push_body_count_sql_update_0))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_update_0, _jspx_page_context, _jspx_push_body_count_sql_update_0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_update_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_update_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_update_0[0]--;
      }
      if (_jspx_th_sql_update_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_update_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_update_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_update_0.doFinally();
      _jspx_tagPool_sql_update_var_dataSource.reuse(_jspx_th_sql_update_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_update_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_update_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_0 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_update_0);
    _jspx_th_sql_param_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.fname}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_0 = _jspx_th_sql_param_0.doStartTag();
    if (_jspx_th_sql_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
    return false;
  }

  private boolean _jspx_meth_sql_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_update_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_update_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_1 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_update_0);
    _jspx_th_sql_param_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.lname}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_1 = _jspx_th_sql_param_1.doStartTag();
    if (_jspx_th_sql_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
    return false;
  }

  private boolean _jspx_meth_sql_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_update_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_update_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_2 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_update_0);
    _jspx_th_sql_param_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_2 = _jspx_th_sql_param_2.doStartTag();
    if (_jspx_th_sql_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
    return false;
  }

  private boolean _jspx_meth_sql_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_update_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_update_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_3 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_update_0);
    _jspx_th_sql_param_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.contact}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_3 = _jspx_th_sql_param_3.doStartTag();
    if (_jspx_th_sql_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_3);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_3);
    return false;
  }

  private boolean _jspx_meth_sql_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_update_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_update_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_4 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_4.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_update_0);
    _jspx_th_sql_param_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.address}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_4 = _jspx_th_sql_param_4.doStartTag();
    if (_jspx_th_sql_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_4);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_4);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result>=1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_redirect_0.setUrl("admin/student/index.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_eval_c_redirect_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_redirect_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_redirect_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_redirect_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_redirect_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_redirect_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_redirect_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_redirect_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_redirect_0);
    _jspx_th_c_param_0.setName("successMsg");
    _jspx_th_c_param_0.setValue("Data inserted successfully");
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("std");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentService.getAll()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                <tr>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.getFirstName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.getLastName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.getContactNo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td><a href=\"admin/student/edit.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\" btn btn-success btn-sm glyphicon glyphicon-pencil\">Edit</a> <a id=\"confirm-delete\" href=\"admin/sutdent/delete.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\" btn btn-danger btn-sm glyphicon glyphicon-trash\">Delete</a></td>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                </tr>\n");
          out.write("\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
