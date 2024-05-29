package com.todo.application.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Task {
    private int id;
    private String title;
    private String description;
    private boolean status;

    public Task(String title,String description,boolean status){
        this.title = title;
        this.description = description;
        this.status = status;
    }
}
