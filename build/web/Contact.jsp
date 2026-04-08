<%@page import="mypack.DatabaseManager" %>
<%
DatabaseManager db=new DatabaseManager();
out.print(db.getCon());
%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>   
<%
    if(request.getParameter("btncontact")!=null)
    {
        String name=request.getParameter("txtname");
        String email=request.getParameter("txtemail");
        String mobile=request.getParameter("txtmobile");
        String msg=request.getParameter("txtmsg");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        
        DatabaseManager db1=new DatabaseManager();
        String cmd="insert into contact(name,email,mobile,msg,cdate) values('"+name+"','"+email+"','"+mobile+"','"+msg+"','"+dt+"')";
        if(db1.Insert_Update_Delete(cmd))
            out.print("<script>alert('Enquiry Successfully done!')</script>");
        else
            out.print("<script>alert('Error!')</script>");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
        <style>
            .col-sm-6{padding: 2%;}
            .box2{padding: 3%;box-shadow: 5px 5px 12px 5px gray;margin: 2%;}
            .form-control{margin: 1%;}
            h3{font-size: 30px;text-align: center;font-weight: bold;}
            body{
                overflow-x: hidden;
            }
        </style>
        <script>
            function validation()
            {
                var name=txtname.value;
                var email=txtemail.value;
                var mobile=txtmobile.value;
                var mbl=mobile.length;
                if(name!="" && name!=null && email!="" && email!=null && mobile!=null && mobile!="" )
                {
                    if(mbl==10)
                    {
                        return true;
                    }
                    else
                    {
                        spmobile.innerText="Mobile Number should be 10 digit only";
                        spmobile.style.color="red";
                        return false;
                    }
                }
                else
                {
                    spname.innerText="Please Enter Name";
                    spemail.innerText="Please Enter email";
                    spmobile.innerText="Please Enter mobile";
                    spname.style.color="red";
                    spemail.style.color="red";
                    spmobile.style.color="red";
                    return false;
                }
            }
                    
        </script>
    </head>
    <body>
        <%@include file="MasterPage/GeneralHeader.jsp" %>
        <div class="row">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                <div class="box2">
                <h3>Contact Panel Here</h3>
                <hr style="height:3px;background: skyblue;width: 50%;">
                <form action="Contact.jsp" method="post" onsubmit="return validation()">
                    <div class="col-sm-6">
                        Enter Name
                        <input type="text" id="txtname" name="txtname" class="form-control">
                        <span id="spname"></span>
                        Enter Email
                        <input type="email" id="txtemail" name="txtemail" class="form-control">
                        <span id="spemail"></span>
                        Enter Mobile Number
                        <input type="text" id="txtmobile" name="txtmobile" class="form-control">
                        <span id="spmobile"></span>
                    </div>
                    <div class="col-sm-6">
                        Enter Description
                        <textarea class="form-control" name="txtmsg" style="height: 160px"></textarea>
                    </div>
                    <br>
                    <input type="submit" class="btn-info form-control" name="btncontact" value="Enquiry Now">
                </form>
            </div>
            </div>
            <div class="col-sm-2"></div>
        </div>
        <%@include file="MasterPage/GeneralFooter.jsp" %>
    </body>
</html>
