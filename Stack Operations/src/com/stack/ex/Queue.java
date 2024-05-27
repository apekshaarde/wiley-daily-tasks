package com.stack.ex;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int maxSize;
    //private Object[] queueArray;

    private List<Object> queueArray;
    private int rear;
    private int front;

    public Queue(int maxSize){
        this.maxSize = maxSize;
        queueArray = new ArrayList<>(maxSize);
        front = 0;
        rear = -1;
    }

    public void insert(T item){
        if(isFull()){
            throw new RuntimeException("Queue is already Full");
        }
//        rear++;
//        queueArray[rear] = item;

        queueArray.add(item);
    }

    public T remove(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
//        T item = (T) queueArray[front];
//        front++;

        T item = (T) queueArray.remove(front);
        return  item;
    }

    public T peek(){
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
//        return (T) queueArray[front];
        return (T) queueArray.get(front);
    }

    public boolean isEmpty(){
//        return (front>rear);
        return queueArray.isEmpty();
    }

    public boolean isFull(){
//        return (rear==maxSize - 1);

        return queueArray.size() == maxSize;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = front; i <= rear; i++) {
            stringBuilder.append(queueArray.get(i));
            if (i < rear) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
