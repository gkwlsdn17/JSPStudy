<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "chap13.board.BoardDataBean" %>
<%@ page import = "chap13.board.BoardDBBean" %>
<%
	String num = request.getParameter("num");
	BoardDBBean bdb = BoardDBBean.getInstance();
	bdb.deleteOne(Integer.parseInt(num));
%>