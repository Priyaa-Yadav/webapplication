package org.apache.jsp.UserZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DatabaseManager;

public final class MyProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/UserZone/../MasterPage/UserHeader.jsp");
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

String Name="",Email="",Mobile="",Dt="";
String id=session.getAttribute("uid")+"";
String cmd="select * from register where email='"+id+"'";
DatabaseManager db=new DatabaseManager();
ResultSet rs=db.DisplayRecords(cmd);
if(rs.next())
{
    Name=rs.getString("name");
    Email=rs.getString("email");
    Mobile=rs.getString("mobile");
    Dt=rs.getString("rdate");
}

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("  <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("  <style>\n");
      out.write("    #menu ul li a{color: white;}  \n");
      out.write("    nav{border: inherit}\n");
      out.write("  </style>\n");
      out.write("    <div class=\"row\">\n");
      out.write("           <div class=\"col-sm-12\" style=\"padding: 0px;\">\n");
      out.write("               <nav class=\"navbar navbar-default\" style=\"background: teal\">\n");
      out.write("                   <div class=\"container-fluid\">\n");
      out.write("                       <div class=\"navbar-header\" id=\"menu\">\n");
      out.write("                           <ul class=\"nav navbar-nav\" style=\"font-size: 18px;\">\n");
      out.write("                               <li><a href=\"../UserZone/Dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                               <li><a href=\"../UserZone/MyProfile.jsp\">MyProfile</a></li>\n");
      out.write("                               <li><a href=\"../UserZone/Complain.jsp\">Complain</a></li>\n");
      out.write("                               <li><a href=\"../UserZone/ChangePassword.jsp\">Change Password</a></li>\n");
      out.write("                               <li><a href=\"../UserZone/feedback.jsp\">Feedback</a></li>\n");
      out.write("                           </ul>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("               </nav>\n");
      out.write("           </div>\n");
      out.write("       </div>");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6 panel panel-body\" style=\"box-shadow: 5px 5px 10px 5px lightgrey\">\n");
      out.write("                    <h4>Welcome ! ");
      out.print(id);
      out.write("</h4>\n");
      out.write("                    <h3 class=\"panel panel-heading\" style=\"background: #0F9E5E;color: white\">User Profile</h3>\n");
      out.write("                    <form action=\"MyProfile.jsp\" method=\"post\">\n");
      out.write("                        Name here\n");
      out.write("                        <input type=\"text\" name=\"txtname\" class=\"form-control\" value=\"");
      out.print(Name);
      out.write("\" placeholder=\"enter your name\" required>\n");
      out.write("                        Email here\n");
      out.write("                        <input type=\"text\" name=\"txtemail\" class=\"form-control\" value=\"");
      out.print(Email);
      out.write("\" placeholder=\"enter your email\" required>\n");
      out.write("                        Mobile Number here\n");
      out.write("                        <input type=\"text\" name=\"txtmobile\" class=\"form-control\" value=\"");
      out.print(Mobile);
      out.write("\" placeholder=\"enter your mobile number\" required>\n");
      out.write("                        Registration Date\n");
      out.write("                        <input type=\"text\" name=\"txtdate\" class=\"form-control\" value=\"");
      out.print(Dt);
      out.write("\" placeholder=\"enter date\" required>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"button\" name=\"btnsave\" class=\"btn btn-info\" value=\"Edit\">\n");
      out.write("                        <input type=\"submit\" name=\"btnupdate\" class=\"btn btn-success\" value=\"Update\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("            </div>\n");
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
