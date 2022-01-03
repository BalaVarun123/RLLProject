package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MenuDAO {
	public List<Menu> getMenuItemsDAO(int restaurantID) throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		String command = "select * from Menu where RestaurantID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(command);
		preparedStatement.setInt(1, restaurantID);
		List<Menu> menuList = new ArrayList<Menu>();
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Menu menu = new Menu();
			menu.setMenuId(resultSet.getInt("MenuId"));
			menu.setRestaurantID(resultSet.getInt("RestaurantID"));
			menu.setItemName(resultSet.getString("ItemName"));
			menu.setMenuType(resultSet.getString("MenuType"));
			menu.setCalories(resultSet.getDouble("Calories"));
			menu.setPrice(resultSet.getDouble("Price"));
			menuList.add(menu);
		}
		return menuList;
	}
	
	
	public Menu getMenuByMenuIDDAO(int menuID) throws ClassNotFoundException, SQLException{
		Connection connection = ConnectionHelper.getConnection();
		String command = "select * from Menu where MenuId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(command);
		preparedStatement.setInt(1, menuID);
		Menu menu;
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			menu = new Menu();
			menu.setMenuId(resultSet.getInt("MenuId"));
			menu.setRestaurantID(resultSet.getInt("RestaurantID"));
			menu.setItemName(resultSet.getString("ItemName"));
			menu.setMenuType(resultSet.getString("MenuType"));
			menu.setCalories(resultSet.getDouble("Calories"));
			menu.setPrice(resultSet.getDouble("Price"));
		}
		else {
			menu = null;
		}
		return menu;
	}
}

