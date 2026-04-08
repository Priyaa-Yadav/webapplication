

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>footer</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <style>
            footer{background: whitesmoke;padding: 85px 0;}
            single-content{padding: 115px 0;text-align: center;}
            footer p{font-size: 15px;color: white}
            footer .social-links a{font-size: 18px;}
            footer .list-unstyled a{text-decoration: none;color: white;font-size: 15px;}
            footer .list-unstyled a:hover{color: white;}
            .footer-bottom{border-top: 1px solid white;padding-top: 10px;font-size: 15px;}
            address{color: white;}
            .icon{height: 30px;width: 30px;background: white;float: left;margin:1%;text-align:center;}
            .col-md-2{
                color:white;
            }
        </style>
    </head>
    <body>
        <div class="row">
            <div class="content">
                <div class="container">
                    <div class="single-content">
                        
                    </div>
                </div>
            </div>
    <!--<div class="row">
        <div class="col-sm-12" style="background: gray;padding: 2%;color: white; text-align: center">
            <p>@ 2024 MedicalSite. All rights reserved. </p>
        </div>
    </div>-->
    <footer style="background: teal;color:white">
        <div class="container">
            <div class="row">
                <div class="col-md-4" style="color:white">
                    <img src="image/image/medi.png" alt="Docmed Logo" width="120">
                    <p>Far far away, behind the<br> word mountains, far from<br> the countries.</p>
                    <div class="social-links">
                        <div class="icon">
                            <a href="https://www.facebook.com"><i class="fa fa-facebook"></i></a></div>
                        <div class="icon">
                            <a href="https://www.twitter.com"><i class="fa fa-twitter"></i></a></div>
                        <div class="icon">
                            <a href="https://www.instagram.com"><i class="fa fa-instagram"></i></a></div>
                    </div>
                </div>
                <div class="col-md-2">
                    <h5 style="color:white;font-weight: bold;font-size: 18px">DEPARTMENTS</h5>
                    <ul class="list-unstyled">
                        <li><a href="Department.jsp" >Neurology</a></li>
                        <li><a href="Department.jsp" >Ophthalmology</a></li>
                        <li><a href="Department.jsp" >Nuclear Magnetic</a></li>
                        <li><a href="Department.jsp" >X-ray</a></li>
                        <li><a href="Department.jsp" >Dental</a></li>
                        <li><a href="Department.jsp" >Surgical</a></li>
                        <li><a href="Department.jsp" >Cardiological</a></li>
                    </ul>
                </div>
                <div class="col-md-2">
                    <h5 style="color:white;font-weight: bold;font-size: 18px">USEFUL LINKS</h5>
                    <ul class="list-unstyled">
                        <li><a href="Home.jsp" >Home</a></li>
                        <li><a href="About Us.jsp">About</a></li>
                        <li><a href="Department.jsp">Department</a></li>
                        <li><a href="Doctors.jsp">Doctor</a></li>
                        <li><a href="Contact.jsp">Contact</a></li>
                    </ul>
                </div>
                <div class="col-md-2">
                    <h5 style="color:white;font-weight: bold;font-size: 18px">SERVICES</h5>
                    <ul class="list-unstyled">
                        <li><a href="Services.jsp" >Emergency help</a></li>
                        <li><a href="Services.jsp">Qualified doctors</a></li>
                        <li><a href="Services.jsp">Location & Direction</a></li>
                        <li><a href="Services.jsp">Medical Treatment</a></li>
                    </ul>
                </div>
                <div class="col-md-2">
                    <h5 style="color:white;font-weight: bold;font-size: 18px">OUR LOCATION</h5>
                    <address>
                        <div class="fa fa-location-arrow"> 200, D-block, Green lane USA</div><br>
                        <a href="#" style="color:white">+10 367 467 8934</a><br>
                        <a href="#" style="color:white">docmed@contact.com</a>
                    </address>
                </div>
            </div>
        </div>
        
    </footer>
    <div class="footer-bottom text-center mt-4" style="background:black;color: white;padding: 1%">
            <span>Copyright @ Arcane Programming InfotechLucknow</span>
        </div>
        </div>
    </body>
</html>
