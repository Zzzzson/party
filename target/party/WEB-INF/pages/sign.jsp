<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: plus
  Date: 14-3-25
  Time: 下午4:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form:form action="sign.do" method="post">
        <table>
            <tr>
                <td>name:</td>
                <td><input type="text" id="name" name="name"></td>
            </tr>
            <tr>
                <td>password:</td>
                <td><input type="password" id="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="sign" ></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
