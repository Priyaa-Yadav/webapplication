package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DatabaseManager;

public final class Gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/MasterPage/GeneralHeader.jsp");
    _jspx_dependants.add("/MasterPage/GeneralFooter.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Hospital Gallery</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                overflow-x: hidden;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");
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
      out.write("        <li><a href=\"Registration.jsp\">Membership</a></li>\n");
      out.write("        <li><a href=\"Contact.jsp\">Contact</a></li>\n");
      out.write("        <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("        <li><a href=\"Doctors.jsp\">Doctor</a></li>\n");
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
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("             <h2 class=\"text-center mb-4\" style=\"font-weight:bold;font-family: serif;font-size: 50px\">Our Events</h2>\n");
      out.write("            <hr style=\"height: 2px;width: 40%;background: gray\">\n");
      out.write("            <br>\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    ");

                    String cmd="select * from event";
                    DatabaseManager db=new DatabaseManager();
                    ResultSet rs=db.DisplayRecords(cmd);
                    while(rs.next())
                    {
                        
      out.write("\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <img src=\"Event/");
      out.print(rs.getString("photo"));
      out.write("\" style=\"height: 200px;width: 100%\" class=\"img-responsive img-thumbnail\">\n");
      out.write("                            <h4 class=\"text-capitalize\" style=\"font-family: serif\">");
      out.print(rs.getString("name"));
      out.write("</h4>\n");
      out.write("                        </div>\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
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
      out.write("                        <li><a href=\"#\" >Neurology</a></li>\n");
      out.write("                        <li><a href=\"#\" >Ophthalmology</a></li>\n");
      out.write("                        <li><a href=\"#\" >Nuclear Magnetic</a></li>\n");
      out.write("                        <li><a href=\"#\" >X-ray</a></li>\n");
      out.write("                        <li><a href=\"#\" >Dental</a></li>\n");
      out.write("                        <li><a href=\"#\" >Surgical</a></li>\n");
      out.write("                        <li><a href=\"#\" >Cardiological</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5 style=\"color:white;font-weight: bold;font-size: 18px\">USEFUL LINKS</h5>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"#\" >Home</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">Department</a></li>\n");
      out.write("                        <li><a href=\"#\">Doctor</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5 style=\"color:white;font-weight: bold;font-size: 18px\">SERVICES</h5>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"#\" >Emergency help</a></li>\n");
      out.write("                        <li><a href=\"#\">Qualified doctors</a></li>\n");
      out.write("                        <li><a href=\"#\">Location & Direction</a></li>\n");
      out.write("                        <li><a href=\"#\">Medical Treatment</a></li>\n");
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
