<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Proyecto AISS</title>
    </head>

    <body>
        <h1>Proyecto AISS</h1>

        <h2>Servlets disponibles:</h2>
        <ul>
            <li><a href="/eventBriteEventList">Listado de eventos de EventBrite</a></li>
        </ul>

        <h2> Tokens de OAuth </h2>
        <ul>
            <li><strong>EventBrite:</strong>
                <ul>
                    <li><c:out value='${sessionScope["EventBrite-token"]}' /> </li>
                </ul>
            </li>
        </ul>
    </body>
</html>
