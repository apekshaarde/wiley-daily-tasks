package com.optional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(104,"Mack",5000, LocalDate.parse("2021-01-01"));
        Employee employee2 = new Employee(102,"John",60000, LocalDate.parse("2022-01-01"));
        Employee employee3 = new Employee(101,"Jonny",11000, LocalDate.parse("2023-01-01"));
        Employee employee4 = new Employee(103,"Albert",52000, LocalDate.parse("2024-01-01"));
        Employee employee5 = new Employee(102,"Peter",60000, LocalDate.parse("2020-01-01"));

        List<Employee> employeeList = new ArrayList<>(List.of(employee1,employee2,employee3,employee4,employee5));

        int sid = 102;


        List<Employee> employees=employeeList.stream().filter(e->e.getId()==sid).collect(Collectors.toList());
        employees.forEach(v-> System.out.println(v));

        List<Employee> increaseSalaryEmployee = employeeList.stream().filter(e->e.getId()==sid).
                                                map(e->{
                                                    int increment =(int) (e.getSalary()*1.20);
                                                    e.setSalary(increment);
                                                    return e;
                                                }).collect(Collectors.toList());
        increaseSalaryEmployee.forEach(v-> System.out.println(v));

    }
}
