package com.foodie.app.model.model;

public class MenuItems {

    private int itemId;
    private String name;
    private double price;
    private ItemType type;
    private double calorieCount;

    public MenuItems() {
    }

    public MenuItems(String name, double price, ItemType type, double calorieCount) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.calorieCount = calorieCount;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public double getCalorieCount() {
        return calorieCount;
    }

    public void setCalorieCount(double calorieCount) {
        this.calorieCount = calorieCount;
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", calorieCount=" + calorieCount +
                '}';
    }
}
