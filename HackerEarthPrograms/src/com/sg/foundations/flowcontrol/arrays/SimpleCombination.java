package com.sg.foundations.flowcontrol.arrays;

public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];

        for(int i=0;i<firstHalf.length;i++){
            wholeNumbers[i] = firstHalf[i];
        }
        for (int i=0;i<secondHalf.length;i++){
            wholeNumbers[i+firstHalf.length] = secondHalf[i];
        }

        System.out.println("Display Combined Array : ");
        for (int val : wholeNumbers){
            System.out.print(val+" ");
        }
    }
}
