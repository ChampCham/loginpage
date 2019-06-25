<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <style>
        <%@ include file="../css/style.css" %>
    </style>
    <body>
        <h1>Login</h1>
        <p>${error}</p>
        <form action="/login" method="post">
            Username:<br/><input type="text" name="username"/>
            <br/>
            Password:<br/><input type="password" name="password">
            <br><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
