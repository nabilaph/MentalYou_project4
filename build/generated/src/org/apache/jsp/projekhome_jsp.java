package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class projekhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Psychology Consultant Website", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <link href=\"views/css/projekhome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- scroll content 1 -->\n");
      out.write("        <div id=\"content1\">\n");
      out.write("                <div class=\"icon1\">\n");
      out.write("                    <img class=\"yoga\" src=\"public/assets/Mental.png\" alt=\"yoga-icon\" width=\"420\" height=\"420\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"quotes1\">\n");
      out.write("                    <h1>love your <br>\n");
      out.write("                        <span style=\"color: #6c2e2e;\">mental health</span>,\n");
      out.write("                        <br>\n");
      out.write("                        love <span style=\"color: #6c2e2e;\">yourself</span>\n");
      out.write("                    </h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"chev\">\n");
      out.write("                    <a href=\"#\"><i class=\"fas fa-chevron-down\"></i></a>\n");
      out.write("                </div>    \n");
      out.write("        </div>\n");
      out.write("        <!-- scroll content 2 -->\n");
      out.write("        <div id=\"content2\" style=\"background-image: url(public/assets/bgpage2.png);\">\n");
      out.write("            <div class=\"quotes2\">\n");
      out.write("                <h1>heal your stressful day <br>\n");
      out.write("                    by reading our articles <br>\n");
      out.write("                    and you can <span style=\"color: #6c2e2e;\">talk to us</span>!\n");
      out.write("                </h1>\n");
      out.write("                <h3><a href=\"projekconsul.jsp\">check out more!</a></h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- scroll content 3 -->\n");
      out.write("        <div id=\"content3\">\n");
      out.write("            <img src=\"public/assets/manyface.jpeg\" alt=\"manyface\" width=\"550\" height=\"385\">\n");
      out.write("            <div class=\"quotes3\">\n");
      out.write("                <h1>check our articles for a lot of insightful \n");
      out.write("                    information about mental health\n");
      out.write("                </h1>\n");
      out.write("                <h3><a href=\"article.jsp\">go to articles \n");
      out.write("                    <i class=\"fas fa-long-arrow-alt-right\" style=\"font-size: 30px;\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/scripts.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
