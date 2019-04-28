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

        <div id="searchDiv">
		<form id="searchForm" action="eventBriteEventList" method="post">
			<input type="text" name="searchQuery" required/> 
			<input type="submit" name="searchBtn" title="search" value="search">
		</form>
	</div>
	 <div id="pruebaDiv">
	 	<label>Forecast test:</label>
		<form id="pruebaForm" action="index" method="get">
			<label>Introduce coordenates (ex.:42.3601,-71.0589):</label>
			<input type="text" name="coordenates" required/>
			<label>Introduce date (ex.:2019-05-26):</label>
			<input type="text" name="date" required/> 
			<input type="submit" name="searchFore" title="searchForecast" value="searchForecast">
		</form>
	</div>
	<li><a href="/calendarOwnerCalendar">Calendario del usuario</a></li> <!-- Añadir "?id=primary" con un clemdarOwnerCalendar mas genérico -->
        <h2> Tokens de OAuth </h2>
        <ul>
            <li><strong>EventBrite:</strong>
                <ul>
                    <li><c:out value='${sessionScope["EventBrite-token"]}' /> </li>
                </ul>
            </li>
            <li><strong>GoogleCalendar:</strong>
                <ul>
                    <li><c:out value='${sessionScope["GoogleCalendar-token"]}' /> </li>
                </ul>
            </li>
        </ul>
        <li><a href="documentationAPI.html">Documentación de nuestra API</a></li>
    </body>
</html>
