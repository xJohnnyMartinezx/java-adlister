<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

    <form action="/logout" method="get">
        <button type="submit">Logout</button>

    </form>

    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>

    <div class="container">
        <h1>Viewing ${sessionScope.username}'s Profile.</h1>
    </div>

</body>
</html>
