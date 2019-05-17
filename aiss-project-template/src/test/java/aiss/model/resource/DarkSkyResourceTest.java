package aiss.model.resource;

import static org.junit.Assert.*;

import org.junit.Test;


public class DarkSkyResourceTest {

	@Test
	public void testGetLatAltDayForecast() {
		DarkSkyResource forecast = new DarkSkyResource();
		assertTrue("Incorrect result", forecast.getLatAltDayForecast("42.3601,-71.0589", "2019-04-25T12:00:00").getSummary().equals("Partly cloudy overnight.")
				&& forecast.getLatAltDayForecast("42.3601,-71.0589", "2019-04-25T12:00:00").getIcon().equals("partly-cloudy-night"));	// Coordenadas de Congress Street, Boston, MA para un día ya pasado.
		// Solución esperada: Summary= Partly cloudy overnight. Icon= partly-cloudy-night
		
		// Prueba para coodenadas en formato incorrecto:
		assertTrue("Incorrect result", forecast.getLatAltDayForecast("42.3601 -71.0589", "2019-04-25T12:00:00")==null);
		// Solución esperada: Error 400 mala sintasis.
		
		// Prueba para fecha en formato incorrecto:
		assertTrue("Incorrect result", forecast.getLatAltDayForecast("42.3601,-71.0589", "2019-04-25T12:00")==null);
		// Solución esperada: Error 400 mala sintasis.
		
		// Prueba para fecha muy distante: (con que devuleva respuesta se considera correcto)
		assertTrue("Incorrect result", forecast.getLatAltDayForecast("42.3601,-71.0589", "2020-04-25T12:00:00")!=null);
		// Solución esperada: Objeto not null. 
	}

}
