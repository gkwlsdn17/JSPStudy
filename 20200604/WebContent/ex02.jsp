<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.mh.org.Box"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Box<String> box = new Box();
		box.setO("문자열");
		
		String outBox = box.getO();
		out.println("outBox = "+outBox);
		
		Box<Integer> box1 = new Box();
		box1.setO(123);
		
		String outBox1 = box1.getO().toString();
		out.println("outBox1 = "+outBox1);
	%>
</body>
</html>