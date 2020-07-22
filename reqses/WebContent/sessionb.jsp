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
	String sesa = (String)session.getAttribute("sesa");
	String a = request.getParameter("a");
%>
sesa=<%=sesa %>
a=<%=a %>
</body>
</html>