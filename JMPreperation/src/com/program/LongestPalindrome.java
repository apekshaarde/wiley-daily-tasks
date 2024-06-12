package com.program;

public class LongestPalindrome {
    public static void main(String[] args) {
        String [] ch = new String[]{"o","l","l","e","H"};
        getPalindrome(ch);
        for(String str : ch){
            System.out.print(str);
        }
    }
    public static void  getPalindrome(String[] str){

        for(int i=0;i<str.length/2;i++){
            String temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length-i-1] = temp;
        }
    }
}
