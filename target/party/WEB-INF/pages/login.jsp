<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: plus
  Date: 14-3-25
  Time: 上午11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form:form action="login.do" method="get">
    <table>
        <tr>
            <td>name:</td>
            <td><input name="name" type="text" id="name"></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input name="password" type="password" id="password"></td>
        </tr>
        <tr>
           <td><input type="submit" value="login"></form:form></td>
           <td><form:form action="signPage.do" method="get">
               <input type="submit" value="sign">
           </form:form> </td>
        </tr>
    </table>
</body>
</html>
