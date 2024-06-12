package com.program;

public class CheckPalindrome {
    public static void main(String[] args) {

        String str = "abc";//abc
        boolean b =isPalindrome(str);
        if(b){
            System.out.println("String is Palindrome");
        }else{
            String res = makePalindrome(str);
            System.out.println("String after making palindrome : "+res);
        }
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String makePalindrome(String str){
        int left = 0;
        int len = str.length();


        for (int i = 0; i < len; i++) {
            if (isPalindrome(str.substring(i))) {
                StringBuilder sb = new StringBuilder(str.substring(0, i));
                return str + sb.reverse().toString();
            }
        }

        // This will never be reached because the loop always returns a result
        return str;
    }
}
