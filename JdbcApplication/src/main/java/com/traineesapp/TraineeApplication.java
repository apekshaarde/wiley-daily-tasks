package com.traineesapp;

import com.traineesapp.exception.RecordNotFoundException;
import com.traineesapp.model.Laptop;
import com.traineesapp.repository.LaptopRepository;
import com.traineesapp.repository.LaptopRepositoryImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class TraineeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LaptopRepository laptopRepository = new LaptopRepositoryImpl();
        try{
            do {
                System.out.println("1.insert data");
                System.out.println("2.Exit");
                System.out.println("Enter your choice : ");
                int ch = sc.nextInt();

                switch (ch){
                    case 1:
                        Laptop laptop = new Laptop("Lenovo V14 G2-ITL",50500.0,"Lenovo");
                        Laptop laptop1 = laptopRepository.saveLaptop(laptop);
                        if(laptop1!=null){
                            System.out.println("data inserted successfully");
                        }
                        break;
                    case 2:
                        return;
                    default :
                        System.out.println("Invalid input");
                }
            }while (true);
        }catch (RecordNotFoundException | SQLException ex){
            ex.getMessage();
        }
    }
}
