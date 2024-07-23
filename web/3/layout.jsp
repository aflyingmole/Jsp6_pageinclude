<%--
  Created by IntelliJ IDEA.
  User: jhta
  Date: 2024-07-23
  Time: 오전 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>3/layout.jsp</title>
</head>
<body>
<div>
    <div>
        <jsp:include page="header.jsp"></jsp:include>
    </div>
    <div>
        <jsp:include page="${content}"></jsp:include>
    </div>
    <div>
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
</div>
</body>
</html>
