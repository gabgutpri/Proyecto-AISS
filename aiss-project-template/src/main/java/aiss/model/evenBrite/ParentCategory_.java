
package aiss.model.evenBrite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "resource_uri",
    "name",
    "name_localized",
    "short_name",
    "short_name_localized",
    "subcategories"
})
public class ParentCategory_ {

    @JsonProperty("id")
    private String id;
    @JsonProperty("resource_uri")
    private String resourceUri;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_localized")
    private String nameLocalized;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("short_name_localized")
    private String shortNameLocalized;
    @JsonProperty("subcategories")
    private List<Subcategory__> subcategories = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("resource_uri")
    public String getResourceUri() {
        return resourceUri;
    }

    @JsonProperty("resource_uri")
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name_localized")
    public String getNameLocalized() {
        return nameLocalized;
    }

    @JsonProperty("name_localized")
    public void setNameLocalized(String nameLocalized) {
        this.nameLocalized = nameLocalized;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("short_name_localized")
    public String getShortNameLocalized() {
        return shortNameLocalized;
    }

    @JsonProperty("short_name_localized")
    public void setShortNameLocalized(String shortNameLocalized) {
        this.shortNameLocalized = shortNameLocalized;
    }

    @JsonProperty("subcategories")
    public List<Subcategory__> getSubcategories() {
        return subcategories;
    }

    @JsonProperty("subcategories")
    public void setSubcategories(List<Subcategory__> subcategories) {
        this.subcategories = subcategories;
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
