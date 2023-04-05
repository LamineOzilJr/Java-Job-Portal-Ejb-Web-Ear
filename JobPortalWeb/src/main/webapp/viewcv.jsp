<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW MY CV</title>
	<%@include file="all_component/all_css.jsp"%>
</head>
	<body style="background-color: #f0f1f2;">
	<%@include file="all_component/navbar.jsp"%>
	
	<div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            <h3 class="box-title">Mon CV</h3>
                           <table class="table table-bordered table-responsive-md">
                                <tr>
                                	<th>Id </th>
                                    <th>Firstname </th>
                                    <th>Lastname</th>
                                    <th>Age</th>
                                    <th>Address</th>
                                    <th>Email</th>
                                    <th>Phone</th>
                                    <th>Speciality</th>
                                    <th>Level</th>
                                    <th>Experience</th>
                                    <th>Action</th>
                                    <th>Action</th>
                                 </tr>
                                 
                                
                                 <c:if test="${cvs != null }">
                                 <c:forEach items="${cvs }" var="c">
                                    <tr>
	                                 <td><c:out value="${c.id}"/></td>
	                                 <td><c:out value="${c.firstname}"/></td>
	                                 <td><c:out value="${c.lastname}"/></td>
	                                 <td><c:out value="${c.age}"/></td>
	                                 <td><c:out value="${c.address}"/></td>
	                                 <td><c:out value="${c.email}"/></td>
	                                 <td><c:out value="${c.phone}"/></td>
	                                 <td><c:out value="${c.speciality}"/></td>
	                                 <td><c:out value="${c.level}"/></td>
	                                 <td><c:out value="${c.experience}"/></td>
	                                  <td><a href="" class="btn btn-success form-group" >Modifier</a></td>
	                                  <td><a href="" class="btn btn-danger form-group" onclick="return confirm('Voulez-vous supprimer?');">supprimer</a></td>
	                                </tr>
	                             </c:forEach>
                                </c:if>
                             </table>
                   	 		</div>
                   	 	</div>
            </div>     	
  
		 
	</body>
</html>