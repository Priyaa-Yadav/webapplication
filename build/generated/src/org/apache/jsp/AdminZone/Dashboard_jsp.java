package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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


 String id=session.getAttribute("aid")+"";
 
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .col-sm-3{height: 120px;border: 5px solid white;padding: 4%;margin: 2%;box-shadow: 5px 5px 14px 5px lightgray;}\n");
      out.write("            #sp1{color: white;font-size: 30px;}\n");
      out.write("             #sp2{color: white;font-size: 20px;font-family: sans-serif;font-weight: bolder;}\n");
      out.write("             .col-sm-3:hover{border: black;transition: 5s ease;}\n");
      out.write("        </style>\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center text-capitalize text-info\"><b>Dashboard ");
      out.print(id);
      out.write("Admin</b></h3>\n");
      out.write("            <hr style=\"background:forestgreen;width: 60%;height: 5px;\">\n");
      out.write("            <div class=\"col-sm-12\" style=\"margin-left:5%\">\n");
      out.write("                <div class=\"col-sm-3\" style=\"background: orangered\">\n");
      out.write("                    <a href=\"AddEvent.jsp\" id=\"sp1\" class=\"fa fa-dashboard\">Add Event</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\" style=\"background: forestgreen\">\n");
      out.write("                    <a href=\"ResponseComplain.jsp\" id=\"sp1\" class=\"fa fa-edit\">Response Complain</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\" style=\"background: teal\">\n");
      out.write("                    <a href=\"ViewComplain.jsp\" id=\"sp1\" class=\"fa fa-envelope\"> View Complain</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-sm-3\" style=\"background: yellowgreen\">\n");
      out.write("                    <a href=\"ViewContact.jsp\" id=\"sp1\" class=\"fa fa-envelope\"> View Contact</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-sm-3\" style=\"background: tomato\">\n");
      out.write("                    <a href=\"ViewFeedback.jsp\" id=\"sp1\" class=\"fa fa-envelope\"> View Feedback</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-sm-3\" style=\"background: violet\">\n");
      out.write("                    <a href=\"ViewRegistration.jsp\" id=\"sp1\" class=\"fa fa-envelope\">View Registration</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-sm-12\" style=\"margin-left:5%\">\n");
      out.write("                 <div class=\"col-sm-3\" style=\"background: grey\">\n");
      out.write("                     <a id=\"sp1\" href=\"AddNotification.jsp\" class=\"fa fa-lock\">Add Notification</a>\n");
      out.write("                 </div>\n");
      out.write("                  <div class=\"col-sm-3\" style=\"background: lightcoral\">\n");
      out.write("                     <a id=\"sp1\" href=\"ViewResponse.jsp\" class=\"fa fa-user-secret\">View Response</a>\n");
      out.write("                 </div>\n");
      out.write("                  <div class=\"col-sm-3\" style=\"background: lightgreen\">\n");
      out.write("                     <a id=\"sp1\" href=\"Dashboard.jsp\" class=\"fa fa-power-off\">Dashboard</a>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
