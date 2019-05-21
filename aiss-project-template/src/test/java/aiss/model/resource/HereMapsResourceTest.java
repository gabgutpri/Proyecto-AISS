package aiss.model.resource;

import static org.junit.Assert.*;

import org.junit.Test;

public class HereMapsResourceTest {

	@Test
	public void test() {
		HereMapsResource map = new HereMapsResource();
		assertTrue("Incorrect result", map.getStaticMap("52.5159,13.3777").equals("https://image.maps.api.here.com/mia/1.6/mapview?c=52.5159%2C13.3777&z=15&app_id=uKSP1vd0obUMYG7Fesvl&app_code=EJq2FWk5Vjwts8keGjp01g"));
		// Resultado esperado: String="https://image.maps.api.here.com/mia/1.6/mapview?c=52.5159%2C13.3777&z=15&app_id=uKSP1vd0obUMYG7Fesvl&app_code=EJq2FWk5Vjwts8keGjp01g"
		assertTrue("Incorrect result", map.getStaticMap("fightingGold")==null);
	}

}
