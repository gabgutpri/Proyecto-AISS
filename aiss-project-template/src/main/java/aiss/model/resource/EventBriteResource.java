package aiss.model.resource;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.MediaType;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.eventBrite.*;

public class EventBriteResource {

    private static final Logger log = Logger.getLogger(EventBriteResource.class.getName());

    private final String access_token;
    private final String uri = "https://www.eventbriteapi.com/v3/";

    public EventBriteResource(String access_token) {
        this.access_token = access_token;
    }

    /**
     *
     * @return Files
     */
    public ListEvent getEvents(String word) {
        ClientResource cr = null;
        cr = new ClientResource(uri + "events/search?q=" + word);
        ListEvent events = null;
        ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
        chr.setRawValue(access_token);
        cr.setChallengeResponse(chr);
        try {
           
            String result = cr.get(String.class);
            events = cr.get(ListEvent.class);
            if(events==null) {
            	log.warning("No events: " + cr.getResponse().getStatus());
            }
        } catch (ResourceException re) {
            log.warning("Error when retrieving all files: " + cr.getResponse().getStatus());
        }

        return events;

    }
    
    public Venue getDireccion(String venueId) {
        ClientResource cr = null;
        //Event event=getEvent(id);
       // String venueId=event.getVenueId();
        cr = new ClientResource(uri + "venues/" + venueId+"/");
        Venue direcciones = null;
        ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
        chr.setRawValue(access_token);
        cr.setChallengeResponse(chr);
        try {
           
            String result = cr.get(String.class);
            direcciones = cr.get(Venue.class);
            if(direcciones==null) {
            	log.warning("Sin direcciones: " + cr.getResponse().getStatus());
            }
        } catch (ResourceException re) {
            log.warning("Error when retrieving  address: " + cr.getResponse().getStatus());
        }

        return direcciones;

    }

    public Event getEvent(String id) {

        ClientResource cr = null;
        Event event = null;
        try {
            cr = new ClientResource(uri + "events/" + id +"/");
            event = cr.get(Event.class);

        } catch (ResourceException re) {
            log.warning("Error when retrieving file: " + cr.getResponse().getStatus());
        }

        return event;

    }

   
}
