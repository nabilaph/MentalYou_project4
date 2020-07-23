package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Your Profile", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <link href=\"public/assets/backend/css/profile.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- scroll content 1 -->\n");
      out.write("         <div id=\"content1\">\n");
      out.write("            <img src=\"img/profile.jpg\" alt=\"bg\" width=\"100%\" height=\"1000\">\n");
      out.write("            <div class=\"quotes1\">\n");
      out.write("                <div class=\"headertext\"></div>\n");
      out.write("                <table border = \"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       <h1><span style=\"color: #db5980;\">Name :</span></h1></td>\n");
      out.write("                    <td><h1><span style=\"color: rgb(106, 59, 192);\"></h1> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <h1><span style=\"color: rgb(152, 93, 207);\">Phone    : </span></h1></td>\n");
      out.write("                    <td><h1><span style=\"color: rgb(106, 59, 192);\"></h1>  </td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <h1><span style=\"color: rgb(192, 59, 148);\">Mobile   : </span></h1></td>\n");
      out.write("                    <td><h1><span style=\"color: rgb(106, 59, 192);\"></h1>  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> \n");
      out.write("                        <h1><span style=\"color: rgb(226, 43, 150);\">Email    : </span></h1></td>\n");
      out.write("                    <td><h1><span style=\"color: rgb(106, 59, 192);\"></h1>  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> \n");
      out.write("                    <h1><span style=\"color: rgb(220, 43, 226);\">Birthday : </span></h1></td>\n");
      out.write("                    <td><h1><span style=\"color: rgb(106, 59, 192);\"></h1>  </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gambar\">\n");
      out.write("            <img src=\"img/hijab2.jpg\" style=\"display: inline-block;\" alt=\"girl\" width=\"320\" height=\"325\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("         <!--content2-->\n");
      out.write("         <div id=\"content2\">\n");
      out.write("            \n");
      out.write("            <div class=\"quotes2\">\n");
      out.write("                \n");
      out.write("                <div class=\"circle\"></div>\n");
      out.write("                <div class=\"headertext\">\n");
      out.write("                    <h3><span style=\"color: #db5980;\">Consultation Details</span><br></h3><br>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <!--content3-->\n");
      out.write("            \n");
      out.write("            <div class=\"quotes3\">\n");
      out.write("                <div class=\"date\" style=\"width: 200px; float:left; height:100px; margin:-7px; font-size: 12px;\">\n");
      out.write("                    <table border = \"0\"><tr><td><h3></h3><span style=\"color: rgb(128, 54, 197);\">Consultation Date</span>\n");
      out.write("                        <br></h3><br></td></tr>\n");
      out.write("                        <td><h2><span style=\"color: rgb(192, 59, 148);\"></span></h2> </td></table>\n");
      out.write("                    \n");
      out.write("                </div>   \n");
      out.write("                    <div class=\"hours\"style=\"width: 200px; float:left; height:100px; margin:115px; font-size: 12px;\">\n");
      out.write("                        <table border = \"0\"><tr><td><h3></h3><span style=\"color: rgb(128, 54, 197);\">Consultation Hours</span>\n");
      out.write("                            <br></h3><br></td></tr>\n");
      out.write("                            <td><h1><span style=\"color: rgb(192, 59, 148);\"></h1></td></table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"doctor\" style=\"width: 200px; float:left; height:100px; margin:325px; font-size: 12px;\">\n");
      out.write("                        <table border = \"0\"><tr><td><h3></h3><span style=\"color: rgb(128, 54, 197);\">Doctor's Name</span>\n");
      out.write("                            <br></h3><br></td></tr>\n");
      out.write("                            <td><h1><span style=\"color: rgb(192, 59, 148);\"></h1> </td></table>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                    \n");
      out.write("        </div>\n");
      out.write("         <!--content4-->\n");
      out.write("         <div id=\"content4\">\n");
      out.write("            <div class=\"via\" style=\"width: 100px; float:left; height:100px; margin:-7px; font-size: 12px;\">\n");
      out.write("                <table border = \"0\"><tr><td><h3></h3><span style=\"color: rgb(128, 54, 197);\">VIA</span><br></h3><br></td></tr>\n");
      out.write("                <td> <h1><span style=\"color: rgb(192, 59, 148);\"></h1> </td></table>\n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("            <div class=\"payment\" style=\"width: 100px; float:left; height:100px; margin:-100px; font-size: 12px;\">\n");
      out.write("                <table border = \"0\"><tr><td><h3></h3><span style=\"color: rgb(128, 54, 197);\">Payment</span><br></h3><br></td></tr>\n");
      out.write("                      <td><h1><span style=\"color: rgb(192, 59, 148);\"></h1> </td></table>\n");
      out.write("            </div>\n");
      out.write("                        \n");
      out.write("        </div>\n");
      out.write("         ");
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
