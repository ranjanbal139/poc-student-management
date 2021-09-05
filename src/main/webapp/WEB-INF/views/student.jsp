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
<table style="width: 60%">
  <tbody>
	<tr>
	  <td><h3>Student Registration Form </h3></td>
	  <c:if test="${not empty message}">
	  	<td><h3><span style="color: blue;">${message}</span></h3></td>
	  </c:if>
	  <td><h3><a href="${pageContext.request.contextPath}/student/view"><span style="color: red;">View</span></a></h3></td>
	</tr>
  </tbody>
</table>
  <div class="form">
    <form:form action="${pageContext.request.contextPath}/student/save" method="POST" modelAttribute="student">
		<table style="with: 50%">
			<tr>
				<td>Name :</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><form:textarea path="address" cols="20" rows="4"/></td>
			</tr>
			<tr>
				<td>Mobile No :</td>
				<td><form:input path="mobileNo"/></td>
			</tr>
				<tr>
				<td>City :</td>
				<td><form:select path="cityId" items="${cities}" itemValue="id" itemLabel="name"/></td>
			</tr>
			<tr>
				<td>Gender : </td>
				<td><form:radiobutton path="sex" value="Male"/>Male <form:radiobutton path="sex" value="Female"/>Female</td>
			</tr>
			<tr>
				<td>Hobbies :</td>
				<td><form:checkbox path="hobbies" value="Cricket"/>Cricket	<form:checkbox path="hobbies" value="Watching Movie" />Watching Movie	<form:checkbox path="hobbies" value="Reading News Paper" />Reading News Paper </td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form:form>
  </div>

</body>
</html>