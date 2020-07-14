<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</body>
</html>