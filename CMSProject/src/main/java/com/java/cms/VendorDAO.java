package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendorDAO {
	List<Vendor> showAllVendorsDAO() throws SQLException, ClassNotFoundException{
		List<Vendor> listVendors = new ArrayList<Vendor>();
		Connection connection = ConnectionHelper.getConnection();
		String command = "select * from vendor";
		PreparedStatement preparedStatement = connection.prepareStatement(command);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			Vendor vendor = new Vendor();
			vendor.setVendorId(resultSet.getInt("VendorId"));
			vendor.setVendorName(resultSet.getString("VendorName"));
			vendor.setVendorState(resultSet.getString("VendorState"));
			vendor.setVendorCity(resultSet.getString("VendorCity"));
			vendor.setVendorEmail(resultSet.getString("VendorEmail"));
			vendor.setVendorMobile(resultSet.getString("VendorMobile"));
			listVendors.add(vendor);
		}
		
		return listVendors;
	}
	
	
	
	Vendor searchVendorDAO(int vendorID) throws SQLException, ClassNotFoundException{
		Vendor vendor;
		Connection connection = ConnectionHelper.getConnection();
		String command = "select * from vendor where VendorId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(command);
		preparedStatement.setInt(1, vendorID);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			vendor = new Vendor();
			vendor.setVendorId(resultSet.getInt("VendorId"));
			vendor.setVendorName(resultSet.getString("VendorName"));
			vendor.setVendorState(resultSet.getString("VendorState"));
			vendor.setVendorCity(resultSet.getString("VendorCity"));
			vendor.setVendorEmail(resultSet.getString("VendorEmail"));
			vendor.setVendorMobile(resultSet.getString("VendorMobile"));
		}
		else {
			vendor = null;
		}
		
		return vendor;
	}
}
