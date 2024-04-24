package com.invension.app.service;

import com.invension.app.model.Book;

import java.util.List;

public interface Inventory {


    public void addBook(Book book);

    public void removeBook(Book book);

    public void displayInventory();

    public Book findBookByTitle(String title);

    public List<Book> findBooksByAuthor(String author);

    public List<Book> findBooksByPriceRange(double minPrice, double maxPrice);
}
