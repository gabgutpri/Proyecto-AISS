
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
    "currency",
    "value",
    "major_value",
    "display"
})
public class MinimumTicketPrice {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("major_value")
    private String majorValue;
    @JsonProperty("display")
    private String display;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonProperty("major_value")
    public String getMajorValue() {
        return majorValue;
    }

    @JsonProperty("major_value")
    public void setMajorValue(String majorValue) {
        this.majorValue = majorValue;
    }

    @JsonProperty("display")
    public String getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(String display) {
        this.display = display;
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
