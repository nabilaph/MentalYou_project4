package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("About Us", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <link href=\"views/css/about.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <!--content1-->\n");
      out.write("        <div id=\"content1\">\n");
      out.write("            <img class=\"yoga\" src=\"public/assets/MentalYou-logo.png\" alt=\"MentalYou-logo.png\" width=\"420\" height=\"420\">\n");
      out.write("            <div class=\"quotes1\">\n");
      out.write("                <h1>Mental condition are the emotional<br>\n");
      out.write("                    foundation that affect daily<br>\n");
      out.write("                    activities, including ways of<br>\n");
      out.write("                    thinking, communication, learning,<br>\n");
      out.write("                    psychological resilience and self-confidence...<br>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--content2-->\n");
      out.write("        \n");
      out.write("        <div id=\"content2\">\n");
      out.write("            <img src=\"public/assets/7.png\" alt=\"bg\" width=\"1800\" height=\"500\">\n");
      out.write("            <div class=\"quotes2\">\n");
      out.write("                <h1>\n");
      out.write("                    When a person experiences mental<br>\n");
      out.write("                    stress that is sodis turbing that<br>\n");
      out.write("                    it hinders activity, the condition<br>\n");
      out.write("                    be considered mental illness<br>\n");
      out.write("                    This website was formed to help people<br>\n");
      out.write("                    who cannot go to a psychiatrist. <br>\n");
      out.write("                    of cost constraints and others.</span>.\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gambar\">\n");
      out.write("            <img src=\"public/assets/selfterapi.jpeg\" style=\"display: inline-block;\" alt=\"girl\" width=\"350\" height=\"350\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--content3-->\n");
      out.write("        <div id=\"content3\">\n");
      out.write("            <img class=\"yoga\" src=\"public/assets/MentalYou-logo.png\" alt=\"MentalYou-logo.png\" width=\"420\" height=\"420\">\n");
      out.write("            <div class=\"quotes3\">\n");
      out.write("                <h1>Our website provides<br>\n");
      out.write("                Articles and Consultation.<br>\n");
      out.write("                All for free!!!<br>\n");
      out.write("                For a paid consultation<br>\n");
      out.write("                can check on the MentalYou website.<br></h1>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/scripts.jsp", out, false);
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
