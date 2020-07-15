<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>jsp구문으로 request</h1>
<%
	String aparam = request.getParameter("a");
	String bparam = request.getParameter("b");
	
	out.println("aparam="+aparam);
	out.println("bparam="+bparam);
%>
<h1>el,jstl태그</h1>
${param.a}
${param.b}
</body>
</html>