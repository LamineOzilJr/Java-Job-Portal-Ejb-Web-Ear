<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD JOB</title>
<%@include file="all_component/all_css.jsp"%>
</head>
<body style="background-color: #f0f1f2;">

<%@include file="all_component/navbar.jsp"%>
	<div class="container p-2">
		<div class="col-md-10 offset-md-1">
			
				<div class="card">
					<div class="card-body">
						<div class="text-center text-success">
							<i class="fas fa-user-friends fa-3x"></i>
							<%-- <c:if test=""></c:if> --%>
							<h5>Add Jobs</h5>
						</div>
						
						<form action="addJob" method="post">
							<div class="form-group">
								<label>Enter Title</label> <input type="text" name="title"
									required class="form-control">
							</div>

							<div class="form-row">
								<div class="form-group col-md-4">
									<label>Address</label> <select name="address"
										class="custom-select" id="inlineFormCustomSelectPref">
										<option selected>Choose...</option>
										<option value="Thies">Thies</option>
										<option value="Dakar">Dakar</option>
										<option value="Saint-Louis">Saint-Louis</option>
										<option value="Diourbel">Diourbel</option>
										<option value="Ziguinchor">Ziguinchor</option>
										<option value="Tambacounda">Tambacounda</option>
									</select>
								</div>

								<div class="form-group col-md-4">
									<label>Category</label> <select name="category"
										class="custom-select" id="inlineFormCustomSelectPref">
										<option selected>Choose...</option>
										<option value="It">It</option>
										<option value="Developper">Developper</option>
										<option value="Banking">Banking</option>
										<option value="Engineer">Engineer</option>
										<option value="Teacher">Teacher</option>
										<option value="Leaddev">Leaddev</option>
									</select>
								</div>

								<div class="form-group col-md-4">
									<label>Status</label> <select class="form-control"
										name="status">
										<option class="Active" value="Active">Active</option>
										<option class="Inactive" value="Inactive">Inactive</option>
									</select>
								</div>
							</div>

							<div class="form-group">
								<label>Enter Description</label>
								<textarea required rows="2" cols="" name="desc"
									class="form-control"></textarea>
							</div>
							
							<button class="btn btn-success">Publish Job</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	
	<div style="margin-top: 50px;">
		<%@include file="all_component/footer.jsp" %>	
	</div>
	
</body>
</html>