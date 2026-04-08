<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DatabaseManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="../MasterPage/AdminHeader.jsp" %>
            <div class="row">
                <div class="col-sm-12">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8" style="box-shadow: 5px 5px 10px 5px skyblue;">
                        <h3 class="text-center text-uppercase">View Complain Details</h3>
                        <hr style="height: 3px;width: 60%;background: black">
                        <table class="table table-responsive" id="example">
                            <thead style="background: forestgreen;color: white">
                                <tr>
                                    <th>ID</th><th>UserId</th><th>Complain</th><th>Date</th><th>Action</th><th>Response</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                String cmd="select * from Complain";
                                DatabaseManager db=new DatabaseManager();
                                ResultSet rs=db.DisplayRecords(cmd);
                                while(rs.next())
                                {
                                   %>
                                   <tr>
                                       <td><%=rs.getString("cid")%></td>
                                       <td><%=rs.getString("userid")%></td>
                                       <td><%=rs.getString("msg")%></td>
                                       <td><%=rs.getString("cdate")%></td>
                                       <td>
                                           <a href="#" class="btn btn-info">Delete</a>
                                       </td>
                                        <td>
                                           <a href="ResponseComplain.jsp?res=<%=rs.getString("cid")%>" class="btn btn-warning">Response</a>
                                       </td>
                                   </tr>
                                   <%
                                }
                                %>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-sm-2"></div>
                </div>
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
