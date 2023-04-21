<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Users</title>
</head>
<body>
<header>

</header>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Last Name</td>
        <td>email</td>
        <th>action</th>
    </tr>
    <c:forEach var="u" items="${userList}">
        <tr>
            <td>${u.id}</td>
            <td>${u.name}</td>
            <td>${u.lastName}</td>
            <td>${u.email}</td>
            <td>
                <a href="users/edit/${u.id}">edit</a>
                <a href="users/delete/${u.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table><br>

</body>
</html>

