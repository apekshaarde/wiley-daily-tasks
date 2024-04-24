package com.invension.app.service;

import com.invension.app.model.Book;

import java.util.ArrayList;
import java.util.List;

public class InventoryImpl implements Inventory {

    private List<Book> books;

    public InventoryImpl(){
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
            books.add(book);
    }

    public void removeBook(Book book) {
            books.remove(book);
    }

    public void displayInventory() {
        System.out.println("Inventory Details");
        for(Book book : books){
            System.out.println(book);
        }
    }

    public Book findBookByTitle(String title) {
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                foundBooks.add(book);
            }
        }
        return foundBooks;

    }

    public List<Book> findBooksByPriceRange(double minPrice, double maxPrice) {
        List<Book> foundBooks = new ArrayList<>();
        for(Book book : books){
            if(book.getPrice() >= minPrice && book.getPrice()<=maxPrice){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

}
