<%--
  Created by IntelliJ IDEA.
  User: Amila
  Date: 1/13/16
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>

<div class="col-md-8">
    <div class="panel panel-default">
        <div class="panel-heading">
            <strong>Deleting item details...</strong>
        </div>

        <div class="panel-body">
            <div class="col-md-8">
                <form:form cssClass="form form-horizontal" action="/products/delete/${product.id}" commandName="product">
                    <div class="form-group">
                        <label>Name</label>
                        <form:input cssClass="form-control" path="name" value="${product.name}"/>
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <form:input cssClass="form-control" path="description" value="${product.description}" />
                    </div>
                    <div class="form-group">
                        <label>Uint Price</label>
                        <form:input cssClass="form-control" path="unitPrice" value="${product.unitPrice}" />
                    </div>
                    <div class="form-group">
                        <label>Are your sure want to delete this item?</label><br/>
                        <button class="btn btn-danger" type="submit">Yes I'm sure</button>
                        <a class="btn btn-default" href="/products/index">No. Back to index</a>
                    </div>
                </form:form>
            </div>
            <div class="col-md-4" style="text-align: center; vertical-align:middle">
                <svg class="glyph stroked blank document"><use xlink:href="#stroked-blank-document"/></svg>
            </div>
        </div>
    </div>
</div>
</body>
</html>
