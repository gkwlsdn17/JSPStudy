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
	Cookie cookie = new Cookie("name","홍길동");
	cookie.setMaxAge(1000*60*60*24);
	response.addCookie(cookie);
	
	out.println("쿠키 설정 했습니다");
%>
</body>
</html>