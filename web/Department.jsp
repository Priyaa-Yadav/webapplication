

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
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
        <div class="container my-5">
            <h2 class="text-center mb-4" style="font-weight:bold;">Our Departments</h2>
            <hr style="height: 3px;width: 60%;background: blue">
            <br>
            <div class="row">
                <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/services1.jpg" class="card-img-top" alt=""/>
                        <div class="card-body">
                            <h3 class="card-title">General consultation</h3> 
                            <p class="card-text">During a general consultation, our doctor will <br>listen to you, hear your concerns and advise<br> you on all of your treatment options. </p>
                    </div>
                </div>
            </div>
                <br>
              <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/ophthalmic.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Ophthalmology Care</h5> 
                            <p class="card-text">Ophthalmology is the specialized field of<br> medicine that focuses on the health of the eye.</p>                      
                        
                        </div>
                </div>
            </div>
                <br>
                <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/services.jpeg" class="card-img-top" alt="Services 3"/>
                        <div class="card-body">
                            <h5 class="card-title">X-ray</h5> 
                            <p class="card-text">An X-ray department is a place in a hospital <br>where X-rays are taken and interpreted . </p>                      
                        </div>
                </div>
            </div>
                <hr style="height:2px;background: gray;width: 95%;">
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/gyneo.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Gynecologist Care</h5> 
                            <p class="card-text"> A branch of medicine that specializes in the <br>care of women during pregnancy and childbirth.</p>                      
                        </div>
                </div>
            </div>
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/ortho.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Liver Care</h5> 
                            <p class="card-text">A liver department, also known as a hepatology <br>department,is a medical specialty that focuses.</p>                      
                    
                        </div>
                </div>
            </div>
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/dental.jpeg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Dental Care</h5> 
                            <p class="card-text">diagnose and treat various dental conditions,<br> perform routine check-ups, and offer treatments.</p>                      
                   
                        </div>
                </div>
            </div>
                <hr style="height:2px;background: gray;width: 95%;">
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/price-4.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Surgical</h5> 
                            <p class="card-text">surgery, branch of medicine that is concerned <br>with the treatment of injuries, diseases, and other<br> disorders by manual and instrumental means.</p>                      
                  
                        </div>
                </div>
            </div>
                <br>
               <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/price-3.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Specialist Care</h5> 
                            <p class="card-text">A specialist care department, also known as a<br> specialty care clinic, provides advanced medical care <br>for specific conditions or symptoms. </p>                      
             
                        </div>
                </div>
            </div> 
                <br>
                 <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="image/image/card.jpg" class="card-img-top" alt="Services 2"/>
                        <div class="card-body">
                            <h5 class="card-title">Cardiology Department</h5> 
                            <p class="card-text">Cardiology is a branch of medicine that deals <br>with disorders of the heart and the cardiovascular system. </p>                      
                   
                        </div>
                </div>
            </div>
                <hr style="height:2px;background: gray;width: 95%;">
        </div> 
        </div>
        <br>
        <%@include  file="MasterPage/GeneralFooter.jsp" %>
    </body>
</html>
