<%--
  Created by IntelliJ IDEA.
  User: johnnymartinez
  Date: 5/17/23
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <h1>Please Log In</h1>
    <form action="/pizza-order" method="POST">
        <div class="form-group">
          <label for="crust-type">Choose a Crust:</label>

          <select name="crust-type" id="crust-type">
            <option value="regular">Regular</option>
            <option value="thin">Thin</option>
            <option value="deep-dish">Deep Dish</option>
          </select>

          <label for="sauce-type">Choose a Sauce:</label>

          <select name="sauce-type" id="sauce-type">
            <option value="regular">Regular</option>
            <option value="bbq">BBQ</option>
            <option value="special">Special</option>
          </select>

          <label for="size">Choose a Size:</label>

          <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="Large">large</option>
          </select>

        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Place Order!">

<%-------------------  TOPPINGS CHECKBOXES   --------------------------%>
        <input type="checkbox" id="peperoni" name="peperoni" value="Peperoni">
        <label for="peperoni"> Peperoni</label><br>
        <input type="checkbox" id="sausage" name="sausage" value="Sausage">
        <label for="sausage"> Sausage</label><br>
        <input type="checkbox" id="pineapple" name="pineapple" value="Pineapple">
        <label for="pineapple"> Pineapple</label><br>

    </form>
</div>

</body>
</html>
