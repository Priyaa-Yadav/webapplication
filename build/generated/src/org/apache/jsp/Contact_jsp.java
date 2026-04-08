package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.DatabaseManager;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

DatabaseManager db=new DatabaseManager();
out.print(db.getCon());

      out.write("\n");
      out.write("\n");
      out.write("   \n");

    if(request.getParameter("btncontact")!=null)
    {
        String name=request.getParameter("txtname");
        String email=request.getParameter("txtemail");
        String mobile=request.getParameter("txtmobile");
        String msg=request.getParameter("txtmsg");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        
        DatabaseManager db1=new DatabaseManager();
        String cmd="insert into contact(name,email,mobile,msg,cdate) values('"+name+"','"+email+"','"+mobile+"','"+msg+"','"+dt+"')";
        if(db1.Insert_Update_Delete(cmd))
            out.print("<script>alert('Enquiry Successfully done!')</script>");
        else
            out.print("<script>alert('Error!')</script>");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact Us</title>\n");
      out.write("        <style>\n");
      out.write("            .col-sm-6{padding: 2%;}\n");
      out.write("            .box2{padding: 3%;box-shadow: 5px 5px 12px 5px gray;margin: 2%;}\n");
      out.write("            .form-control{margin: 1%;}\n");
      out.write("            h3{font-size: 30px;text-align: center;font-weight: bold;}\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function validation()\n");
      out.write("            {\n");
      out.write("                var name=txtname.value;\n");
      out.write("                var email=txtemail.value;\n");
      out.write("                var mobile=txtmobile.value;\n");
      out.write("                var mbl=mobile.length;\n");
      out.write("                if(name!=\"\" && name!=null && email!=\"\" && email!=null && mobile!=null && mobile!=\"\" )\n");
      out.write("                {\n");
      out.write("                    if(mbl==10)\n");
      out.write("                    {\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        spmobile.innerText=\"Mobile Number should be 10 digit only\";\n");
      out.write("                        spmobile.style.color=\"red\";\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    spname.innerText=\"Please Enter Name\";\n");
      out.write("                    spemail.innerText=\"Please Enter email\";\n");
      out.write("                    spmobile.innerText=\"Please Enter mobile\";\n");
      out.write("                    spname.style.color=\"red\";\n");
      out.write("                    spemail.style.color=\"red\";\n");
      out.write("                    spmobile.style.color=\"red\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("                    \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("            #menu ul li a{color: white;}\n");
      out.write("            .icon{height: 30px;width: 30px;background: white;float: left;margin:1%;text-align:center;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\" style=\"background: whitesmoke;color: white;padding: .5%;font-size: 18px;\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <span class=\"fa fa-paper-plane\" style=\"color:blue\"></span>\n");
      out.write("                         <span class=\"text\" style=\"color:grey;\">youremail@email.com</span>\n");
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
      out.write("                    <a href=\"Registration.jsp\" class=\"btn btn-primary\" style=\"padding-top:0.25rem;padding-bottom: 0.25rem;\">Appointment</a>\n");
      out.write("                </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\"></div>\n");
      out.write("                    <div class=\"col-sm-8\" style=\"padding:1%\">\n");
      out.write("                        <img src=\"image/image/medi.png\" alt=\"\" class=\"img-responsive\" style=\"height:100px\"/>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"col-sm-4\"></div>        \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("       <div class=\"row\">\n");
      out.write("           <div class=\"col-sm-12\" style=\"padding: 0px;\">\n");
      out.write("               <nav class=\"navbar navbar-default\" style=\"background: #00aba9\">\n");
      out.write("                   <div class=\"container-fluid\">\n");
      out.write("                       <div class=\"navbar-header\" id=\"menu\">\n");
      out.write("                           <ul class=\"nav navbar-nav\" style=\"font-size: 18px;\">\n");
      out.write("                               <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                               <li><a href=\"About Us.jsp\">About Us</a></li>\n");
      out.write("                               <li><a href=\"Gallery.jsp\">Gallery</a></li>\n");
      out.write("                               <li><a href=\"Contact.jsp\">Contact</a></li>\n");
      out.write("                               <li><a href=\"Registration.jsp\">Registration</a></li>\n");
      out.write("                               <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("                               <li><a href=\"Department.jsp\">Department</a></li>\n");
      out.write("                           </ul>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("               </nav>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       ");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <div class=\"box2\">\n");
      out.write("                <h3>Contact Panel Here</h3>\n");
      out.write("                <hr style=\"height:3px;background: skyblue;width: 50%;\">\n");
      out.write("                <form action=\"Contact.jsp\" method=\"post\" onsubmit=\"return validation()\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        Enter Name\n");
      out.write("                        <input type=\"text\" id=\"txtname\" name=\"txtname\" class=\"form-control\">\n");
      out.write("                        <span id=\"spname\"></span>\n");
      out.write("                        Enter Email\n");
      out.write("                        <input type=\"email\" id=\"txtemail\" name=\"txtemail\" class=\"form-control\">\n");
      out.write("                        <span id=\"spemail\"></span>\n");
      out.write("                        Enter Mobile Number\n");
      out.write("                        <input type=\"text\" id=\"txtmobile\" name=\"txtmobile\" class=\"form-control\">\n");
      out.write("                        <span id=\"spmobile\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        Enter Description\n");
      out.write("                        <textarea class=\"form-control\" name=\"txtmsg\" style=\"height: 160px\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" class=\"btn-info form-control\" name=\"btncontact\" value=\"Enquiry Now\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
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
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            footer{background: whitesmoke;padding: 85px 0;}\n");
      out.write("            single-content{padding: 115px 0;text-align: center;}\n");
      out.write("            footer p{font-size: 14px;color: black}\n");
      out.write("            footer .social-links a{font-size: 18px;}\n");
      out.write("            footer .list-unstyled a{text-decoration: none;color: black;font-size: 14px;}\n");
      out.write("            footer .list-unstyled a:hover{color: black;}\n");
      out.write("            .footer-bottom{border-top: 1px solid white;padding-top: 10px;font-size: 14px;}\n");
      out.write("            address{color: black;}\n");
      out.write("            .icon{height: 30px;width: 30px;background: white;float: left;margin:1%;text-align:center;}\n");
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
      out.write("    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
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
      out.write("                    <h5 style=\"color:black;font-weight: bolder\"><a href=\"Department.jsp\">DEPARTMENTS</a></h5>\n");
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
      out.write("                    <h5 style=\"color:black;font-weight: bolder\">USEFUL LINKS</h5>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"#\" >Home</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">Department</a></li>\n");
      out.write("                        <li><a href=\"#\">Doctor</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5 style=\"color:black;font-weight: bolder\">Services</h5>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"#\" >Emergency help</a></li>\n");
      out.write("                        <li><a href=\"#\">Qualified doctors</a></li>\n");
      out.write("                        <li><a href=\"#\">Location & Direction</a></li>\n");
      out.write("                        <li><a href=\"#\">Medical Treatment</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <h5 style=\"color:black;font-weight: bolder\">Our Location</h5>\n");
      out.write("                    <address>\n");
      out.write("                        <div class=\"fa fa-location-arrow\"> 200, D-block, Green lane USA</div><br>\n");
      out.write("                        <a href=\"#\">+10 367 467 8934</a><br>\n");
      out.write("                        <a href=\"#\">docmed@contact.com</a>\n");
      out.write("                    </address>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--<div class=\"footer-bottom text-center mt-4\">\n");
      out.write("            <p>Copyright @2024 MedicalSite. All rights reserved.</p>\n");
      out.write("        </div>-->\n");
      out.write("    </footer>\n");
      out.write("    <div class=\"footer-bottom text-center mt-4\" style=\"background: #00aba9;color: white;\">\n");
      out.write("            <p>Copyright @2024 MedicalSite. All rights reserved.</p>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
