
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product View</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

<div class="row text-center">
    <div class="col-md-3">
    </div>
    <div class="col-md-6"><h1>VIEW!</h1></div>
    <div class="col-md-3"></div>
</div>
<div class="row ">
    <div class="col-md-3">
        <button class="btn btn-success" onclick="location.href='/product'">Back to list</button>
    </div>
    <div class="col-md-6"></div>
    <div class="col-md-3"></div>
</div>
<table class="table table-striped table-hover">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Product Detail</th>
        <th>Producer</th>
    </tr>
    <tr>
        <td>${product.getName()}</td>
        <td>${product.getPrice()}</td>
        <td>${product.getProductDetail()}</td>
        <td>${product.getProducer()}</td>
    </tr>

</table>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</body>
</html>