<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song To Album</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>Add Song To Album!</h1>
<hr>
<form:form method="POST" action="/song/add" modelAttribute="song">
	<div class="form">
		<form:label path="album">Album:</form:label>
		<form:errors path="album"/>
		<form:select path="album">
			<c:forEach items="${albums}" var="album">
				<option value="${album.id}">${album.bandName} - ${album.albumName }</option>
			</c:forEach>
		</form:select>
	</div>
	<div class="form-group">
		<form:label path="name">Name:</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
	</div>
	<div class="form-group">
		<form:label path="length">Length:</form:label>
		<form:errors path="length"/>
		<form:input path="length"/>
	</div>
	<div class="form-group">
		<form:label path="genre">Genre:</form:label>
		<form:errors path="genre"/>
		<form:input path="genre"/>
	</div>
	<button>Add Song!</button>
</form:form>
</div>
</body>
</html>