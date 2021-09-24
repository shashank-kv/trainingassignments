package com.epsilon.ordersconstructor;

public class customer {
	String customerId;
	String customerName;
	public customer(String customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	
}
