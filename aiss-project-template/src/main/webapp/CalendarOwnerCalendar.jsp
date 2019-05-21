<%@include file="includes/header.jsp"%>
<%@include file="includes/footer.jsp"%>

<h1>Calendar's Events</h1>

<div class="container">

    <p class="message">${message}</p>

    <table id="event">
        <tr>
        	<th>Id</th>
        	<th>Name</th>
            <th>Start date</th>
            <th>End date</th>
            <th>Venue Id</th>
            <th>More info</th>
            <th>Delete event</th>
            
        </tr> 
        <c:forEach items="${events.items}" var="event">  
            <tr>
            	<td><c:out value="${event.id}"/></td>
            	<td><c:out value="${event.summary}"/></td>
                <td><c:out value="${event.start.dateTime}"/></td>
                <td><c:out value="${event.end.dateTime}"/></td>
                <td><c:out value="${event.description}"/></td>
                <td><a href="eventBriteEventInfo?venueId=${event.description}&eventId=${event.id}&date=${event.start.dateTime}"><img src="./images/info.jpg" width="30px"></a></td>
                <td><a href="deletingEvent?id=${event.id}"><img src="./images/GoogleCalendarLogo.png" width="30px"></a></td>
            </tr>
       </c:forEach> 
    </table>
    <p>
        <button type="button" onClick="javascript:window.location.href = '/'" class="button">Back</button>
</div>