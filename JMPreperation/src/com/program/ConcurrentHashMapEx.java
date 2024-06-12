package com.program;

import java.util.*;

public class ConcurrentHashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Apeksha");
        map.put(2,"vaishnavi");

        Map<Integer,String> syncMap = Collections.synchronizedMap(map);
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            syncMap.put(3,"Pallavi");
            iterator.next();
        }
    }
}
