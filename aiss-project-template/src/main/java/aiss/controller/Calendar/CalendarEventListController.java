package aiss.controller.Calendar;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.calendar.ListOfEvents;
import aiss.model.resource.CalendarResource;

public class CalendarEventListController extends HttpServlet{

    private static final Logger log = Logger.getLogger(CalendarEventListController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	String id = "primary";
        String accessToken = (String) req.getSession().getAttribute("GoogleCalendar-token");

        if (accessToken != null && !"".equals(accessToken)) {
            CalendarResource spResource = new CalendarResource(accessToken);
            ListOfEvents events = spResource.listEvent(id);
            req.setAttribute("events", events);
            req.getRequestDispatcher("/CalendarOwnerCalendar.jsp").forward(req, resp);
        } else {
            log.info("Trying to access Google Calendar without an access token, redirecting to OAuth servlet");
            req.getRequestDispatcher("/AuthController/GoogleCalendar").forward(req, resp);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
