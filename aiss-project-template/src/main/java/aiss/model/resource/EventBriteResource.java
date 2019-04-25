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

    public Event getEvent(String id) {

        ClientResource cr = null;
        Event event = null;
        try {
            cr = new ClientResource(uri + "events/" + id + "/orders");
            event = cr.get(Event.class);

        } catch (ResourceException re) {
            log.warning("Error when retrieving file: " + cr.getResponse().getStatus());
        }

        return event;

    }

   /* public String insertFile(FileItem file, String content) {

        ClientResource cr = null;
        String newId = null;
        try {
            cr = new ClientResource(uri + "?access_token=" + access_token);
            FileItem newFile = cr.post(file, FileItem.class);
            newId = newFile.getId();
            cr = new ClientResource(uri_upload + "/" + newId + "?uploadType=media&access_token=" + access_token);
            Map<String, Object> headers = cr.getRequestAttributes();
            headers.put("Content-Type", "text/plain");
            cr.put(content);
        } catch (ResourceException re) {
            log.warning("Error when inserting file: " + cr.getResponse().getStatus());
        }
        return newId;
    }

    public boolean updateFile(FileItem file) {

        ClientResource cr = null;
        boolean result = true;
        try {
            cr = new ClientResource(uri + "/" + file.getId() + "?access_token=" + access_token);
            cr.put(file);
        } catch (ResourceException re) {
            log.warning("Error when updating file: " + cr.getResponse().getStatus());
            result = false;
        }
        return result;
    }

    public boolean deleteFile(String id) {

        ClientResource cr = null;
        boolean result = true;
        try {
            cr = new ClientResource(uri + "/" + id + "?access_token=" + access_token);
            cr.delete();
        } catch (ResourceException re) {
            log.warning("Error when deleting file: " + cr.getResponse().getStatus());
            result = false;
        }
        return result;

    }

    public String getFileContent(FileItem item) {
        String result = null;
        String contentURL = item.getDownloadUrl();
        try {
            ClientResource cr = new ClientResource(contentURL);
            /*Map<String, Object> reqAttribs = cr.getRequestAttributes(); 
	        Series<Header> headers = (Series<Header>)reqAttribs.get("org.restlet.http.headers"); 
	        if (headers == null) { 
	            headers = new Series<Header>(Header.class); 
	            reqAttribs.put("org.restlet.http.headers", headers); 
	        } 
	        headers.add(new Header("Authorization:", "Bearer "+access_token));
            ChallengeResponse chr = new ChallengeResponse(
                    ChallengeScheme.HTTP_OAUTH_BEARER);
            chr.setRawValue(access_token);
            cr.setChallengeResponse(chr);

            result = cr.get(String.class);
        } catch (ResourceException re) {
            log.warning("Error when obtaining the content of file: " + item.getId());
        }
        return result;
    }

    public boolean updateFileContent(String id, String content) {
        ClientResource cr = new ClientResource(uri_upload + "/" + id + "?uploadType=media");
        try {
            ChallengeResponse chr = new ChallengeResponse(
                    ChallengeScheme.HTTP_OAUTH_BEARER);
            chr.setRawValue(access_token);
            cr.setChallengeResponse(chr);
            StringRepresentation rep = new StringRepresentation(content, MediaType.TEXT_PLAIN);
            cr.put(rep);
        } catch (ResourceException re) {
            log.warning("Error when updating the content of file: " + id);
            log.warning(re.getMessage());
            return false;
        }
        return true;
*/
}
