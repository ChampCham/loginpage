/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.2
 * Generated at: 2019-06-11 16:26:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("file:/Users/Champcham/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1557906963000L));
    _jspx_dependants.put("/WEB-INF/../css/style.css", Long.valueOf(1560269713000L));
    _jspx_dependants.put("jar:file:/Users/Champcham/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        ");
      out.write("\n");
      out.write(".wrapper {\n");
      out.write("height: 100vh;\n");
      out.write("width: 100%;\n");
      out.write("display: flex;\n");
      out.write("flex-direction: column;\n");
      out.write("justify-content: center;\n");
      out.write("align-items: center;\n");
      out.write("background-color: rgba(35, 133, 166, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-wrapper {\n");
      out.write("width: 400px;\n");
      out.write("display: flex;\n");
      out.write("flex-direction: column;\n");
      out.write("padding: 20px 40px;\n");
      out.write("border-radius: 10px;\n");
      out.write("box-shadow: 0px 10px 50px #555;\n");
      out.write("background-color: whitesmoke;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("body {\n");
      out.write("color: #404E67;\n");
      out.write("background: #F5F7FA;\n");
      out.write("font-family: 'Open Sans', sans-serif;\n");
      out.write("}\n");
      out.write(".table-wrapper {\n");
      out.write("width: 700px;\n");
      out.write("margin: 30px auto;\n");
      out.write("background: #fff;\n");
      out.write("padding: 20px;\n");
      out.write("box-shadow: 0 1px 1px rgba(0,0,0,.05);\n");
      out.write("}\n");
      out.write(".table-title {\n");
      out.write("padding-bottom: 10px;\n");
      out.write("margin: 0 0 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input::placeholder {\n");
      out.write("font-size: 1.2em;\n");
      out.write("font-weight: lighter;\n");
      out.write("justify-content: center;\n");
      out.write("color: #999;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("width: 100%;\n");
      out.write("color: #111;\n");
      out.write("font-weight: bolder;\n");
      out.write("font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, Oxygen,\n");
      out.write("Ubuntu, Cantarell, \"Open Sans\", \"Helvetica Neue\", sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"/user\">User</a></li>\n");
      out.write("        <li><a href=\"/users\">Users</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <body>\n");
      out.write("        <h1>Register</h1>\n");
      out.write("        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <form action=\"/register\" method=\"post\">\n");
      out.write("        Username:<br/><input type=\"text\" name=\"username\"/>\n");
      out.write("        <br/>\n");
      out.write("        Password:<br/><input type=\"password\" name=\"password\"/>\n");
      out.write("        <br/>\n");
      out.write("        First name:<br/><input type=\"text\" name=\"firstName\"/>\n");
      out.write("        <br/>\n");
      out.write("        Last name:<br/><input type=\"text\" name=\"lastName\"/>\n");
      out.write("        <br><br>\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
