<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Album Detail Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Album Details</h1>
<hr>
<p>Artist/Band Name: ${album.bandName}</p>
<p>Album Name: ${album.albumName}</p>
<p>Release Year: ${album.releaseYear}</p>
<hr>

<c:choose>
<c:when test="${album.label != null }">
<h1>Label Information</h1>
<p>Label Name: ${album.label.name }</p>
<p>Label Location: ${album.label.city}</p>
</c:when>
<c:otherwise>
<h3>Add A Label To Record</h3>
<form:form method="POST" action="/${album.id}/addlabel" modelAttribute="label">
<div class="form-group">
<form:label path="name">Label Name:</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</div>
<div class="form-group">
<form:label path="city">Label City:</form:label>
<form:errors path="city"/>
<form:input path="city"/>
</div>
<button>Add Label</button>

</form:form>
</c:otherwise>
</c:choose>
<a href="/${album.id}/edit" class="btn btn-primary">Edit Album</a>
<a href="/${album.id}/delete" class="btn btn-danger">Delete Album</a>
</div>
</body>
</html>