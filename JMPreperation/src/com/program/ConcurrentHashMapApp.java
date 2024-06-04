package com.program;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class MapHelper1 implements Runnable{
    Map<String,Integer> map;

    public MapHelper1(Map<String,Integer> map){
        this.map = map;
        new Thread(this,"MapHelper").start();
    }

    public void run(){
        map.put("One",1);
        try {
            System.out.println("Sleeping for some time : ");
            Thread.sleep(1000);
        }catch (Exception ex){
            System.out.println("Exception is : "+ex);
        }
    }
}

class MapHelper2 implements Runnable{
    Map<String,Integer> map;

    public MapHelper2(Map<String,Integer> map){
        this.map = map;
        new Thread(this,"MapHelper2").start();
    }

    public void run(){
        map.put("Two",2);
        try{
            System.out.println("MapHelper2 sleeping");
            Thread.sleep(1000);
        }catch(Exception ex){
            System.out.println("Exception is : "+ex);
        }
    }
}

class MapHelper3 implements Runnable{
    Map<String,Integer> map;
    public MapHelper3(Map<String,Integer> map){
        this.map = map;
        new Thread(this,"MapHelper3").start();
    }

    public void run(){
        map.put("Three",3);
        try {
            System.out.println("MapHelper3 sleeping ");
            Thread.sleep(1000);
        }catch(Exception ex){
            System.out.println("Exception is : "+ex);
        }
    }
}
public class ConcurrentHashMapApp {
    public static void main(String[] args) {
        Map<String,Integer> map = new ConcurrentHashMap<>();
        //Map<String,Integer> syncMap = Collections.synchronizedMap(map);


        MapHelper1 mh1 = new MapHelper1(map);
        MapHelper2 mh2 = new MapHelper2(map);
        MapHelper3 mh3 = new MapHelper3(map);
        //MapHelper1 mh1 = new MapHelper1(syncMap);
        //MapHelper2 mh2 = new MapHelper2(syncMap);
        //MapHelper3 mh3 = new MapHelper3(syncMap);
//        MapHelper mh4 = new MapHelper(syncMap);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }
    }
}
