<%@page import="com.mg.org.STUDY01"%>
<%@page import="java.util.List"%>
<%@page import="com.mg.org.DataManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<STUDY01> list = DataManager.select();
	for(STUDY01 temp:list){
		out.println("temp = "+temp);
	}
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
		    <h1>select.jsp</h1>
	  	 </div>
	  	 <div class = "row">
	  	 	<div class="col">
	  	 		<table class = "table">
				  <tr>
				    <td>A</td>
				    <td>B</td>
				    <td>C</td>
				    <td>D</td>
				    <td>E</td>
				  <tr>
				  <tr>
				    <%
						for(STUDY01 temp:list){
							out.println("<tr>"+"<td>"+temp.getA()+"</td>");
							out.println("<td>"+temp.getB()+"</td>");
							out.println("<td>"+temp.getC()+"</td>");
							out.println("<td>"+temp.getD()+"</td>");
							out.println("<td>"+temp.getE()+"</td></tr>");
						}
					%>
				  </tr>
				  
				</table>
	  	 	</div>
	  	 </div>
	</div>
</body>
</html>