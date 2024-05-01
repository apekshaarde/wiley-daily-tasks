package com.optional;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchEmployeesUsingNames {
    public static void main(String[] args) {

        Employee employee1 = new Employee(104,"Mack",5000, LocalDate.parse("2021-01-01"));
        Employee employee2 = new Employee(102,"John",40000, LocalDate.parse("2022-01-01"));
        Employee employee3 = new Employee(101,"Jonny",11000, LocalDate.parse("2023-01-01"));
        Employee employee4 = new Employee(103,"Albert",52000, LocalDate.parse("2024-01-01"));
        Employee employee5 = new Employee(102,"Peter",60000, LocalDate.parse("2020-01-01"));

        Map<Integer,Employee> map = new HashMap<>();

        map.put(employee1.getId(),employee1);
        map.put(employee2.getId(),employee2);
        map.put(employee3.getId(),employee3);
        map.put(employee4.getId(),employee4);
        map.put(employee5.getId(),employee5);

        String name = "john";
        map.values().stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .map(e->e.getName())
                .forEach(v-> System.out.println(v));

        int i=0;

        while((i<10) && (i>24)){

        }

        for(;;){
            System.out.println("*");
        }

    }
}
