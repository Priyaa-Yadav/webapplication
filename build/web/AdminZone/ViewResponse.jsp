

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
        <%@include file="../MasterPage/AdminHeader.jsp" %>
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-3"></div>
                <div class="col-sm-7" style="box-shadow: 5px 5px 10px 5px skyblue;">
                    <h3 style="margin-left: 20%">View Response Management</h3>
                    <hr style="background: teal;height: 3px;margin-right: 40%">
                    <table class="table-responsive table-condensed">
                        <thead style="background: forestgreen;color: white">
                            <tr>
                                <th>CID</th><th>Complain</th>
                                <th>Response</th><th>Cdate</th>
                                <th>RDate</th><th>Edit</th><th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            String cmd="select * from complain inner join response on complain.cid=response.cid";
                            DatabaseManager db=new DatabaseManager();
                            ResultSet rs=db.DisplayRecords(cmd);
                            while(rs.next())
                            {
                                %>
                                <tr>
                                    <td><%=rs.getString("cid")%></td>
                                    <td><%=rs.getString("msg")%></td>
                                    <td><%=rs.getString("Response.msg")%></td>
                                    <td><%=rs.getString("cdate")%></td>
                                    <td><%=rs.getString("rdate")%></td>
                                    <td>
                                        <span class="fa fa-edit"></span>
                                    </td>
                                    <td>
                                        <span class="fa fa-trash-o"></span>
                                    </td>
                                </tr>
                                <%
                            }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
