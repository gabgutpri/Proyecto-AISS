package aiss.model.resource;

import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.darkSky.DailyTimeMachine;
import aiss.model.darkSky.Datum;


public class DarkSkyResource {
	
	private static final String DARKSKY_API_KEY = "07f61ec3618a79d795e3b3d7657dd414";
	private static final String URI = "https://api.darksky.net/forecast/";
	private static final String QUERY = "?exclude=currently,hourly,flags&units=si";
	private static final Logger log = Logger.getLogger(DarkSkyResource.class.getName());
	// Llamada de ejemplo: https://api.darksky.net/forecast/07f61ec3618a79d795e3b3d7657dd414/42.3601,-71.0589,2019-04-25T12:00:00?exclude=currently,hourly,flags&lang=en&units=si
	
	public Datum getLatAltDayForecast (String coordenates, String date) {
		ClientResource cr = null;
		Datum result = null;
		try {
			cr = new ClientResource(URI+DARKSKY_API_KEY+"/"+coordenates+date+"T12:00:00"+QUERY);
			result = cr.get(DailyTimeMachine.class).getDaily().getData().get(0);
		}catch (ResourceException re){
			log.warning("Error when retrieving forecast: " + cr.getResponse().getStatus());
		}
		return result;
	}
}
