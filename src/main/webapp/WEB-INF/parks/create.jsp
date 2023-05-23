<%--
  Created by IntelliJ IDEA.
  User: johnnymartinez
  Date: 5/22/23
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add a New Park!</title>
</head>
<body>
<div class="container">
  <h1>Create a new Ad</h1>
  <form action="/parks/create" method="post">
    <div class="form-group">
      <label for="title">Name</label>
      <input id="title" name="name" class="form-control" type="text">
    </div>
    <div class="form-group">
      <label for="description">Description</label>
      <textarea id="description" name="description" class="form-control"></textarea>
    </div>
    <label for="location">Location</label>
    <input type="text" name="location" id="location">
    <input type="submit" class="btn btn-block btn-primary">
  </form>
</div>
</body>
</html>