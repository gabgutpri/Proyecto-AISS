package aiss.controller.Calendar;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.CalendarResource;

public class CalendarDeleteEventController extends HttpServlet{

    private static final Logger log = Logger.getLogger(CalendarDeleteEventController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	String idCalendar = "primary";
    	String idEvent = req.getParameter("id");
        String accessToken = (String) req.getSession().getAttribute("GoogleCalendar-token");

        if (accessToken != null && !"".equals(accessToken)) {
            CalendarResource spResource = new CalendarResource(accessToken);
            spResource.deleteEvent(idCalendar, idEvent);
            req.setAttribute("message", "Event with id "+idEvent+" was deleted correctly");
            req.getRequestDispatcher("/deletingEvent.jsp").forward(req, resp);
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
