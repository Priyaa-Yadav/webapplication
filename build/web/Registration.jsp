<%@page import="mypack.DatabaseManager" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date" %>
<%
if(request.getParameter("btnsave")!=null)
{
    String name=request.getParameter("txtname");
    String email=request.getParameter("txtemail");
    String mobile=request.getParameter("txtmobile");
    String pass=request.getParameter("txtpass");
    String cpass=request.getParameter("txtcpass");
    String depart=request.getParameter("ddldepartment");
    SimpleDateFormat sm=new SimpleDateFormat();
    String dt=sm.format(new Date());
    if(pass.equals(cpass))
    {
        String cmd1="insert into register values('"+name+"','"+email+"','"+mobile+"','"+pass+"','"+depart+"','"+dt+"','yes')";
        
        String cmd2="insert into Login values('"+email+"','"+pass+"','utype','yes')";
        DatabaseManager db=new DatabaseManager();
        if(db.Insert_Update_Delete(cmd1)&& db.Insert_Update_Delete(cmd2))
        out.print("<script>alert('Registration done successfully!')</script>");
        else
            out.print("<script>alert('unable to save')</script>");
    }
    else
    {
        out.print("<script>alert('password and confirm password not match')</script>");
    }
}
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
       <title>Registration Form</title>
       
       
        
    </head>
        <body>
            <%@include file="MasterPage/GeneralHeader.jsp" %>
               
                <div class="col-sm-12">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8 panel panel-body" style="box-shadow: 5px 5px 10px 5px gray">
                        <h3 class="panel panel-heading text-center text-capitalize" style="background: #2098d1;color: white;font-family: serif">
                            Patient Registration 
                            <span class="fa fa-ambulance"></span>
                        </h3>
                        <form action="Registration.jsp" method="post">
                        <div class="col-sm-6">
                            Enter Name Here
                            <input type="text" class="form-control" name="txtname" required placeholder="enter name">
                            Enter Mobile Number
                            <input type="text" class="form-control" name="txtmobile" required placeholder="enter 10-digit mobile number" maxlength="10">
                            Enter password
                            <input type="password" class="form-control" name="txtpass" required>
                        </div>
                            <div class="col-sm-6">
                                Enter Email Here
                                <input type="text" class="form-control" name="txtemail" required>
                                Choose Department
                                <select name="ddldepartment" class="form-control" required>
                                    <option>Cardiology</option>
                                    <option>General Medicine</option>
                                    <option>Neurology</option>
                                    <option>OPD</option>
                                    <option>Ophthalmology</option>
                                    <option>Orthopedic</option>
                                </select>
                                Enter Confirm Password
                                <input type="password" class="form-control" name="txtcpass" required>
                                <br>
                                <input type="submit" name="btnsave" class="form-control btn-danger" value="Register Now">
                            </div>
                        </form>
                    </div>
                    <div class="col-sm-2"></div>
                </div>
            <%@include file="MasterPage/GeneralFooter.jsp" %>
        </body>
</html>
