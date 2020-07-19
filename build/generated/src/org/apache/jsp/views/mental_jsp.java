package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mental_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Mental Health Article", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <link href=\"views/css/mentalhealth.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("       <!--content1-->\n");
      out.write("        <div id=\"content1\">\n");
      out.write("           <div class=\"img\"><img src=\"public/assets/pink.jpeg\" alt=\"bg\"></div>\n");
      out.write("            <div class=\"quotes1\">\n");
      out.write("                <div class=\"ijo\"><img src=\"public/assets/ijo.jpeg\" alt=\"ijo\" width=\"300\" height=\"300\"></div>\n");
      out.write("                <h1><span style=\"color: #6c2e2e;\">What is mental health?</span> <br>\n");
      out.write("                Mental health is the ability to adjust to yourself,<br>\n");
      out.write("                 with others and the community and <br>\n");
      out.write("                  environment in which it lives.<br>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <!--content2-->\n");
      out.write("        \n");
      out.write("        <div id=\"content2\">\n");
      out.write("            <div class=\"image\"><img src=\"public/assets/tumblr.jpg\" alt=\"bg\" width=\"100%\" height=\"500\"></div>\n");
      out.write("            <div class=\"quotes2\">\n");
      out.write("                <h1>\n");
      out.write("                    <span style=\"color: #6c2e2e;\">Type of mental health :</span> <br>\n");
      out.write("                    depression, bipolar disorder, anxiety,<br>\n");
      out.write("                    posttraumatic stress disorder (PTSD),<br>\n");
      out.write("                    obsessive compulsive disorder (OCD), and psychosis. <br>\n");
      out.write("                    Some mental illnesses only occur in certain <br>\n");
      out.write("                    of sufferers, such as postpartum depression <br>\n");
      out.write("                    attacks the mother after giving birth<br>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--content3-->\n");
      out.write("        <div id=\"content3\">\n");
      out.write("            <div class=\"background\"> <img src=\"public/assets/pinkbg.png\" alt=\"pink\" width=\"1350\" height=\"500\"></div>\n");
      out.write("            <div class=\"ungu\"> <img src=\"public/assets/ungu.jpeg\" alt=\"ungu\" width=\"300\" height=\"300\"> </div>\n");
      out.write("            <div class=\"quotes3\">\n");
      out.write("                <h1><span style=\"color: #6c2e2e;\">Mental Health Medicine</span><br>\n");
      out.write("                1. Psychotherapy<br>\n");
      out.write("                2. Drugs<br>\n");
      out.write("                3. Inpatient<br>\n");
      out.write("                4. Support group<br>\n");
      out.write("                5. Brain stimulation<br>\n");
      out.write("                6. Treatment of substance abuse<br>\n");
      out.write("                </h1>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
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
