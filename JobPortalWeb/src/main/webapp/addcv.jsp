<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> ADD CV </title>
	<%@include file="all_component/all_css.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
	<%@include file="all_component/navbar.jsp"%>
	 <section class="page-section portfolio" id="cvs">
            <div class="container">
                <!-- Portfolio Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Add new cv</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <form method="post" action="Cv">
				  <div class="form-group">
				  	<label>First Name</label>
				    <input type="text" value="" class="form-control" id="firstname" placeholder="firstname" name="firstname">
				  </div>
				  <label>Last Name</label>
				  <div class="form-group">
				    <input type="text" value="" class="form-control" id="lastname" placeholder="Password" name="lastname">
				  </div>
				   <label>Age</label>
				   <div class="form-group">
				    <input type="number" value="" class="form-control" id="age" placeholder="age" name="age">
				  </div>
				  <label>Address</label>
				   <div class="form-group">
				    <input type="text" value="" class="form-control" id="address" placeholder="address" name="address">
				  </div>
				   <label>Email</label>
				   <div class="form-group">
				    <input type="text" value="" class="form-control" id="email" placeholder="email" name="email">
				  </div>
				   <label>Phone</label>
				   <div class="form-group">
				    <input type="text" value="" class="form-control" id="phone" placeholder="phone" name="phone">
				  </div>
				   <label>Speciality</label>
				   <div class="form-group">
				    <input type="text" value="" class="form-control" id="speciality" placeholder="speciality" name="speciality">
				  </div>
				   <label>Level</label>
				   <div class="form-group">
				    <input type="text" value="" class="form-control" id="level" placeholder="level" name="level">
				  </div>
				   <label>Experience</label>
				   <div class="form-group">
				    <input type="text" value="" class="form-control" id="experience" placeholder="experience" name="experience">
				  </div>
				  &nbsp;&nbsp;&nbsp;
				  <div class="form-group">
				    <button type="submit" class="form-control btn btn-primary submit px-3" > Save Cv </button>
				  </div>
				</form>
            </div>
        </section>
        
        <div style="margin-top: 50px;">
		<%@include file="all_component/footer.jsp" %>	
	</div>
	
</body>
</html>