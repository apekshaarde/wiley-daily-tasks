package com.program;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        String res = getReverse(str);
        System.out.println("Reversed String is : "+res);
    }
    public static String getReverse(String str){
        String reverse = "";

        for (int i=str.length()-1;i>=0;i--){
            reverse+= str.charAt(i);
        }
        return reverse;
    }
}
