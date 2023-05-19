<%--
  Created by IntelliJ IDEA.
  User: johnnymartinez
  Date: 5/19/23
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Title</title>
</head>
  <body>

  <c:forEach var="album" items="${albums}">

    <h3>${album.getArtist()}</h3>
    <p>${album.getRecordName()}</p>
    <p>${album.getReleaseYear()}</p>

  </c:forEach>

</body>
</html>
