package com.epsilon.ordersconstructor;

public class author {
	String authorName;
	String authorId;
	public author(String authorName, String authorId) {
		super();
		this.authorName = authorName;
		this.authorId = authorId;
	}
	
	@Override
	public String toString() {
		return "author [authorName=" + authorName + ", authorId=" + authorId + "]";
	}
	
	
}
