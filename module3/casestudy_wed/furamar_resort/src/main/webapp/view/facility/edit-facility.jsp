<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/7/2022
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Furama-Danh sach dich vu</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap5.min.css">
    <link rel="stylesheet" href="../../view/customer/mystyle.css">
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
                <a href="https://goo.gl/maps/oaWEpPuBNhUYoFPN8"><img src="../../1x/baseline_location_on_black_24dp.png"
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
                <img src="../../1x/baseline_local_phone_black_24dp.png" height="24" width="24"/>
                <p style="font-size: 13px">84-236-3847 333/888</p>
                <img src="../../1x/baseline_email_black_24dp.png" height="24" width="24"/>
                <p style="font-size: 13px">reservation@furamavietnam.com</p>
            </div>
        </div>
        <div class="d-flex justify-content-center pe-5">
            <button type="button" class="btn btn-success my-5 text-dark bg-light ">login</button>
            <button type="button" class="btn btn-success my-5 text-dark bg-secondary">log out</button>
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
                            <a class="nav-link active text-white" aria-current="page" href="#"
                               style="color: #0000008c ">Home</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarEmployee" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Employee
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarEmployee">
                                <li><a class="dropdown-item" href="#">Management</a></li>
                                <li><a class="dropdown-item" href="#">Staff</a></li>
                                <li><a class="dropdown-item" href="#">Show All</a></li>
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
                                <li><a class="dropdown-item" href="#">Villa</a></li>
                                <li><a class="dropdown-item" href="#">House</a></li>
                                <li><a class="dropdown-item" href="#">Room</a></li>
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
                    <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 ">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>

                </div>
            </div>
        </nav>
    </div>
    <div class="row text-center"
         style="height: 75%">
        <div class="row ">
            <div class="col-lg-1 ">

            </div>

            <div class="col-lg-10">

                <div class="row m-5">
                    <div class="col-lg-1">
                        <button class="btn btn-outline-primary" onclick="location.href='/facility'">Back</button>
                    </div>
                    <div class="col-lg-10">
                        <div class="container register-form">
                            <div class="form">
                                <div class="note align-items-center d-flex justify-content-center">
                                    <h2>EDIT FACILITY</h2>
                                </div>
                                <form action="/facility?action=edit" method="post">
                                    <div class="form-content">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div hidden class="form-group">
                                                    <label>Id</label>
                                                    <input type="text" class="form-control" name="id"
                                                           placeholder="id *" value="${id}"/>
                                                </div>
                                                <div class="form-group">
                                                    <label>Name</label>
                                                    <input type="text" class="form-control" name="name"
                                                           placeholder="name *" value="${name}"/>
                                                </div>
                                                <br>
                                                <div class="form-group">
                                                    <lable>Area</lable>
                                                    <input type="text" class="form-control" name="area"
                                                           placeholder="area *" value="${area}"/>
                                                </div>
                                                <br>
                                                <div class="form-group">
                                                    <lable>Cost</lable>
                                                    <input type="text" class="form-control" name="cost"
                                                           placeholder="cost *" value="${cost}"/>
                                                </div>
                                                <br>
                                                <div class="form-group">
                                                    <lable>Max PeoPle</lable>
                                                    <select name="maxPeople" class="form-select"
                                                            aria-label="Default select example"
                                                            style="border-radius: 30px">
                                                        <option value="1" ${maxPeople == 1?"selected":""}>1</option>
                                                        <option value="2"${maxPeople == 2?"selected":""}>2</option>
                                                        <option value="3"${maxPeople == 3?"selected":""}>3</option>
                                                        <option value="4"${maxPeople == 4?"selected":""}>4</option>
                                                        <option value="5"${maxPeople == 5?"selected":""}>5</option>
                                                        <option value="6"${maxPeople == 6?"selected":""}>6</option>
                                                        <option value="7"${maxPeople == 7?"selected":""}>7</option>
                                                        <option value="8"${maxPeople == 8?"selected":""}>8</option>
                                                        <option value="9"${maxPeople == 9?"selected":""}>9</option>
                                                        <option value="10"${maxPeople == 10?"selected":""}>10</option>
                                                    </select>
                                                    <%--                                                    <input type="text" class="form-control" name="maxPeople"--%>
                                                    <%--                                                           placeholder="maxPeople *" value="${maxPeople}"/>--%>
                                                </div>
                                                <br>
                                                <div class="form-group">
                                                    <label>Rent Type</label>
                                                    <select name="rentTypeId" class="form-select"
                                                            aria-label="Default select example"
                                                            style="border-radius: 30px">
                                                        <option value="1"${rentTypeId == 1?"selected":""}>year</option>
                                                        <option value="2"${rentTypeId == 2?"selected":""}>month</option>
                                                        <option value="3"${rentTypeId == 3?"selected":""}>day</option>
                                                        <option value="4"${rentTypeId == 4?"selected":""}>hour</option>
                                                    </select>
                                                    <%--                                                    <input type="text" class="form-control" name="rentTypeId"--%>
                                                    <%--                                                           placeholder="rentTypeId *" value="${rentTypeId}"/>--%>
                                                </div>
                                                <br>
                                                <div class="form-group">
                                                    <label>Facility Type</label>
                                                    <select name="facilityTypeId" class="form-select"
                                                            aria-label="Default select example"
                                                            style="border-radius: 30px">
                                                        <option value="1" ${facilityTypeId == 1?"selected":""}>Villa
                                                        </option>
                                                        <option value="2"${facilityTypeId == 2?"selected":""}>House
                                                        </option>
                                                        <option value="3"${facilityTypeId == 3?"selected":""}>Room
                                                        </option>
                                                    </select>
                                                    <%--                                                    <input type="text" class="form-control" name="facilityTypeId"--%>
                                                    <%--                                                           placeholder="facilityTypeId *" value="${facilityTypeId}"/>--%>
                                                </div>
                                                <br>
                                            </div>
                                            <div class="col-md-6">

                                                <div class="form-group">
                                                    <label>Standard Room</label>
                                                    <input type="text" class="form-control" name="standardRoom"
                                                           placeholder="standardRoom *" value="${standardRoom}"/>
                                                </div>
                                                <br>
                                                <div class="form-group">
                                                    <label>Description Other Convenience</label>
                                                    <input type="text" class="form-control"
                                                           name="descriptionOtherConvenience"
                                                           placeholder="descriptionOtherConvenience *"
                                                           value="${descriptionOtherConvenience}"/>
                                                </div>
                                                <br>
                                                <c:if test="${(facilityTypeId==1)}">
                                                    <div class="form-group">
                                                        <label>Pool Area</label>
                                                        <input type="text" class="form-control" name="poolArea"
                                                               placeholder="poolArea *" value="${poolArea}"/>
                                                    </div>
                                                    <br>
                                                    <div hidden class="form-group">
                                                        <label>Number Of Floors</label>
                                                        <input type="text" class="form-control" name="numberOfFloors"
                                                               placeholder="numberOfFloors *" value="${0}"/>
                                                    </div>
                                                    <div hidden class="form-group">
                                                        <label> Facility Free</label>
                                                        <input type="text" class="form-control" name="facilityFree"
                                                               placeholder="facilityFree *" value="${null}"/>
                                                    </div>
                                                </c:if>
                                                <c:if test="${!(facilityTypeId==3)}">
                                                    <div class="form-group">
                                                        <label>Number Of Floors</label>
                                                        <input type="text" class="form-control" name="numberOfFloors"
                                                               placeholder="numberOfFloors *" value="${numberOfFloors}"/>
                                                    </div>
                                                    <br>
                                                    <div hidden class="form-group">
                                                        <label>Pool Area</label>
                                                        <input type="text" class="form-control" name="poolArea"
                                                               placeholder="poolArea *" value="${0}"/>
                                                    </div>
                                                    <br>

                                                    <div hidden class="form-group">
                                                        <label> Facility Free</label>
                                                        <input type="text" class="form-control" name="facilityFree"
                                                               placeholder="facilityFree *" value="${null}"/>
                                                    </div>
                                                </c:if>

                                                <c:if test="${(facilityTypeId==3)}">
                                                    <div class="form-group">
                                                        <label> Facility Free</label>
                                                        <input type="text" class="form-control" name="facilityFree"
                                                               placeholder="facilityFree *" value="${facilityFree}"/>
                                                    </div>
                                                    <div hidden class="form-group">
                                                        <label>Pool Area</label>
                                                        <input type="text" class="form-control" name="poolArea"
                                                               placeholder="poolArea *" value="${0}"/>
                                                    </div>
                                                    <div hidden class="form-group">
                                                        <label>Number Of Floors</label>
                                                        <input type="text" class="form-control" name="numberOfFloors"
                                                               placeholder="numberOfFloors *" value="${0}"/>
                                                    </div>
                                                </c:if>

                                            </div>
                                        </div>
                                        <br>
                                        <button type="submit" class="btn btn-outline-success">Submit</button>
                                    </div>
                                </form>

                            </div>
                        </div>
                    </div>
                    <div class="col-lg-1"></div>

                </div>

                <div></div>

            </div>
            <div class="col-lg-1"></div>
        </div>

    </div>
    <footer class="bg-light text-center text-lg-start position-fixed" style="height: 5%;width: 100%">
        <div class="text-center text-white p-3" style="background-color:#046056 ;">
            © 2022 Phuong Le Ta Ha
        </div>
    </footer>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous">var toastTrigger = document.getElementById('liveToastBtn')
var toastLiveExample = document.getElementById('liveToast')
if (toastTrigger) {
    toastTrigger.addEventListener('click', function () {
        var toast = new bootstrap.Toast(toastLiveExample)

        toast.show()
    })
}</script>
</html>