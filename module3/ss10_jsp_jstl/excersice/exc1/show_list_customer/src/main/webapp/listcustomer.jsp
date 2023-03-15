<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2022
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Trang danh sách khách hàng</h1>
<table class="table table-dark">
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
        <c:forEach var="customer" items="${customerList}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getDate()}</td>
                <td>${customer.getAddress()}</td>
                <td><img src="${customer.getImg()}" style="width: 100px;height: 100px" </td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
