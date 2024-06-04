package com.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueOccurence {
    public static void main(String[] args) {
        String str = "lovellll";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        //map.forEach((k,v)-> System.out.println(k+"---->"+v));

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+"--->"+entry.getValue());
            }
        }
}
