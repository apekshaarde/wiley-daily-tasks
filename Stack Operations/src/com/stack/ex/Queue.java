package com.stack.ex;

public class Queue<T> {
    private int maxSize;
    private Object[] queueArray;
    private int rear;
    private int front;

    public Queue(int maxSize){
        this.maxSize = maxSize;
        queueArray = new Object[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(T item){
        if(isFull()){
            throw new RuntimeException("Queue is already Full");
        }
        rear++;
        queueArray[rear] = item;
    }

    public T remove(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        T item = (T) queueArray[front];
        front++;
        return  item;
    }

    public T peek(){
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return (T) queueArray[front];
    }

    public boolean isEmpty(){
        return (front>rear);
    }

    public boolean isFull(){
        return (rear==maxSize - 1);
    }
}
