package com.program;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        for (Object obj : list){
            if((int)obj == 300){
                list.remove(obj);
            }
        }
        System.out.println(list);
    }
}
