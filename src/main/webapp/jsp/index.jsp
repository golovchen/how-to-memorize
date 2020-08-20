<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%--@elvariable id="words" type="java.util.List<java.lang.String>"--%>
<html>
<head>
    <title>How to memorize</title></head>
<body>
<form method="get">
    <input type="text" name="query" value="" style="width: 250px">
    <input type="submit" value="Поиск">
</form>
<c:if test="${not empty words}">
    <ol>
        <c:forEach items="${words}" var="word">
            <li><c:out value="${word}"/></li>
        </c:forEach>
    </ol>
</c:if>
</body>
</html>