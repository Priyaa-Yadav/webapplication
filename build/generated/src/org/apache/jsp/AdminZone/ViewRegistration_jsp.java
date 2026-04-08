package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DatabaseManager;

public final class ViewRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"../js/akash.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-7\" style=\"box-shadow: 5px 5px 10px 5px skyblue;\">\n");
      out.write("                    <h3 style=\"margin-left: 30%;font-size: 30px\">View Registration</h3>\n");
      out.write("                    <hr style=\"height: 2px;background: black;margin-right: 35%;margin-left: 20%\">\n");
      out.write("                    <table class=\"table-responsive table-condensed\">\n");
      out.write("                        <thead style=\"background: forestgreen;color: white\">\n");
      out.write("                            <tr style=\"font-size:18px\">\n");
      out.write("                                <th>P.Name</th><th>Email</th><th>Mobile</th><th>Department</th>\n");
      out.write("                                <th>Date</th><th>Status</th><th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                            String cmd="select * from register";
                            DatabaseManager db=new DatabaseManager();
                            ResultSet rs=db.DisplayRecords(cmd);
                            while(rs.next())
                            {
                                
      out.write("\n");
      out.write("                                <tr style=\"font-size:15px\">\n");
      out.write("                                    \n");
      out.write("                                    <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("mobile"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("department"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("rdate"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-info\">Delete</a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                            }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                   <div class=\"col-sm-3\"></div>     \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                         <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("                            <script src=\"../js/akash.js\" type=\"text/javascript\"></script>\n");
      out.write("                            <script>\n");
      out.write("                                $(document).ready(function(){\n");
      out.write("                                    $(\"#example\").DataTable();\n");
      out.write("                                })\n");
      out.write("                            </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
