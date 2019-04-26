<%@include file="includes/header.jsp"%>
<%@include file="includes/footer.jsp"%>

<h1>Events</h1>

<div class="container">

    <p class="message">${message}</p>

    <table id="event">
        <tr>
            <th>Start date</th>
            <th>End date</th>
            <th>Name</th>
            <th>Description</th>
            <th>Location</th>
        </tr> 
        <c:forEach items="${events.events}" var="event">  
            <tr>
                <td><c:out value="${event.start.dateTime}"/></td>
                <td><c:out value="${event.end.dateTime}"/></td>
                <td><c:out value="${event.summary}"/></td>
                <td><c:out value="${event.description}"/></td>
                <td><c:out value="${event.location}"/></td>
            </tr>
       </c:forEach> 
    </table>
    <p>
        <button type="button" onClick="javascript:window.location.href = '/'" class="button">Back</button>
</div>