

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery.js" type="text/javascript"></script>
        <script>
            $(document).ready(function(){
                $("#txt1").attr("placeholder","Enter 1 Number");
                 $("#txt2").attr("placeholder","Enter 2 Number");
                 $("input[type='text'],.btn-info").css("border","2px solid red")
                 $(".btn-info").click(function(){
                     var n1=Number($("#txt1").val());
                     var n2=Number($("#txt2").val());
                     $("#txt3").val("Addition is:"+(n1+n2));
                     $("#txt3").css({"color":"red","fontSize":"20px"});
                 })
            })
        </script>
    </head>
    <body>
        <h1>
          Example of small calculator
        </h1>
        <hr/>
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    Enter 1 Number
                    <input type="text" id="txt1" class="form-control">
                    Enter 2 Number
                    <input type="text" id="txt2" class="form-control">
                    Enter 3 Number
                    <input type="text" id="txt3" class="form-control">
                    <br>
                    <input type="button"  class="btn btn-info" value="+">
                </div>
                 <div class="col-sm-4"></div>
            </div>
        </div>
    </body>
</html>
