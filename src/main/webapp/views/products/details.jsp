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
    <title>Details</title>
</head>
<body>
<div class="col-md-8">
    <div class="panel panel-default">
        <div class="panel-heading">
            Details of the product...
        </div>

        <div class="panel-body">
            <div class="col-md-8">
                    <div class="form-group">
                        <label>Name</label>
                        <p class="form-control-static">${product.name}</p>
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <p class="form-control-static">${product.description}</p>
                    </div>
                    <div class="form-group">
                        <label>Category</label>
                        <p class="form-control-static">${product.category}</p>
                    </div>
                    <div class="form-group">
                        <label>Author</label>
                        <p class="form-control-static">${product.author}</p>
                    </div>
                    <div class="form-group">
                        <label>Year</label>
                        <p class="form-control-static">${product.year}</p>
                    </div>
                    <div class="form-group">
                        <label>Uint Price</label>
                        <p class="form-control-static">${product.unitPrice}</p>
                    </div>
                    <div class="form-group">
                        <a class="btn btn-primary" href="/products/index">Back to index</a>
                    </div>
            </div>
            <div class="col-md-4" style="text-align: center; vertical-align:middle">
                <svg class="glyph stroked blank document"><use xlink:href="#stroked-blank-document"/></svg>
            </div>
        </div>
    </div>
</div>
</body>
</html>
