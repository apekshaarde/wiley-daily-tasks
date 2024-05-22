package com.traineesapp.exception;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException(String message){
        throw new RecordNotFoundException(message);
    }
}
