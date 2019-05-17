package aiss.model.resource;

public class HereMapsResource {
	
    private final String uri = "https://image.maps.api.here.com/mia/1.6/mapview";
    private final String API_ID = "&app_id=uKSP1vd0obUMYG7Fesvl";
	private final String API_Code = "&app_code=EJq2FWk5Vjwts8keGjp01g";
//	Ejemplo: https://image.maps.api.here.com/mia/1.6/mapview?c=52.5159%2C13.3777&z=14&app_id=uKSP1vd0obUMYG7Fesvl&app_code=EJq2FWk5Vjwts8keGjp01g

	    public String getStaticMap(String coordenates) {
		return uri+"?c="+coordenates+"&z=15"+API_ID+API_Code;
	    }
}
