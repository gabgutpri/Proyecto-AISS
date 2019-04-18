
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
    "id",
    "name",
    "description",
    "start",
    "end",
    "url",
    "vanity_url",
    "created",
    "changed",
    "published",
    "status",
    "currency",
    "online_event",
    "organization_id",
    "organizer_id",
    "organizer",
    "logo_id",
    "logo",
    "venue",
    "format_id",
    "format",
    "category_id",
    "category",
    "subcategory_id",
    "subcategory",
    "music_properties",
    "bookmark_info (Bookmark Info, optional) - The bookmark information on the event (requires the `bookmark_info` expansion)",
    "ticket_availability",
    "listed",
    "shareable",
    "invite_only",
    "show_remaining",
    "password",
    "capacity",
    "capacity_is_custom",
    "tx_time_limit",
    "hide_start_date",
    "hide_end_date",
    "locale",
    "is_locked",
    "privacy_setting",
    "is_externally_ticketed",
    "is_series",
    "is_series_parent",
    "is_reserved_seating",
    "show_pick_a_seat",
    "show_seatmap_thumbnail",
    "show_colors_in_seatmap_thumbnail",
    "is_free",
    "source",
    "version",
    "resource_uri"
})
public class Event {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("description")
    private Description description;
    @JsonProperty("start")
    private Start start;
    @JsonProperty("end")
    private End end;
    @JsonProperty("url")
    private String url;
    @JsonProperty("vanity_url")
    private String vanityUrl;
    @JsonProperty("created")
    private String created;
    @JsonProperty("changed")
    private String changed;
    @JsonProperty("published")
    private String published;
    @JsonProperty("status")
    private String status;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("online_event")
    private Boolean onlineEvent;
    @JsonProperty("organization_id")
    private String organizationId;
    @JsonProperty("organizer_id")
    private String organizerId;
    @JsonProperty("organizer")
    private Organizer organizer;
    @JsonProperty("logo_id")
    private Object logoId;
    @JsonProperty("logo")
    private Logo_ logo;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("format_id")
    private Object formatId;
    @JsonProperty("format")
    private Format format;
    @JsonProperty("category_id")
    private Object categoryId;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("subcategory_id")
    private Object subcategoryId;
    @JsonProperty("subcategory")
    private Subcategory_ subcategory;
    @JsonProperty("music_properties")
    private MusicProperties musicProperties;
    @JsonProperty("bookmark_info (Bookmark Info, optional) - The bookmark information on the event (requires the `bookmark_info` expansion)")
    private String bookmarkInfoBookmarkInfoOptionalTheBookmarkInformationOnTheEventRequiresTheBookmarkInfoExpansion;
    @JsonProperty("ticket_availability")
    private TicketAvailability ticketAvailability;
    @JsonProperty("listed")
    private Boolean listed;
    @JsonProperty("shareable")
    private Boolean shareable;
    @JsonProperty("invite_only")
    private Boolean inviteOnly;
    @JsonProperty("show_remaining")
    private Boolean showRemaining;
    @JsonProperty("password")
    private String password;
    @JsonProperty("capacity")
    private Integer capacity;
    @JsonProperty("capacity_is_custom")
    private Boolean capacityIsCustom;
    @JsonProperty("tx_time_limit")
    private String txTimeLimit;
    @JsonProperty("hide_start_date")
    private Boolean hideStartDate;
    @JsonProperty("hide_end_date")
    private Boolean hideEndDate;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("is_locked")
    private Boolean isLocked;
    @JsonProperty("privacy_setting")
    private String privacySetting;
    @JsonProperty("is_externally_ticketed")
    private Boolean isExternallyTicketed;
    @JsonProperty("is_series")
    private Boolean isSeries;
    @JsonProperty("is_series_parent")
    private Boolean isSeriesParent;
    @JsonProperty("is_reserved_seating")
    private Boolean isReservedSeating;
    @JsonProperty("show_pick_a_seat")
    private Boolean showPickASeat;
    @JsonProperty("show_seatmap_thumbnail")
    private Boolean showSeatmapThumbnail;
    @JsonProperty("show_colors_in_seatmap_thumbnail")
    private Boolean showColorsInSeatmapThumbnail;
    @JsonProperty("is_free")
    private Boolean isFree;
    @JsonProperty("source")
    private String source;
    @JsonProperty("version")
    private String version;
    @JsonProperty("resource_uri")
    private String resourceUri;
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

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("description")
    public Description getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
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

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("vanity_url")
    public String getVanityUrl() {
        return vanityUrl;
    }

    @JsonProperty("vanity_url")
    public void setVanityUrl(String vanityUrl) {
        this.vanityUrl = vanityUrl;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("changed")
    public String getChanged() {
        return changed;
    }

    @JsonProperty("changed")
    public void setChanged(String changed) {
        this.changed = changed;
    }

    @JsonProperty("published")
    public String getPublished() {
        return published;
    }

    @JsonProperty("published")
    public void setPublished(String published) {
        this.published = published;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("online_event")
    public Boolean getOnlineEvent() {
        return onlineEvent;
    }

    @JsonProperty("online_event")
    public void setOnlineEvent(Boolean onlineEvent) {
        this.onlineEvent = onlineEvent;
    }

    @JsonProperty("organization_id")
    public String getOrganizationId() {
        return organizationId;
    }

    @JsonProperty("organization_id")
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @JsonProperty("organizer_id")
    public String getOrganizerId() {
        return organizerId;
    }

    @JsonProperty("organizer_id")
    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    @JsonProperty("organizer")
    public Organizer getOrganizer() {
        return organizer;
    }

    @JsonProperty("organizer")
    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
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
    public Logo_ getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(Logo_ logo) {
        this.logo = logo;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("format_id")
    public Object getFormatId() {
        return formatId;
    }

    @JsonProperty("format_id")
    public void setFormatId(Object formatId) {
        this.formatId = formatId;
    }

    @JsonProperty("format")
    public Format getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(Format format) {
        this.format = format;
    }

    @JsonProperty("category_id")
    public Object getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("subcategory_id")
    public Object getSubcategoryId() {
        return subcategoryId;
    }

    @JsonProperty("subcategory_id")
    public void setSubcategoryId(Object subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    @JsonProperty("subcategory")
    public Subcategory_ getSubcategory() {
        return subcategory;
    }

    @JsonProperty("subcategory")
    public void setSubcategory(Subcategory_ subcategory) {
        this.subcategory = subcategory;
    }

    @JsonProperty("music_properties")
    public MusicProperties getMusicProperties() {
        return musicProperties;
    }

    @JsonProperty("music_properties")
    public void setMusicProperties(MusicProperties musicProperties) {
        this.musicProperties = musicProperties;
    }

    @JsonProperty("bookmark_info (Bookmark Info, optional) - The bookmark information on the event (requires the `bookmark_info` expansion)")
    public String getBookmarkInfoBookmarkInfoOptionalTheBookmarkInformationOnTheEventRequiresTheBookmarkInfoExpansion() {
        return bookmarkInfoBookmarkInfoOptionalTheBookmarkInformationOnTheEventRequiresTheBookmarkInfoExpansion;
    }

    @JsonProperty("bookmark_info (Bookmark Info, optional) - The bookmark information on the event (requires the `bookmark_info` expansion)")
    public void setBookmarkInfoBookmarkInfoOptionalTheBookmarkInformationOnTheEventRequiresTheBookmarkInfoExpansion(String bookmarkInfoBookmarkInfoOptionalTheBookmarkInformationOnTheEventRequiresTheBookmarkInfoExpansion) {
        this.bookmarkInfoBookmarkInfoOptionalTheBookmarkInformationOnTheEventRequiresTheBookmarkInfoExpansion = bookmarkInfoBookmarkInfoOptionalTheBookmarkInformationOnTheEventRequiresTheBookmarkInfoExpansion;
    }

    @JsonProperty("ticket_availability")
    public TicketAvailability getTicketAvailability() {
        return ticketAvailability;
    }

    @JsonProperty("ticket_availability")
    public void setTicketAvailability(TicketAvailability ticketAvailability) {
        this.ticketAvailability = ticketAvailability;
    }

    @JsonProperty("listed")
    public Boolean getListed() {
        return listed;
    }

    @JsonProperty("listed")
    public void setListed(Boolean listed) {
        this.listed = listed;
    }

    @JsonProperty("shareable")
    public Boolean getShareable() {
        return shareable;
    }

    @JsonProperty("shareable")
    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    @JsonProperty("invite_only")
    public Boolean getInviteOnly() {
        return inviteOnly;
    }

    @JsonProperty("invite_only")
    public void setInviteOnly(Boolean inviteOnly) {
        this.inviteOnly = inviteOnly;
    }

    @JsonProperty("show_remaining")
    public Boolean getShowRemaining() {
        return showRemaining;
    }

    @JsonProperty("show_remaining")
    public void setShowRemaining(Boolean showRemaining) {
        this.showRemaining = showRemaining;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("capacity")
    public Integer getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("capacity_is_custom")
    public Boolean getCapacityIsCustom() {
        return capacityIsCustom;
    }

    @JsonProperty("capacity_is_custom")
    public void setCapacityIsCustom(Boolean capacityIsCustom) {
        this.capacityIsCustom = capacityIsCustom;
    }

    @JsonProperty("tx_time_limit")
    public String getTxTimeLimit() {
        return txTimeLimit;
    }

    @JsonProperty("tx_time_limit")
    public void setTxTimeLimit(String txTimeLimit) {
        this.txTimeLimit = txTimeLimit;
    }

    @JsonProperty("hide_start_date")
    public Boolean getHideStartDate() {
        return hideStartDate;
    }

    @JsonProperty("hide_start_date")
    public void setHideStartDate(Boolean hideStartDate) {
        this.hideStartDate = hideStartDate;
    }

    @JsonProperty("hide_end_date")
    public Boolean getHideEndDate() {
        return hideEndDate;
    }

    @JsonProperty("hide_end_date")
    public void setHideEndDate(Boolean hideEndDate) {
        this.hideEndDate = hideEndDate;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("is_locked")
    public Boolean getIsLocked() {
        return isLocked;
    }

    @JsonProperty("is_locked")
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    @JsonProperty("privacy_setting")
    public String getPrivacySetting() {
        return privacySetting;
    }

    @JsonProperty("privacy_setting")
    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    @JsonProperty("is_externally_ticketed")
    public Boolean getIsExternallyTicketed() {
        return isExternallyTicketed;
    }

    @JsonProperty("is_externally_ticketed")
    public void setIsExternallyTicketed(Boolean isExternallyTicketed) {
        this.isExternallyTicketed = isExternallyTicketed;
    }

    @JsonProperty("is_series")
    public Boolean getIsSeries() {
        return isSeries;
    }

    @JsonProperty("is_series")
    public void setIsSeries(Boolean isSeries) {
        this.isSeries = isSeries;
    }

    @JsonProperty("is_series_parent")
    public Boolean getIsSeriesParent() {
        return isSeriesParent;
    }

    @JsonProperty("is_series_parent")
    public void setIsSeriesParent(Boolean isSeriesParent) {
        this.isSeriesParent = isSeriesParent;
    }

    @JsonProperty("is_reserved_seating")
    public Boolean getIsReservedSeating() {
        return isReservedSeating;
    }

    @JsonProperty("is_reserved_seating")
    public void setIsReservedSeating(Boolean isReservedSeating) {
        this.isReservedSeating = isReservedSeating;
    }

    @JsonProperty("show_pick_a_seat")
    public Boolean getShowPickASeat() {
        return showPickASeat;
    }

    @JsonProperty("show_pick_a_seat")
    public void setShowPickASeat(Boolean showPickASeat) {
        this.showPickASeat = showPickASeat;
    }

    @JsonProperty("show_seatmap_thumbnail")
    public Boolean getShowSeatmapThumbnail() {
        return showSeatmapThumbnail;
    }

    @JsonProperty("show_seatmap_thumbnail")
    public void setShowSeatmapThumbnail(Boolean showSeatmapThumbnail) {
        this.showSeatmapThumbnail = showSeatmapThumbnail;
    }

    @JsonProperty("show_colors_in_seatmap_thumbnail")
    public Boolean getShowColorsInSeatmapThumbnail() {
        return showColorsInSeatmapThumbnail;
    }

    @JsonProperty("show_colors_in_seatmap_thumbnail")
    public void setShowColorsInSeatmapThumbnail(Boolean showColorsInSeatmapThumbnail) {
        this.showColorsInSeatmapThumbnail = showColorsInSeatmapThumbnail;
    }

    @JsonProperty("is_free")
    public Boolean getIsFree() {
        return isFree;
    }

    @JsonProperty("is_free")
    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("resource_uri")
    public String getResourceUri() {
        return resourceUri;
    }

    @JsonProperty("resource_uri")
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
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
