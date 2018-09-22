<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<body>
   <!--Logo区域开始-->
        <div id="header">
            <img src="${pageContext.request.contextPath}/images/logo.png" alt="logo" class="left"/>
            欢迎您！${sessionScope.admin.aname}
            <a href="${pageContext.request.contextPath}/view/login.jsp">[退出]</a>            
        </div>
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <div id="navi">
            <ul id="menu">
                <c:forEach items="${sessionScope.admin.lp}" var="priv">
                	<li><a href="${pageContext.request.contextPath}/${priv.phref}" class="${priv.pclass}" ></a></li>
                </c:forEach>
            </ul>
        </div>
        <!--导航区域结束-->
</body>
</html>