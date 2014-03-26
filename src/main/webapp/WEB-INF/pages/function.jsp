<%--
  Created by IntelliJ IDEA.
  User: plus
  Date: 14-3-25
  Time: 下午5:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title></title>
</head>
<body>
    <c:if test="${not empty list}">
    <table border="8">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>address</td>
            <td>introduction</td>
        </tr>
        <c:forEach items="${list}" var="listValue">
              <tr>
                  <td>${listValue.id}</td>
                  <td>${listValue.name}</td>
                  <td>${listValue.address}</td>
                  <td>${listValue.introduction}</td>
                  <td><form action="join.do" method="post"><input type="text" name="id" id="id" value="${listValue.id}" style="display: none" >
                  <input type="submit" value="join"></form></td>
              </tr>
        </c:forEach>
    </table>
    </c:if>
</body>
</html>
