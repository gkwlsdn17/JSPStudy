<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.mh.org.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<%
	Student st1 = new Student();
	st1.setGender("남");
	st1.setStu_number(1);
	st1.setRemark("이름이");
	
	Student st2 = new Student();
	st2.setGender("여");
	st2.setStu_number(2);
	st2.setRemark("여자분");
	
	List<Student> al = new ArrayList();
	al.add(st1);
	al.add(st2);
	al.add(st2);
	al.add(st2);
	
	Iterator<Student> itt = al.iterator();
	while(itt.hasNext()){
		System.out.println(itt.next());
	}
	
	al.remove(3);
	al.clear();
	
	List al1 = new ArrayList<>();
	for(Object st : al1){
		st = (Student) st;
	}
%>
	<ul class = "list-group">
<% 
	//for(Student student : al){
	for(int i=0;i<al.size();i++){
		Student student = (Student) al.get(i);	
	
%>
	<li class = "list-group-item list-grop-item-success"><%out.print(student); %></li>
<%
	}
%>
	</ul>
<%
%>
</body>
</html>