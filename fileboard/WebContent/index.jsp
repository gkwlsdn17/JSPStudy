<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mh.fileboard.FileBoardDAO" %>
<%@ page import="com.mh.fileboard.FileBoardDTO" %>
<%
/*
	String requestAttribute = (String)request.getAttribute("a");
	out.println("requestAttribute = "+requestAttribute+"<br/>");
	
	String sessionAttribute = (String)session.getAttribute("b");
	out.println("sessionAttribute = "+sessionAttribute);
*/
	//FileBoardDAO dao1 = new FileBoardDAO();
	FileBoardDAO dao = FileBoardDAO.getInstance();
	List<FileBoardDTO> list = dao.selectAllFileBoard();
%>
<!-- <br/> -->
<!-- <br/> -->
<%-- ${a} --%>
<%-- ${b} --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$(".row").on("click",function(){
			//값을 가져오는 함수 3개: val(), text(), html()
			// val()은 input태그에 있는 값을 가져오거나 넣을 때 사용
			// text()는 html태그를 제외한 값을 가져옴
			// html()은 html태그까지 포함한 값을 가져옴
			var idx = $(this).find("td").eq(1).html();
			var title = $(this).find("td").eq(2).html();
			var content = $(this).find("td").eq(3).html();
			$("#idx").val(idx);
			$("#title").val(title);
			$("#content").val(content);
		})
	})
</script>
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
<form action = "updateproc.jsp" method="post" enctype="multipart/form-data">
	<h1>file 수정</h1>
	<div>
		<input type = "hidden" name="idx" id="idx"/><br/>
		제목<input type = "text" name="title" id="title"/><br/>
		내용<textarea name = "content" id="content"></textarea><br/>
		첨부<input type = "file" name="file" id="file"/>
		<input type="submit" value="수정"/>
	</div>
</form>
<div>
	<form action="deleteproc.jsp">
		<input type="submit" value="삭제"/>
	
		<table border="1">
			<tr>
				<th></th>
				<th>idx</th>
				<th>title</th>
				<th>content</th>
				<th>file</th>
			</tr>
		<%
			for(int i=0;i<list.size();i++){
				FileBoardDTO fdto = list.get(i);
				out.println("<tr class=\"row\">");
				out.println("<td><input type=\"checkbox\" name = \"ck\" value=\""+fdto.getIdx()+"\"/></td>");
				out.println("<td>"+fdto.getIdx()+"</td>");
				out.println("<td>"+fdto.getTitle()+"</td>");
				out.println("<td>"+fdto.getContent()+"</td>");
				out.println("<td><img width='150' src = '/fileboard/upload/"+fdto.getFilename()+"'/></td>");
				out.println("</tr>");
			}
		%>
		
		</table>			
	</form>
</div>
</body>
</html>