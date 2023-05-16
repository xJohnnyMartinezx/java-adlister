<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<nav>
    <%@include file="/partials/navbar.jsp"%>

</nav>
<body>
<%--    <c:if test="true">--%>
<%--        <h1>Variable names should be very descriptive</h1>--%>
<%--    </c:if>--%>
<%--    <c:if test="false">--%>
<%--        <h1>single letter variable names are good</h1>--%>
<%--    </c:if>--%>

<%! String name = "johnny"; %>
<h1><%= name %></h1>

<%! String[] namesList = {"johnny", "jay", "far", "nikki"};%>

<h1><%= Arrays.toString(namesList)%></h1>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
