package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/Footer.html");
  }

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

      out.write('\n');
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>WordPower</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"owlcarousel/assets/owl.theme.green.css\">\t \n");
      out.write("        <link rel=\"stylesheet\" href=\"owlcarousel/assets/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"owlcarousel/assets/owl.theme.default.css\">\t \n");
      out.write("        <script type=\"text/javascript\" src=\"JQuery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"owlcarousel/owl.carousel.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.owl-carousel').owlCarousel({\n");
      out.write("                    slideSpeed: 300,\n");
      out.write("                    paginationSpeed: 400,\n");
      out.write("                    items: 1,\n");
      out.write("                    autoplay: true,\n");
      out.write("                    autoplayTimeout: 7000,\n");
      out.write("                    loop: true,\n");
      out.write("                    autoplayHoverPause: true\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(\".owl-prev\").html('<i class=\"left_arrow\"></i>');\n");
      out.write("            $(\".owl-next\").html('<i class=\"right_arrow\"></i>');\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"topBar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"top_btns\">\n");
      out.write("                    <a href=\"Login.jsp\" class=\"btn btn-info pull-right\">Login</a>\n");
      out.write("                    <a href=\"Registration.jsp\" class=\"btn btn-success pull-right \">Register</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <h1 class=\"text-center\">WordPower Learning Academy</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menuBar\">\n");
      out.write("            <div class=\"container\">\t\n");
      out.write("                <ul class=\"nav nav-pills\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Home.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">About Us <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"\">First</a></li>\n");
      out.write("                            <li><a href=\"\">Second</a></li>\n");
      out.write("                            <li><a href=\"\">third</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Contact Us <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"\">First</a></li>\n");
      out.write("                            <li><a href=\"\">Second</a></li>\n");
      out.write("                            <li><a href=\"\">third</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Our Mission <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"\">First</a></li>\n");
      out.write("                            <li><a href=\"\">Second</a></li>\n");
      out.write("                            <li><a href=\"\">third</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\" style=\"min-height: 400px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"img_slider\">\n");
      out.write("    <div class=\"owl-carousel\">\n");
      out.write("        <img src=\"images/img3.jpg\" style=\"width:1350px;height:760px;\">\n");
      out.write("        <img src=\"images/img5.jpg\" style=\"width:1350px;height: 760px;\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>    \n");
      out.write("        <footer>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                    <div class=\"foot foot_abt\">\n");
      out.write("                        <h3>About Us</h3>\n");
      out.write("                        <p>This word power academy is a platform for students preparing for different competitive examinations like GRE, GMAT, CAT etc.\n");
      out.write("So students will get access to a list of vocabulary words for different exams.\n");
      out.write("Words will be available for different examinations with different difficulty levels.Each learning module includes a quiz to test the words learnt.\n");
      out.write(" Based on the performance in the quizzes, a result will be generated to give  them an idea of their preparation.\n");
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"foot foot_cont\">\n");
      out.write("                        <h3>Contact Us</h3>\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li><a href=\"#\">#123,Sec-7,Chd</a></li>\n");
      out.write("                            <li><a href=\"tel:9876543210\">9876543210</a></li>\n");
      out.write("                            <li><a href=\"mailto:abc@gmail.com\">abc@gmail.com</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"foot foot_btns\">\n");
      out.write("                        <h3>Links</h3>\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li><a href=\"#\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                            <li><a href=\"#\">Our Mission</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
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
