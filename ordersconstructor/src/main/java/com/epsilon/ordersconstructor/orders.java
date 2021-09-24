package com.epsilon.ordersconstructor;

import java.util.List;

public class orders {
	String orderId;
	customer ctmr;
	List<book> orderItems;
	public orders(String orderId, com.epsilon.ordersconstructor.customer ctmr,
			List<com.epsilon.ordersconstructor.book> orderItems) {
		super();
		this.orderId = orderId;
		this.ctmr = ctmr;
		this.orderItems = orderItems;
	}
	@Override
	public String toString() {
		return "orders [orderId=" + orderId + ", ctmr=" + ctmr + ", orderItems=" + orderItems + "]";
	}
	
	
}
