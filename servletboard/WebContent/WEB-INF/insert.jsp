<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../resources/cssjs/head.jsp" %>
<script type="text/javascript">
	$(document).ready(function(){
		$("#cancel").on("click",function(){
			window.location = "index.ws";
		});
	});
</script>
</head>
<body>
<div class="container">
	<h1>글쓰기</h1>
	<div class="row" style="height:400px;">
		<form action="insertproc.ws">
			<table class="table">
				<tr>
					<th>제목</th>
					<td><input class="form-control" type="text" name="title"/></td>
				</tr>
				<tr>
					<th colspan="2">내용</th>
				</tr>
				<tr>
					<td colspan="2"><textarea class="form-control" name = "content" ></textarea></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
						<input class="btn-primary" type="submit" value="저장"/>
						<input class="btn-primary" type="reset" value="초기화"/>
						<input class="btn-primary" type="button" id="cancel" value="취소"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
</body>
</html>