package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("login", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <link href=\"public/assets/backend/css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!--content1-->\n");
      out.write("        <div id=\"content1\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"public/assets/backend/img/MentalYou-logo.png\" alt=\"logo\" width=\"300\" height=\"300\">\n");
      out.write("            </div>\n");
      out.write("             <form id=\"login\" class=\"form-group\">\n");
      out.write("                <h1>LOGIN</h1>\n");
      out.write("                <div class=\"username\">\n");
      out.write("                    <label>Username</label>\n");
      out.write("                    <input class=\"control-name\" type=\"text\"\n");
      out.write("                           name=\"username\" required/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pass\">\n");
      out.write("                    <label>Password</label>\n");
      out.write("                    <input class=\"control-pass\" type=\"password\"\n");
      out.write("                           name=\"name\" required/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn\">\n");
      out.write("                    <input type=\"checkbox\" class=\"check-box\"><span style=\"color: #fff3d1; font-size: 12px; padding-left: 5px; \"\n");
      out.write("                    >Remember Password</span>\n");
      out.write("                    <button type=\"submit\" class=\"submit-btn\">LOGIN</button>\n");
      out.write("                    <a href=\"signup\">Click Here To Create An Account</a>\n");
      out.write("                </div>\n");
      out.write("             </form>\n");
      out.write("        </div>\n");
      out.write("        <!-- footer -->\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("         \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/scripts.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
