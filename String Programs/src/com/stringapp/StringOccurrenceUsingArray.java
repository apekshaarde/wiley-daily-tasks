package com.stringapp;

import java.util.*;

public class StringOccurrenceUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String str = sc.nextLine();

        int count;
       // char temp=' ';

        for(int i=0;i<str.length();i++){
                count = 1;
            for(int j=(i+1);j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    //j=-1;
                }
            }
            if(i != -1) {
                System.out.println(str.charAt(i) + "--->" + count);
            }
        }
    }
}
