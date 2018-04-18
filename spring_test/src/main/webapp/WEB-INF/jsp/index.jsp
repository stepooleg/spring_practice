<%--
  Created by IntelliJ IDEA.
  User: kursi
  Date: 12.04.2018
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>My spring app</title>
</head>
<body>
<table border="1">
    <tr>
        <th>
            Идентификатор
        </th>
        <th>
            Имя
        </th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.ID}</td>
            <td>${user.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
