<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGNUP</title>
<%@include file="all_component/all_css.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid">
		<div class="row p-5">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<div class="text-center">
							<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
							<h5>Registration Page</h5>
						</div>
						<%-- <c:if test=""></c:if> --%>
						<form method="post" action="Signup">

						
							<div class="form-group">
								<label>Enter Login</label> <input type="text"
									required="required" class="form-control"
									id="exampleInputLogin" aria-describedby="LoginHelp" name="login">
							</div>
							

							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password</label> <input
									required="required" type="password" class="form-control"
									id="exampleInputPasswordl1" name="password">
							</div>
							
							<button type="submit"
								class="form-control btn btn-primary submit px-3">Register</button>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div style="margin-top: 50px;">
		<%@include file="all_component/footer.jsp" %>	
	</div>
</body>
</html>