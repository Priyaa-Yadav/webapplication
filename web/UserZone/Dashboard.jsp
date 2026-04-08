<%
 String id=session.getAttribute("uid")+"";
 %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .col-sm-3{height: 120px;border: 5px solid white;padding: 4%;margin: 2%;box-shadow: 5px 5px 14px 5px lightgray;}
            #sp1{color: white;font-size: 30px;}
             #sp2{color: white;font-size: 20px;font-family: sans-serif;font-weight: bolder;}
             .col-sm-3:hover{border: black;transition: 5s ease;}
        </style>
    </head>
    <body>
        <%@include file="../MasterPage/UserHeader.jsp" %>
        <div class="container">
            <h3 class="text-center text-capitalize text-info"><b>Welcome <%=id%> User</b></h3>
            <hr style="background:forestgreen;width: 60%;height: 5px;">
            <div class="col-sm-12" style="margin-left:5%">
                <div class="col-sm-3" style="background: orangered">
                    <a href="../Contact.jsp" id="sp1" class="fa fa-dashboard">Dashboard</a>
                </div>
                <div class="col-sm-3" style="background: forestgreen">
                    <a href="feedback.jsp" id="sp1" class="fa fa-edit">Feedback</a>
                </div>
                <div class="col-sm-3" style="background: teal">
                    <a href="Complain.jsp" id="sp1" class="fa fa-envelope">Complain</a>
                    
                </div>
            </div>
             <div class="col-sm-12" style="margin-left:5%">
                 <div class="col-sm-3" style="background: yellowgreen">
                     <a id="sp1" href="ChangePassword.jsp" class="fa fa-lock"> Change Password</a>
                 </div>
                  <div class="col-sm-3" style="background: lightcoral">
                     <a id="sp1" href="MyProfile.jsp" class="fa fa-user-secret"> My Profile</a>
                 </div>
                  <div class="col-sm-3" style="background: lightgreen">
                     <a id="sp1" href="#" class="fa fa-power-off">Dashboard</a>
                 </div>
            </div>
        </div>
       
    </body>
</html>
