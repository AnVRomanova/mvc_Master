<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<html>--%>
<%--<body>--%>
<%-- edit--%>
<%--<c:forEach var="msq" items="${messages}">--%>
<%--    <h1>${msq}</h1>--%>
<%--</c:forEach>--%>

<%--</body>--%>
<%--</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>Edit</title>
</head>
<body>

<form th:method="POST" th:action="@{/users/edit/{id}(id=${user.id})}"  th:object="${user}">
    <input type="hidden" name="id" value="${user.id}">

    <label for="name">Name</label>
    <input th:field="*{name}" type="text" name="name" id="name">

    <label for="lastName">lastName</label>
    <input th:field="*{lastName}" type="text" name="lastName" id="lastName">

    <label for="email">email</label>
    <input th:field="*{user.email}" type="text" name="email" id="email">

    <input type="submit" value="Edit user">
</form>
</body>
</html>