<%@page import="java.sql.ResultSet" %>
<%@page import="mypack.DatabaseManager" %>
<%
String id=request.getParameter("btnlogin");
if(id!=null)
{
    String my_type="";
    String userid=request.getParameter("txtid");
    String pass=request.getParameter("txtpass");
    String cmd="select * from Login where userid='"+userid+"' and password='"+pass+"' and status='yes'";
    DatabaseManager db=new DatabaseManager();
    ResultSet rs=db.DisplayRecords(cmd);
    if(rs.next())
    {
        my_type=rs.getString("type"); //utype/atype
        if(my_type.equals("utype"))
        {
          session.setAttribute("uid", userid);
          response.sendRedirect("UserZone/Dashboard.jsp");
        }
        else if(my_type.equals("atype"))
        {
            session.setAttribute("aid", userid);
            response.sendRedirect("AdminZone/Dashboard.jsp");
        }
        else
        {
            response.sendRedirect("Login.jsp");
        }
    }
    else
    {
        out.print("<script>alert('Invalid Userid or password')</script>");
    }
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
      <style>
        .input-group{
            margin-top: 2%;
        }
        .btn-info{margin-top:2%}
        .panel-heading{
            background: #2098d1;color: white;font-family: cursive;font-weight: bold;
        }
        body{
                overflow-x: hidden;
            }
      </style>
      <script>
        function hide()
        {
            sp2.style.display="none";
        }
        function show()
        {
            var pswd=document.getElementById("txtpass").type;
            if(pswd=='password')
        {
            document.getElementById("txtpass").type="text";
            document.getElementById("sp2").style.display="block";
            document.getElementById("sp1").style.display="none";
        }
        }
        function show2()
        {
            var ps=txtpass.type;//text
            if(ps=='text')
        {
            txtpass.type="password";
            sp1.style.display="block";
            sp2.style.display="none";
        }
        }
        function validpass()
        {
            var pass=txtpass.value;
            var psw=pass.length;
            if(psw>0 && psw<=4)
        {
            sppass.style.color="red";
            sppass.innerText="Password to short"
        }
        else if(psw>=5 && psw<=8)
        {
            sppass.style.color="blue";
            sppass.innerText="Password to medium"
        }
        else
        {
            sppass.style.color="green";
            sppass.innerText="Password to strong"
        }
        }
      </script>  
      </head>
    <body onload="hide()">
        <%@include file="MasterPage/GeneralHeader.jsp" %>
        <div class="row">
            <div class="col-sm-4"></div> 
            <div class="col-sm-4 panel panel-body" style="box-shadow: 5px 5px 12px 5px gray;">
                <h2 class="panel panel-heading" style="background: #2098d1;">login panel here <span class="fa fa-key fa-spin" style="font-size: 30px;color: white"></span></h2>
            <form action="Login.jsp" method="post">
                <div class="input-group">
                    <input type="text" placeholder="enter user id" class="form-control" name="txtid" id="txtid" required>
                    <div class="input-group-btn">
                        <button class="btn btn-info" type="button">
                        <span class="fa fa-user"></span>
                    </button>
                    </div>
                </div>
                <div class="input-group">
                    <input type="password" class="form-control" id="txtpass" name="txtpass" required placeholder="enter password" onkeyup="validpass()">
                    <div class="input-group-btn">
                        <button class="btn btn-danger" type="button">
                            <span class="fa fa-eye" id="sp1" onclick="show()"></span>
                            <span class="fa fa-eye-slash" id="sp2" onclick="show2()"></span>
                        </button>
                    </div>
                </div>
                <span id="sppass"></span><br>
                <input type="submit" value="login now" name="btnlogin" class="btn btn-info">
            </form>
        </div>
        <div class="col-sm-4"></div>
        </div>
        <%@include file="MasterPage/GeneralFooter.jsp" %>
    </body>
</html>