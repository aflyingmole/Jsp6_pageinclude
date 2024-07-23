<%--
  Created by IntelliJ IDEA.
  User: jhta
  Date: 2024-07-23
  Time: 오전 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
    <h1>게시글</h1>
    <ul>
        <c:forEach var="d" items="${list}">
            <li>${d}</li>
        </c:forEach>
    </ul>
</div>