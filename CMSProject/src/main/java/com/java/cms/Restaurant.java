package com.java.cms;

public class Restaurant {
	private int restaurantID;
	private String restaurantName;
	private String city;
	private String branch;
	private String email;
	private String contactNo;
	public Restaurant() {
	}
	public Restaurant(int restaurantID, String restaurantName, String city, String branch, String email,
			String contactNo) {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.city = city;
		this.branch = branch;
		this.email = email;
		this.contactNo = contactNo;
	}
	public int getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantID=" + restaurantID + ", restaurantName=" + restaurantName + ", city=" + city
				+ ", branch=" + branch + ", email=" + email + ", contactNo=" + contactNo + "]";
	}
	
	
	

}
