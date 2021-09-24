package com.epsilon.ordersconstructor;

public class book {
	String bookId;
	String bookName;
	publisher pb;
	author atr;
	public book(String bookId, String bookName, com.epsilon.ordersconstructor.publisher pb,
			com.epsilon.ordersconstructor.author atr) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.pb = pb;
		this.atr = atr;
	}
	@Override
	public String toString() {
		return "book [bookId=" + bookId + ", bookName=" + bookName + ", pb=" + pb + ", atr=" + atr + "]";
	}
	
	
	
}
