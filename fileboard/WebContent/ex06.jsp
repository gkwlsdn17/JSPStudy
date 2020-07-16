<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! //전역변수로 선언
	String a = "a";
	public void doA(){
		System.out.println("a= "+a);
	}
%>
<%  //지역변수로 선언
	String b = "b";
%>
<%=a %>
<%=b %>
<% doA(); %>
</body>
</html>