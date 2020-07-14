<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<String> list = Arrays.asList("AA","BB","CC"); //이렇게 하면 초기화 할 수 있긴한데 변경이 불가함.
	for(String temp : list){
		out.print("temp = "+temp+"<br/>");
	}
%>
</body>
</html>