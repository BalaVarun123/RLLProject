package com.java.cms;

import java.sql.SQLException;
import java.util.List;

public class RestaurantBAL {
private static RestaurantDAO restaurantDAO;
	
	static {
		restaurantDAO = new RestaurantDAO();
	}
	
	public List<Restaurant> showAllRestaurants() throws ClassNotFoundException, SQLException{
		return restaurantDAO.showAllRestaurants();
	}
	
	public Restaurant searchRestaurant(int restaurantID) throws ClassNotFoundException, SQLException{
		return restaurantDAO.searchRestaurant(restaurantID);
	}

}
