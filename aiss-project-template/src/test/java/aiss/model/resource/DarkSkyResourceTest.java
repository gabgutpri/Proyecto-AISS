package aiss.model.resource;

import static org.junit.Assert.*;

import org.junit.Test;


public class DarkSkyResourceTest {

	@Test
	public void testGetLatAltDayForecast() {
		DarkSkyResource forecast = new DarkSkyResource();
		assertTrue("Incorrect result", forecast.getLatAltDayForecast("42.3601,-71.0589,", "2019-04-25").getSummary().equals("Partly cloudy overnight.")
				&& forecast.getLatAltDayForecast("42.3601,-71.0589", "2019-04-25").getIcon().equals("partly-cloudy-night"));	// Coordenadas de Congress Street, Boston, MA para un día ya pasado.
		// Solución esperada: Summary= Partly cloudy overnight. Icon= partly-cloudy-night
		
		// Prueba para coodenadas en formato incorrecto:
		
		// Prueba para fecha en formato incorrecto:
		
		
	}

}
