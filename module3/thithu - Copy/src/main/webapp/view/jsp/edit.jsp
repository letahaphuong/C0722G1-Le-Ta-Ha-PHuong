
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>sửa</title>
    <link rel="stylesheet" href="/bootstrap-5.1.3-dist/css/bootstrap.min.css">
</head>
<body>
<div class="row ">
    <div class="col-lg-1">
        <button class="btn btn-outline-primary mt-5" type="submit" onclick="location.href='/benhAn'">quay lại list
        </button>
    </div>
    <div class="col-lg-10">

        <div class="row m-5">
            <div class="container register-form">
                <div class="form">
                    <div class="note align-items-center d-flex justify-content-center">
                        <h2>Sửa</h2>
                    </div>
                    <c:if test="${mess!=null}">
                        <h4 style="color: blue"> ${mess}</h4>
                    </c:if>
                    <form action="/benhAn?action=edit" method="post">
                        <div class="form-content">
                            <div class="row">
                                <div class="col-md-3"></div>
                                <div class="col-md-6">

                                    <div class="form-group">
                                        <label>Mã Bênh án</label>
                                        <input  readonly
                                                style="border-radius: 30px"
                                               type="text" class="form-control" name="idBenhAn"
                                               value="${idBenhAn}"/>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Mã Bệnh Nhân</label>
                                        <input readonly
                                               style="border-radius: 30px" type="text" class="form-control"
                                               name="idBenhNhan"
                                               value="${idBenhNhan}" />
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Tên Bệnh Nhân</label>
                                        <input style="border-radius: 30px" type="date" class="form-control"
                                               name="name"
                                               value="${name}" />
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Ngày Nhập Viên</label>

                                        <input
                                              style="border-radius: 30px"
                                               type="text" class="form-control"
                                               value="${ngayNhap}" name="ngayNhap"
                                               placeholder="Ghi chú *"/>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Ngày Ra Viên</label>

                                        <input
                                                style="border-radius: 30px"
                                                type="text" class="form-control"
                                                value="${ngayRa}" name="ngayRa"
                                                placeholder="Ghi chú *"/>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Lý Do Nhập Viện</label>

                                        <input
                                                style="border-radius: 30px"
                                                type="text" class="form-control"
                                                value="${lyDo}" name="lyDo"
                                                placeholder="Ghi chú *"/>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Phương Pháp Điều Trị</label>

                                        <input
                                                style="border-radius: 30px"
                                                type="text" class="form-control"
                                                value="${phuongPhapDieuTri}" name="phuongPhapDieuTri"
                                                placeholder="Ghi chú *"/>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <label>Phương Pháp Điều Trị</label>

                                        <input
                                                style="border-radius: 30px"
                                                type="text" class="form-control"
                                                value="${bacSi}" name="bacSi"
                                                placeholder="Ghi chú *"/>
                                    </div>
                                    <br>


                                </div>
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
