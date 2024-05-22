package com.sg.foundations.flowcontrol.arrays;

public class PrintPositiveFromArray {
    public static void main(String[] args) {
        int[] numbers = { 389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278, -219, 799, -311};

        for (int positive : numbers){
            if(positive > 0){
                System.out.println(positive);
            }
        }
    }
}
