package com.java.cms;

public class Customer {
	private int customerID ;
	private String customerName;
	private String customerState;
	private String customerCity;
	private String customerEmail;
	private String customerMobile;
	
	
	public Customer() {
	
	}


	public Customer(int customerID, String customerName, String customerState, String customerCity,
			String customerEmail, String customerMobile) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerState = customerState;
		this.customerCity = customerCity;
		this.customerEmail = customerEmail;
		this.customerMobile = customerMobile;
	}


	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerState() {
		return customerState;
	}


	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public String getCustomerMobile() {
		return customerMobile;
	}


	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}


	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerState="
				+ customerState + ", customerCity=" + customerCity + ", customerEmail=" + customerEmail
				+ ", customerMobile=" + customerMobile + "]";
	}
	
	
	
}
