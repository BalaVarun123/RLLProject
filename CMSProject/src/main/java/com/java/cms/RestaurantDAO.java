package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RestaurantDAO {
	public List<Restaurant> showAllRestaurants() throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		List<Restaurant> restaurants = new ArrayList<Restaurant>(); 
		String command = "select * from Restaurant";
		PreparedStatement preparedStatement = connection.prepareStatement(command);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Restaurant restaurant = new Restaurant();
			restaurant.setRestaurantID(resultSet.getInt("RestaurantID"));
			restaurant.setRestaurantName(resultSet.getString("RestaurantName"));
			restaurant.setCity(resultSet.getString("city"));
			restaurant.setBranch(resultSet.getString("branch"));
			restaurant.setEmail(resultSet.getString("email"));
			restaurant.setContactNo(resultSet.getString("contactNo"));
			restaurants.add(restaurant);
		}
		return restaurants;
	}
	
	
	public Restaurant searchRestaurant(int restaurantID) throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		String command = "select * from Restaurant where RestaurantID = ?";
		Restaurant restaurant = null;
		PreparedStatement  preparedStatement = connection.prepareStatement(command);
		preparedStatement.setInt(1, restaurantID);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			restaurant = new Restaurant();
			restaurant.setRestaurantID(resultSet.getInt("RestaurantID"));
			restaurant.setRestaurantName(resultSet.getString("RestaurantName"));
			restaurant.setCity(resultSet.getString("city"));
			restaurant.setBranch(resultSet.getString("branch"));
			restaurant.setEmail(resultSet.getString("email"));
			restaurant.setContactNo(resultSet.getString("contactNo"));
		}
		return restaurant;
	}
}
