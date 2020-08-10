<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Home</title>
	    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
	
</script>
<!-- header css -->
<%@ include file="../resources/cssjs/head.jsp" %>
<!-- content css -->
<%@ include file="../resources/cssjs/content.jsp" %>
<!-- footer css -->
<%@ include file="../resources/cssjs/footer.jsp" %>
</head>
<body>
<div class="container">
        <div id="header">
            <div id="title">
                <div class="parent left">
                    <img class="left" src="http://placehold.it/100x100"/>
                    <h1 class="left">오늘부터일일</h1>
                </div>
                <div class="right">
                    <h1>세상 모든이들의 일자리</h1>
                </div>
            </div>
            <div id="nav" class="parent">
                <ul id="indiv_menu" class="parent left">
                    <li>전체공고</li>
                    <li>기업정보</li>
                    <li>이력서관리</li>
                    <li>후기</li>
                </ul>
                <div class="left">/</div>
                <ul id="com_menu" class="parent left">
                    <li>인재정보</li>
                </ul>
                <div class="right">
                    <input type="text" value="검색">

                </div>
            </div>
        </div>
        <div id="content">
            <div id="top_content" class="parent">
                <div id="new_recruit" class="parent left">
                    <c:forEach items="${list}" var="dto">
                    	<div>
                    		${dto.SUBJECT}<br/>
                    		${dto.COM_NAME}
                    	</div>
                    	
                    </c:forEach>
                </div>
                <form action="loginProc" method="POST">
	                <div id="wrap_login" class="left">
	                    <div id="choice_login" class="parent">
	                        <label for="indiv_radio">개인</label>
	                        <input type="radio" id="indiv_radio" name="chk_login" value="개인" />
	                        <label for="com_radio">기업</label>
	                        <input type="radio" id="com_radio" name="chk_login" value="기업" />
	                    </div>
	                    <div id="input_login" class="parent">
	                        <div id="text" class="left">
	                            <input type="text" name="ID" id="ID" value="아이디"/>
	                            <input type="password" name="PW" id="PW" value="비밀번호"/>
	                        </div>
	                        <div id="login_button" class="left">
	                            <input type="submit" value="login">
	                        </div>
	                    </div>
	                </div>
                </form>
            </div>
           <div id="hot_recruit" class="parent">
               <h1>많이 찾는 공고</h1>
                <c:forEach items="${hot_list}" var="dto">
                	<div>
                		${dto.SUBJECT}<br/>
                		${dto.COM_NAME}
                	</div>
                </c:forEach>

           </div>
           <div id="imminent_recruit" class="parent">
                <h1>기한이 임박한 공고</h1>
                <c:forEach items="${imminent_list}" var="dto">
                	<div>
                		${dto.SUBJECT}<br/>
                		${dto.COM_NAME}<br/>
                	</div>
                </c:forEach>
           </div>
        </div>
        <div id="footer">
            <div id="footer_logo" class="parent">
                <img class="left" src="http://placehold.it/100x100">
                <h3 class="left">오늘부터일일</h3>
            </div>
            <div id="info">
                <div>고객센터 010-2600-7226 (평일 09:00~18:00, 주말·공휴일 휴무)</div>
                <div>이메일 : kk0141@naver.com  Fax : 053-751-7761(대표), 02-6937-0035(세금계산서)</div>
                <div>(주)오늘부터일일, 우 : 412-28, 대구광역시 동구 동부로 121 (신천동,경북산업직업전문학교), 대표 : 권희경</div>
                <div>사업자번호 : 502-91-09709, 통신판매업신고번호 : 동구청 제2-844호, Copyright (c) (주)오늘부터일일. All rights reserved.</div>
            </div>
        </div>
    </div>
</body>
</html>
