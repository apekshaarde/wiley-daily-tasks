package com.linkedlist;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) throws Exception {

        SinglyLinkedList list = new SinglyLinkedList();

        LinkedList<Integer> list1 = new LinkedList<>();


        list.insertLast(10);
        list.insertLast(50);
        list.insertLast(20);
        list.insertLast(30);
        list.insertFirst(70);
        list.insertFirst(100);

//        list.removeFirst();
//        list.removeFirst();
        list.displayList();
    }
}