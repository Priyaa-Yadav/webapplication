<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>medical center</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery.js" type="text/javascript"></script>
        <style>
            .hero-sec{
                background-image: url('image/image/hero_1.jpg');background-size: cover;height: 75vh;padding: 100px 0;color: white;
            }
            .hero-tex h5{
                font-size: 2rem;text-transform: uppercase;letter-spacing: 1px;margin-bottom: 20px;color: skyblue;font-weight: bold;
            }
            .hero-tex h1{font-size: 5rem;font-weight:bolder; }
            .hero-button .btn{margin-right: 15px;padding: 10px 25px;font-size: 2rem;margin-top: 20px;margin-bottom: 20px;}
            .hero-button .btn-outline-primary{background-color: white;color: black;border-radius: 30px;}
            .hero-button .btn-primary{color: white;background-color: transparent;border-radius: 30px;}
            .hero-section{background-color: #f8f9fa;padding: 50px 0;}
        .text-section h1
        {
           font-size: 4em;font-weight: bolder; 
        }
        .text-section h2
        {
           font-size: 3em; 
        }
        .text-section p
        {
            font-size: 1.2em;margin-bottom: 20px;
        }
        .text-section .btn-info
        {
            font-size: 1.1em;padding: 10px 20px;
        }
        .hero-section img{max-width: 100%;height: auto;}
        .services-section{background-color: lightblue;min-height: auto;}
        .service-box{
            background-color: #fff;border: 1px solid #ddd;border-radius: 8px;box-shadow: 0 0 10px rgba(0,0,0,0.1);margin-bottom: 30px;margin-top: 30px;
        }
        .service-box h3{font-size: 1.5em;margin-bottom: 15px;}
        .service-box p{font-size: 1em;margin-bottom: 20px;}
        .service-box .btn-outline-primary{font-size: 1em;padding: 10px 20px;}
        .fa fa-hospital-o, .fa fa-ambulance{font-size: 3em;margin-bottom: 10px;color: #007bff;font-weight: bold;}
        
            body{
                overflow-x: hidden;
            }
            .col-sm-2{
                padding: 2%;margin: 2%;
            }
        </style>
    </head>
    <body>
        <%@include file="MasterPage/GeneralHeader.jsp" %>
        <section class="hero-sec">
            <div class="container">
                <div class="row">
                    <div class="col-md-7 hero-tex">
                        <h5>Welcome To MediQuickCare</h5>
                        <h1>Best Healthcare Solution<br> in your city.</h1>
                        <div class="hero-button">
                            <a href="Doctors.jsp" class="btn btn-outline-primary">Find Doctor</a>
                            <a href="Services.jsp" class="btn btn-primary">Our Services</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <hr style="height: 3px;width: 100%;background: gray">
        <div class="container-fluid hero-section text-white text-center">
            <div class="row align-items-center">
                <div class="col-md-6 text-section">
                    <h1>Health Care</h1>
                            <h2>For The Whole Family</h2>
                    <p>In the healthcare sector, service excellence is the facility of<br> the hospital as healthcare service provider to consistently.</p>
                <a href="Registration.jsp" class="btn btn-info">Book Appointment</a>
            </div>
                <div class="col-md-6">
                    <img src="image/image/services2.jpg" class="img-fluid" alt="Doctor"/>
                </div>
        </div>
        </div>
        <hr style="height: 3px;width: 100%;background: gray">
        <div class="row">
            <div class="col-sm-12" style="box-shadow: 5px 5px 12px 5px gray">
                <h4 style="text-align: center;font-size: 30px;font-weight: bold;font-family: sans-serif;margin-top: 5%">
                    Qualified Healthcare Professional Doctors</h4>
                 <hr style="height:2px;background:green;width: 70%;">
                <br>
                <div class="col-sm-1"></div>
                <div class="col-sm-2" style="box-shadow: 5px 5px 12px 5px gray">
                    <img src="image/image/team-1.jpg"  alt="" class="img-responsive" style="height: 150px;border-radius: 50%"/>
                    <div class="box3">
                        <h3>Dr. Vivek Singh</h3>
                        <p>He is specialist doctor of <br>our hospital.He is a Neurology<br> specialist doctor,</p>
                </div>
                </div>
                
                <div class="col-sm-2" style="box-shadow: 5px 5px 12px 5px gray">
                    <img src="image/image/team-2.jpg"  alt="" class="img-responsive" style="height: 150px;border-radius: 50%"/>
                    <div class="box3">
                        <h3>Dr. Neeraj Gautam </h3>
                        <p>He is specialist doctor of <br>our hospital.He is a Cardiology<br> specialist doctor,</p>
                </div>
                </div>
                <div class="col-sm-2" style="box-shadow: 5px 5px 12px 5px gray">
                    <img src="image/image/team-3.jpg"  alt="" class="img-responsive" style="height: 150px;border-radius: 50%"/>
                    <div class="box3">
                        <h3>Dr. Supriya Yadav</h3>
                        <p>He is specialist doctor of <br>our hospital.He is a Gynecologist<br> specialist doctor,</p>
                </div>
                </div>
                <div class="col-sm-2" style="box-shadow: 5px 5px 12px 5px gray">
                    <img src="image/image/doctor.jpeg"  alt="" class="img-responsive" style="height: 150px;border-radius: 50%"/>
                    <div class="box3">
                        <h3>Dr. Saurabh Singh</h3>
                        <p>He is specialist doctor of <br>our hospital.He is a Ophthamology<br> specialist doctor,</p>
                </div>
                </div>
               
               
            </div>
        </div>
      
                   <div class="container-fluid services-section bg-light py-5">
                            <div class="col-md-4 text-center">
                                <div class="service-box p-4" style="padding-bottom:2%">
                                    <i class="fa fa-hospital-o"></i>
                                    <h3 style="font-weight:bold">Hospitality</h3>
                                    <p>Clinical excellence must be the priority <br>for any healthcare service provider.</p>
                                    <a href="Contact.jsp" class="btn btn-primary">Apply for a Bed</a>
                                </div>
                            </div>
                            <div class="col-md-4 text-center">
                                <div class="service-box p-4" style="padding-bottom:2%">
                                    <i class="fa fa-ambulance"></i>
                                    <h3 style="font-weight:bold">Emergency Care</h3>
                                    <p>Clinical excellence must be the priority <br>for any healthcare service provider.</p>
                                    <a href="tel:+106723563567" class="btn btn-primary">+10 672 356 3567</a>
                                </div>
                            </div>
                            <div class="col-md-4 text-center">
                                <div class="service-box p-4" style="padding-bottom:2%">
                                    <i class="fa fa-hospital-o" style="height:100%;width: 100%"></i>
                                    <h3 style="font-weight:bold">Chamber Services</h3>
                                    <p>Clinical excellence must be the priority<br> for any healthcare service provider.</p>
                                    <a href="Contact.jsp" class="btn btn-primary">Contact Us</a>
                                </div>
                            </div>
                        </div>
           <%@include file="MasterPage/GeneralFooter.jsp" %>          
    </body>
</html>
