package com.program;

import java.util.Arrays;

public class FindMobileNumberStream {
    public static void main(String[] args) {
        int n =98765432;
        findNumber(n);
    }
    public static void findNumber(int n){
        String numString = Integer.toString(n);

        int sum = Arrays.stream(numString.split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        String fullPhoneNumber = sum<10 ? numString+"0"+sum:numString+sum;
        System.out.println("Number is : "+fullPhoneNumber);

    }
}
