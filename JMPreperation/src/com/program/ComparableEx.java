package com.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp implements Comparable<Emp>{
    private int id;
    private String name;
    private int salary;

    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emp e) {
        if(this.name.compareTo(e.getName())>0){
            return 1;
        }else if(this.name.compareTo(e.getName())<0){
            return -1;
        }else {
            return 0;
        }
    }
}

class SortBySalary implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        if(o1.getSalary()>o2.getSalary()){
            return 1;
        } else if (o1.getSalary()<o2.getSalary()) {
            return -1;
        }else {
            return 0;
        }
    }
}

class SortByName implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        if(o1.getName().compareTo(o2.getName())>1){
            return 1;
        } else if (o1.getName().compareTo(o2.getName())<1) {
            return -1;
        }else{
            return 0;
        }
    }
}
public class ComparableEx {
    public static void main(String[] args) {
        List<Emp> list  = new ArrayList<>(List.of(new Emp(1,"Zaid",45000),
                new Emp(2,"Mack",78000),
                new Emp(3,"John",34000),
                new Emp(4,"Apeksha",89000)));

        Collections.sort(list);

        System.out.println("List after Sorting by name : ");
        list.forEach(System.out::println);

        System.out.println("Sorting using comparator : ");
        Collections.sort(list,(t1,t2)->t1.getSalary() - t2.getSalary());
        list.forEach(System.out::println);

        System.out.println("Sorting using comparator by Name : ");
        Collections.sort(list,(t1,t2)->t1.getName().compareTo(t2.getName()));
        list.forEach(System.out::println);

        System.out.println("Sort By Name Again: ");
        SortByName nameList = new SortByName();
        Collections.sort(list,nameList);
        list.forEach(System.out::println);

        System.out.println("Sort by Salary : ");
        SortBySalary salary = new SortBySalary();
        Collections.sort(list,salary);
        list.forEach(System.out::println);

    }
}
