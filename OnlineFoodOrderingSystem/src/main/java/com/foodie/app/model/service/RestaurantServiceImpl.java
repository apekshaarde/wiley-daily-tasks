package com.foodie.app.model.service;

import com.foodie.app.model.model.CuisineType;
import com.foodie.app.model.model.MenuItems;
import com.foodie.app.model.model.Restaurant;
import com.foodie.app.model.repository.RestaurantRepository;
import com.foodie.app.model.repository.RestaurantRepositoryImpl;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService
{
    private RestaurantRepository restaurantRepository = new RestaurantRepositoryImpl();
    @Override
    public void addRestaurant(Restaurant restaurant) {
        restaurantRepository.addRestaurant(restaurant);
    }

    @Override
    public void setActivationStatus(boolean status) {

    }

    @Override
    public void updateMenuItem(MenuItems item) {
        restaurantRepository.updateMenuItem(item);
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
