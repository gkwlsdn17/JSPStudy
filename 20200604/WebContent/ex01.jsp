<%-- <%@page import="java.sql.DriverManager"%> --%>
<%-- <%@page import="java.sql.PreparedStatement"%> --%>
<%-- <%@page import="java.sql.Connection"%> --%>
<%@page import="com.mh.org.MyOracle" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello world
<%
	MyOracle mo = new MyOracle();
	String msg = mo.doUpdate();
	out.println(msg);
// 	int a = 10;
// 	out.print(a);
	
%>
</body>
</html>