package com.stack.ex;

import java.util.Arrays;

public class Stack<T> {

    private int maxSize;
    private Object[] stackArray;
    private int top;

    public Stack(int maxSize){
        this.maxSize=maxSize;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public T push(T data){
        if(isFull()){
            throw new RuntimeException("Stack is already full");
        }
        top++;
        stackArray[top]=data;
        return data;
    }

    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is already empty");
        }
        T data = (T) stackArray[top];
        top--;
        return data;
    }

    public T peek(){
        return (T) stackArray[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(maxSize-1);
    }

    public String toString() {
        return Arrays.toString(stackArray);
    }
}