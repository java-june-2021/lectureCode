<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
<script src="/js/script.js"></script>
</head>
<body>
<p> Lets hear a joke!  </p>

<form method="POST" action="/telljoke">
<p>Name: <input type="text" name="name"></p>
<p>Location <input type="text" name="location"></p>
<p>Joke <input type="text" name="joke"</p>

<button>Submit Joke</button>


</form>
</body>

</html>