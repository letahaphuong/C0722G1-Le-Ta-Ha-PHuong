<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center">Product List</h1>
<button class="btn btn-primary" onclick="location.href='/product?action=add'">Add</button>
<form action="/product?action=findProduct" method="post">
    <input type="text" placeholder="Search" name="name">
    <button class="btn btn-primary">
        Search
    </button>
</form>

<table class="table table-striped table-hover">
    <tr>
        <th hidden>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Product Detail</th>
        <th>Producer</th>
        <th>Edit</th>
        <th>Delete</th>
        <th>View Detail</th>
    </tr>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td hidden><p name="id">${product.getId()}</p></td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getProductDetail()}</td>
            <td>${product.getProducer()}</td>
            <td>
                <button class="btn btn-warning" onclick="location.href='product?action=edit&id=${product.getId()}'">
                    Edit
                </button>
            </td>
            <td>
                <button type="button" onclick="idRemove('${product.getId()}')" class="btn btn-danger" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
            <td>
                <button class="btn btn-info" onclick="location.href='product?action=view&id=${product.getId()}'">View
                </button>
            </td>
        </tr>
    </c:forEach>

</table>
<%-- REMOVE--%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">DELETE</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal"
                        aria-label="Close"></button>
            </div>
            <div class="modal-body">
                Are you sure to delete???
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel
                </button>
                <form action="/product"
                      method="get">

                    <input type="hidden" name="id" id="idInput">
                    <input type="hidden" name="action" value="remove">
                    <button class="btn btn-primary">Delete</button>
                </form>
            </div>
        </div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous">

</script>

<script>
    function idRemove(id) {

        document.getElementById("idInput").value=id;
    }
</script>
</body>
</html>