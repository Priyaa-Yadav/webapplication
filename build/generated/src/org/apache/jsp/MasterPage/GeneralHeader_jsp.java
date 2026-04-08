package org.apache.jsp.MasterPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GeneralHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MediQuickCare</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                overflow-x: hidden;\n");
      out.write("            }\n");
      out.write("            #myNavbar ul li a{\n");
      out.write("                color:white;font-weight: bold;font-family: sans-serif;font-size: 18px;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("            }\n");
      out.write("            .icon{\n");
      out.write("                border:2px solid teal;border-radius: 50%;\n");
      out.write("            }\n");
      out.write("            .icon:hover{\n");
      out.write("                border:2px solid teal;border-radius: 50%;background: maroon;color:white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\" style=\"background: whitesmoke;color: white;padding: .5%;font-size: 18px;\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <span class=\"fa fa-paper-plane\" style=\"color:blue\"></span>\n");
      out.write("                         <span class=\"text\" style=\"color:grey;font-family:calibri\">mediquickcare@gmail.com</span>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("<div class=\"social-media\">\n");
      out.write("    <div class=\"icon\">\n");
      out.write("        <a href=\"#\"><span class=\"fa fa-facebook\"></span></a></div>\n");
      out.write("    <div class=\"icon\">\n");
      out.write("        <a href=\"#\"><span class=\"fa fa-twitter\"></span></a></div>\n");
      out.write("    <div class=\"icon\">\n");
      out.write("        <a href=\"#\"><span class=\"fa fa-instagram\"></span></a></div>\n");
      out.write("    <div class=\"icon\">\n");
      out.write("        <a href=\"#\"><span class=\"fa fa-dribbble\"></span></a></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <a href=\"Registration.jsp\" class=\"btn btn-primary\" style=\"background: teal\">Book Now Appointment</a>\n");
      out.write("                </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-2\"></div>\n");
      out.write("                    <div class=\"col-sm-3\" style=\"padding:1%\">\n");
      out.write("                        <img src=\"image/image/medi.png\" alt=\"\" class=\"img-responsive\" style=\"height:70px\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\" style=\"margin-top: 2%;font-size: 20px;font-weight: bold\">\n");
      out.write("                        <span class=\"fa fa-times-circle-o\"> Appointment </span><br>\n");
      out.write("                        <span>Times : 10:00 to 07:00</span>\n");
      out.write("                    </div>   \n");
      out.write("                     <div class=\"col-sm-3\" style=\"margin-top: 2%;font-size: 20px;font-weight: bold\">\n");
      out.write("                        <span class=\"fa fa-phone\"> 6898765678 , 9876542321 </span><br>\n");
      out.write("                        <span class=\"fa fa-windows\" style=\"font-weight: bold\"> www.mediquickcase.org</span>\n");
      out.write("                    </div>   \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       <div class=\"row\">\n");
      out.write("           <nav class=\"navbar navbar-inverse\" style=\"background: teal\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">MediquickCare</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"About Us.jsp\">About Us</a></li>\n");
      out.write("        <li><a href=\"Gallery.jsp\">Events</a></li>\n");
      out.write("        <li><a href=\"Department.jsp\">Department</a></li>\n");
      out.write("        <li><a href=\"Doctors.jsp\">Doctor</a></li>\n");
      out.write("        <li><a href=\"Services.jsp\">Services</a></li>\n");
      out.write("        <li><a href=\"Registration.jsp\">Membership</a></li>\n");
      out.write("        <li><a href=\"Contact.jsp\">Contact</a></li>\n");
      out.write("        <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("      </ul>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       ");
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
