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


<c:forEach var="park" items="${parks}">
<div class="item">
    <h3>${park.getName()}</h3>
    <p>${park.getLocation}</p>
    <p>${park.getGescription}</p>
        </c:forEach>

</body>
</html>
