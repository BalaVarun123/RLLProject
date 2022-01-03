package com.java.cms;

import java.sql.SQLException;
import java.util.List;

public class CustomerBAL {
private static CustomerDAO customerDAO;

static {
	customerDAO = new CustomerDAO();
}

List<Customer> showAllCustomersBAL() throws SQLException, ClassNotFoundException{
	return customerDAO.showAllCustomersDAO();
}


Customer searchCustomerDAO(int customerID) throws SQLException, ClassNotFoundException{
	return customerDAO.searchCustomerDAO(customerID);
}

}
