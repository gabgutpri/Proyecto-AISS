package aiss.controller.Calendar;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.calendar.End;
import aiss.model.calendar.Events;
import aiss.model.calendar.Start;
import aiss.model.resource.CalendarResource;

public class CalendarInsertEventController extends HttpServlet{

    private static final Logger log = Logger.getLogger(CalendarInsertEventController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	String idCalendar = "primary";
    	String idEvent = req.getParameter("id");
    	String summary = req.getParameter("name");
    	String start = req.getParameter("start");
    	String end = req.getParameter("end");
    	String venueId = req.getParameter("venueId");
        String accessToken = (String) req.getSession().getAttribute("GoogleCalendar-token");

        if (accessToken != null && !"".equals(accessToken)) {
            CalendarResource spResource = new CalendarResource(accessToken);
            Events event = new Events(); Start s = new Start(); End e = new End();
            s.setDateTime(start); s.setTimeZone("Europe/Madrid"); e.setDateTime(end); e.setTimeZone("Europe/Madrid");
            event.setId(idEvent); event.setSummary(summary); event.setStart(s); event.setEnd(e); event.setDescription(venueId);
            spResource.insertEvent(idCalendar, event);
            req.setAttribute("message", "Event with id "+idEvent+" was added correctly");
            req.getRequestDispatcher("/AddingEvent.jsp").forward(req, resp);
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
