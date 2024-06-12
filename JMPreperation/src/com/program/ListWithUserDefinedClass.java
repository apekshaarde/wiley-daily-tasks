package com.program;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class Student{
    private int id;
    private String name;
    private int roll_no;

    public Student(int id,String name,int roll_no){
        this.id = id;
        this.name = name;
        this.roll_no = roll_no;
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

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String toString(){
        return "["+id+","+name+","+roll_no+"]";
    }
}
public class ListWithUserDefinedClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>(List.of(new Student(1,"John",102),
                                new Student(2,"Mack",102),
                                new Student(3,"Albert",100),
                                new Student(4,"Jonny",201)));

        System.out.println("Enter name to delete student : ");
        String name = sc.nextLine();

        boolean b = list.removeIf(v->v.getName().equals(name));
        if(b){
            System.out.println("Removed Successfully");
        }else{
            System.out.println("Not Found");
        }
        list.stream().filter(v->v.getName().equals(name)).forEach(System.out::println);
//        list.removeIf(v->v.getName().equals(name));
//
//        for (int i=0;i<list.size();i++){
//            if(list.get(i).getName().equals(name)){
//                list.remove(i);
//            }
//        }
        boolean flag = false;
        for (Student s : list){
            if(s.getName().equals(name)){
                flag = true;
                System.out.println(s);
            }
        }
        if(!flag){
            System.out.println("User not found");
        }

        //list.forEach(System.out::println);

        Predicate<Student> p = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                if(student.getName().equals(name)){
                    return true;
                }
                return false;
            }
        };
        Student s = new Student(5,"Apeksha",1000);
        b = p.test(s);
        if(b){
            System.out.println(s);
        }else {
            System.out.println("Not Found");
        }

    }
}
