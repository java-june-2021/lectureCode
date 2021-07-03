<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>Edit This Album</title>
</head>
<body>
<div class="container">
<h1>Edit This Record</h1>
<hr>
<form:form action="/${album.id}/edit" method="POST" modelAttribute="album">
<div class="form-group">
<form:label path="bandName">Band Name:</form:label>
<form:errors path="bandName"/>
<form:input path="bandName"/>
</div>
<div class="form-group">
<form:label path="albumName">Album Name:</form:label>
<form:errors path="albumName"/>
<form:input path="albumName"/>
</div>
<div class="form-group">
<form:label path="releaseYear">Release Year</form:label>
<form:errors path="releaseYear"/>
<form:input path="releaseYear"/>
</div>
<button>Edit Record</button>
</form:form>
</div>
</body>
</html>