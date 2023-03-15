<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/14/2022
  Time: 8:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>sửa khách hàng</title>
    <link rel="stylesheet" href="/bootstrap-5.1.3-dist/css/bootstrap.min.css">
</head>
<body>
<div class="row ">
    <div class="col-lg-1">
        <button class="btn btn-outline-primary mt-5" type="submit" onclick="location.href='/customer'">quay lại list
        </button>
    </div>
    <div class="col-lg-10">

        <div class="row m-5">
            <div class="container register-form">
                <div class="form">
                    <div class="note align-items-center d-flex justify-content-center">
                        <h2>Sửa Khách hàng</h2>
                    </div>
                    <c:if test="${mess!=null}">
                        <h4 style="color: blue"> ${mess}</h4>
                    </c:if>
                    <form action="/customer?action=edit" method="post">
                        <div class="form-content">
                            <div class="row">
                                <div class="col-md-3"></div>
                                <div class="col-md-6">
                                    <div hidden class="form-group">
                                        <input  style="border-radius: 30px"
                                               type="text" class="form-control" name="id"
                                               value="${id}" />
                                    </div>
                                    <div class="form-group">
                                        <label>Tên</label>
                                        <input required pattern="([A-Z][a-z]+[ ])+([A-Z][a-z]+)"
                                               title="Vui Lòng Nhập đúng định dạng" style="border-radius: 30px"
                                               type="text" class="form-control" name="name"
                                               value="${name}" placeholder="Nhập tên *"/>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Sô điện thoại</label>
                                        <input required pattern="0[0-9]{9,10}"
                                               title="Số điện thoại bắt đầu từ 0 và có 10-11 chữ số"
                                               style="border-radius: 30px" type="text" class="form-control"
                                               name="phoneNumber"
                                               value="${phoneNumber}" placeholder="Nhập số điện thoại 0-xxx xxx xxx *"/>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Ngày Bắt đầu thuê</label>
                                        <input style="border-radius: 30px" type="date" class="form-control"
                                               name="startDate"
                                               value="${startDate}" placeholder="Ngày Bắt đầu thuê *"/>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Hình thức thanh toán</label>
                                        <select onmouseover="disappear()" name="rentTypeId" class="form-select"
                                                aria-label="Default select example"
                                                style="border-radius: 30px">
                                            <option id="disappearId">Chọn hình thức thanh toán *</option>
                                            <option value="1"${rentTypeId == 1?"selected":""}>Theo tháng</option>
                                            <option value="2"${rentTypeId == 2?"selected":""}>Theo quí</option>
                                            <option value="3"${rentTypeId == 3?"selected":""}>Theo day</option>
                                        </select>

                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Ghi chú</label>

                                        <input required pattern="([a-z0-9]+[ ])+([a-z0-9]+)"
                                               title="Vui lòng không nhập ký tự đặt biệt" style="border-radius: 30px"
                                               type="text" class="form-control"
                                               value="${note}" name="note"
                                               placeholder="Ghi chú *"/>
                                    </div>
                                    <br></div>
                                <div class="col-md-3"></div>
                            </div>
                            <br>
                            <button type="submit" class="btn btn-outline-success">Submit</button>
                        </div>
                    </form>

                </div>
            </div>

        </div>

        <div></div>

    </div>
    <div class="col-lg-1"></div>
</div>
</body>
<script src="/bootstrap-5.1.3-dist/js/bootstrap.bundle.min.js"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
    function disappear() {
        document.getElementById("disappearId").style.display = "none";

    }
</script>
</html>
