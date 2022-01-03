package com.java.cms;

public class Vendor {

	private int vendorId;
	private String vendorName;
	private String vendorState;
	private String vendorCity;
	private String vendorEmail;
	private String vendorMobile;
	
	public Vendor() {
	}

	public Vendor(int vendorId, String vendorName, String vendorState, String vendorCity, String vendorEmail,
			String vendorMobile) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorState = vendorState;
		this.vendorCity = vendorCity;
		this.vendorEmail = vendorEmail;
		this.vendorMobile = vendorMobile;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorState() {
		return vendorState;
	}

	public void setVendorState(String vendorState) {
		this.vendorState = vendorState;
	}

	public String getVendorCity() {
		return vendorCity;
	}

	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}

	public String getVendorEmail() {
		return vendorEmail;
	}

	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}

	public String getVendorMobile() {
		return vendorMobile;
	}

	public void setVendorMobile(String vendorMobile) {
		this.vendorMobile = vendorMobile;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorState=" + vendorState
				+ ", vendorCity=" + vendorCity + ", vendorEmail=" + vendorEmail + ", vendorMobile=" + vendorMobile
				+ "]";
	}
	
	
	
	
}
