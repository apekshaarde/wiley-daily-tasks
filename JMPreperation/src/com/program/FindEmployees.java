package com.program;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && sal == employee.sal && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sal);
    }

    public void setSal(int sal) {
        this.sal = sal;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
public class FindEmployees {
    public static void main(String[] args) {
            List<Employee> list = new ArrayList<>(List.of(new Employee(101,"John",10000),
                    new Employee(102,"Albert",10000),
                    new Employee(103,"Manasi",20000),
                    new Employee(102,"Albert",10000),
                    new Employee(103,"Manasi",20000)));
            List<Employee> result = list.stream().filter(t->t.getSal()>10000).collect(Collectors.toList());
            result.forEach(System.out::println);



        System.out.println("Non repeating");

        List<Employee> nonRepeating = list.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        nonRepeating.forEach(System.out::println);
    }
}
