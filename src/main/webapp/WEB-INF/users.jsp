<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <style>
        <%@ include file="../css/style.css" %>
    </style>
    <head>
        <script>
            function del(username){
                if(window.confirm("want to delete " + username + " ?")){
                    var request = new XMLHttpRequest();
                    request.open("DELETE", "/users?username=" + username);
                    request.send();
                    location.reload(true);
                }
            }
        </script>
    </head>
    <body>
        <ul>
            <li><a href="/user">User</a></li>
            <li><a href="/logout">Logout</a></li>
        </ul>
        <h1>User List</h1>
        <div className="table-wrapper">
        <table border="1">
            <tr>
                <td>Username</td>
                <td>First name</td>
                <td>Last name</td>
                <td></td>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.username}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>
                        <c:if test="${username != user.username}">
                            <button onclick="del('${user.username}')" style="background:none; border:none; cursor:pointer;">
                                delete
                            </button>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
        </div>
        <button type="button"onclick="window.location.href = '/register';">Add</button>
    </body>
</html>