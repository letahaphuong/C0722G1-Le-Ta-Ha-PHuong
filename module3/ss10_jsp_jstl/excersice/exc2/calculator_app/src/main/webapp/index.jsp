<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2022
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/caculate" method="get">
  <fieldset style="border-radius: 40px;height: 130px;width: 300px">
    <legend>Calculator</legend>
    <table>
      <tr>
        <td style="">First operand</td>
        <td>
          <div class="input-group flex-nowrap">
            <input type="text" name="first" class="form-control" placeholder="First operand" aria-label="Username"
                   aria-describedby="addon-wrapping" style="border: solid black 1px">
          </div>
        </td>
      </tr>
      <tr>
        <td>Operator</td>
        <td><select class="form-select" name="macth" aria-label="Default select example">
          <option value="Addition">Addition</option>
          <option value="Subtraction">Subtraction</option>
          <option value="Multiplication">Multiplication</option>
          <option value="Division">Division</option>
        </select></td>
      </tr>
      <tr>
        <td>Second operand</td>
        <td>
          <div class="input-group flex-nowrap">
            <input type="text" name="second" class="form-control" placeholder="Second operand" aria-label="Username"
                   aria-describedby="addon-wrapping" style="border: solid black 1px">
          </div>
        </td>
      </tr>
    </table>
    <button type="submit" value="sumit">Caculate</button>
  </fieldset>

</form>




</body>
</html>
