<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DatabaseManager" %>
<%
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
                <div class="col-sm-3"></div>
                <div class="col-sm-6 panel panel-body" style="box-shadow: 5px 5px 10px 5px lightgrey">
                    <h4>Welcome ! <%=id%></h4>
                    <h3 class="panel panel-heading" style="background: #0F9E5E;color: white">User Profile</h3>
                    <form action="MyProfile.jsp" method="post">
                        Name here
                        <input type="text" name="txtname" class="form-control" value="<%=Name%>" placeholder="enter your name" required>
                        Email here
                        <input type="text" name="txtemail" class="form-control" value="<%=Email%>" placeholder="enter your email" required>
                        Mobile Number here
                        <input type="text" name="txtmobile" class="form-control" value="<%=Mobile%>" placeholder="enter your mobile number" required>
                        Registration Date
                        <input type="text" name="txtdate" class="form-control" value="<%=Dt%>" placeholder="enter date" required>
                        <br>
                        <input type="button" name="btnsave" class="btn btn-info" value="Edit">
                        <input type="submit" name="btnupdate" class="btn btn-success" value="Update">
                    </form>
                </div>
                <div class="col-sm-3"></div>
            </div>
        </div>
    </body>
</html>
