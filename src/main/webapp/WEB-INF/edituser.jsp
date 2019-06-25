<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <style>
        <%@ include file="../css/style.css" %>
    </style>
    <ul>
        <li><a href="/user">User</a></li>
        <li><a href="/users">Users</a></li>
    </ul>
    <body>
        <h1>Edit Profile</h1>
        <p>${error}</p>
        <h2>Username: ${user.username}</h2>
        <form action="/edit" method="post">
            <h2>First name:</h2><input type="text" name="firstName" id="firstName" value="${user.firstName}"/>
            <br/>
            <h2>Last name:</h2><input type="text" name="lastName" id="lastName" value="${user.lastName}"/>
            <br/>
            <h2>Password:</h2><input type="password" name="password" id="userPassword"/>
            <br><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>