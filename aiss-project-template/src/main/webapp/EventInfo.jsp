<%@include file="includes/header.jsp"%>
<header>
	<script src="js/skycons.js"></script> 
</header>

<h1>Events</h1>

	<table>
		<tr>
            <th>City</th>
            <td><c:out value="${venue.address.city}"/></td>
        </tr>
        <tr>
            <th>Latitude</th>
            <td><c:out value="${venue.latitude}"/></td>
        </tr>
        <tr>
            <th>Longitude</th>
            <td><c:out value="${venue.longitude}"/></td>
        </tr>
    </table>
    <img class="map" alt="Map from location" src="${map}">
    <table>
        <tr>
            <th>Forecast for the event's starting day</th>
            <td><c:out value="${forecast}"/></td>
        </tr>
	</table>


                <div class="icon" id="icono" atri="${icon}">
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

        <button class="buttonBack" type="button" onclick="goBack()" class="button">Back</button> 
        
		<script>
		function goBack() {
 			window.history.back();
		}
		</script>
		
<div class="links">
	<a class="link" href="https://darksky.net/poweredby/">Powered by Dark Sky</a>
</div>
<%@include file="includes/footer.jsp"%>
