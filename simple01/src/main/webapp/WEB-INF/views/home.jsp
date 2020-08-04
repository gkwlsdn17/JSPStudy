<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="jumbotron">
		<h1>
			<a href="/simple01">Hello world!</a>  
		</h1>
		<P>  The time on the server is ${serverTime}.<br/> 
			<a href="aajoin">joinform </a>/
			<a href="aaselectall">selectall </a>/
			<a href="aaupdate">updateform </a>/
			<a href="aadelete">deleteform</a>
		</P>	
		
	</div>
</div>

</body>
</html>
