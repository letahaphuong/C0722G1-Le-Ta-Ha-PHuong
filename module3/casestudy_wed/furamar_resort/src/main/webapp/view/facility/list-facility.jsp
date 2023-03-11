<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/7/2022
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama List facility</title>
    <link rel="stylesheet" href="customer/mystyle.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="datatables/scc/dataTables.bootstrap5.min.css">


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
            <!--                <button type="button" class="btn btn-success my-5 text-dark bg-light">Login</button>-->
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
                               href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/furama_resort_danang.html?_ijt=54bbo2t15k9rpj1hh5v7cevh83"
                               style="color: #0000008c ">Home</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarEmployee" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">
                                Employee
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarEmployee">
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_employee.html?_ijt=r18j13pltmd37669566c41v116">Management</a>
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
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_customer.html?_ijt=54bbo2t15k9rpj1hh5v7cevh83">Diamond</a>
                                </li>
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_customer.html?_ijt=54bbo2t15k9rpj1hh5v7cevh83v">Platinium</a>
                                </li>
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_customer.html?_ijt=54bbo2t15k9rpj1hh5v7cevh83">Gold</a>
                                </li>
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_customer.html?_ijt=54bbo2t15k9rpj1hh5v7cevh83">Silver</a>
                                </li>
                                <li><a class="dropdown-item"
                                       href="http://localhost:63342/COdegym/C0722G1-Le-Ta-Ha-Phuong/module3/case_study_data_base_wed/web/list_customer.html?_ijt=54bbo2t15k9rpj1hh5v7cevh83">Member</a>
                                </li>

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
                    <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3" action="/facility?action=search"
                          method="post">
                        <input name="search" class="form-control me-2" type="search" placeholder="Search"
                               aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>

                </div>
            </div>
        </nav>
    </div>

    <div class="row text-center align-items-end" style="height: 10%;border-bottom: 2px solid black">
        <div class="col-lg-1"></div>
        <div class="col-lg-2"></div>
        <div class="col-lg-6"><h3 class="mb-4">LIST FACILITY</h3></div>
        <div class="col-lg-2 d-flex justify-content-around">
            <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 mb-2">
                <button onclick="location.href='/facility?action=addVilla'" class="btn btn-outline-success" type="button">
                    +Villa
                </button>
            </form>
            <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 mb-2">
                <button onclick="location.href='/facility?action=addHouse'" class="btn btn-outline-success" type="button">
                    +House
                </button>
            </form>
            <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 mb-2">
                <button onclick="location.href='/facility?action=addRoom'" class="btn btn-outline-success"
                        type="button">
                    +Room
                </button>
            </form>

        </div>
        <div class="col-lg-1"></div>

    </div>
    <div class="row" style="height: 65%">
        <div class="col-lg-1"></div>
        <div class="col-lg-10">
            <div>
                <table id="tableFacility" class="table table-striped table-hover table-bordered" style="width: 100%">
                    <thead>
                    <tr>
                        <th scope="col">STT</th>
                        <th hidden scope="col">ID CLASS</th>
                        <th scope="col">NAME</th>
                        <th scope="col">AREA</th>
                        <th scope="col">COST</th>
                        <th scope="col">MAX PEOPLE</th>
                        <th scope="col">RENT TYPE NAME</th>
                        <th scope="col">FACILITY TYPE NAME</th>
                        <th scope="col">STANDARD ROOM</th>
                        <th scope="col">PREDESCRIPTION OTHER CONVENIENCE</th>
                        <th scope="col">POOL AREA</th>
                        <th scope="col">NUMBER OF FLOORS</th>
                        <th scope="col">FACILITY FREE</th>
                        <th scope="col">EDIT</th>
                        <th scope="col">REMOVE</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="facility" items="${facilityList}" varStatus="status">
                        <tr class="text-center">
                            <th hidden>${facility.getId()}</th>
                            <th>${status.count}</th>
                            <td>${facility.getName()}</td>
                            <td>${facility.getArea()}</td>
                            <td>${facility.getCost()}</td>
                            <td>${facility.getMaxPeople()}</td>
                            <td>${facility.getRentTypeName()}</td>
                            <td>${facility.getFacilityTypeName()}</td>
                            <td>${facility.getStandardRoom()}</td>
                            <td>${facility.getDescriptionOtherConvenience()}</td>
                            <td>${facility.getPoolArea()}</td>
                            <td>${facility.getNumberOfFloors()}</td>
                            <td>${facility.getFacilityFree()}</td>
                            <td>
                                <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 ">
                                    <button onclick="location.href='facility?action=edit&id=${facility.getId()}'"
                                            class="btn btn-outline-success" type="button">Edit
                                    </button>
                                </form>
                            </td>
                            <td>
                                <form class="d-flex col-xxl-2 col-xl-2 col-lg-3 col-md-3 col-sm-3 ">
                                    <button onclick="idRemove('${facility.getId()}','${facility.getName()}')"
                                            class="btn btn-outline-success" data-bs-toggle="modal"
                                            type="button" data-bs-target="#exampleModalRemove">Remove
                                    </button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>
        <div class="col-lg-1"></div>
    </div>
    <footer class="bg-light text-center text-lg-start position-fixed" style="height: 5%;width: 100%">
        <div class="text-center text-white p-3" style="background-color:#046056 ;">
            © 2022 Phuong Le Ta Ha
        </div>
    </footer>
</div>

<!-- REMOVE -->
<div class="modal fade" id="exampleModalRemove" tabindex="-1" aria-labelledby="exampleModalLabelRemove"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header" style="background: -webkit-linear-gradient(left, #046056, #ffffff)">
                <h5 class="modal-title text-white" id="exampleModalLabelRemove">Facility</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <span class="mt-2 ms-3">Are you sure to delete: </span><span style="color: #db365d"
                                                                             id="deleteModal"></span>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <form action="/facility?action=remove" method="post">
                    <input type="hidden" hidden name="id" id="idInput">
                    <button class="btn btn-success">DELETE</button>
                </form>
            </div>
        </div>
    </div>
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
<script>
    function idRemove(id, name) {
        document.getElementById("idInput").value = id;
        document.getElementById("deleteModal").innerText = name;
    }
</script>
<script src="/jquery/jquery-3.5.1.min.js"></script>
<script src="/datatables/js/jquery.dataTables.min.js"></script>
<script src="/datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function () {
        debugger
        $('#tableFacility').dataTable({

            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        })
    })
</script>

</html>