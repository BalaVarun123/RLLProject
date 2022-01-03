package com.java.cms;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CanteenMain {
	private static Scanner scanner;
	private static RestaurantBAL restaurantBAL;
	private static MenuBAL menuBAL;
	private static CustomerBAL customerBAL;
	private static VendorBAL vendorBAL;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		restaurantBAL = new RestaurantBAL();
		menuBAL =  new MenuBAL();
		customerBAL = new CustomerBAL();
		vendorBAL = new VendorBAL();
		int choice = 0;
		
		
		do {
			try {
				showCMSMenu();
				choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 1 :
					showRestaurants();
					break;
				case 2 :
					searchRestaurant();
					break;
				case 3 :
					showRestaurantMenu();
					break;
				case 4 :
					searchRestauranMenu();
					break;
				case 5 :
					showVendors();
					break;
				case 6 :
					searchVendor();
					break;
				case 7 :
					showCustomers();
					break;
				case 8 :
					searchCustomer();
					break;
				case 9 :
					System.out.println("Program has been terminated.");
					break;
				default :
					System.err.println("Enter a valid choice.");
				}
			}
			catch(InputMismatchException e) {
				System.err.println("Enter input in the valid format.");
				scanner.nextLine();
			}
			catch(ClassNotFoundException | SQLException e) {
				System.err.println("Internal error occured. Please try again.");
			}
			
			
		}
		while (choice != 9);
		scanner.close();
	}
	
	
private static void showCMSMenu() {
	System.out.println("==================================");
	System.out.println("\t\tC M S");
	System.out.println("==================================");
	System.out.println("\t1. Show All Restaurants");
	System.out.println("\t2. Search Restaurant");
	System.out.println("\t3. Show All Menu Items");
	System.out.println("\t4. Search Menu");
	System.out.println("\t5. Show All Vendors");
	System.out.println("\t6. Search Vendor");
	System.out.println("\t7. Show All Customers");
	System.out.println("\t8. Search Customer");
	System.out.println("\t9. Exit");
	System.out.println("==================================");
	System.out.println("Enter your choice:");
	
} 
	private static void showRestaurants() throws ClassNotFoundException, SQLException {
		List <Restaurant> listRestaurants = restaurantBAL.showAllRestaurants();
		if (listRestaurants == null || listRestaurants.size() == 0) {
			System.out.println("No record found.");
		}
		else {
			for (Restaurant restaurant : listRestaurants) {
				System.out.println(restaurant);
			}
		}

	}
	
private static void searchRestaurant() throws ClassNotFoundException, SQLException {
		int restaurantID;
		System.out.println("Enter restaurant ID:");
		restaurantID = scanner.nextInt();
		scanner.nextLine();
		Restaurant restaurant = restaurantBAL.searchRestaurant(restaurantID);
		if (restaurant == null) {
			System.out.println("Restaurant not found.");
		}
		else {
			System.out.println(restaurant);
		}
		
	} 

private static void showRestaurantMenu() throws ClassNotFoundException, SQLException {
	int restaurantID;
	System.out.println("Enter restaurant ID:");
	restaurantID = scanner.nextInt();
	scanner.nextLine();
	List <Menu> listMenu = menuBAL.getMenuItemsBAL(restaurantID);
	if (listMenu == null || listMenu.size() == 0) {
		System.out.println("Menu not found for given restaurant id.");
	}
	else {
		for (Menu menu : listMenu) {
			System.out.println(menu);
		}
	}

} 

private static void searchRestauranMenu() throws ClassNotFoundException, SQLException {
	int menuID;
	System.out.println("Enter menu ID:");
	menuID = scanner.nextInt();
	scanner.nextLine();
	Menu menu = menuBAL.getMenuByMenuIDBAL(menuID);
	if (menu == null) {
		System.out.println("Menu not found for given menu id.");
	}
	else {
		System.out.println(menu);
	}
} 



private static void showCustomers() throws ClassNotFoundException, SQLException {
	List <Customer> listCustomers = customerBAL.showAllCustomersBAL();
	if (listCustomers == null || listCustomers.size() == 0) {
		System.out.println("No record found.");
	}
	else {
		for (Customer customer : listCustomers) {
			System.out.println(customer);
		}
	}
}

private static void searchCustomer() throws ClassNotFoundException, SQLException {
	int customerID;
	System.out.println("Enter customer ID:");
	customerID = scanner.nextInt();
	scanner.nextLine();
	Customer customer = customerBAL.searchCustomerDAO(customerID);
	if (customer == null) {
		System.out.println("Customer not found.");
	}
	else {
		System.out.println(customer);
	}
} 

private static void showVendors() throws ClassNotFoundException, SQLException {
	List<Vendor> listVendors = vendorBAL.showAllVendorsBAL();
	if (listVendors == null || listVendors.size() == 0) {
		System.out.println("No record found.");
	}
	else {
		for (Vendor vendor : listVendors) {
			System.out.println(vendor);
		}
	}
}

private static void searchVendor() throws ClassNotFoundException, SQLException {
	int vendorID;
	System.out.println("Enter vendor ID:");
	vendorID = scanner.nextInt();
	scanner.nextLine();
	Vendor vendor = vendorBAL.searchVendorBAL(vendorID);
	if (vendor == null) {
		System.out.println("Vendor not found.");
	}
	else {
		System.out.println(vendor);
	}
	
} 


}
