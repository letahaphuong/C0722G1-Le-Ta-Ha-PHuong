<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2022
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Result:</h1>
    <c:choose>
        <c:when test="${calculator.getMatch().equals('Addition')}">
            <p>${calculator.getFirstOperand()+calculator.getSecondOperand()}</p>
        </c:when>
        <c:when test="${calculator.getMatch().equals('Subtraction')}">
            <p>${calculator.getFirstOperand()-calculator.getSecondOperand()}</p>
        </c:when>
        <c:when test="${calculator.getMatch().equals('Multiplication')}">
            <p>${calculator.getFirstOperand()*calculator.getSecondOperand()}</p>
        </c:when>
        <c:when test="${calculator.getMatch().equals('Division')}">
                <p>${calculator.getFirstOperand()/calculator.getSecondOperand()}</p>
        </c:when>
    </c:choose>
</body>
</html>
