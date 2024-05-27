package com.stringapp;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();

        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}
