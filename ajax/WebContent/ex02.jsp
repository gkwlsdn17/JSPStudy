<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- ex02.jsp입니다. -->
<!-- ajax 통신에 성공 했습니다. -->
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String result = "";
	String sqlClass="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String sqlUrl="jdbc:sqlserver://192.168.0.200:1433;databasename=khk_20200611";
	String sqlUser="sa";
	String sqlPass="8765432!";
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn = DriverManager.getConnection(sqlUrl,sqlUser,sqlPass);
		pstmt = conn.prepareStatement("select * from freeboard");
		rs = pstmt.executeQuery();
		while(rs.next()){
			result += ("<br/> title= "+rs.getString("title")+"content = "+rs.getString("content")+"<br/>");
		}
		out.println(result);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	finally{
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(conn!=null)
			conn.close();
	}
%>