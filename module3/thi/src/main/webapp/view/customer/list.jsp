
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>list customer</title>
    <link rel="stylesheet" href="/bootstrap-5.1.3-dist/css/bootstrap.min.css">
</head>
<body>
<div class="row text-center align-items-end" style="height: 10%">
    <div class="col-lg-4">
        <div class="container"><c:if test="${mess!=null}">
            <h4 style="color: blue">${mess}</h4>
        </c:if></div>

    </div>
    <div class="col-lg-4"><h3 class="mb-4">DANH SÁCH THUÊ PHÒNG TRỌ</h3>
    </div>
    <div class="col-lg-4 d-flex justify-content-between">
        <div class="col-lg-4">
            <form class="d-flex align-items-start col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 mb-4">
                <button onclick="location.href='/customer?action=add'" class="btn btn-outline-success" type="button">
                    thêm
                </button>
            </form>
        </div>
        <div class="col-lg-4">
            <nav class="navbar bg-light">
                <div class="container-fluid">
                    <form class="d-flex" role="search" action="customer?action=search" method="post">
                        <input class="form-control me-2" name="search" type="search" placeholder="Tìm tên/sđt" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Tìm</button>
                    </form>
                </div>
            </nav>
        </div>
        <div class="col-lg-4">
            <nav class="navbar bg-light">
                <div class="container-fluid">
                    <form class="d-flex" role="search" action="customer?action=searchId" method="post">
                        <input class="form-control me-2" name="searchById" type="search" placeholder="Tìm id" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Tìm</button>
                    </form>
                </div>
            </nav>
        </div>
    </div>
    </div>

</div>
<div class="row">
    <div class="col-lg-1"></div>
    <div class="col-lg-10" style="border-top: 2px solid black">

        <div class="row">
            <table id="tableCustomer" class="table table-striped table-hover table-bordered" style="width: 100%">
                <thead>
                <tr>
                    <th scope="col">STT</th>
                    <th scope="col" hidden>Mã Khách hàng</th>
                    <th scope="col">Tên Người Thuê</th>
                    <th scope="col">Số Điện Thoại</th>
                    <th scope="col">Ngày Bắt Đầu Thuê</th>
                    <th scope="col">Hình thức thanh toán</th>
                    <th scope="col">Ghi chú</th>
                    <th scope="col">Sửa</th>
                    <th scope="col">Xoá</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customer" items="${customerList}" varStatus="status">
                    <tr class="text-center">
                        <th>${status.count}</th>

                        <td hidden>${customer.getId()}</td>
                        <td>${customer.getName()}</td>
                        <td>${customer.getPhoneNumber()}</td>
                        <td>${customer.getStartDate()}</td>
                        <td>${customer.getRenName()}</td>
                        <td>${customer.getNote()}</td>

                        <td>
                            <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 ">
                                <button onclick="location.href='customer?action=edit&id=${customer.getId()}'"
                                        class="btn btn-outline-success" type="button">
                                    sửa
                                </button>
                            </form>
                        </td>
                        <td>
                            <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 ">
                                <button onclick="idRemove('${customer.getId()}','${customer.getName()}')"
                                        class="btn btn-outline-warning" type="button" data-bs-toggle="modal"
                                        data-bs-target="#exampleModal" >
                                    xoá
                                </button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<div class="col-lg-1"></div>
</div>
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
                <span>Are you sure to delete:  <span style="color: #db365d " id="deleteModal"></span></span>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                </button>
                <form action="/customer?action=delete" method="post">
                    <input type="hidden" name="id  id="idInput">
                    <button class="btn btn-primary">DELETE</button>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="datatables/scc/dataTables.bootstrap5.min.css">
<script>
    function idRemove(id,name) {
        document.getElementById("idInput").value = id;
        document.getElementById("deleteModal").innerText=name;
    }
</script>
<script src="/bootstrap-5.1.3-dist/js/bootstrap.bundle.min.js"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
</html>
