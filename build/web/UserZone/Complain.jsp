<%@page import="mypack.DatabaseManager" %>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
String id=session.getAttribute("uid")+"";
String btn=request.getParameter("btnsave");
SimpleDateFormat sm=new SimpleDateFormat();
String dt=sm.format(new Date());
if(btn!=null)
{
    String msg=request.getParameter("txtmsg");
    DatabaseManager db=new DatabaseManager();
    String cmd="insert into complain(userid,msg,cdate) values('"+id+"','"+msg+"','"+dt+"')";
    if(db.Insert_Update_Delete(cmd))
        out.print("<script>alert('Complain Save ! Admin Team Response shortly')</script>");
    else
      out.print("<script>alert('Error')</script>");
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/MasterPage/UserHeader.jsp" %>
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4 panel panel-heading" style="box-shadow: 5px 5px 10px 5px lightgreyg;">
                    <form action="Complain.jsp" method="post">
                        Complain Here
                        <textarea name="txtmsg" class="form-control" style="height: 160px" placeholder="Describe your Complaint" required></textarea>
                        <br>
                        <input type="submit" class="form-control btn-info" value="Complain Now" name="btnsave">
                    </form>                    
                </div>
                  <div class="col-sm-4"></div>
            </div>
        </div>
    </body>
</html>
