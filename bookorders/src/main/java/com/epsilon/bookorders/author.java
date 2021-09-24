package com.epsilon.bookorders;

public class author {
	String authorName;
	String authorId;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	@Override
	public String toString() {
		return "author [authorName=" + authorName + ", authorId=" + authorId + "]";
	}
	
	
}
