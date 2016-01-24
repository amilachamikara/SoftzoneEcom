<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Amila
  Date: 1/13/16
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<%--<c:set var="viewName" value="/products/create" scope="session" />--%>


<div class="col-md-8">
    <div class="panel panel-default">
        <div class="panel-heading">
            <strong>Insert Product Details</strong>
        </div>

        <div class="panel-body">
            <div class="col-md-8">
                <form:form cssClass="form form-horizontal" action="/products/create" commandName="product">
                    <div class="form-group">
                        <label>Name</label>
                        <form:input cssClass="form-control" path="name" />
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <form:input cssClass="form-control" path="description" />
                    </div>
                    <div class="form-group">
                        <label>Category</label>
                        <form:select cssClass="form-control" path="category">
                            <form:option value="Research Paper"/>
                            <form:option value="Thesis"/>
                            <form:option value="Research Proposal"/>
                            <form:option value="Project Report"/>
                            <form:option value="Presentation"/>
                            <form:option value="Other"/>
                        </form:select>

                    </div>
                    <div class="form-group">
                        <label>Author</label>
                        <form:input cssClass="form-control" path="author" />
                    </div>
                    <div class="form-group">
                        <label>Year</label>
                        <form:input cssClass="form-control" path="year" />
                    </div>
                    <div class="form-group">
                        <label>Uint Price</label>
                        <form:input cssClass="form-control" path="unitPrice"/>
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary" type="submit">Create</button>
                        <button class="btn btn-default" type="reset">Reset</button>
                        <a class="btn btn-default" href="/products/index">Back to index</a>
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
