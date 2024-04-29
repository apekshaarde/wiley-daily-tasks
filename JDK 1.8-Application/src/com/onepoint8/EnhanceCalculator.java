package com.onepoint8;

public class EnhanceCalculator {

    static int calculate(int a, int b, DigitalCalculator digitalCalculator){
        return digitalCalculator.operate(a,b);
    }

    public static void main(String[] args) {

            var add = calculate(5,9,(a,b)-> a + b);
            System.out.println("Addition is : "+add);

            var sub = calculate(10,5 , (a,b)-> a-b);
            System.out.println("Subtraction is : "+sub);

            var multiply = calculate(5,4,(a,b)->a*b);
            System.out.println("Multiplication is : "+multiply);

            var division = calculate(1000,500 ,(a,b)-> a/b);
            System.out.println("Division is : "+division);

            var power = calculate(2,3,(a,b)-> (int)Math.pow(a,b));
            System.out.println("Power of Numbers is : "+power);
    }
}

interface DigitalCalculator{
    int operate(int a,int b);
}
