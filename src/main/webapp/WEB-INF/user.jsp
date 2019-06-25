<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <style>
        <%@ include file="../css/style.css" %>
    </style>
    <body>
        <ul>
            <li><a href="/users">Users</a> </li>
            <li><a href="/logout">Logout</a></li>
        </ul>
        <h1>User Profile</h1>
        <h2>Username: ${user.username}</h2>
        <h2>First name: ${user.firstName}</h2>
        <h2>Last name: ${user.lastName}</h2>
        <button type="button"onclick="window.location.href = '/edit';">Edit</button>
    </body>
</html>