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
        <h1>Register</h1>
        <p>${error}</p>
        <form action="/register" method="post">
        Username:<br/><input type="text" name="username"/>
        <br/>
        Password:<br/><input type="password" name="password"/>
        <br/>
        First name:<br/><input type="text" name="firstName"/>
        <br/>
        Last name:<br/><input type="text" name="lastName"/>
        <br><br>
        <input type="submit" value="Submit">
        </form>
    </body>
</html>