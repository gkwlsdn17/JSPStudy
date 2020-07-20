<%@page import="com.mh.org.freeboard.FreeBoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../resources/cssjs/head.jsp" %>
</head>
<body>
	<div class="container">
		<table class = "table">
			<tr>
				<th>순번</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성일자</th>
				<th>수정일자</th>
			</tr>
			
			<%
			//java로 만든 소스
				List<FreeBoardDTO> list = (List<FreeBoardDTO>)request.getAttribute("list");
				for(FreeBoardDTO dto : list){
					out.println("<tr><td>"+dto.getIdx()+"</td>");
					out.println("<td>"+dto.getTitle()+"</td>");
					out.println("<td>"+dto.getContent()+"</td>");
					out.println("<td>"+dto.getReg_date()+"</td>");
					out.println("<td>"+dto.getMod_date()+"</td></tr>");
				}
			%>
			
			<!-- jstl로 만든 소스 -->
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.idx}</td>
					<td>${dto.title}</td>
					<td>${dto.content}</td>
					<td>${dto.reg_date}</td>
					<td>${dto.mod_date}</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>