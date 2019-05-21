package aiss.controller.EventBrite;

import aiss.model.eventBrite.ListEvent;
import aiss.model.eventBrite.Venue;
import aiss.model.resource.EventBriteResource;
import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventBriteEventListController extends HttpServlet {

    private static final Logger log = Logger.getLogger(EventBriteEventListController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	String query = req.getParameter("searchQuery");
		//RequestDispatcher rd = null;
		//log.log(Level.FINE, "Searching for OMDb movies that contain " + query);
		
        String accessToken = (String) req.getSession().getAttribute("EventBrite-token");
        //String accessTokenAppEngine = (String) req.getSession().getAttribute("EventBriteAppEngine-token");

        if (accessToken != null && !"".equals(accessToken)) {

            EventBriteResource ebResource = new EventBriteResource(accessToken);
            ListEvent events = ebResource.getEvents(query);
            if (events != null) {
                req.setAttribute("events", events);
                req.getRequestDispatcher("/EventBriteEventListing.jsp").forward(req, resp);//Cambiar
            } else {
                log.info("The files returned are null... probably your token has experied. Redirecting to OAuth servlet.");
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
