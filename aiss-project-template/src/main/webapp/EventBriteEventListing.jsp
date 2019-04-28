<%@include file="includes/header.jsp"%>

<h1>Events</h1>

<div class="container">

    <p class="message">${message}</p>

    <table id="events">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Date</th>
            <th>More info</th>
        </tr>
        <c:forEach items="${events.events}" var="event">
         
            <tr>
                <td><c:out value="${event.id}"/></td>
                <td><c:out value="${event.name.text}"/></td>
                <td><c:out value="${event.start.local}"/></td>
                <td><div id="searchDiv">
		<form id="searchForm" action="eventBriteEventInfo" method="post">
			<input type="submit" name="searchBtn" title="info" value="info">
		</form>
		</div>
		</td>
            </tr>
       </c:forEach> 
    </table>
    <p>
        <button type="button" onClick="javascript:window.location.href = '/'" class="button">Back</button>
</div>

<%@include file="includes/footer.jsp"%>
