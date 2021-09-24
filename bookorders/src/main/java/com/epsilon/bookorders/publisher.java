package com.epsilon.bookorders;

public class publisher {
	String publisherId;
	String publisherName;
	String publisherLocation;
	public String getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherLocation() {
		return publisherLocation;
	}
	public void setPublisherLocation(String publisherLocation) {
		this.publisherLocation = publisherLocation;
	}
	@Override
	public String toString() {
		return "publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", publisherLocation="
				+ publisherLocation + "]";
	}
	
	
}
