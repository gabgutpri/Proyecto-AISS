<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Planeando</title>
        <link rel="stylesheet" type="text/css" href="css/style.css"/>
    </head>

    <body>
        <img class="planeando_logo" alt="Planeando" src="images/Logo.png">

    <div id="searchDiv">
		<form id="searchForm" action="eventBriteEventList" method="post">
			<input type="text" name="searchQuery" placeholder="Search for events!" required/> 
			<input class="buttonIndex" type="submit" name="searchBtn" title="search" value="Search">
		</form>
	</div>
	<div class="links">
		<a class="link" href="/calendarOwnerCalendar">User's calendar</a>
    	<a class="link" href="docs/index.html">API documentation</a>
    </div>
    </body>
</html>