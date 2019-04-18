
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
    "has_available_tickets",
    "minimum_ticket_price",
    "maximum_ticket_price",
    "is_sold_out",
    "start_sales_date"
})
public class TicketAvailability {

    @JsonProperty("has_available_tickets")
    private Boolean hasAvailableTickets;
    @JsonProperty("minimum_ticket_price")
    private MinimumTicketPrice minimumTicketPrice;
    @JsonProperty("maximum_ticket_price")
    private MaximumTicketPrice maximumTicketPrice;
    @JsonProperty("is_sold_out")
    private Boolean isSoldOut;
    @JsonProperty("start_sales_date")
    private StartSalesDate startSalesDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("has_available_tickets")
    public Boolean getHasAvailableTickets() {
        return hasAvailableTickets;
    }

    @JsonProperty("has_available_tickets")
    public void setHasAvailableTickets(Boolean hasAvailableTickets) {
        this.hasAvailableTickets = hasAvailableTickets;
    }

    @JsonProperty("minimum_ticket_price")
    public MinimumTicketPrice getMinimumTicketPrice() {
        return minimumTicketPrice;
    }

    @JsonProperty("minimum_ticket_price")
    public void setMinimumTicketPrice(MinimumTicketPrice minimumTicketPrice) {
        this.minimumTicketPrice = minimumTicketPrice;
    }

    @JsonProperty("maximum_ticket_price")
    public MaximumTicketPrice getMaximumTicketPrice() {
        return maximumTicketPrice;
    }

    @JsonProperty("maximum_ticket_price")
    public void setMaximumTicketPrice(MaximumTicketPrice maximumTicketPrice) {
        this.maximumTicketPrice = maximumTicketPrice;
    }

    @JsonProperty("is_sold_out")
    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    @JsonProperty("is_sold_out")
    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    @JsonProperty("start_sales_date")
    public StartSalesDate getStartSalesDate() {
        return startSalesDate;
    }

    @JsonProperty("start_sales_date")
    public void setStartSalesDate(StartSalesDate startSalesDate) {
        this.startSalesDate = startSalesDate;
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
