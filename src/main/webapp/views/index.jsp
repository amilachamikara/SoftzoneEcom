<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: Amila
  Date: 1/12/16
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<c:set var="viewName" value="/index" scope="session"/>

    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class=""></li>
            <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="2" class=""></li>
        </ol>
        <div class="carousel-inner" role="listbox">
            <div class="item">
                <img class="first-slide" src="/images/carouselbg.jpg" alt="First slide">
                <div class="container">
                    <div class="carousel-caption">
                        <svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></svg>
                        <h1>Example headline.</h1>
                        <p>Note: If you're viewing this page via a <code>file://</code> URL, the "next" and "previous" Glyphicon buttons on the left and right might not load/display properly due to web browser security rules.</p>
                        <p><a class="btn btn-lg btn-primary" href="/login" role="button">Sign up today</a></p>
                    </div>
                </div>
            </div>
            <div class="item active">
                <img class="second-slide" src="/images/carouselbg.jpg" alt="Second slide">
                <div class="container">

                    <div class="carousel-caption">
                        <svg class="glyph stroked camera "><use xlink:href="#stroked-camera"/></svg>
                        <h1>Another example headline.</h1>
                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img class="third-slide" src="/images/carouselbg.jpg" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption">
                        <svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></svg>
                        <h1>One more for good measure.</h1>
                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                        <p><a class="btn btn-lg btn-primary" href="/gallery" role="button">Browse gallery</a></p>
                    </div>
                </div>
            </div>
        </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>


</body>
</html>
