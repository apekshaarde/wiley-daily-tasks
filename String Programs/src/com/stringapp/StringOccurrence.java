package com.stringapp;

import java.util.*;

public class StringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (Character ch: str.toCharArray()){
            Integer count = map.get(ch);

            if(count == null){
                count = new Integer(0);
            }
            count++;
            map.put(ch,count);
        }

        map.forEach((k,v)-> System.out.println(k+"------>"+v));
    }
}
