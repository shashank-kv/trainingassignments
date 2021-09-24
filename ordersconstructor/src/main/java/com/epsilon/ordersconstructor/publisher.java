package com.epsilon.ordersconstructor;

public class publisher {
	String publisherId;
	String publisherName;
	String publisherLocation;
	public publisher(String publisherId, String publisherName, String publisherLocation) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherLocation = publisherLocation;
	}
	@Override
	public String toString() {
		return "publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", publisherLocation="
				+ publisherLocation + "]";
	}
	
	
}
