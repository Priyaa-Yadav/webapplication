<%@page import="mypack.DatabaseManager"%>
<%
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
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../MasterPage/UserHeader.jsp" %>
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4 panel panel-body" style="box-shadow: 5px 5px 10px 5px skyblue;">
                    <h2 class="text-danger">Change Password Panel</h2>
                    <form action="ChangePassword.jsp" method="post" onsubmit="return validationForm()">
                    Enter old password
                    <input type="password" name="txtoldpass" class="form-control" required>
                    Enter New Password
                    <input type="password" name="txtnewpass" class="form-control" required>
                    Enter Confirm Password
                    <input type="password" name="txtcpass" class="form-control" required>
                    <br>
                    <input type="submit" class="form-control btn-success" name="btnsave" value="Change Password">
                    </form>
                </div>
                <div class="col-sm-4"></div>
            </div>
        </div>
    </body>
</html>
