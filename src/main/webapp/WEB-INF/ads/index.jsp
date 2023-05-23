<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
    <hr>
    <h1>Here are all the parks!</h1>
    <c:forEach var="park" items="${parks}">
        <div class="col-md-6">
            <h2>${park.name}</h2>
            <p>${park.description}</p>
            <small>${park.location}</small>
        </div>
    </c:forEach>
</div>

</body>
</html>
