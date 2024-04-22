package com.invension.app.service;

import com.invension.app.exception.BookAlreadyPresent;
import com.invension.app.exception.BookNotFound;
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

//    public void bookAlreadyPresent(Book book) throws BookAlreadyPresent{
//        for(Book checkBook : items){
//            if(checkBook.getTitle().equalsIgnoreCase(book.getTitle())){
//                return;
//            }
//        }
//        throw new BookAlreadyPresent("book is already present in your cart");
//    }

    public void addItem(Book book){
        //bookAlreadyPresent(book);
        items.add(book);
    }

    private void bookPresentOrNot(Book book) throws BookNotFound {
        for(Book findBook : items){
            if(findBook.getTitle().equalsIgnoreCase(book.getTitle())){
                return;
            }
        }
        throw new BookNotFound("Book Not Found");
    }
    public void removeItem(Book book)  throws BookNotFound {
        bookPresentOrNot(book);
        items.remove(book);
    }

    public void displayItems() {
        System.out.println("Shopping Cart:");
        for(Book item : items){
            System.out.println(item);
        }
    }
}