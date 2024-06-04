package com.program;


public class FindPhoneNumber {
    public static void main(String[] args) {
        int n = 98765432;
        findPhoneNumber(n);
    }

    public static void findPhoneNumber(int n){
        int temp = n;
        int sum = 0;

        while(temp!=0){
            sum += temp%10;
            temp /=10;
        }

        if(sum<10){
            System.out.println(n+"0"+sum);
        }else{
            System.out.println(n+""+sum);
        }
    }
}
