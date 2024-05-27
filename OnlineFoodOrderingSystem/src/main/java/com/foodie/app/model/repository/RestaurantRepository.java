package com.foodie.app.model.repository;

import com.foodie.app.model.model.CuisineType;
import com.foodie.app.model.model.MenuItems;
import com.foodie.app.model.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    public void addRestaurant(Restaurant restaurant);

    public void setActivationStatus(boolean status);

    public void updateMenuItem(MenuItems item);

    public Restaurant getRestaurantById(long id);

    public List<Restaurant> findRestaurantByLocation(String location);

    public List<Restaurant> findRestaurantByName(String name);

    public List<Restaurant> findRestaurantByType(CuisineType type);

    public List<Restaurant> findAllActiveRestaurant();

    public List<Restaurant> findAllDeactivatedRestaurant();
}
