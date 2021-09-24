package com.epsilon.bookorders;

public class book {
	String bookId;
	String bookName;
	publisher pb;
	author atr;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public publisher getPb() {
		return pb;
	}
	public void setPb(publisher pb) {
		this.pb = pb;
	}
	public author getAtr() {
		return atr;
	}
	public void setAtr(author atr) {
		this.atr = atr;
	}
	@Override
	public String toString() {
		return "book [bookId=" + bookId + ", bookName=" + bookName + ", pb=" + pb + ", atr=" + atr + "]";
	}
	
	
}
