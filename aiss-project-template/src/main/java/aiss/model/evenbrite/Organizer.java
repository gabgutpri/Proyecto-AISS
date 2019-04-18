
package aiss.model.evenBrite;

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
    "name",
    "description",
    "long_description",
    "logo_id",
    "logo",
    "resource_uri",
    "id",
    "url",
    "num_past_events",
    "num_future_events",
    "twitter",
    "facebook"
})
public class Organizer {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private Description_ description;
    @JsonProperty("long_description")
    private LongDescription longDescription;
    @JsonProperty("logo_id")
    private Object logoId;
    @JsonProperty("logo")
    private Logo logo;
    @JsonProperty("resource_uri")
    private String resourceUri;
    @JsonProperty("id")
    private String id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("num_past_events")
    private Integer numPastEvents;
    @JsonProperty("num_future_events")
    private Integer numFutureEvents;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("facebook")
    private String facebook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public Description_ getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description_ description) {
        this.description = description;
    }

    @JsonProperty("long_description")
    public LongDescription getLongDescription() {
        return longDescription;
    }

    @JsonProperty("long_description")
    public void setLongDescription(LongDescription longDescription) {
        this.longDescription = longDescription;
    }

    @JsonProperty("logo_id")
    public Object getLogoId() {
        return logoId;
    }

    @JsonProperty("logo_id")
    public void setLogoId(Object logoId) {
        this.logoId = logoId;
    }

    @JsonProperty("logo")
    public Logo getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    @JsonProperty("resource_uri")
    public String getResourceUri() {
        return resourceUri;
    }

    @JsonProperty("resource_uri")
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("num_past_events")
    public Integer getNumPastEvents() {
        return numPastEvents;
    }

    @JsonProperty("num_past_events")
    public void setNumPastEvents(Integer numPastEvents) {
        this.numPastEvents = numPastEvents;
    }

    @JsonProperty("num_future_events")
    public Integer getNumFutureEvents() {
        return numFutureEvents;
    }

    @JsonProperty("num_future_events")
    public void setNumFutureEvents(Integer numFutureEvents) {
        this.numFutureEvents = numFutureEvents;
    }

    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
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
