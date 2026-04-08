
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
                <div class="col-sm-4"></div>
                <div class="col-sm-4 panel panel-body" style="box-shadow: 5px 5px 10px 5px skyblue;">
                    <h3 class="text-danger">Add Events</h3>
                    <hr style="height: 3px;background: green">
                    <form action="../Event" method="post" enctype="multipart/form-data">
                      Enter Event Name
                      <input type="text" class="form-control" name="txtname" required maxlength="20" >
                      Choose Event Picture
                      <input type="file" class="form-control" name="fupic" accept="image/*" required="">
                      <br>
                      <input type="submit" value="Upload Now" class="form-control btn-danger">
                    </form>
                </div>
                    <div class="col-sm-4"></div>
            </div>
        </div>
    </body>
</html>
