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
    	String query = req.getParameter("searchQuery");
        String accessToken = (String) req.getSession().getAttribute("EventBrite-token");
        String accessTokenAppEngine = (String) req.getSession().getAttribute("EventBriteAppEngine-token");
        //El segundo es para cuando se utilice en AppEngine
        if (accessToken != null && !"".equals(accessToken)) {

            EventBriteResource ebResource = new EventBriteResource(accessToken);
            Event event = ebResource.getEvent(query);
            Venue direccion=null;
            
            	direccion=ebResource.getDireccion(event);
            
            if (event != null) {
                req.setAttribute("event", event);
                req.getRequestDispatcher("/EventInfo.jsp").forward(req, resp);//Cambiar
            } else {
                log.info("The files returned are null... probably your token has experied. Redirecting to OAuth servlet.");
                req.getRequestDispatcher("/AuthController/EventBrite").forward(req, resp);//Cambiar
            }
            if (direccion != null) {
                req.setAttribute("direccion", direccion);
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
