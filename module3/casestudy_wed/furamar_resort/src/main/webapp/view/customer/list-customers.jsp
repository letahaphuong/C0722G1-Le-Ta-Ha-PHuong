<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/6/2022
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Danana Customer List</title>
    <meta charset="UTF-8">
    <!--    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">-->
    <link rel="stylesheet" href="mystyle.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap5.min.css">


</head>
<body>

<div class="vh-100 vw-100">
    <header class="d-flex justify-content-between" style="height: 15%;">
        <div class=" d-flex justify-content-center ps-5">
            <div class="shadow-lg">
                <a href="https://furamavietnam.com/" class="header-logo1 rounded">
                    <img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png" class="img-fura"></a>
            </div>
        </div>
        <div class=" d-flex justify-content-center " style="flex-direction: column">
            <div class="border rounded shadow-lg" style="border: 1px solid  #046056 ">
                <a class="m-0"
                   href="https://www.tripadvisor.com/Hotel_Review-g298085-d302750-Reviews-Furama_Resort_Danang-Da_Nang.html">
                    <img src="https://logos-marques.com/wp-content/uploads/2021/03/TripAdvisor-Logo-500x283.png"
                         style="width: 150px">
                </a>
            </div>
        </div>
        <div class=" d-flex justify-content-center align-items-center">
            <div class="container border rounded " style="height: 100px;width: 250px">
                <a href="https://goo.gl/maps/oaWEpPuBNhUYoFPN8"><img src="../1x/baseline_location_on_black_24dp.png"
                                                                     height="24" width="24"/></a>
                <a class="text-black text-decoration-none" href="https://goo.gl/maps/oaWEpPuBNhUYoFPN8"
                   style="font-size: 13px">
                    103 - 105 Vo Nguyen Giap Street,
                    Khue My Ward, Ngu Hanh Son
                    District, Danang City, Vietnam
                    7,0 km from Danang Airport
                </a>
            </div>
        </div>
        <div class=" d-flex justify-content-center align-items-center">
            <div class="container border rounded shadow-lg" style="width: 235px;height: 115px">
                <img src="../1x/baseline_local_phone_black_24dp.png" height="24" width="24"/>
                <p style="font-size: 13px">84-236-3847 333/888</p>
                <img src="../1x/baseline_email_black_24dp.png" height="24" width="24"/>
                <p style="font-size: 13px">reservation@furamavietnam.com</p>
            </div>
        </div>
        <div class="d-flex justify-content-center pe-5">
            <button type="button" class="btn btn-success my-5 text-dark bg-secondary" data-bs-toggle="modal"
                    data-bs-target="#exampleModalLogOut">log out
            </button>
        </div>
    </header>
    <div class="row sticky-top" style="height: 5%">
        <nav class="navbar navbar-expand-lg " style="background-color: #046056">
            <div class="container-fluid">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item ">
                            <a class="nav-link active text-white" aria-current="page"
                               href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/furama_resort_danang.html?_ijt=dioev7us81f2sm3e9dk11snnsp"
                               style="color: #0000008c ">Home</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarEmployee" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Employee
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarEmployee">
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_employee.html?_ijt=r18j13pltmd37669566c41v116v">Management</a>
                                </li>
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_employee.html?_ijt=r18j13pltmd37669566c41v116">Staff</a>
                                </li>
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_employee.html?_ijt=r18j13pltmd37669566c41v116">Show
                                    All</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarCustomer" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Customer
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarCustomer">
                                <li><a class="dropdown-item" href="#">Diamond</a></li>
                                <li><a class="dropdown-item" href="#">Platinium</a></li>
                                <li><a class="dropdown-item" href="#">Gold</a></li>
                                <li><a class="dropdown-item" href="#">Silver</a></li>
                                <li><a class="dropdown-item" href="#">Member</a></li>

                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarService" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Service
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarService">
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_facility.html?_ijt=dioev7us81f2sm3e9dk11snnsp">Villa</a>
                                </li>
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_facility.html?_ijt=dioev7us81f2sm3e9dk11snnsp">House</a>
                                </li>
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_facility.html?_ijt=dioev7us81f2sm3e9dk11snnsp">Room</a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarContract" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Contract
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarContract">
                                <li><a class="dropdown-item" href="#">Action</a></li>
                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li>
                            </ul>
                        </li>
                    </ul>
                    <form action="customer?action=search" method="post"
                          class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 ">
                        <input class="form-control me-2" type="text" placeholder="Search name or address" name="search"
                               aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>

                </div>
            </div>
        </nav>
    </div>

    <div class="row text-center align-items-end" style="height: 10%">
        <div class="col-lg-4">
            <div class="container"><c:if test="${mess!=null}">
                <h4 style="color: blue">${mess}</h4>
            </c:if></div>

        </div>
        <div class="col-lg-4"><h3 class="mb-4">LIST CUSTOMER</h3>
        </div>
        <div class="col-lg-4">
            <form class="d-flex align-items-start col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 mb-4">
                <button onclick="location.href='/customer?action=add'" class="btn btn-outline-success" type="button">
                    Add
                </button>
            </form>
        </div>

    </div>
    <div class="row">
        <div class="col-lg-2"></div>
        <div class="col-lg-8" style="border-top: 2px solid black">

            <div>
                <table id="tableCustomer" class="table table-striped table-hover table-bordered" style="width: 100%">
                    <thead>
                    <tr>
                        <th scope="col">STATUS</th>
                        <th scope="col">NAME CUSTOMER TYPE</th> <!--CUSTOMER TYPE ID-->
                        <th scope="col">NAME</th>
                        <th scope="col">DATE OF BIRTH</th>
                        <th scope="col">GENDER</th>
                        <th scope="col">ID CARD</th>
                        <th scope="col">PHONE NUMBER</th>
                        <th scope="col">EMAIL</th>
                        <th scope="col">ADDRESS</th>
                        <th scope="col">EDIT</th>
                        <th scope="col">ROMVE</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="customer" items="${customerList}" varStatus="status">
                        <tr class="text-center">
                            <th>${status.count}</th>

                            <td>${customer.getNameCustomerType()}</td>
                            <td>${customer.getName()}</td>
                            <td>${customer.getDateOfBirth()}</td>
                            <c:if test="${customer.isGender()}">
                                <td>Female</td>
                            </c:if>
                            <c:if test="${!customer.isGender()}">
                                <td>Male</td>
                            </c:if>
                            <td>${customer.getIdCard()}</td>
                            <td>${customer.getPhoneNumber()}</td>
                            <td>${customer.getEmail()}</td>
                            <td>${customer.getAddress()}</td>
                            <td>
                                <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 ">
                                    <button onclick="location.href='customer?action=edit&id=${customer.getId()}'"
                                            class="btn btn-outline-success" type="button">
                                        Edit
                                    </button>
                                </form>
                            </td>
                            <td>
                                <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 ">
                                    <button onclick="idRemove('${customer.getId()}','${customer.getName()}')"
                                            class="btn btn-outline-secondary" type="button" data-bs-toggle="modal"
                                            data-bs-target="#exampleModal" >
                                        Remove
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
    <div class="col-lg-2"></div>
</div>

<footer class="bg-light text-center text-lg-start position-fixed" style="height: 5%;width: 100%">
    <div class="text-center text-white p-3" style="background-color:#046056 ;">
        © 2022 Phuong Le Ta Ha
    </div>
</footer>
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
                <form action="/customer?action=remove" method="post">
                    <input type="hidden" name="id"  id="idInput">
                    <button class="btn btn-primary">DELETE</button>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- ADD -->
<div class="modal fade" id="exampleModalAdd" tabindex="-1" aria-labelledby="exampleModalLabelAdd" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header" style="background: -webkit-linear-gradient(left, #046056, #ffffff)">
                <h5 class="modal-title text-white" id="exampleModalLabelAdd">Customer</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div class="row m-5">
                    <div class="container register-form">
                        <div class="form">
                            <div class="note align-items-center d-flex justify-content-center">
                                <h2>ADD CUSTOMER</h2>
                            </div>

                            <div class="form-content">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="birtdDateAdd">Id</label>
                                            <input type="text" class="form-control" placeholder="ID *" value=""/>
                                        </div>
                                        <div class="form-group">
                                            <label for="birtdDateAdd">Select Customer Type</label>
                                            <select class="form-select" aria-label="Default select example"
                                                    style="border-radius: 30px">
                                                <option selected>SELECT CUSTOMER *</option>
                                                <option value="1">Diamond</option>
                                                <option value="2">Platinum</option>
                                                <option value="3">Gold</option>
                                                <option value="4">Silver</option>
                                                <option value="5">Member</option>
                                            </select>
                                            <!--                                            <input type="text" class="form-control" placeholder="CUSTOMER TYPE ID *" value=""/>-->
                                        </div>
                                        <div class="form-group">
                                            <label for="birtdDateAdd">Name</label>
                                            <input type="text" class="form-control" placeholder="NAME *" value=""/>
                                        </div>
                                        <div class="form-group">
                                            <!--                                            <input type="text" class="form-control" placeholder="DATE OF BIRTH *"-->
                                            <!--                                                   value=""/>-->
                                            <label for="birtdDateAdd">Birth Day</label>
                                            <input id="birtdDateAdd" class="form-control" type="date"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="birtdDateAdd">Gender</label>
                                            <input type="text" class="form-control" placeholder="GENDER *" value=""/>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="birtdDateAdd">Id Card</label>
                                            <input type="text" class="form-control" placeholder="ID CARD *" value=""/>
                                        </div>
                                        <div class="form-group">
                                            <label for="birtdDateAdd">Phone Numeber</label>
                                            <input type="text" class="form-control" placeholder="PHONE NUMBER *"
                                                   value=""/>
                                        </div>
                                        <div class="form-group">
                                            <label for="birtdDateAdd">E-mail</label>
                                            <input type="text" class="form-control" placeholder="EMAIL *" value=""/>
                                        </div>
                                        <div class="form-group">
                                            <label for="birtdDateAdd">Address</label>
                                            <input type="text" class="form-control" placeholder="ADDRESS *" value=""/>
                                        </div>
                                    </div>
                                </div>
                                <br>
                                <!--                                <button type="submit" class="btn btn-outline-success">Submit</button>-->
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                    </button>
                                    <button type="button" class="btn btn-success">Summit</button>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <!--                        <div class="modal-footer">-->
            <!--                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>-->
            <!--                            <button type="button" class="btn btn-success">Save changes</button>-->
            <!--                        </div>-->
        </div>
    </div>
</div>
<!-- EDIT -->
<div class="modal fade" id="exampleModalEdit" tabindex="-1" aria-labelledby="exampleModalLabelEdit" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header" style="background: -webkit-linear-gradient(left, #046056, #ffffff)">
                <h5 class="modal-title text-white" id="exampleModalLabelEdit">Customer</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div class="row m-5">
                    <div class="container register-form">
                        <div class="form">
                            <div class="note align-items-center d-flex justify-content-center">
                                <h2>EDIT CUSTOMER</h2>
                            </div>

                            <div class="form-content">
                                <div class="row">
                                    <div class="col-md-6">
                                        <label>Select Customer</label>
                                        <div class="form-group">
                                            <select class="form-select" aria-label="Default select example"
                                                    style="border-radius: 30px">
                                                <option selected>SELECT CUSTOMER *</option>
                                                <option value="1">Diamond</option>
                                                <option value="2">Platinum</option>
                                                <option value="3">Gold</option>
                                                <option value="4">Silver</option>
                                                <option value="5">Member</option>
                                            </select>
                                        </div>
                                        <label>Name</label>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="NAME *" value=""/>
                                        </div>
                                        <div class="form-group">
                                            <label for="birtdDateEdit">Birth Day</label>
                                            <input id="birtdDateEdit" class="form-control" type="date"/>
                                        </div>
                                        <label>Gender</label>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="GENDER *" value=""/>
                                        </div>
                                        <br>

                                    </div>
                                    <div class="col-md-6">
                                        <label>Id Card</label>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="ID CARD *" value=""/>
                                        </div>
                                        <div class="form-group">
                                            <label>Phone Number</label>
                                            <input type="text" class="form-control" placeholder="PHONE NUMBER *"
                                                   value=""/>
                                        </div>
                                        <div class="form-group">
                                            <label>E-mail</label>
                                            <input type="text" class="form-control" placeholder="EMAIL *" value=""/>
                                        </div>
                                        <div class="form-group">
                                            <label>Address</label>
                                            <input type="text" class="form-control" placeholder="ADDRESS *" value=""/>
                                        </div>
                                    </div>
                                </div>
                                <br>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                    </button>
                                    <button type="button" class="btn btn-success">Save changes</button>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous">
    var toastTrigger = document.getElementById('liveToastBtn')
var toastLiveExample = document.getElementById('liveToast')
if (toastTrigger) {
    toastTrigger.addEventListener('click', function () {
        var toast = new bootstrap.Toast(toastLiveExample)

        toast.show()
    })
}</script>
<script>
    function idRemove(id,name) {
        document.getElementById("idInput").value = id;
        document.getElementById("deleteModal").innerText=name;
    }
</script>
<script src="/jquery/jquery-3.5.1.min.js"></script>
<script src="/datatables/js/jquery.dataTables.min.js"></script>
<script src="/datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 3
        })
    })
</script>
</html>
