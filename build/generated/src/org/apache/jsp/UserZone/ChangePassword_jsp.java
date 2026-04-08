package org.apache.jsp.UserZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.DatabaseManager;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String id=session.getAttribute("uid")+"";
String btn=request.getParameter("btnsave");
if(btn!=null)
{
    String oldpass=request.getParameter("txtoldpass");
    String newpass=request.getParameter("txtnewpass");
    String cpass=request.getParameter("txtcpass");
    if(newpass.equals(cpass))
    {
    String cmd="update login set password='"+newpass+"' where userid='"+id+"' and password='"+oldpass+"'";
    DatabaseManager db=new DatabaseManager();
    if(db.Insert_Update_Delete(cmd))
        out.print("<script>alert('Password change successfully')</script>");
    else
       out.print("<script>alert('Unable to change')</script>"); 
    }
    else
    {
        out.print("<script>alert('Newpass and confirm pass is not match')</script>");
    }
}

      out.write("\n");
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
      out.write("               <nav class=\"navbar navbar-default\" style=\"background: lightblue\">\n");
      out.write("                   <div class=\"container-fluid\">\n");
      out.write("                       <div class=\"navbar-header\" id=\"menu\">\n");
      out.write("                           <ul class=\"nav navbar-nav\" style=\"font-size: 18px;\">\n");
      out.write("                               <li><a href=\"../UserZone/Dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                               <li><a href=\"../UserZone/MyProfile.jsp\">MyProfile</a></li>\n");
      out.write("                               <li><a href=\"#\">View Enquiry</a></li>\n");
      out.write("                               <li><a href=\"../UserZone/ChangePassword.jsp\">Change Password</a></li>\n");
      out.write("                               <li><a href=\"#\">View Registration</a></li>\n");
      out.write("                               <li><a href=\"#\">Logout</a></li>\n");
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
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4 panel panel-body\">\n");
      out.write("                    <h2 class=\"text-danger\">Change Password Panel</h2>\n");
      out.write("                    <form action=\"ChangePassword.jsp\" method=\"post\">\n");
      out.write("                    Enter old password\n");
      out.write("                    <input type=\"password\" name=\"txtoldpass\" class=\"form-control\">\n");
      out.write("                    Enter New Password\n");
      out.write("                    <input type=\"password\" name=\"txtnewpass\" class=\"form-control\">\n");
      out.write("                    Enter Confirm Password\n");
      out.write("                    <input type=\"password\" name=\"txtcpass\" class=\"form-control\">\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" class=\"form-control btn-success\" name=\"btnsave\" value=\"Change Password\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
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
