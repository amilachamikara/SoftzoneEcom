<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Amila
  Date: 1/13/16
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>

<c:set var="viewName" value="/products/index" scope="session"/>

<div class="panel panel-default">
    <div class="panel-heading">
        <a class="btn btn-primary" href="/products/create">Create New</a>
    </div>
    <div class="panel-body">
<table class="table table-responsive">
    <thead>
    <tr >
        <th style="text-align: center">Id</th>
        <th style="text-align: center">Name</th>
        <th style="text-align: center">Category</th>
        <th style="text-align: center">Price</th>
        <th style="text-align: center">Action</th>
    </tr>
    </thead>
    <c:forEach var="item" items="${pList}">
        <tr >
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.category}</td>
            <td style="text-align: right">${item.unitPrice}</td>
            <td style="text-align: center">
                <a class="label label-info" href="/products/details/${item.id}"><span class="glyphicon glyphicon-eye-open"></span> Details</a>
                <a class="label label-warning" href="/products/update/${item.id}"><span class="glyphicon glyphicon-edit"></span> Update</a>
                <a class="label label-danger" href="/products/delete/${item.id}"><span class="glyphicon glyphicon-trash"></span> Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
    </div>
</div>
</body>
</html>
