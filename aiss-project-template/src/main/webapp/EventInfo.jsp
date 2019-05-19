<%@include file="includes/header.jsp"%>
<header>
	<script src="js/skycons.js"></script> 
</header>

<h1>Events</h1>

<div class="container">

    <p class="message">${message}</p>

    			<p>City: <c:out value="${venue.address.city}"/></p>
                <p>Latitude: <c:out value="${venue.latitude}"/></p>
                <p>Longitude: <c:out value="${venue.longitude}"/></p>
                <p>Forecast for the event's starting day: <c:out value="${forecast}"/></p>
                
                <div id="icono" atri="${icon}"/>
                <canvas id="icon" width="128" height="128"></canvas>
                </div>
                
                <script>
                var iconRequest = document.getElementById("icono").getAttribute("atri");
    			
    			var icons = new Skycons({'color' : 'blue'});
    			
    			var iconList = [
    				"clear-day",
    				"clear-night",
    				"partly-cloudy-day",
    				"partly-cloudy-night",
    				"cloudy",
    				"rain",
    				"sleet",
    				"snow",
    				"wind",
    				"fog"
    			];		
    			console.log(icons);
    			for (i = 0; i < iconList.length; i++) {
    				if (iconRequest == iconList[i]) {
    						icons.set('icon', iconList[i]);
    					
    				}
    			}
    			icons.play();
				</script>
				
                <img alt="Map from location" src="${map}">
    <p>
        <button type="button" onClick="javascript:window.location.href = '/'" class="button">Event browser</button>
</div>
<a href="https://darksky.net/poweredby/">Powered by Dark Sky</a>

<%@include file="includes/footer.jsp"%>
