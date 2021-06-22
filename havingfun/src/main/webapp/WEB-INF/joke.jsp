<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lets hear that joke!</title>
</head>
<body>
<p>Name: <c:out value="${nameForFrontEnd}"/><p>
<p>Location: <c:out value="${locationForFrontEnd}"/><p>
<p>Joke: <c:out value="${jokeFrontEnd}"/><p>
</body>
</html>