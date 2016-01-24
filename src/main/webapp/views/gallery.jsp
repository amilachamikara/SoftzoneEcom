<%--
  Created by IntelliJ IDEA.
  User: Amila
  Date: 1/21/16
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product Gallery</title>
</head>
<body>
<c:set var="viewName" value="/gallery" scope="session"/>
<div class="panel panel-default">
    <div class="panel-heading">
        <div class="col-md-9">
        <strong>All Publications</strong>
        </div>
        <div class="col-md-3">
        <select class="form-control">
            <option>Free</option>
            <option>Paid</option>
            <option>All</option>
        </select>
        </div>
    </div>
    <div class="panel-body">
        <div class="icon-grid">
            <c:forEach var="item" items="${productList}">
            <div class="col-lg-3 col-md-4 col-sm-6">
                <svg class="glyph stroked blank document"><use xlink:href="#stroked-blank-document"/></svg>
                <strong>${item.name}</strong>
                <p>${item.category}</p>
                <p>Rs. ${item.unitPrice}</p>
                <a class="btn btn-primary btn-sm" href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Add to cart</a>
                <a class="btn btn-success btn-sm" href="#"><span class="glyphicon glyphicon-download-alt"></span> Download</a>
            </div>
            </c:forEach>
        </div>
    </div>
</div>



</body>
</html>
