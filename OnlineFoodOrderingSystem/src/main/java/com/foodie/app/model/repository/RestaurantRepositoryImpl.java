package com.foodie.app.model.repository;

import com.foodie.app.model.model.CuisineType;
import com.foodie.app.model.model.MenuItems;
import com.foodie.app.model.model.Restaurant;
import com.foodie.app.model.util.JdbcConnectionUtil;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantRepositoryImpl implements RestaurantRepository
{
    private Map<Long,Restaurant> restaurants;

    public RestaurantRepositoryImpl(){
        restaurants = new HashMap<>();
    }

    @Override
    public void addRestaurant(Restaurant restaurant) {

        try (Connection connection = JdbcConnectionUtil.getConnection()) {

            try (PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO restaurant (name, cuisineType, location, openingTime, closingTime, isActive) VALUES (?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS)) {

                preparedStatement.setString(1, restaurant.getName());
                preparedStatement.setString(2, restaurant.getCuisineType().toString());
                preparedStatement.setString(3, restaurant.getLocation());
                preparedStatement.setTime(4, java.sql.Time.valueOf(restaurant.getOpeningTime()));
                preparedStatement.setTime(5, java.sql.Time.valueOf(restaurant.getClosingTime()));
                preparedStatement.setBoolean(6, restaurant.isActive());

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected == 0) {
                    throw new SQLException("Failed to insert restaurant, no rows affected.");
                }

                try (var generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        long restaurantId = generatedKeys.getLong(1);

                        List<MenuItems> menuItems = restaurant.getMenuItems();
                        for (MenuItems menuItem : menuItems) {
                            try (PreparedStatement menuItemStatement = connection.prepareStatement(
                                    "INSERT INTO menu_items (restaurant_id, name, price, type, calorie_count) VALUES (?, ?, ?, ?, ?)")) {

                                menuItemStatement.setLong(1, restaurantId);
                                menuItemStatement.setString(2, menuItem.getName());
                                menuItemStatement.setDouble(3, menuItem.getPrice());
                                menuItemStatement.setString(4, menuItem.getType().toString());
                                menuItemStatement.setDouble(5, menuItem.getCalorieCount());

                                menuItemStatement.executeUpdate();
                            }
                        }
                    } else {
                        throw new SQLException("Failed to insert restaurant, no ID obtained.");
                    }
                }
                connection.commit();
                System.out.println("Restaurant added successfully.");
            }
        } catch (SQLException e) {
            System.err.println("Error adding restaurant: " + e.getMessage());
        }
    }

    @Override
    public void setActivationStatus(boolean status) {

    }

    @Override
    public void updateMenuItem(MenuItems item) {
        try (Connection connection = JdbcConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE menu_items SET name = ?, price = ?, type = ?, calorie_count = ? WHERE item_id = ?")) {

            preparedStatement.setString(1, item.getName());
            preparedStatement.setDouble(2, item.getPrice());
            preparedStatement.setString(3, item.getType().toString());
            preparedStatement.setDouble(4, item.getCalorieCount());
            preparedStatement.setLong(5, item.getItemId());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                System.err.println("Failed to update menu item: No rows affected.");
            } else {
                System.out.println("Menu item updated successfully.");
            }

        } catch (SQLException e) {
            System.err.println("Error updating menu item: " + e.getMessage());
        }
    }

    @Override
    public Restaurant getRestaurantById(long id) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByLocation(String location) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByName(String name) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByType(CuisineType type) {
        return null;
    }

    @Override
    public List<Restaurant> findAllActiveRestaurant() {
        return null;
    }

    @Override
    public List<Restaurant> findAllDeactivatedRestaurant() {
        return null;
    }
}
