<%@page import="reqses.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	User user = new User("홍길동","14","없음");
	session.setAttribute("user", user);
	out.println("세션안에 user키가 설정되고 값은 user객체를 넣었음");
%>
</body>
</html>