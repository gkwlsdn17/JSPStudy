<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../resources/cssjs/head.jsp" %>
<style type="text/css">
	.dto:hover{
 		background-color: lime; 
		cursor: pointer;
	}
</style>
<script type="text/javascript">
	$(document).ready(function(){
		$("#insert").on("click",function(){
			window.location="insert.ws";
		});
		$(".dto").on("click",function(){
			//alert($(this).find("td").eq(0).text());
			var idx = $(this).find("input").val();
			window.location="update.ws?idx="+idx;
		});
		$(".td_ck").on("click",function(e){
			e.stopPropagation();
			$(this).find("input").attr("checked",true);
		});
		/*
		$(".checkbox").on("click",function(e){
			//자기 기능까지 막는 기능
			//e.preventDefault();
			//체크박스 기능은 하고 부모 태그의 기능은 막는 기능
			e.stopPropagation();
			
		});*/
		$("#delete").on("click",function(){
			$("#frm").submit();
		});
		
	});
</script>
</head>
<body>
	<div class="container">
		<div class="row" style="height:430px;">
		<form action ="delete.ws" id="frm">
		<table class = "table">
			<tr>
				<th></th>
				<th>순번</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성일자</th>
				<th>수정일자</th>
			</tr>
			
<%-- 			<% --%>
<!-- // 			//java로 만든 소스 -->
<!-- // 				List<FreeBoardDTO> list = (List<FreeBoardDTO>)request.getAttribute("list"); -->
<!-- // 				for(FreeBoardDTO dto : list){ -->
<!-- // 					out.println("<tr><td>"+dto.getIdx()+"</td>"); -->
<!-- // 					out.println("<td>"+dto.getTitle()+"</td>"); -->
<!-- // 					out.println("<td>"+dto.getContent()+"</td>"); -->
<!-- // 					out.println("<td>"+dto.getReg_date()+"</td>"); -->
<!-- // 					out.println("<td>"+dto.getMod_date()+"</td></tr>"); -->
<!-- // 				} -->
<%-- 			%> --%>
			
			<!-- jstl로 만든 소스 -->
			<c:forEach items="${list}" var="dto">
				<tr class="dto">
					<td class="td_ck"><input class = "checkbox" type="checkbox" name="idx" value="${dto.idx}"/></td>
					<td>${dto.idx}</td>
					<td>${dto.title}</td>
					<td>${dto.content}</td>
					<td>${dto.reg_date}</td>
					<td>${dto.mod_date}</td>
				</tr>
			</c:forEach>
			
		</table>
		</form>
		</div>
		<div class = "row" style="text-align:center">
			<c:forEach begin="1" end="${pagecount}" var="i">
				<a href="index.ws?page=${i}">[ ${i} ]</a>
			</c:forEach>
			
		</div>
		<div class="row">
		<button id="insert" class="btn-primary">글쓰기</button>
		<button id="delete" class="btn-primary">삭제</button>
		</div>
	</div>
</body>
</html>