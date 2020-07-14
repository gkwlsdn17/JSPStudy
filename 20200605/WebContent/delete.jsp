<%@page import="com.mg.org.DataManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	DataManager.delete();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body>
	<div class="container">
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="index.jsp">STUDY01</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li class="active"><a href="select.jsp">SELECT</a></li>
		      <li><a href="insert.jsp">INSERT</a></li>
		      <li><a href="update.jsp">UPDATE</a></li>
		      <li><a href="delete.jsp">DELETE</a></li>
		    </ul>
		  </div>
		</nav>
		
		 <div class="jumbotron">
		    <h1>delete.jsp</h1>
	  	 </div>
	</div>
</body>
</html>