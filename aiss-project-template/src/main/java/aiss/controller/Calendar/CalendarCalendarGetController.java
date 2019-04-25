package aiss.controller.Calendar;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.calendar.CalendarList;
import aiss.model.calendar.Calendars;
import aiss.model.resource.CalendarResource;

public class CalendarCalendarGetController extends HttpServlet{

    private static final Logger log = Logger.getLogger(CalendarCalendarGetController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	String id = req.getParameter("id");
        String accessToken = (String) req.getSession().getAttribute("GoogleCalendar-token");

        if (accessToken != null && !"".equals(accessToken)) {

            CalendarResource spResource = new CalendarResource(accessToken);
            Calendars calendar = spResource.getCalendar(id);
            CalendarList calendarList = spResource.getCalendarList(id);
            String accessRole = calendarList.getAccessRole();

            if (accessRole == "reader" || accessRole == "owner") {
                req.setAttribute("calendar", calendar);
                req.getRequestDispatcher("/CalendarOwnerCalendar.jsp").forward(req, resp);
            } else {
                log.warning("This user don't have the role necessary to read this calendar");
                req.getRequestDispatcher("/AuthController/GoogleCalendar").forward(req, resp);
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
