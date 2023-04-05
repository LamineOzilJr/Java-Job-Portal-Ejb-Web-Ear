<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>
<%@include file="all_component/all_css.jsp" %>
<style type="text/css">
.back-img{
	background: url("img/naruto.jpg");
	width: 100%;
	height: 90vh;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>

</head>
<body>
 	<%@include file="all_component/navbar.jsp" %>
 	
 	<div class="container-fluid back-img">
 		<div class="text-center">
 			<h1 class="text-white p-4">
 				<i class="fa fa-book" aria-hidden="true"></i> Portail d'emploies en ligne </h1>
 	
 		</div>
 	</div>
 <%@include file="all_component/footer.jsp" %>	
 	
</body>
</html>