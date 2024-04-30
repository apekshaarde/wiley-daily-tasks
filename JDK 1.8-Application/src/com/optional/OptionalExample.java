package com.optional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(104,"John",5000, LocalDate.parse("2021-01-01"));
        Employee employee2 = new Employee(102,"John",60000, LocalDate.parse("2022-01-01"));
        Employee employee3 = new Employee(101,"John",11000, LocalDate.parse("2023-01-01"));
        Employee employee4 = new Employee(103,"John",52000, LocalDate.parse("2024-01-01"));

        List<Employee> employeeList = new ArrayList<>(List.of(employee1,employee2,employee3,employee4));

        int sid = 102;

        Optional<Employee> optionalEmployee=employeeList.stream().filter(e->e.getId()==sid).findFirst();

        optionalEmployee.ifPresentOrElse(e-> System.out.println(e.toString()),()-> System.out.println(sid +" number employee is not present"));

        optionalEmployee.ifPresent(e->{
            int increaseSalary = (int)(e.getSalary() * 1.20);
            e.setSalary(increaseSalary);
            System.out.println("Increased Salary is : " +increaseSalary);
            System.out.println("Employees after salary increment : "+e.toString());
        });
    }
}
