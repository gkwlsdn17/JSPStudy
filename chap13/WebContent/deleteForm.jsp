<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String num = request.getParameter("num");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
삭제하시겠습니까?
<button onclick="doBack();">취소</button>
<button id="deleteProc">삭제</button>
</body>
</html>
<script type="text/javascript">
	function doBack(){
		window.history.back();
	}
	$("#deleteProc").on("click",function(){
		location.href="deleteProc.jsp?num=<%out.print(num);%>";
	})
</script>