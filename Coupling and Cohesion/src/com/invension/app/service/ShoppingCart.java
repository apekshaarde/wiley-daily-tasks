package com.invension.app.service;

import com.invension.app.model.Book;

public interface ShoppingCart {

    public double calculateTotalPrice();

    public void addItem(Book book);

    public void removeItem(Book book);
    public void displayItems();
}
