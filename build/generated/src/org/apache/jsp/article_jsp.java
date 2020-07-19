package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class article_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Articles", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <link href=\"views/css/article.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- scroll content 1 -->\n");
      out.write("        <div id=\"content1\">\n");
      out.write("            <div class=\"icon2\">\n");
      out.write("                <img src=\"public/assets/pinkbg.png\" alt=\"pink-bg\" width=\"700\" height=\"100\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon3\">\n");
      out.write("                <img src=\"public/assets/brainimg.jpg\" alt=\"brain-img\" width=\"400\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("            <div class=\"quotes1\">\n");
      out.write("                <h1>Get To Know You</h1>\n");
      out.write("                <p>First, lets start with getting to know what type of mental health issues \n");
      out.write("                   that you feel \n");
      out.write("                    this whole time</p>\n");
      out.write("                <h3><a href=\"mental.jsp\">Click Here!</a></h3>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--content 2-->\n");
      out.write("        <div id=\"content2\">\n");
      out.write("            <div class=\"heading1\">\n");
      out.write("                <h1>Self<br>The <br> rapy</h1>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"quotes2\">\n");
      out.write("                <p>If you ever feel stress and need something to make you relax <br>\n");
      out.write("                 we have some tips for you!</p>\n");
      out.write("                    <h3><a href=\"projekterapy.jsp\">Useful Tips!</a></h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--content 3-->\n");
      out.write("        <div id=\"content3\">\n");
      out.write("            <div class=\"book1\">\n");
      out.write("                <img src=\"public/assets/book1.png\" alt=\"book1\" width=\"100\" height=\"120\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"book2\">\n");
      out.write("                <img src=\"public/assets/book2.jpg\" alt=\"book-2\" width=\"100\" height=\"120\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"book3\">\n");
      out.write("                <img src=\"public/assets/book3.jpg\" alt=\"book-3\" width=\"100\" height=\"120\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bg1\">\n");
      out.write("                <img src=\"public/assets/pinkbg.png\" alt=\"pink1\" width=\"1200\" height=\"10\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bg2\">\n");
      out.write("                <img src=\"public/assets/pinkbg.png\" alt=\"pink2\" width=\"800\" height=\"10\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"quotes3\">\n");
      out.write("                <p><i class=\"fas fa-quote-left\"></i> Reading gives us <br> someplace to go <br>\n");
      out.write("                    when we have to stay <br> where we are <i class=\"fas fa-quote-right\"></i> </p>\n");
      out.write("                    <h4>-Mason Cooley</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"heading2\">\n");
      out.write("                <h1>Books <br> Recommendation</h1>\n");
      out.write("                <h3><a href=\"books.jsp\">Books Details</a></h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "views/layouts/scripts.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
}
