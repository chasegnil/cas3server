<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/16
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=pageContext.getServletContext().getContextPath()+"/"%>">
    <title>cas 单点登录系统</title>
    <!-- Custom Theme files -->
    <link href="css/home/login/style.css" rel="stylesheet" type="text/css" media="all"/>
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="单点登录" />
    <!--Google Fonts-->
    <!--<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    --><!--Google Fonts-->
</head>
<body>
<!--header start here-->
<div class="login-form">
    <div class="top-login">
        <span><img src="images/home/login/group.png" alt=""/></span>
    </div>
    <h1>登录 单点登录系统(CAS)</h1>
    <div class="login-top">
        <form:form method="post" id="fm1" commandName="${commandName}" htmlEscape="true">
            <div class="login-ic">
                <i ></i>
            <c:if test="${not empty sessionScope.openIdLocalId}">
                <strong>${sessionScope.openIdLocalId}</strong>
                <input type="hidden" id="username" placeholder="用户名" autofocus="autofocus" name="username" value="${sessionScope.openIdLocalId}" />
            </c:if>

            <c:if test="${empty sessionScope.openIdLocalId}">
                <form:input path="username" required="required" cssErrorClass="error" placeholder="用户名" tabindex="1" htmlEscape="true" autocomplete="false" />
            </c:if>
                <div class="clear"> </div>
            </div>
            <div class="login-ic">
                <i class="icon"></i>
                <form:password path="password" required="required" cssErrorClass="error" placeholder="密码" tabindex="2" htmlEscape="true" autocomplete="off" />
                <div class="clear"> </div>
            </div>
            <input type="hidden" name="lt" value="${loginTicket}" />
            <input type="hidden" name="execution" value="${flowExecutionKey}" />
            <input type="hidden" name="_eventId" value="submit" />

            <div class="log-bwn">
                <input type="submit"  value="Login" >
            </div>
        </form:form>
    </div>
    <p class="copy">© 2018 xxxxxxxxxxx</p>
</div>
<!--header start here-->
</body>
</html>
