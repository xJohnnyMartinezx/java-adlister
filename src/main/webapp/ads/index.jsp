<%--
  Created by IntelliJ IDEA.
  User: johnnymartinez
  Date: 5/19/23
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Ads Page</title>
</head>
  <body>

  <section>

    <c:forEach items="${allAdsProp}" var="ad">

      <h1>Title ${ad.title}</h1>
      <p>Description ${ad.description}</p>

    </c:forEach>

  </section>

</body>
</html>
