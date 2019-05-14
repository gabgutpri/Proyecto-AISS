package aiss.model.calendar;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "etag",
    "id",
    //"status",
    "htmlLink",
    "created",
    "updated",
    "summary",
    "description",
    "location",
    //"colorId",
    "creator",
    "organizer",
    "start",
    "end",
    //"endTimeUnspecified",
    //"recurrence",
    //"recurringEventId", 
    //"originalStartTime",
    //"transparency",
    //"visibility",
    "iCalUID",
    "sequence",
    //"attendees",
    //"attendeesOmitted",
    //"extendedProperties",
    //"hangoutLink",
    //"conferenceData",
    //"anyoneCanAddSelf",
    //"guestsCanInviteOthers",
    //"guestsCanModify",
    //"guestsCanSeeOtherGuests",
    //"privateCopy",
    //"locked"
    "reminders"
})
public class Events {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("id")
    private String id;
    @JsonProperty("htmlLink")
    private String htmlLink;
    @JsonProperty("created")
    private String created;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("location")
    private String location;
    @JsonProperty("creator")
    private Creator creator;
    @JsonProperty("organizer")
    private Organizer organizer;
    @JsonProperty("start")
    private Start start;
    @JsonProperty("end")
    private End end;
    @JsonProperty("iCalUID")
    private String iCalUID;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("reminders")
    private Reminders reminders;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    public static Events create() {
    	return new Events("","","","",Start.create(), End.create());
    }
    
    public static Events create(String id, String summary, String description, String location, Start start, End end) {
    	return new Events(id,summary,description,location,start, end);
	}

    private Events(String id, String summary, String description, String location, Start start, End end) {
		super();
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.location = location;
		this.start = start;
		this.end = end;
	}

	@JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("htmlLink")
    public String getHtmlLink() {
        return htmlLink;
    }

    @JsonProperty("htmlLink")
    public void setHtmlLink(String htmlLink) {
        this.htmlLink = htmlLink;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    @JsonProperty("description")
    public String getDescription() {
		return description;
	}

    @JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

    @JsonProperty("location")
	public String getLocation() {
		return location;
	}

    @JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("creator")
    public Creator getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @JsonProperty("organizer")
    public Organizer getOrganizer() {
        return organizer;
    }

    @JsonProperty("organizer")
    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    @JsonProperty("start")
    public Start getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Start start) {
        this.start = start;
    }

    @JsonProperty("end")
    public End getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(End end) {
        this.end = end;
    }

    @JsonProperty("iCalUID")
    public String getICalUID() {
        return iCalUID;
    }

    @JsonProperty("iCalUID")
    public void setICalUID(String iCalUID) {
        this.iCalUID = iCalUID;
    }

    @JsonProperty("sequence")
    public Integer getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("reminders")
    public Reminders getReminders() {
        return reminders;
    }

    @JsonProperty("reminders")
    public void setReminders(Reminders reminders) {
        this.reminders = reminders;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
