<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Planeando</title>
    </head>

    <body>
        <h1>Planeando</h1>

    <div id="searchDiv">
		<form id="searchForm" action="eventBriteEventList" method="post">
			<input type="text" name="searchQuery" required/> 
			<input type="submit" name="searchBtn" title="search" value="search">
		</form>
	</div>
	<a href="/calendarOwnerCalendar">User's calendar</a>
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
        <a href="documentationAPI.html">Documentación de nuestra API</a>
    </body>
</html>