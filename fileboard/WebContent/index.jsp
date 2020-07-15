<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mh.fileboard.FileBoardDAO" %>
<%@ page import="com.mh.fileboard.FileBoardDTO" %>
<%
	//FileBoardDAO dao1 = new FileBoardDAO();
	FileBoardDAO dao = FileBoardDAO.getInstance();
	List<FileBoardDTO> list = dao.selectAllFileBoard();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "uploadproc.jsp" method="post" enctype="multipart/form-data">
	<h1>file upload</h1>
	<div>
		제목<input type = "text" name="title"/><br/>
		내용<textarea name = "content"></textarea><br/>
		첨부<input type = "file" name="file"/>
		<input type="submit" value="저장"/>
	</div>
</form>
<div>
	<table border="1">
		<tr>
			<th>idx</th>
			<th>title</th>
			<th>content</th>
			<th>file</th>
		</tr>
		<%
			for(int i=0;i<list.size();i++){
				FileBoardDTO fdto = list.get(i);
				out.println("<tr>");
				out.println("<td>"+fdto.getIdx()+"</td>");
				out.println("<td>"+fdto.getTitle()+"</td>");
				out.println("<td>"+fdto.getContent()+"</td>");
				out.println("<td><img width='150' src = '/fileboard/upload/"+fdto.getFilename()+"'/></td>");
				out.println("</tr>");
			}
		%>
		
	</table>
</div>
</body>
</html>