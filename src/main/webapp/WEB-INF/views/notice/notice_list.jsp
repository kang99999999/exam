<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<html>
<head>
    <title> 공지사항 </title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<head>
<body>
<h3>공지사항</h3>
<br><br><br>
<table border="1">
    <tr align="center" bgcolor="lightgreen">
        <td>번호</td>
        <td>구분</td>
        <td>제목</td>
        <td>등록일</td>
    </tr>
    <c:forEach var="notice" items="${noticeList}"
    <tr align="center">
        <td>${notice.n_idx}</td>
        <td>${notice.n_category}</td>
        <td>${notice.n_title}</td>
        <td>${notice.n_regdate}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>