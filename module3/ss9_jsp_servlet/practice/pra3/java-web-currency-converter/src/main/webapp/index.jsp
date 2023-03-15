<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2022
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  </head>
  <body>
    <h2>Currency Converter</h2>
    <form action="/convert" method="get">
      <input type="text" name="rate" placeholder="RATE" value="22000"> <br>
      <label>USD: </label> <br>
      <input type="text" name="usd" placeholder="USD" value="0"> <br>
      <input type="submit" id="sumit" value="Converter">
    </form>

  </body>
</html>
