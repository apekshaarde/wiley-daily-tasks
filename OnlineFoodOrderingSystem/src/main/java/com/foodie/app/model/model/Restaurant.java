package com.foodie.app.model.model;
import java.time.LocalTime;
import java.util.List;

public abstract class Restaurant {
    private long restaurantId;
    private String name;
    private CuisineType cuisineType;
    private String location;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private List<MenuItems> menuItems;
    private boolean isActive;


    public Restaurant() {
    }

    public Restaurant(long restaurantId, String name, CuisineType cuisineType, String location, LocalTime openingTime, LocalTime closingTime, List<MenuItems> menuItems, boolean isActive) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.cuisineType = cuisineType;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.menuItems = menuItems;
        this.isActive = isActive;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public List<MenuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", name='" + name + '\'' +
                ", cuisineType=" + cuisineType +
                ", location='" + location + '\'' +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", menuItems=" + menuItems +
                ", isActive=" + isActive +
                '}';
    }
}
