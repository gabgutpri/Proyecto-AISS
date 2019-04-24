package aiss.model.resource;

import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.calendar.CalendarList;
import aiss.model.calendar.Calendars;
import aiss.model.calendar.Events;
import aiss.model.calendar.ListOfCalendarList;
import aiss.model.calendar.ListOfEvents;

public class CalendarResource {
	
	private static final Logger log = Logger.getLogger(CalendarResource.class.getName());
	
	private final String access_token;
    private final String uri = "https://www.googleapis.com/calendar/v3";

    public CalendarResource(String access_token) {
        this.access_token = access_token;
    }
    
    // CalendarList
    
    public boolean deleteCalendarList(String id) {
        ClientResource cr = null;
        boolean result = true;
        try {
            cr = new ClientResource(uri + "/users/me/calendarList/" + id + "?access_token=" + access_token);
            cr.delete();
        } catch (ResourceException re) {
            log.warning("Error when deleting calendarList: " + cr.getResponse().getStatus());
            result = false;
        }
        return result;
    }
    
    public CalendarList getCalendarList(String id) {
        ClientResource cr = null;
        CalendarList calendarList = null;
        try {
            cr = new ClientResource(uri + "/users/me/calendarList/" + id + "?access_token=" + access_token);
            calendarList = cr.get(CalendarList.class);
        } catch (ResourceException re) {
            log.warning("Error when getting calendarList: " + cr.getResponse().getStatus());
        }
        return calendarList;
    }
    
    public boolean insertCalendarList(CalendarList calendarList) {
        ClientResource cr = null;
        boolean res = true;
        try {
            cr = new ClientResource(uri + "/users/me/calendarList?access_token=" + access_token);
            cr.post(calendarList);
        } catch (ResourceException re) {
            log.warning("Error when inserting calendarList: " + cr.getResponse().getStatus());
            res = false;
        }
        return res;
    }
    
    public ListOfCalendarList listCalendarList() {
        ClientResource cr = null;
        ListOfCalendarList list = null;
        try {
            cr = new ClientResource(uri + "/users/me/calendarList?access_token=" + access_token);
            list = cr.get(ListOfCalendarList.class);
        } catch (ResourceException re) {
            log.warning("Error when getting a list of calendarList: " + cr.getResponse().getStatus());
        }
        return list;
    } 
    
    public boolean updateCalendarList(String id, CalendarList calendarList) {
        ClientResource cr = null;
        boolean result = true;
        try {
            cr = new ClientResource(uri + "/users/me/calendarList/" + id + "?access_token=" + access_token);
            cr.put(calendarList);
        } catch (ResourceException re) {
            log.warning("Error when updating calendarList: " + cr.getResponse().getStatus());
            result = false;
        }
        return result;
    }
    
    // Calendar
    
    public boolean deleteCalendar(String id) {
        ClientResource cr = null;
        boolean result = true;
        try {
            cr = new ClientResource(uri + "/calendars/" + id + "?access_token=" + access_token);
            cr.delete();
        } catch (ResourceException re) {
            log.warning("Error when deleting calendar: " + cr.getResponse().getStatus());
            result = false;
        }
        return result;
    }

    public Calendars getCalendar(String id) {
        ClientResource cr = null;
        Calendars calendar = null;
        try {
            cr = new ClientResource(uri + "/calendars/" + id + "?access_token=" + access_token);
            calendar = cr.get(Calendars.class);
        } catch (ResourceException re) {
            log.warning("Error when getting calendar: " + cr.getResponse().getStatus());
        }
        return calendar;
    }
    
    public boolean insertCalendar(Calendars calendar) {
        ClientResource cr = null;
        boolean res = true;
        try {
            cr = new ClientResource(uri + "/calendars?access_token=" + access_token);
            cr.post(calendar);
        } catch (ResourceException re) {
            log.warning("Error when inserting calendar: " + cr.getResponse().getStatus());
            res = false;
        }
        return res;
    }
    
    public boolean updateCalendar(Calendars calendar) {
        ClientResource cr = null;
        boolean result = true;
        try {
            cr = new ClientResource(uri + "/calendars/" + calendar.getId() + "?access_token=" + access_token);
            cr.put(calendar);
        } catch (ResourceException re) {
            log.warning("Error when updating calendar: " + cr.getResponse().getStatus());
            result = false;
        }
        return result;
    }
    
    // Events
    
    public boolean deleteEvent(String cId, String eId) {
        ClientResource cr = null;
        boolean result = true;
        try {
            cr = new ClientResource(uri + "/calendars/" + cId + "/events/" + eId + "?access_token=" + access_token);
            cr.delete();
        } catch (ResourceException re) {
            log.warning("Error when deleting event: " + cr.getResponse().getStatus());
            result = false;
        }
        return result;
    }
    
    public Events getEvent(String cId, String eId) {
        ClientResource cr = null;
        Events event = null;
        try {
            cr = new ClientResource(uri + "/calendars/" + cId + "/events/" + eId + "?access_token=" + access_token);
            event = cr.get(Events.class);
        } catch (ResourceException re) {
            log.warning("Error when getting event: " + cr.getResponse().getStatus());
        }
        return event;
    }
    
    public boolean insertEvent(String id, Events event) {
        ClientResource cr = null;
        boolean res = true;
        try {
            cr = new ClientResource(uri + "/calendars/" + id + "/events?access_token=" + access_token);
            cr.post(event);
        } catch (ResourceException re) {
            log.warning("Error when inserting event: " + cr.getResponse().getStatus());
            res = false;
        }
        return res;
    } 
    
    public ListOfEvents listEvent(String id) {
        ClientResource cr = null;
        ListOfEvents list = null;
        try {
            cr = new ClientResource(uri + "/calendars/" + id + "/events?access_token=" + access_token);
            list = cr.get(ListOfEvents.class);
        } catch (ResourceException re) {
            log.warning("Error when getting a list of events: " + cr.getResponse().getStatus());
        }
        return list;
    }
    
    public boolean updateEvent(String cId, String eId, Events event) {
        ClientResource cr = null;
        boolean result = true;
        try {
            cr = new ClientResource(uri + "/calendars/" + cId + "/events/" + eId + "?access_token=" + access_token);
            cr.put(event);
        } catch (ResourceException re) {
            log.warning("Error when updating event: " + cr.getResponse().getStatus());
            result = false;
        }
        return result;
    }
}
