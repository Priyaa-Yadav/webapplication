

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery.js" type="text/javascript"></script>
        <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Playwrite+CU:wght@100..400&display=swap" rel="stylesheet">
        <style>
            .col-sm-12 img{border-radius: 8px;margin-bottom: 20px;}
            .col-sm-6{flex: 3;}
            .col-sm-5{flex: 1;padding: 10px;margin-right: 10px;}
            .col-sm-6 img{width: 40vw;height: 50vh;}
            .card-img-top{height: 200px;object-fit: cover;}
            .card-title{font-size: 2rem;font-weight: bold;color: green;}
            .card-text{font-size: 1.5rem;color: #555;}
            body{
                overflow-x: hidden;
            }
            
        </style>
    </head>
    <body>
        <%@include file="MasterPage/GeneralHeader.jsp" %>
        <div class="row">
        <div class="col-sm-12">
                <div class="col-sm-6">
                    <img src="image/image/medical.jpeg" alt="About Us"/>
                </div>
                <div class="col-sm-5">
                    <h2 style="font-weight:bold">Best Medical Care For Yourself<br> and Your Family</h2>
                    <p style="font-size:18px">our medical center has been providing exception healthcare services for over 25 year.we are committed to delivering personalized and comprehensive care to our patients.
                    we offer wide range of medical services, including general checkups, pediatrics,cardiology, and much more.
                    our mission is to improve the health and well-being of our community by providing accessible, high quality<br> healthcare services and caring environment.</p>
                    <ul>
                        <li style="font-size:18px">Apartments frequently or motionless.</li>
                        <li style="font-size:18px">Duis aute irure dolor in reprehenderit in voluptate.</li>
                        <li style="font-size:18px">Voluptatem quia voluptas sit aspernatur.</li>
                    </ul>
                    <a href="Services.jsp" class="btn btn-primary">Explore our Services</a>
                    <a href="Contact.jsp" class="btn btn-danger">Contact Us</a>
                </div>
            </div>
        </div>
        <br>
        <div class="container my-5">
            <h2 class="text-center mb-4" style="font-weight:bold;">Our Departments</h2>
            <hr style="height: 3px;width: 70%;background: blue">
            <br>
            <div class="row">
                <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/services1.jpg" class="card-img-top" alt=""/>
                        <div class="card-body">
                            <h3 class="card-title">General consultation</h3> 
                            <p class="card-text">Comprehensive health consultation to assess and address your medical concern.</p>                      
                    </div>
                </div>
            </div>
              <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/ophthalmic.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Specialist Care</h5> 
                            <p class="card-text">Access to specialist care in various fields including cardiology, dermatology, and more</p>                      
                    </div>
                </div>
            </div>
                <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/services3.jpeg" class="card-img-top" alt="Services 3"/>
                        <div class="card-body">
                            <h5 class="card-title">X-ray</h5> 
                            <p class="card-text">Advanced diagnostic tests and screenings to ensure accurate medical assessments. </p>                      
                    </div>
                </div>
            </div>
            </div>
            <hr style="height:2px;background: gray;width: 95%;">
            <div class="row">
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/gyneo.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Gynecologist Care</h5> 
                            <p class="card-text">Access to gynecologist care in various fields including cardiology, dermatology, and more</p>                      
                    </div>
                </div>
            </div>
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/Main-liver.jpeg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Liver Care</h5> 
                            <p class="card-text">Access to liver care in various fields including cardiology, dermatology, and more</p>                      
                    </div>
                </div>
            </div>
                <br>
                 <div class="col-md-4 mb-4">
                     <div class="card h-100" >
                        <img src="image/image/dental.jpeg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Dental Care</h5> 
                            <p class="card-text">Access to dental care in various fields including cardiology, dermatology, and more</p>                      
                    </div>
                </div>
            </div>
        </div> 
            <hr style="height:2px;background: gray;width: 95%;">
             <a href="Department.jsp" class="btn btn-primary">See more</a>
        </div>
        <%@include file="MasterPage/GeneralFooter.jsp" %>
    </body>
</html>
