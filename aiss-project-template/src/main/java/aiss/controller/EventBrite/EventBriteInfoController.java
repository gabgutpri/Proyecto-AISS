package aiss.controller.EventBrite;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.darkSky.Datum;
import aiss.model.eventBrite.Event;
import aiss.model.eventBrite.ListEvent;
import aiss.model.eventBrite.Venue;
import aiss.model.resource.DarkSkyResource;
import aiss.model.resource.EventBriteResource;
import aiss.model.resource.HereMapsResource;

public class EventBriteInfoController extends HttpServlet {
	private static final Logger log = Logger.getLogger(EventBriteInfoController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	log.info("entra.");
    	String queryVenue = req.getParameter("venueId");
    	String date = req.getParameter("date");
        String accessToken = (String) req.getSession().getAttribute("EventBrite-token");
        if (accessToken != null && !"".equals(accessToken)) {
            
        	EventBriteResource ebResource2 = new EventBriteResource(accessToken);
            Venue venue=null;
            venue=ebResource2.getDireccion(queryVenue);

            if (venue != null) {
            	log.info("Adios.");
                req.setAttribute("venue", venue);
                
                String coordenates = venue.getLatitude()+","+venue.getLongitude();
		
		log.log(Level.FINE, "Image from "+coordenates);
                HereMapsResource mp = new HereMapsResource();
                String map = mp.getStaticMap(coordenates);
                req.setAttribute("map", map);
		    
                log.log(Level.FINE, "Searching for forecast in "+coordenates+" in date "+date);
        		DarkSkyResource dK = new DarkSkyResource();
        		Datum dKResult = dK.getLatAltDayForecast(coordenates, date);

        		if (dKResult!=null){
        			req.setAttribute("forecast", dKResult.getSummary());
        			req.setAttribute("icon", dKResult.getIcon());
        		} else {
        			log.log(Level.SEVERE, "Datum object: " + dKResult);
        		}
        		
                req.getRequestDispatcher("/EventInfo.jsp").forward(req, resp);//Cambiar
            } else {
                log.info("The addresses returned are null... probably your token has experied. Redirecting to OAuth servlet.");
                req.getRequestDispatcher("/AuthController/EventBrite").forward(req, resp);//Cambiar
            }
        } else {
            log.info("Trying to access EventBrite without an access token, redirecting to OAuth servlet");
            req.getRequestDispatcher("/AuthController/EventBrite").forward(req, resp);//Cambiar
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
