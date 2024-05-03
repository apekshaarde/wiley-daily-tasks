package com.stack.ex;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>(5);

        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);

        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Removed: " + myQueue.remove());
        System.out.println("Peek: " + myQueue.peek());

       // System.out.println(myQueue);

        Queue<String> stringQueue = new Queue<>(5);
        stringQueue.insert("John");
        stringQueue.insert("Peter");
        stringQueue.insert("Mack");

        System.out.println("Peek: " + stringQueue.peek());
        System.out.println("Removed: " + stringQueue.remove());
        System.out.println("Peek: " + stringQueue.peek());
    }
}