<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nam
  Date: 14/12/2024
  Time: 3:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>No</th>
        <th>Catalog ID</th>
        <th>Catalog Name</th>
        <th>Description</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${listCategories}" var="catalog" varStatus="loop">
            <tr>
                <td>${loop.index+1}</td>
                <td>${catalog.catalog_id}</td>
                <td>${catalog.catalog_name}</td>
                <td>${catalog.catalog_description}</td>
                <td>${catelog.catelog_status?"Active":"Inactive"}</td>
                <td></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
