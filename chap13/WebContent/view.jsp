<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "chap13.board.BoardDBBean"%>
<%@page import="chap13.board.BoardDataBean"%>
<% 
	String num = request.getParameter("num");
	BoardDBBean bdb = BoardDBBean.getInstance();
	BoardDataBean one = bdb.selectOne(Integer.parseInt(num));
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/chap13.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</head>
<body>
<form action = "writePro.jsp" id="frm">
<!-- <div class = "container" style="background-color: blue"> -->
<div class = "container bg-lightblue bg-mycolor">
	<div class = "row">
		<div class = "col">
			<h1>글보기</h1>
		</div>
	</div>
	<div class = "row">
		<div class = "col-md-2 myright myborder">
			이름
		</div>
		<div class = "col-md-10 myborder">
		<% out.print(one.getWriter()); %>
		</div>
	</div>
	<div class = "row">
		<div class = "col-md-2 myborder myright">
			제목
		</div>
		<div class = "col-md-10 myborder">
		<% out.print(one.getSubject()); %>
		</div>
	</div>
	<div class = "row">
		<div class = "col-md-2 myright myborder">
			메일
		</div>
		<div class = "col-md-10 myborder">
		<% out.print(one.getEmail()); %>
		</div>
	</div>
	<div class = "row">
		<div class = "col-md-2 myright myborder">
			내용
		</div>
		<div class = "col-md-10 myborder">
			<textarea class="form-control" name="content" rows="20">
			<% out.print(one.getContent()); %>
			</textarea>
		</div>
	</div>
	<div class = "row">
		<div class = "col-md-2 myright myborder">
			비밀번호
		</div>
		<div class = "col-md-10 myborder">
		<% out.print(one.getPasswd()); %>
		</div>
	</div>
	<div class = "row">
		<div class="col-md-12 mycenter">
			<input class="btn" type="button" value="글수정" id="updateBtn"/>
			<input class="btn" type="button" value="글삭제" id = "deleteBtn"/>
			<input class="btn" type="button" value="목록보기" id="indexBtn"/>
		</div>
	</div>
</div>
</form>
</body>
</html>
<script type="text/javascript">
	$("#updateBtn").on("click",function(){ window.location="updateForm.jsp"; });
	$("#deleteBtn").on("click",function(){ window.location="deleteForm.jsp?num=<%out.print(one.getNum());%>"; });
	$("#indexBtn").on("click",function(){ window.location="index.jsp"; });
</script>