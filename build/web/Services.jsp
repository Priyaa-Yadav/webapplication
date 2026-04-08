<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>services</title>
         <style>
            .card-img-top{height: 200px;object-fit: cover;width: 220px}
            .card-title{font-size: 2rem;font-weight: bold;color: green;}
            .card-text{font-size: 1.5rem;color: #555;}
            body{
                overflow-x: hidden;
            }
        </style>
            
          
    </head>
    <body>
        <%@include file="MasterPage/GeneralHeader.jsp" %>
        <div class="container my-5">
            <h2 class="text-center mb-4" style="font-weight:bold;">Our Services</h2>
            <hr style="height: 3px;width: 60%;background: green">
            <br>
            <div class="row">
                <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/Emergency.png" class="card-img-top" alt=""/>
                        <div class="card-body">
                            <h3 class="card-title">Emergency Help</h3> 
                            <p class="card-text">contingency, crisis, exigency,<br>
                juncture,pinch, straits, and strait.<br>
            </p>
                    </div>
                </div>
            </div>
                <br>
              <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/doctors.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Qualified Doctors</h5> 
                            <p class="card-text">senior doctors that have completed<br> 
                full medicatraining in a specialised.<br>
            </p>                      
                        
                        </div>
                </div>
            </div>
                <br>
                <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/google_maps_gdpr.jpg" class="card-img-top" alt="Services 3"/>
                        <div class="card-body">
                            <h5 class="card-title">Location & Direction</h5> 
                            <p class="card-text">200, D-block, Green lane USA<br>
                           +10 367 467 8934<br>
                             </p>                      
                        </div>
                </div>
            </div>
                <hr style="height:2px;background: white;width: 90%;">
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/1.png.webp" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Medical Treatment</h5> 
                            <p class="card-text">the management and care <br>
                              of patient tocombat disease.<br>
                             </p>                      
                        </div>
                </div>
            </div>
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/services1.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">General Consultation</h5> 
                            <p class="card-text">he first step to addressing<br> 
                                    health concerns.<br>
                            </p>                     
                    
                        </div>
                </div>
            </div>
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/services.jpeg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Laboratory Services</h5> 
                            <p class="card-text">used by outside laboratories<br> 
                          that do not have the means to test. <br>
                            </p>                  
                   
                        </div>
                </div>
            </div>
               
                <hr>
        </div> 
        </div>
        <br>
        <!--<div class="container">
            <div class="col-sm-12">
        <h1>Our Services</h1>
        <div class="row">
            <div class="box">
                <img src="image/image/Emergency.png" style="height:200px">
            <h3>Emergency Help</h3>
            <p>contingency, crisis, exigency,<br>
                juncture,pinch, straits, and strait.<br>
            </p>
            <button class="btn">See More</button>
        </div>
        
        <div class="box">
            <img src="image/image/doctors.jpg" style="height:200px">
            <h3>Qualified Doctors</h3>
            <p>senior doctors that have completed<br> 
                full medicatraining in a specialised.<br>
            </p>
            <button class="btn">See More</button>
        </div>

        <div class="box">
            <img src="image/image/google_maps_gdpr.jpg" style="height:200px">
            <h3>Location & Direction</h3>
            <p> 200, D-block, Green lane USA<br>
                +10 367 467 8934<br>
            </p>
            <button class="btn">See More</button>
        </div>
        </div>
            
        <div class="row">
            <div class="box">
                <img src="image/image/1.png.webp" style="height:200px">
            <h3>Medical Treatment</h3>
            <p>the management and care <br>
              of patient tocombat disease.<br>
            </p>
            <button class="btn">See More</button>
        </div>
            
            <div class="box">
                <img src="image/image/services1.jpg" style="height:200px">
            <h3>General Consultation</h3>
            <p>he first step to addressing<br> 
                health concerns.<br>
            </p>
            <button class="btn">See More</button>
        </div>
            
            <div class="box">
                <img src="image/image/services.jpeg" style="height:200px">
            <h3>Laboratory Services</h3>
            <p> used by outside laboratories<br> 
               that do not have the means to test. <br>
            </p>
            <button class="btn">See More</button>
        </div>
        </div>
            </div>
        </div>-->
        <%@include file="MasterPage/GeneralFooter.jsp" %>
    </body>
</html>