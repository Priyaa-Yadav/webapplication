<%
 String id=session.getAttribute("aid")+"";
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
        <%@include file="../MasterPage/AdminHeader.jsp" %>
        <div class="container">
            <h3 class="text-center text-capitalize text-info"><b>Dashboard <%=id%>Admin</b></h3>
            <hr style="background:forestgreen;width: 60%;height: 5px;">
            <div class="col-sm-12" style="margin-left:5%">
                <div class="col-sm-3" style="background: orangered">
                    <a href="AddEvent.jsp" id="sp1" class="fa fa-dashboard">Add Event</a>
                </div>
                <div class="col-sm-3" style="background: forestgreen">
                    <a href="ResponseComplain.jsp" id="sp1" class="fa fa-edit">Response Complain</a>
                </div>
                <div class="col-sm-3" style="background: teal">
                    <a href="ViewComplain.jsp" id="sp1" class="fa fa-envelope"> View Complain</a>
                    
                </div>
                 <div class="col-sm-3" style="background: yellowgreen">
                    <a href="ViewContact.jsp" id="sp1" class="fa fa-envelope"> View Contact</a>
                    
                </div>
                 <div class="col-sm-3" style="background: tomato">
                    <a href="ViewFeedback.jsp" id="sp1" class="fa fa-envelope"> View Feedback</a>
                    
                </div>
                 <div class="col-sm-3" style="background: violet">
                    <a href="ViewRegistration.jsp" id="sp1" class="fa fa-envelope">View Registration</a>
                    
                </div>
            </div>
             <div class="col-sm-12" style="margin-left:5%">
                 <div class="col-sm-3" style="background: grey">
                     <a id="sp1" href="AddNotification.jsp" class="fa fa-lock">Add Notification</a>
                 </div>
                  <div class="col-sm-3" style="background: lightcoral">
                     <a id="sp1" href="ViewResponse.jsp" class="fa fa-user-secret">View Response</a>
                 </div>
                  <div class="col-sm-3" style="background: lightgreen">
                     <a id="sp1" href="Dashboard.jsp" class="fa fa-power-off">Dashboard</a>
                 </div>
            </div>
        </div>
        
    </body>
</html>

