<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="requestTestPro.jsp">
학번:<input type="text" name="num"><br>
이름:<input type="text" name="name"><br>
학년:
<input type="radio" name="grade" value="1" checked>1학년&nbsp;
<input type="radio" name="grade" value="2" checked>2학년&nbsp;
<input type="radio" name="grade" value="3" checked>3학년&nbsp;
<input type="radio" name="grade" value="4" checked>4학년&nbsp;
선택과목:
<select name="subject">
<option value="JAVA">JAVA</option>
<option value="JSP">JSP</option>
<option value="XML">XML</option>
</select><br>
<input type="submit" value="입력완료">
</form>
</body>
</html>