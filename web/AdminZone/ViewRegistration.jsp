<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DatabaseManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
         <link href="../js/akash.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="../MasterPage/AdminHeader.jsp" %>
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-3"></div>
                <div class="col-sm-5" style="box-shadow: 5px 5px 10px 5px skyblue;">
                    <h3 style="margin-left: 30%;font-size: 30px">View Registration</h3>
                    <hr style="height: 2px;background: black;margin-right: 30%;margin-left: 25%">
                    <table class="table-responsive table-condensed">
                        <thead style="background: forestgreen;color: white">
                            <tr style="font-size:18px">
                                <th>P.Name</th><th>Email</th><th>Mobile</th><th>Department</th>
                                <th>Date</th><th>Status</th><th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            String cmd="select * from register";
                            DatabaseManager db=new DatabaseManager();
                            ResultSet rs=db.DisplayRecords(cmd);
                            while(rs.next())
                            {
                                %>
                                <tr style="font-size:15px">
                                    
                                    <td><%=rs.getString("name")%></td>
                                    <td><%=rs.getString("email")%></td>
                                    <td><%=rs.getString("mobile")%></td>
                                    <td><%=rs.getString("department")%></td>
                                    <td><%=rs.getString("rdate")%></td>
                                    <td><%=rs.getString("status")%></td>
                                    <td>
                                        <a href="#" class="btn btn-info">Delete</a>
                                    </td>
                                </tr>
                                <%
                            }
                            %>
                        </tbody>
                    </table>
                </div>
                   <div class="col-sm-3"></div>     
            </div>
        </div>
                         <script src="../js/jquery.js" type="text/javascript"></script>
                            <script src="../js/akash.js" type="text/javascript"></script>
                            <script>
                                $(document).ready(function(){
                                    $("#example").DataTable();
                                })
                            </script>
    </body>
</html>


