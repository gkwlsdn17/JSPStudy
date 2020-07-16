<%@page import="com.mh.fileboard.FileBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
deleteproc.jsp
<%
	String[] cks = request.getParameterValues("ck");

// 	for(int i=0;i<cks.length;i++){
// 		out.println(cks[i]);
// 	}
	FileBoardDAO dao =FileBoardDAO.getInstance();
	dao.deleteFileBoard(cks);
	response.sendRedirect("index.jsp");
%>
</body>
</html>