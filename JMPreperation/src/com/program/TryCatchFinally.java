package com.program;

public class TryCatchFinally
{
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("Addition is : "+c);
        }finally {
            System.out.println("I am finally block");
        }
    }
}
