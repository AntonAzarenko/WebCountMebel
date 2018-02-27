<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <%--<style type="text/css">
        h1 {
            padding-left: 450px;
            color: #b80c01;
            font-size: 50px;
        }

        .header {
            padding-left: 550px;
            color: #414bb8;
        }

        .td {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
            padding-left: 150px;
        }

        .td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #414bb8;
            background-color: #fff;
        }

        .th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg tg-4eph {
            background-color: #f9f9f9
        }
    </style>--%>
</head>
<body>
<h1>My Libryary</h1>

<h2 class="header">BOOKS</h2>

<c:if test="${!empty dspMap}">
    <table class="table table-striped table-condensed">
        <tr >
            <th class="bg-info" width="120">Number</th>
            <th class="bg-info le" width="120">name</th>
            <th class="bg-info" width="120">X</th>
            <th class="bg-info" width="120">Y</th>
            <th class="bg-info text-center" width="60">Count</th>
            <th class="bg-info" width="80">EdgeX</th>
            <th class="bg-info" width="80">EdgeY</th>
            <th class="bg-info" width="80">CountEdge</th>
            <th class="bg-info" width="80">CountSM</th>
            <th class="bg-info" width="60">Edit</th>
            <th class="bg-info" width="60">Delete</th>
        </tr>
        <c:forEach items="${dspMap}" var="dsp">
            <tr>
                <td>${dsp.numder}</td>
                <td class="size" max>${dsp.name}</td>
                <td>${dsp.x}</td>
                <td>${dsp.y}</td>
                <td>${dsp.count}</td>
                <td>${dsp.edgeX}</td>
                <td>${dsp.edgeY}</td>
                <td>${dsp.countEdge}</td>
                <td>${dsp.countSM}</td>
                <td><a href="<c:url value='/edit/${dsp.numder}'/>">Edit

                </a></td>
                <td><a href="<c:url value='/remove/${dsp.numder}'/>">Remove

                </a></td>

                </a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br/>



</body>
</html>
