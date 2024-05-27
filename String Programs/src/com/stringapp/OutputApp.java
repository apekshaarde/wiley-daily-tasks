package com.stringapp;

interface A{
    void hello();
}
interface TestInf{
    int i =10;
}
abstract class B implements A{

}
public class OutputApp {
    public static void main(String[] args) {
        //TestInf.i=12;
        System.out.println(TestInf.i);
    }
}
