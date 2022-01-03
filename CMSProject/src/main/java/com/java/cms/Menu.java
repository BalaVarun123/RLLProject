package com.java.cms;

public class Menu {
	private int menuId;
	private int restaurantID;
	private String itemName;
	private String menuType;
	private double calories;
	private double price;
	
	
	public Menu(){
		
	}


	public Menu(int menuId, int restaurantID, String itemName, String menuType, double calories, double price) {
		super();
		this.menuId = menuId;
		this.restaurantID = restaurantID;
		this.itemName = itemName;
		this.menuType = menuType;
		this.calories = calories;
		this.price = price;
	}


	public int getMenuId() {
		return menuId;
	}


	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}


	public int getRestaurantID() {
		return restaurantID;
	}


	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getMenuType() {
		return menuType;
	}


	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}


	public double getCalories() {
		return calories;
	}


	public void setCalories(double calories) {
		this.calories = calories;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", restaurantID=" + restaurantID + ", itemName=" + itemName + ", menuType="
				+ menuType + ", calories=" + calories + ", price=" + price + "]";
	}
	
	
}
