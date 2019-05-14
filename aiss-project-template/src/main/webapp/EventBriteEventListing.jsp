<%@include file="includes/header.jsp"%>

<h1>Events</h1>

<div class="container">

    <p class="message">${message}</p>

    <table id="events">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Date</th>
            <th>Venue id</th>
            <th>Info weather</th>
        </tr>
        <c:forEach items="${events.events}" var="event">
         
            <tr>
                <td><c:out value="${event.id}"/></td>
                <td><c:out value="${event.name.text}"/></td>
                <td><c:out value="${event.start.local}"/></td>
                <td><c:out value="${event.venueId}"/></td>
               <td><a href="eventBriteEventInfo?venueId=${event.venueId}"><img src="./images/lluvia.png" width="30px"></a> 
		</td>
            </tr>
       </c:forEach> 
    </table>
    <p>
        <button type="button" onClick="javascript:window.location.href = '/'" class="button">Back</button>
</div>

<%@include file="includes/footer.jsp"%>
