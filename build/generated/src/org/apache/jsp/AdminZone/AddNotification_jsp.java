package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.DatabaseManager;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class AddNotification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminZone/../MasterPage/AdminHeader.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

String btn=request.getParameter("btnsave");
if(btn!=null)
{
    String name=request.getParameter("txtname");
    String msg=request.getParameter("txtmessage");
    SimpleDateFormat sm=new SimpleDateFormat();
    String dt=sm.format(new Date());
    DatabaseManager db=new DatabaseManager();
    String cmd="insert into notification values('"+name+"','"+msg+"','"+dt+"')";
    if(db.Insert_Update_Delete(cmd))
        out.print("<script>alert('Notification Add Successfully')</script>");
    else
        out.print("<script>alert('Unable to add')</script>");
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Notification</title>\n");
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
      out.write("                                <li><a href=\"../AdminZone/AddEvent.jsp\">AddEvent</a></li>\n");
      out.write("                              \n");
      out.write("                               <li><a href=\"../AdminZone/AddNotification.jsp\">Add Notification</a></li>\n");
      out.write("                               <li><a href=\"../AdminZone/ViewContact.jsp\">View Enquiry</a></li>\n");
      out.write("                               <li><a href=\"../AdminZone/ChangePassword.jsp\">Change Password</a></li>\n");
      out.write("                               <li><a href=\"../AdminZone/ViewRegistration.jsp\">View Registration</a></li>\n");
      out.write("                               <li><a href=\"../AdminZone/ViewFeedback.jsp\">View Feedback</a></li>\n");
      out.write("                               <li><a href=\"../AdminZone/ViewComplain.jsp\">View Complain</a></li>\n");
      out.write("                                <li><a href=\"../AdminZone/ResponseComplain.jsp\">Response Complain</a></li>\n");
      out.write("                                 <li><a href=\"../AdminZone/ViewResponse.jsp\">View Response</a></li>\n");
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
      out.write("                    <h3 class=\"text-capitalize text-center\">Add Notification Panel</h3>\n");
      out.write("                    <hr style=\"height: 3px;background: black;width: 60%\">\n");
      out.write("                    <form action=\"AddNotification.jsp\" method=\"post\">\n");
      out.write("                        Enter Notification Name\n");
      out.write("                        <input type=\"text\" name=\"txtname\" class=\"form-control\" required>\n");
      out.write("                        Enter Message\n");
      out.write("                        <textarea class=\"form-control\" name=\"txtmessage\" style=\"height: 160px\"></textarea><br>\n");
      out.write("                        <input type=\"submit\" name=\"btnsave\" class=\"form-control btn-warning\" value=\"Add Notification\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
