<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
		<%@include file="include/link.jsp" %>
    </head>
    <body class="index">
       <!--Logo区域开始-->
        <div id="header">
            <img src="${pageContext.request.contextPath}/images/logo.png" alt="logo" class="left"/>
            欢迎您！${sessionScope.admin.aname}
            <a href="${pageContext.request.contextPath}/view/login.jsp">[退出]</a>            
        </div>
        <!--Logo区域结束-->
        <!--导航区域开始-->
       <div><p></p></div>
        <div id="index_navi">
            <ul id="menu">
                <c:forEach items="${sessionScope.admin.lp}" var="priv">
                	<li><a href="${pageContext.request.contextPath}/${priv.phref}" class="${priv.pclass}"></a></li>
                </c:forEach>
            </ul>
        </div>
    </body>
    
</html>
