
<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DatabaseManager"%>
<html>
    <head>
        <title>Hospital Gallery</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <style>
            body{
                overflow-x: hidden;
            }
        </style>
       
    </head>
    <body>
       
        <%@include file="MasterPage/GeneralHeader.jsp" %>
        <div class="row">
             <h2 class="text-center mb-4" style="font-weight:bold;font-family: serif;font-size: 50px">Our Events</h2>
            <hr style="height: 2px;width: 40%;background: gray">
            <br>
            <div class="col-sm-12">
                <div class="col-sm-1"></div>
                <div class="col-sm-10">
                    <%
                    String cmd="select * from event";
                    DatabaseManager db=new DatabaseManager();
                    ResultSet rs=db.DisplayRecords(cmd);
                    while(rs.next())
                    {
                        %>
                        <div class="col-sm-4">
                            <img src="Event/<%=rs.getString("photo")%>" style="height: 200px;width: 100%" class="img-responsive img-thumbnail">
                            <h4 class="text-capitalize" style="font-family: serif"><%=rs.getString("name")%></h4>
                        </div>
                    <%
                    }
                    %>
                </div>
                <div class="col-sm-1"></div>
            </div>
        </div>
        <%@include file="MasterPage/GeneralFooter.jsp" %>
    </body>
</html>