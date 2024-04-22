package com.invension.app.service;

import com.invension.app.exception.BookNotFound;
import com.invension.app.model.Book;

public interface ShoppingCart {

    public double calculateTotalPrice();

    public void addItem(Book book);

    public void removeItem(Book book) throws BookNotFound;
    public void displayItems();
}
