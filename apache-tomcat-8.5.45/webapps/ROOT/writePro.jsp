<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="chap13.board.BoardDBBean" %>
    <%@ page import="chap13.board.BoardDataBean" %>
<%
	//입력한 값을 가져옴
	String name = request.getParameter("name");
	String sub = request.getParameter("subject");
	String email = request.getParameter("email");
	String content=request.getParameter("content");
	String passwd = request.getParameter("password");

	BoardDataBean dataBean = new BoardDataBean();
	dataBean.setSubject(sub);
	dataBean.setWriter(name);
	dataBean.setEmail(email);
	dataBean.setContent(content);
	dataBean.setPasswd(passwd);
	
	BoardDBBean bdb = BoardDBBean.getInstance();
	bdb.insertArticle(dataBean);
	bdb.insertDetailArticle(name, sub, email, content, passwd);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>