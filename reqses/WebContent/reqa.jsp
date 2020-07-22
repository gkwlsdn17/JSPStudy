<%@page import="reqses.User"%>
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
<%
	String sesa = (String)session.getAttribute("sesa");
// 	User user= (User)session.getAttribute("user");
%>
sesa=<%=sesa %>
<%-- 사용자명=<%=user.getName() %> --%>
<%-- 사용자나이=<%=user.getAge() %> --%>
<%-- 사용자비고=<%=user.getRemark() %> --%>
${sessionScope.user.name}
${sessionScope.user.age }
${sessionScope.user.remark }
<form action="reqb.jsp">
	<input type="text" name="a"/>
	<input type="text" name="b"/>
	<input type="submit" value="reqb파일로 이동"/>
</form>
</body>
</html>