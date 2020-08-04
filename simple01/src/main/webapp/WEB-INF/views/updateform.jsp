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
		<p>
			<h3>aa 수정</h3> 
			<a href="aajoin">joinform </a>/
			<a href="aaselectall">selectall </a>/
			<a href="aaupdate">updateform </a>/
			<a href="aadelete">deleteform</a>
		</P>	
		
	</div>
	<div class="row">
		<form action="aaupdate" method="post">
<!-- 			aa <input class = "form-control" type="text" name="aa"> -->
			bb <input class = "form-control" type="text" name="bb">
			<input class="btn-success" type="submit" value="저장"/>
		</form>
	</div>
</div>

</body>
</html>
