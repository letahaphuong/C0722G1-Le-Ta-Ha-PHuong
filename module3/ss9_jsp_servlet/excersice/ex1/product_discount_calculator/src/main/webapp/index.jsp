<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2022
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%-- Product Description: Mô tả của sản phẩm--%>
<%--  List Price: Giá niêm yết của sản phẩm--%>
<%--  Discount Percent: Tỷ lệ chiết khấu (phần trăm)--%>
<form action="/display-discount" method="post">
    <h1>Product Description</h1><br>
    <input type="text" name="product" placeholder="nhap mo ta"><br>
    <h1>List Price</h1><br>
    <input type="text" name="price" placeholder="gia niem yet"><br>
    <h1>Discount Percent</h1><br>
    <input type="text" name="discount" placeholder="chiet khau"><br>
    <button type="submit" >Calculate Discount</button>
</form>

</body>
</html>
