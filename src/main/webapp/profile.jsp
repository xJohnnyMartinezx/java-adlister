<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>

<div class="container">
    <h1>Viewing your profile.</h1>
</div>


<c:forEach var="parks" items="${park}">
<div class="item">
    <h3>${parks.getName()}</h3>
    <p>${parks.getLocation()}</p>
    <p>${parks.getDescription()}</p>
        </c:forEach>

</body>
</html>
