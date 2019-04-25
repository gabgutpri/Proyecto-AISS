<%@include file="includes/header.jsp"%>

<h1>Events</h1>

<div class="container">

    <p class="message">${message}</p>

    <table id="events">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Date</th>
        </tr>
        <c:forEach items="${events.events}" var="event">  
            <tr>
                <td><c:out value="${event.id}"/></td>
                <td><c:out value="${event.name.text}"/></td>
                <td><c:out value="${event.start.local}"/></td>
                
            </tr>
       </c:forEach> 
    </table>
    <p>
        <button type="button" onClick="javascript:window.location.href = '/'" class="button">Back</button>
</div>

<%@include file="includes/footer.jsp"%>
