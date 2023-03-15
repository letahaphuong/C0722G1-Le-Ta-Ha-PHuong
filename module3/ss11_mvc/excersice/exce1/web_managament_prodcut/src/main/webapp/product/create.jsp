
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product Info Input</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<div class="row text-center">
    <h1>Add new Product</h1>
</div>
<div class="row text-center">
    <div class="col-md-2">    <button class="btn btn-success" onclick="location.href='/product'">Back to list</button>
    </div>
    <div class="col-md-8"></div>
    <div class="col-md-2">
        <c:if test="${message!=null}">
            <h4 style="color: blue">${message}</h4>
        </c:if>
    </div>
</div>

<div class="row">
    <div class="col-md-4"></div>
    <div class="col-md-4">
        <form action="/product?action=add" method="post">
            <div class="form-content ">

                <div class="col-md-12">
                    <div class="form-group">
                        <input type="text" class="form-control" name="id" placeholder="ID *" value=""/>
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="text" class="form-control" name="name" placeholder="NAME *" value=""/>
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="text" class="form-control" name="price" placeholder="PRICE *" value=""/>
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="text" class="form-control" name="productDetail" placeholder="PRODUCT DETAIL *"
                               value=""/>
                    </div>
                    <br>
                    <div class="form-group">
                        <input type="text" class="form-control" name="producer" placeholder="PRODUCER *" value=""/>
                    </div>
                    <br>
                </div>
                <br>
                <button type="submit" class="btn btn-outline-success">Submit</button>
            </div>

        </form>
    </div>
    <div class="col-md-4"></div>

</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</html>