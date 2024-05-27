package com.traineesapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {

    private int laptopId;
    private String laptopName;
    private double price;
    private String brand;

    public Laptop(String laptopName,double price,String brand){
        this.laptopName = laptopName;
        this.price = price;
        this.brand = brand;
    }
}
