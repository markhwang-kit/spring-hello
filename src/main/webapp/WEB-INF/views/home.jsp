<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<br>
<%
	String path = request.getContextPath();
%>
<a href="${pageContext.request.contextPath}/board/writeView">글쓰기</a><br>
<a href="${pageContext.request.contextPath}/board/list">글보기</a><br>
</body>
</html>
