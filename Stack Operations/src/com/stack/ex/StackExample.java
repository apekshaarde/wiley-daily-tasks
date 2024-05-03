package com.stack.ex;

import java.util.Scanner;

public class StackExample {
    public static void main(String[] args) {

        Stack<Object> myStack = new Stack<>(10);
        Scanner sc = new Scanner(System.in);

//        java.util.Stack<Integer> stack = new java.util.Stack<>();
//        System.out.println(stack.push(1));


//        System.out.println("===All Data Of Stack is===");
//        if(myStack!=null){
//            System.out.println(myStack);
    //
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//
//        System.out.println("==Stack Data after POP Operation===");
//        if(!myStack.isEmpty()){
//            System.out.println(myStack);
//        }
//
//        System.out.println("Peek element of Stack is : "+myStack.peek());


//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        do {
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.PEEK");
            System.out.println("4.View Stack Data : ");
            System.out.println("5.Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    myStack.push(2);
                    myStack.push(5);
                    myStack.push("John");
                    myStack.push(45.5f);
                    myStack.push(true);
                    myStack.push("Hello");
                    myStack.push("Rakesh");
                    myStack.push('u');
                    myStack.push(127);
                    myStack.push(22.44f);
                    if (myStack != null) {
                        System.out.println("data pushed into stack");
                    } else {
                        System.out.println("not pushed");
                    }
                    break;
                case 2:
                    Object obj = myStack.pop();
                    if (obj != null) {
                        System.out.println(obj + "removed from stack");
                    }
                    break;
                case 3:
                    obj = myStack.peek();
                    if (obj != null) {
                        System.out.println(obj + " is peek element of stack");
                    }
                    break;
                case 4:
                    System.out.println("===All Data Of Stack is===");
                    if (myStack != null) {
                        System.out.println(myStack);
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(true);
    }
}