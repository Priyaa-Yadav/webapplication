

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <style>
            .box3{
                height: 250px;width: 85%;border: 3px solid white;border-radius: 30px;margin-top: 45%;margin-top: -15%;margin-left: 12%;
            }
            .box3:hover{background: #1b6d85;}
            .box9{
                width: 100%;height: 150px;background: lightpink;padding: 1%;border-radius: 20px;
            }
            
            
            .col-sm-7{flex: 1;padding: 10px;margin-right: 10px;}
            .col-sm-4 img{width: 18vw;height: 30vh;border-radius: 50%;margin-left: 30px}
            body{
                overflow-x: hidden;
            }
        </style>
    </head>
    <body>
        <%@include file="MasterPage/GeneralHeader.jsp" %>
        <div class="row" style="height: 700px;background-image: linear-gradient(to top,paleturquoise,lightskyblue)">
            <div class="col-sm-12">
                <h3 style="text-align: center;font-size: 40px;font-weight: bold;font-family: sans-serif;margin-top: 5%">Qualified Healthcare Professional Doctors</h3>
                 <hr style="height:2px;background: white;width: 70%;">
                <br>
                
                <div class="col-sm-3">
                    <img src="image/image/team-1.jpg" style="border-radius: 50%;height: 200px;width: 200px;margin-left: 33%;margin-top: 20px;border: 4px solid white" alt=""/>
                    <div class="box3" style="height:260px">
                        <h2 style="text-align: center;color: white;font-size: 30px;margin-top: 25%;font-weight: bold">Dr. Vivek Singh</h2>
                        <p style="font-size:20px;text-align: center;color: white">He is specialist doctor of <br>our hospital.He is a Neurology<br> specialist doctor,</p>
                </div>
                </div>
                <br>
                <div class="col-sm-3">
                    <img src="image/image/team-2.jpg" style="border-radius: 50%;height: 200px;width: 200px;margin-left: 33%;margin-bottom: 10px;border: 4px solid white" alt=""/>
                    <div class="box3" style="height:255px">
                        <h2 style="text-align: center;color: white;font-size: 30px;margin-top: 25%;font-weight: bold">Dr. Neeraj Gautam</h2>
                        <p style="font-size:20px;text-align: center;color: white">He is specialist doctor of <br>our hospital.He is a Cardiology<br> specialist doctor,</p>
                </div>
                </div>
                <br>
                <div class="col-sm-3" style="margin-top:0px">
                    <img src="image/image/team-3.jpg" style="border-radius: 50%;height: 200px;width: 200px;margin-left: 33%;border: 4px solid white" alt=""/>
                    <div class="box3">
                        <h2 style="text-align: center;color: white;font-size: 30px;margin-top: 25%;font-weight: bold">Dr. Supriya Yadav</h2>
                        <p style="font-size:20px;text-align: center;color: white">He is specialist doctor of <br>our hospital.He is a Gynecologist<br> specialist doctor,</p>
                        
                    </div>
                </div>
                <div class="col-sm-3">
                    <img src="image/image/doctor.jpeg" style="border-radius: 50%;height: 200px;width: 200px;margin-left: 33%;border: 4px solid white" alt=""/>
                    <div class="box3">
                        <h2 style="text-align: center;color: white;font-size: 30px;margin-top: 25%;font-weight: bold">Dr. Saurabh Singh</h2>
                        <p style="font-size:20px;text-align: center;color: white">He is specialist doctor of <br>our hospital.He is a Ophthamology<br> specialist doctor,</p>
                        
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
        <h3 style="text-align: center;font-size: 40px;font-weight: bold;font-family: sans-serif;margin-top: 5%">Qualified Doctors</h3>
                 <hr style="height:3px;background: teal;width: 50%;">
                <br>
                 <hr style="height: 2px;width: 100%;background: gray">
                <div class="col-sm-12">
                    <div class="col-sm-4">
                        <img src="image/image/team-1.jpg" alt=""/>
                    </div>
                    <div class="col-sm-7">
                        <h2 style="font-weight:bold">Dr. Vivek Singh</h2>
                        <h4>Department: Neurology </h4>
                        <p>He is specialist doctor of our hospital.He is a Neurology specialist doctor.Neurology is a branch of medicine that deals with disorders</p>
                        <p> of the brain and the cardiovascular system.</p>
                        <p style="font-weight: bold">Available: Monday & Tuesday<p>
                        <p style="font-weight: bold">Timing: 9:00am-4:00pm</p>
                    </div>
                </div>
                <br>
                 <hr style="height: 2px;width: 90%;background: gray">
                 <div class="col-sm-12">
                    <div class="col-sm-4">
                        <img src="image/image/team-2.jpg" alt=""/>
                    </div>
                    <div class="col-sm-7">
                        <h2 style="font-weight:bold">Dr. Neeraj Gautam</h2>
                        <h4>Department: Neurology </h4>
                        <p>He is specialist doctor of our hospital.He is a Neurology specialist doctor.Neurology is a branch of medicine that deals with disorders</p>
                        <p> of the brain and the cardiovascular system.</p>
                        <p style="font-weight: bold">Available: Wednesday & Thursday<p>
                        <p style="font-weight: bold">Timing: 2:00am-6:00pm</p>
                    </div>
                </div>
                <br>
                 <hr style="height: 2px;width: 90%;background: gray">
                 <div class="col-sm-12">
                    <div class="col-sm-4">
                        <img src="image/image/team-3.jpg" alt=""/>
                    </div>
                    <div class="col-sm-7">
                        <h2 style="font-weight:bold">Dr. Supriya Yadav</h2>
                        <h4>Department: Gynecology </h4>
                        <p>He is specialist doctor of our hospital.He is Gynecology specialist doctor.Neurology is a branch of medicine that deals with disorders</p>
                        <p> of the female  and the cardiovascular system.</p>
                        <p style="font-weight: bold">Available: Friday & Saturday<p>
                        <p style="font-weight: bold">Timing: 9:00am-2:00pm</p>
                    </div>
                </div>
                <br>
                 <hr style="height: 2px;width: 90%;background: gray">
             <div class="col-sm-12">
                    <div class="col-sm-4">
                        <img src="image/image/doctor.jpeg" alt=""/>
                    </div>
                    <div class="col-sm-7">
                        <h2 style="font-weight:bold">Dr. Saurabh Singh</h2>
                        <h4>Department: Ophthalmology </h4>
                        <p>He is specialist doctor of our hospital.Ophthalmology is the specialized field of<br> medicine that focuses on the </p>
                        <p>health of the eye.</p>
                        <p style="font-weight: bold">Available: Sunday <p>
                        <p style="font-weight: bold">Timing: 9:00am-5:00pm</p>
                    </div>
                </div>
                <br>
                 <hr style="height: 2px;width: 90%;background: gray">
                 <div class="col-sm-12">
                    <div class="col-sm-4">
                        <img src="image/image/dentist.jpg" alt=""/>
                    </div>
                    <div class="col-sm-7">
                        <h2 style="font-weight:bold">Dr. Nidhi Verma</h2>
                        <h4>Department: Dentist </h4>
                        <p>He is specialist doctor of our hospital.diagnose and treat various dental conditions,perform routine check-ups,</p>
                        <p> and offer treatments. </p>
                        <p style="font-weight: bold">Available: Monday & Tuesday<p>
                        <p style="font-weight: bold">Timing: 10:00am-3:00pm</p>
                    </div>
                </div>
                <br>
                 <hr style="height: 2px;width: 90%;background: gray">
                 <div class="col-sm-12">
                    <div class="col-sm-4">
                        <img src="image/image/va.jpg" alt=""/>
                    </div>
                    <div class="col-sm-7">
                        <h2 style="font-weight:bold">Dr. Vaibhav Pandey</h2>
                        <h4>Department: General Medicine </h4>
                        <p>He is specialist doctor of our hospital.During a general consultation, our doctor will listen to you, hear your concerns</p>
                        <p> and advise you on all of your treatment options.</p>
                        <p style="font-weight: bold">Available: Saturday & Tuesday<p>
                        <p style="font-weight: bold">Timing: 9:00am-4:00pm</p>
                    </div>
                </div>
                <br>
                 <hr style="height: 2px;width: 90%;background: gray">
                 <div class="col-sm-12">
                    <div class="col-sm-4">
                        <img src="image/image/Epitome-Hospitals-Our-Doctor.jpeg" alt=""/> 
                    </div>
                    <div class="col-sm-7">
                        <h2 style="font-weight:bold">Dr. Akash Datt Pathak</h2>
                        <h4>Department: General Medicine </h4>
                        <p>He is specialist doctor of our hospital.An X-ray department is a place in a hospital where X-rays</p>
                         <p>are taken and interpreted.</p> 
                        <p style="font-weight: bold">Available: Friday & Tuesday<p>
                        <p style="font-weight: bold">Timing: 9:00am-4:00pm</p>
                    </div>
                </div>
                <br>
                 <hr style="height: 2px;width: 100%;background: gray">
        </div>
        <%@include file="MasterPage/GeneralFooter.jsp" %>
    </body>
</html>
