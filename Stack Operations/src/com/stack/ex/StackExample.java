package com.stack.ex;

public class StackExample {
    public static void main(String[] args) {

//        java.util.Stack<Integer> stack = new java.util.Stack<>();
//        System.out.println(stack.push(1));

        Stack<Object> myStack = new Stack<>(10);
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

        if(myStack!=null){
            System.out.println(myStack);
        }

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println("==Stack Data after POP Operation===");
        if(!myStack.isEmpty()){
            System.out.println(myStack);
        }

        System.out.println("Peek element of Stack is : "+myStack.peek());


//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }


    }

}