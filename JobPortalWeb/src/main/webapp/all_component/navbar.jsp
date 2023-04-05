<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-custom ">
	<a class="navbar-brand" href="#">Navbar</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp">Home
					<span class="sr-only">(current)</span>
			</a></li>
			
			<li class="nav-item"><a class="nav-link" href="addcv.jsp"> Add Cv</a></li>
			<li class="nav-item"><a class="nav-link" href="Cv"> View Cv</a></li>
			
			<li class="nav-item"><a class="nav-link" href="addjob.jsp"> Post Job</a></li>
			<li class="nav-item"><a class="nav-link" href="viewjob.jsp"> View Job</a></li>

		</ul>
		<form class="form-inline my-2 my-lg-0">
			<a href="login.jsp" class="btn btn-light mr-1"><i class="fas fa-sign-in-alt"></i>Login</a>
			<a href="signup.jsp" class="btn btn-light"><i class="fas fa-user"></i>SignUp</a>
		</form>
	</div>
</nav>