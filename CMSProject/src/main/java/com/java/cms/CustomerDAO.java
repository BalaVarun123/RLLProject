package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

	List<Customer> showAllCustomersDAO() throws SQLException, ClassNotFoundException{
		List<Customer> listCustomers = new ArrayList<Customer>();
		Connection connection = ConnectionHelper.getConnection();
		String command = "select * from Customer";
		PreparedStatement preparedStatement = connection.prepareStatement(command);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			Customer customer = new Customer();
			customer.setCustomerID(resultSet.getInt("CustomerID"));
			customer.setCustomerName(resultSet.getString("CustomerName"));
			customer.setCustomerState(resultSet.getString("CustomerState"));
			customer.setCustomerCity(resultSet.getString("CustomerCity"));
			customer.setCustomerEmail(resultSet.getString("CustomerEmail"));
			customer.setCustomerMobile(resultSet.getString("CustomerMobile"));
			listCustomers.add(customer);
		}
		
		return listCustomers;
	}
	
	
	Customer searchCustomerDAO(int customerID) throws SQLException, ClassNotFoundException{
		Customer customer;
		Connection connection = ConnectionHelper.getConnection();
		String command = "select * from Customer where CustomerID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(command);
		preparedStatement.setInt(1, customerID);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			customer = new Customer();
			customer.setCustomerID(resultSet.getInt("CustomerID"));
			customer.setCustomerName(resultSet.getString("CustomerName"));
			customer.setCustomerState(resultSet.getString("CustomerState"));
			customer.setCustomerCity(resultSet.getString("CustomerCity"));
			customer.setCustomerEmail(resultSet.getString("CustomerEmail"));
			customer.setCustomerMobile(resultSet.getString("CustomerMobile"));
			
		}
		else{
			customer = null;
		}
		
		return customer;
	}
}
