<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "chap13.board.BoardDataBean" %>
<%@ page import = "chap13.board.BoardDBBean" %>
<%
	BoardDBBean bdb = BoardDBBean.getInstance();
	List<BoardDataBean>list = bdb.selectAll();
	
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jsp파일을 포함하는 문구, header.jsp에 부트스트랩 링크가 있다 -->
<jsp:include page="header.jsp"></jsp:include>

</head>
<body>
<div class="container">
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
	  <ul class="navbar-nav">
	    <li class="nav-item">
	      <a class="nav-link" href="writeForm.jsp">글작성</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="deleteForm.jsp">글삭제</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="updateForm.jsp">글수정</a>
	    </li>
	  </ul>
	</nav>
	<div class="row">
		<div class="col">
			<table class="table table-bordered table-hover">
				<tr>
					<th>번호</th>
					<th>작성자</th>
					<th>이메일</th>
					<th>제목</th>
					<th>비밀번호</th>
					<th>작성일자</th>
					<th>조회수</th>
				</tr>	
			
				<%
					for(BoardDataBean temp: list){
						out.print("<tr onclick ='row("+temp.getNum()+")'>");
						out.print("<td>"+temp.getNum()+"</td>");
						out.print("<td>"+temp.getWriter()+"</td>");
						out.print("<td>"+temp.getEmail()+"</td>");
						out.print("<td>"+temp.getSubject()+"</td>");
						out.print("<td>"+temp.getPasswd()+"</td>");
						out.print("<td>"+temp.getReg_date()+"</td>");
						out.print("<td>"+temp.getReadcount()+"</td>");
						out.println("</tr>");
					}
				%>
			</table>
			
		</div>
	</div>
	
</div>
</body>
</html>
<script type="text/javascript">
	function row(num){
		location.href="view.jsp?num="+num;
	}
</script>