package aiss.controller.EventBrite;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.eventBrite.Event;
import aiss.model.eventBrite.ListEvent;
import aiss.model.eventBrite.Venue;
import aiss.model.resource.EventBriteResource;

public class EventBriteInfoController extends HttpServlet {
	private static final Logger log = Logger.getLogger(EventBriteInfoController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	log.info("entra.");
    	String queryVenue = req.getParameter("venueId");
    	String queryEvent = req.getParameter("eventId");
        String accessToken = (String) req.getSession().getAttribute("EventBrite-token");
        //String accessTokenAppEngine = (String) req.getSession().getAttribute("EventBriteAppEngine-token");
        //El segundo es para cuando se utilice en AppEngine
        if (accessToken != null && !"".equals(accessToken)) {

           //EventBriteResource ebResource = new EventBriteResource(accessToken);
            //Event event = null;
            //event=ebResource.getEvent(queryEvent);
            EventBriteResource ebResource2 = new EventBriteResource(accessToken);
            Venue venue=null;
            venue=ebResource2.getDireccion(queryVenue);
            
            /*if (event != null) {
            	log.info("Hola.");
                req.setAttribute("event", event);
                req.getRequestDispatcher("/EventInfo.jsp").forward(req, resp);//Cambiar
            } else {
                log.info("The files returned are null... probably your token has experied. Redirecting to OAuth servlet.");
                req.getRequestDispatcher("/AuthController/EventBrite").forward(req, resp);//Cambiar
            }*/
            if (venue != null) {
            	log.info("Adios.");
                req.setAttribute("venue", venue);
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
