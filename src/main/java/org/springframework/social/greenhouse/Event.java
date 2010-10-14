package org.springframework.social.greenhouse;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

	@JsonProperty
	private long id;

	@JsonProperty
	private String title;

	@JsonProperty
	private String location;

	@JsonProperty
	private String hashtag;

	@JsonProperty
	private String description;

	@JsonProperty
	private Date startTime;

	@JsonProperty
	private Date endTime;

	@JsonProperty
	private String slug;

	@JsonProperty
	private String groupName;

	@JsonProperty
	private String groupSlug;

	@JsonProperty
	private Group group;

	@JsonProperty
	private TimeZone timeZone;

	@JsonProperty
	private List<Venue> venues;

	public List<Venue> getVenues() {
		return venues;
	}

	public void setVenues(List<Venue> venues) {
		this.venues = venues;
	}

	public String getSlug() {
		return slug;
	}

	public Group getGroup() {
		return group;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupSlug() {
		return groupSlug;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getLocation() {
		return location;
	}

	public String getHashtag() {
		return hashtag;
	}

	public String getDescription() {
		return description;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class TimeZone {
		@JsonProperty
		private String id;

		@JsonProperty
		private boolean fixed;

		public String getId() {
			return id;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Venue {
		@JsonProperty
		private long id;

		@JsonProperty
		private String name;

		@JsonProperty
		private String postalAddress;

		@JsonProperty
		private String locationHint;

		@JsonProperty
		private Map<String, Double> location;

		public double getLatitude() {
			return location.get("latitude");
		}

		public double getLongitude() {
			return location.get("longitude");
		}

		public long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getPostalAddress() {
			return postalAddress;
		}

		public String getLocationHint() {
			return locationHint;
		}
	}
}