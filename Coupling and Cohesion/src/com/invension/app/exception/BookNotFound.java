package com.invension.app.exception;

public class BookNotFound extends RuntimeException{
    public BookNotFound(String message){
        super(message);
    }
}
