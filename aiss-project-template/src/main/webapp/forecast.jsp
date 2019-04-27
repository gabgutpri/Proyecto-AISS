<%@include file="includes/header.jsp"%>
<%@include file="includes/footer.jsp"%>

<h1>Forecast</h1>

<div class="container">

    <p class="message">${message}</p>

	<table id="weather">
        <tr>
            <th>Summary</th>
            <th>Icon</th>
        </tr>   
            <tr>
                <td><c:out value="${forecast}"/></td>
                <td><c:out value="${icon}"/></td>
            </tr>
    </table>
    <p>
        <button type="button" onClick="javascript:window.location.href = '/'" class="button">Back</button>
</div>