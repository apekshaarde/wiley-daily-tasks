package com.foodie.app.model;

import com.foodie.app.model.model.*;
import com.foodie.app.model.service.RestaurantService;
import com.foodie.app.model.service.RestaurantServiceImpl;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static RestaurantService restaurantService = new RestaurantServiceImpl();

    public static void main(String[] args) {
        System.out.println("Welcome to Foodie App!");
        System.out.println("Are you an Admin or a User?");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                adminInterface();
                break;
            case 2:
                userInterface();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void adminInterface() {
        System.out.println("Welcome, Admin!");
        System.out.println("1. Add Restaurant");
        System.out.println("2. Delete Restaurant");
        System.out.println("3. View Restaurants");
        System.out.print("Enter your choice: ");
        int adminChoice = scanner.nextInt();
        scanner.nextLine();

        switch (adminChoice) {
            case 1:
                addRestaurantAsAdmin();
                break;
            case 2:
                // Implement delete restaurant functionality
                break;
            case 3:
                // Implement view restaurants functionality
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void userInterface() {
        System.out.println("Welcome, User!");
        // Implement user interface functionality
    }


    private static void addRestaurantAsAdmin() {
        System.out.println("Enter restaurant details:");
        System.out.print("Restaurant Name: ");
        String name = scanner.nextLine();
        System.out.print("Cuisine Type (1. Fast Food, 2. Fine Dining): ");
        int cuisineChoice = scanner.nextInt();
        scanner.nextLine();
        CuisineType cuisineType = (cuisineChoice == 1) ? CuisineType.FAST_FOOD : CuisineType.FINE_DINING;
        System.out.print("Location: ");
        String location = scanner.nextLine();
        System.out.print("Opening Time (HH:MM): ");
        LocalTime openingTime = LocalTime.parse(scanner.nextLine());
        System.out.print("Closing Time (HH:MM): ");
        LocalTime closingTime = LocalTime.parse(scanner.nextLine());
        System.out.print("Number of Menu Items: ");
        int numMenuItems = scanner.nextInt();
        scanner.nextLine();

        List<MenuItems> menuItems = new ArrayList<>();
        for (int i = 0; i < numMenuItems; i++) {
        System.out.println("Enter details for menu item " + (i + 1) + ":");
        System.out.print("Name: ");
        String itemName = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Price: ");
        double itemPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Type (VEG/NON_VEG): ");
        String itemType = scanner.nextLine();
        System.out.println("Enter Calarie Count : ");
        double calarieCount = scanner.nextDouble();
        menuItems.add(new MenuItems(itemName, itemPrice, ItemType.valueOf(itemType.toUpperCase()),calarieCount));
        }

        Restaurant restaurant;
        if (cuisineType == CuisineType.FAST_FOOD) {
        restaurant = new FastFoodRestaurant(0, name, cuisineType, location, openingTime, closingTime, menuItems, true);
        } else {
        restaurant = new FineDiningRestaurant(0, name, cuisineType, location, openingTime, closingTime, menuItems, true);
        }

        restaurantService.addRestaurant(restaurant);
        System.out.println(restaurant);
        }

    private static void updateMenuItem() {
        System.out.println("Enter details of the menu item to update:");
        System.out.print("Item ID: ");
        long itemId = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character

        System.out.print("New Name: ");
        String name = scanner.nextLine();

        System.out.print("New Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("New Type (VEG/NON_VEG): ");
        String typeStr = scanner.nextLine();
        ItemType type = ItemType.valueOf(typeStr.toUpperCase());

        System.out.print("New Calorie Count: ");
        double calorieCount = scanner.nextDouble();
        scanner.nextLine();

        MenuItems item = new MenuItems(name, price, type, calorieCount);

        restaurantService.updateMenuItem(item);
    }
}
