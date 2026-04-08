package org.apache.jsp.UserZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import mypack.DatabaseManager;
import java.text.SimpleDateFormat;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

String id=session.getAttribute("uid")+"";
String btn=request.getParameter("btnsave");
if(btn!=null)
{
    String rate=request.getParameter("txtrate");
     String msg=request.getParameter("txtmsg");
     SimpleDateFormat sm=new SimpleDateFormat();
     String dt=sm.format(new Date());
     DatabaseManager db=new DatabaseManager();
     String cmd="insert into feedback(msg,rate,id,fdate) values('"+msg+"','"+rate+"','"+id+"','"+dt+"')";
     if(db.Insert_Update_Delete(cmd))
         out.print("<script>alert('Feedback submitted')</script>");
     else
       out.print("<script>alert('unable to save')</script>");  
}

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #sp1,#sp2,#sp3,#sp4,#sp5{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            #s1,#s2,#s3,#s4,#s5{\n");
      out.write("                font-size: 40px;cursor: pointer;\n");
      out.write("            }\n");
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
      out.write("               <nav class=\"navbar navbar-default\" style=\"background: lightblue\">\n");
      out.write("                   <div class=\"container-fluid\">\n");
      out.write("                       <div class=\"navbar-header\" id=\"menu\">\n");
      out.write("                           <ul class=\"nav navbar-nav\" style=\"font-size: 18px;\">\n");
      out.write("                               <li><a href=\"../UserZone/Dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                               <li><a href=\"../UserZone/MyProfile.jsp\">MyProfile</a></li>\n");
      out.write("                               <li><a href=\"../UserZone/Complain.jsp\">Complain</a></li>\n");
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
      out.write("                <div class=\"col-sm-4\" style=\"box-shadow: 5px 5px 10px 5px lightgrey\">\n");
      out.write("                    <h3 style=\"color: white;background: orange\" class=\"text-center panel panel-heading text-capitalize\">Feedback Management</h3>\n");
      out.write("                    Rate Now<br>\n");
      out.write("                    <span class=\"fa fa-star-o\" id=\"s1\"></span>\n");
      out.write("                     <span class=\"fa fa-star-o\" id=\"s2\"></span>\n");
      out.write("                      <span class=\"fa fa-star-o\" id=\"s3\"></span>\n");
      out.write("                       <span class=\"fa fa-star-o\" id=\"s4\"></span>\n");
      out.write("                        <span class=\"fa fa-star-o\" id=\"s5\"></span>\n");
      out.write("                        \n");
      out.write("                        <span class=\"fa fa-star-o\" id=\"sp1\">1</span>\n");
      out.write("                     <span class=\"fa fa-star-o\" id=\"sp2\">2</span>\n");
      out.write("                      <span class=\"fa fa-star-o\" id=\"sp3\">3</span>\n");
      out.write("                       <span class=\"fa fa-star-o\" id=\"sp4\">4</span>\n");
      out.write("                        <span class=\"fa fa-star-o\" id=\"sp5\">5</span>\n");
      out.write("                        <br>\n");
      out.write("                        <form action=\"feedback.jsp\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"txtrate\">\n");
      out.write("                        Write your Reviews<br>\n");
      out.write("                        <textarea style=\"height: 160px\" class=\"form-control\" name=\"txtmsg\"></textarea><br>\n");
      out.write("                        <input type=\"submit\" class=\"form-control btn-info\" value=\"Feedback Now\" name=\"btnsave\">\n");
      out.write("                        </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var total=\"\";\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                alert(\"okk\");\n");
      out.write("                $(\"#s1\").click(function(){\n");
      out.write("                    total=$(\"#sp1\").text();//1\n");
      out.write("                    $(\"#s1\").css(\"color\",\"red\")\n");
      out.write("                    $(\"#s2,#s3,#s4,#s5\").css(\"color\",\"black\")\n");
      out.write("                    $(\"input[name='txtrate']\").val(total);\n");
      out.write("                })\n");
      out.write("                 $(\"#s2\").click(function(){\n");
      out.write("                    total=$(\"#sp2\").text();//1\n");
      out.write("                    $(\"#s1,#s2\").css(\"color\",\"red\")\n");
      out.write("                    $(\"#s3,#s4,#s5\").css(\"color\",\"black\")\n");
      out.write("                    $(\"input[name='txtrate']\").val(total);\n");
      out.write("                })\n");
      out.write("                 $(\"#s3\").click(function(){\n");
      out.write("                    total=$(\"#sp3\").text();//1\n");
      out.write("                    $(\"#s1,#s2,#s3\").css(\"color\",\"lightgreen\")\n");
      out.write("                    $(\"#s4,#s5\").css(\"color\",\"black\")\n");
      out.write("                    $(\"input[name='txtrate']\").val(total);\n");
      out.write("                })\n");
      out.write("                 $(\"#s4\").click(function(){\n");
      out.write("                    total=$(\"#sp4\").text();//1\n");
      out.write("                    $(\"#s1,#s2,#s3,#s4\").css(\"color\",\"green\")\n");
      out.write("                    $(\"#s5\").css(\"color\",\"black\")\n");
      out.write("                    $(\"input[name='txtrate']\").val(total);\n");
      out.write("                })\n");
      out.write("                 $(\"#s5\").click(function(){\n");
      out.write("                    total=$(\"#sp5\").text();//1\n");
      out.write("                    $(\"#s1,#s2,#s3,#s4,#s5\").css(\"color\",\"green\")\n");
      out.write("                    $(\"input[name='txtrate']\").val(total);\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("        </script>\n");
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
