<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>

<div>
    <form action="/ads" method="get">

    <button type="submit" name="adsButton" id="adsButton">View Ads</button>
    </form>

</div>

</body>
</html>
