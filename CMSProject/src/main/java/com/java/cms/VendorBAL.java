package com.java.cms;

import java.sql.SQLException;
import java.util.List;

public class VendorBAL {

	private static VendorDAO dao = new VendorDAO();
	
	List<Vendor> showAllVendorsBAL() throws SQLException, ClassNotFoundException{
		 return dao.showAllVendorsDAO();
	}
	
	Vendor searchVendorBAL(int vendorID) throws SQLException, ClassNotFoundException{
		return dao.searchVendorDAO(vendorID);
	}
}
