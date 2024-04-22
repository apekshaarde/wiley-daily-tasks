package com.invension.app.service;

import com.invension.app.model.Book;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImpl implements ShoppingCart{
    private List<Book> items;

    public ShoppingCartImpl(){
        this.items = new ArrayList<>();
    }

    public double calculateTotalPrice() {
        double total = 0;

        for(Book item : items ){
            total += item.getPrice();
        }
        return total;

    }

    public void addItem(Book book) {
        items.add(book);
    }

    public void removeItem(Book book) {
        items.remove(book);
    }

    public void displayItems() {
        System.out.println("Shopping Cart:");
        for(Book item : items){
            System.out.println(item);
        }
    }
}