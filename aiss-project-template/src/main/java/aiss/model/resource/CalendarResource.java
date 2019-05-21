package aiss.model.resource;

import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.calendar.Events;
import aiss.model.calendar.ListOfEvents;

public class CalendarResource {
	
	private static final Logger log = Logger.getLogger(CalendarResource.class.getName());
	
	private final String access_token;
    private final String uri = "https://www.googleapis.com/calendar/v3";

    public CalendarResource(String access_token) {
        this.access_token = access_token;
    }
    
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
}
