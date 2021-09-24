package com.epsilon.bookorders;

import java.util.List;

public class orders {
	String orderId;
	customer ctmr;
	List<book> orderItems;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public customer getCtmr() {
		return ctmr;
	}
	public void setCtmr(customer ctmr) {
		this.ctmr = ctmr;
	}
	public List<book> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<book> orderItems) {
		this.orderItems = orderItems;
	}
	@Override
	public String toString() {
		return "orders [orderId=" + orderId + ", ctmr=" + ctmr + ", orderItems=" + orderItems + "]";
	}
	
	
	
}
