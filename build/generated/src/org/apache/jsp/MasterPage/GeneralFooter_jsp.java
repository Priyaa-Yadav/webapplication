package org.apache.jsp.MasterPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GeneralFooter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>footer</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            footer{background: whitesmoke;padding: 85px 0;}\n");
      out.write("            single-content{padding: 115px 0;text-align: center;}\n");
      out.write("            footer p{font-size: 15px;color: white}\n");
      out.write("            footer .social-links a{font-size: 18px;}\n");
      out.write("            footer .list-unstyled a{text-decoration: none;color: white;font-size: 15px;}\n");
      out.write("            footer .list-unstyled a:hover{color: white;}\n");
      out.write("            .footer-bottom{border-top: 1px solid white;padding-top: 10px;font-size: 15px;}\n");
      out.write("            address{color: white;}\n");
      out.write("            .icon{height: 30px;width: 30px;background: white;float: left;margin:1%;text-align:center;}\n");
      out.write("            .col-md-2{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"single-content\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    <!--<div class=\"row\">\n");
      out.write("        <div class=\"col-sm-12\" style=\"background: gray;padding: 2%;color: white; text-align: center\">\n");
      out.write("            <p>@ 2024 MedicalSite. All rights reserved. </p>\n");
      out.write("        </div>\n");
      out.write("    </div>-->\n");
      out.write("    <footer style=\"background: teal;color:white\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\" style=\"color:white\">\n");
      out.write("                    <img src=\"image/image/medi.png\" alt=\"Docmed Logo\" width=\"120\">\n");
      out.write("                    <p>Far far away, behind the<br> word mountains, far from<br> the countries.</p>\n");
      out.write("                    <div class=\"social-links\">\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a></div>\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a></div>\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5 style=\"color:white;font-weight: bold;font-size: 18px\">DEPARTMENTS</h5>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"Department.jsp\" >Neurology</a></li>\n");
      out.write("                        <li><a href=\"Department.jsp\" >Ophthalmology</a></li>\n");
      out.write("                        <li><a href=\"Department.jsp\" >Nuclear Magnetic</a></li>\n");
      out.write("                        <li><a href=\"Department.jsp\" >X-ray</a></li>\n");
      out.write("                        <li><a href=\"Department.jsp\" >Dental</a></li>\n");
      out.write("                        <li><a href=\"Department.jsp\" >Surgical</a></li>\n");
      out.write("                        <li><a href=\"Department.jsp\" >Cardiological</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5 style=\"color:white;font-weight: bold;font-size: 18px\">USEFUL LINKS</h5>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"Home.jsp\" >Home</a></li>\n");
      out.write("                        <li><a href=\"About Us.jsp\">About</a></li>\n");
      out.write("                        <li><a href=\"Department.jsp\">Department</a></li>\n");
      out.write("                        <li><a href=\"Doctors.jsp\">Doctor</a></li>\n");
      out.write("                        <li><a href=\"Contact.jsp\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5 style=\"color:white;font-weight: bold;font-size: 18px\">SERVICES</h5>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"Services.jsp\" >Emergency help</a></li>\n");
      out.write("                        <li><a href=\"Services.jsp\">Qualified doctors</a></li>\n");
      out.write("                        <li><a href=\"Services.jsp\">Location & Direction</a></li>\n");
      out.write("                        <li><a href=\"Services.jsp\">Medical Treatment</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5 style=\"color:white;font-weight: bold;font-size: 18px\">OUR LOCATION</h5>\n");
      out.write("                    <address>\n");
      out.write("                        <div class=\"fa fa-location-arrow\"> 200, D-block, Green lane USA</div><br>\n");
      out.write("                        <a href=\"#\" style=\"color:white\">+10 367 467 8934</a><br>\n");
      out.write("                        <a href=\"#\" style=\"color:white\">docmed@contact.com</a>\n");
      out.write("                    </address>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </footer>\n");
      out.write("    <div class=\"footer-bottom text-center mt-4\" style=\"background:black;color: white;padding: 1%\">\n");
      out.write("            <span>Copyright @ Arcane Programming InfotechLucknow</span>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
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
