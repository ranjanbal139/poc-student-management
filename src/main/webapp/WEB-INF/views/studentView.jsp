<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
</head>
<body>
<table style="width: 50%">
  <tbody>
	<tr>
	  <td><h1>Registered Students</h1></td>
	  <td><h3><a href="${pageContext.request.contextPath}/student/"><span style="color: red;">Register New Student</span></a></h3></td>
	</tr>
  </tbody>
</table>
  <div class="form">
	<table border="1" style="with: 100%" >
		<thead style="background-color: gray; color: purple;">
		   <tr><th>Name</th><th>Address</th><th>Mobile No</th><th>City</th><th>Gender</th><th>Hobbies</th></tr>
		</thead>
		<tbody>
		<c:forEach items="${students}" var="student">
		 <tr><td>${student.name}</td><td>${student.address}</td><td>${student.mobileNo}</td><td>${student.cityId}</td><td>${student.sex}</td><td>${student.hobbiesCommaSeparated}</td></tr>
		 </c:forEach>
		</tbody>
	</table>
  </div>

</body>
</html>