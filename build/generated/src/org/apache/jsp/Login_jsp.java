package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DatabaseManager;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');

String id=request.getParameter("btnlogin");
if(id!=null)
{
    String my_type="";
    String userid=request.getParameter("txtid");
    String pass=request.getParameter("txtpass");
    String cmd="select * from Login where userid='"+userid+"' and password='"+pass+"' and status='yes'";
    DatabaseManager db=new DatabaseManager();
    ResultSet rs=db.DisplayRecords(cmd);
    if(rs.next())
    {
        my_type=rs.getString("type"); //utype/atype
        if(my_type.equals("utype"))
        {
          session.setAttribute("uid", userid);
          response.sendRedirect("UserZone/Dashboard.jsp");
        }
        else if(my_type.equals("atype"))
        {
            session.setAttribute("aid", userid);
            response.sendRedirect("/Admin/Dashboard.jsp");
        }
        else
        {
            response.sendRedirect("Login.jsp");
        }
    }
    else
    {
        out.print("<script>alert('Invalid Userid or password')</script>");
    }
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("      <style>\n");
      out.write("        .input-group{\n");
      out.write("            margin-top: 2%;\n");
      out.write("        }\n");
      out.write("        .btn-info{margin-top:2%}\n");
      out.write("        .panel-heading{\n");
      out.write("            background: #2098d1;color: white;font-family: cursive;font-weight: bold;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("                overflow-x: hidden;\n");
      out.write("            }\n");
      out.write("      </style>\n");
      out.write("      <script>\n");
      out.write("        function hide()\n");
      out.write("        {\n");
      out.write("            sp2.style.display=\"none\";\n");
      out.write("        }\n");
      out.write("        function show()\n");
      out.write("        {\n");
      out.write("            var pswd=document.getElementById(\"txtpass\").type;\n");
      out.write("            if(pswd=='password')\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"txtpass\").type=\"text\";\n");
      out.write("            document.getElementById(\"sp2\").style.display=\"block\";\n");
      out.write("            document.getElementById(\"sp1\").style.display=\"none\";\n");
      out.write("        }\n");
      out.write("        }\n");
      out.write("        function show2()\n");
      out.write("        {\n");
      out.write("            var ps=txtpass.type;//text\n");
      out.write("            if(ps=='text')\n");
      out.write("        {\n");
      out.write("            txtpass.type=\"password\";\n");
      out.write("            sp1.style.display=\"block\";\n");
      out.write("            sp2.style.display=\"none\";\n");
      out.write("        }\n");
      out.write("        }\n");
      out.write("        function validpass()\n");
      out.write("        {\n");
      out.write("            var pass=txtpass.value;\n");
      out.write("            var psw=pass.length;\n");
      out.write("            if(psw>0 && psw<=4)\n");
      out.write("        {\n");
      out.write("            sppass.style.color=\"red\";\n");
      out.write("            sppass.innerText=\"Password to short\"\n");
      out.write("        }\n");
      out.write("        else if(psw>=5 && psw<=8)\n");
      out.write("        {\n");
      out.write("            sppass.style.color=\"blue\";\n");
      out.write("            sppass.innerText=\"Password to medium\"\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            sppass.style.color=\"green\";\n");
      out.write("            sppass.innerText=\"Password to strong\"\n");
      out.write("        }\n");
      out.write("        }\n");
      out.write("      </script>  \n");
      out.write("      </head>\n");
      out.write("    <body onload=\"hide()\">\n");
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
      out.write("            body{\n");
      out.write("                overflow-x: hidden;\n");
      out.write("            }\n");
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
      out.write("                               <li><a href=\"Doctors.jsp\">Doctors</a></li>\n");
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
      out.write("            <div class=\"col-sm-4\"></div> \n");
      out.write("            <div class=\"col-sm-4 panel panel-body\" style=\"box-shadow: 5px 5px 12px 5px gray;\">\n");
      out.write("                <h2 class=\"panel panel-heading\" style=\"background: #2098d1;\">login panel here <span class=\"fa fa-key fa-spin\" style=\"font-size: 30px;color: white\"></span></h2>\n");
      out.write("            <form action=\"Login.jsp\" method=\"post\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" placeholder=\"enter user id\" class=\"form-control\" name=\"txtid\" id=\"txtid\">\n");
      out.write("                    <div class=\"input-group-btn\">\n");
      out.write("                        <button class=\"btn btn-info\" type=\"button\">\n");
      out.write("                        <span class=\"fa fa-user\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"txtpass\" name=\"txtpass\" placeholder=\"enter password\" onkeyup=\"validpass()\">\n");
      out.write("                    <div class=\"input-group-btn\">\n");
      out.write("                        <button class=\"btn btn-danger\" type=\"button\">\n");
      out.write("                            <span class=\"fa fa-eye\" id=\"sp1\" onclick=\"show()\"></span>\n");
      out.write("                            <span class=\"fa fa-eye-slash\" id=\"sp2\" onclick=\"show2()\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <span id=\"sppass\"></span><br>\n");
      out.write("                <input type=\"submit\" value=\"login now\" name=\"btnlogin\" class=\"btn btn-info\"> <a><span style=\"margin-left: 5%;font-size: 20px;cursor: pointer\">create new user</span></a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\"></div>\n");
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
      out.write("                    <h5 style=\"color:black;font-weight: bolder\">DEPARTMENTS</h5>\n");
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
