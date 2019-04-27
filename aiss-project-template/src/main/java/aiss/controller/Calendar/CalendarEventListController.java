package aiss.controller.Calendar;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.calendar.CalendarList;
import aiss.model.calendar.Calendars;
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
            CalendarList calendarList = spResource.getCalendarList(id);
            String accessRole = calendarList.getAccessRole();
            ListOfEvents events = spResource.listEvent(id);

            if (accessRole == "reader" || "owner".equals(accessRole)) {
                req.setAttribute("events", events);
                req.getRequestDispatcher("/CalendarOwnerCalendar.jsp").forward(req, resp);
            } else {
                log.warning("This user don't have the role necessary to read this calendar "+accessRole);
                req.getRequestDispatcher("/index.jsp").forward(req, resp);
            }
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
