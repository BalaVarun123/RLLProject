package com.java.cms;

import java.sql.SQLException;
import java.util.List;

public class MenuBAL {
	private static MenuDAO menuDAO;
	static {
		menuDAO = new MenuDAO();
	}
	
	public List<Menu> getMenuItemsBAL(int restaurantID) throws ClassNotFoundException, SQLException{
		return menuDAO.getMenuItemsDAO(restaurantID);
	}
	
	public Menu getMenuByMenuIDBAL(int menuID) throws ClassNotFoundException, SQLException{
		return menuDAO.getMenuByMenuIDDAO(menuID);
	}
}
