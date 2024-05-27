package ArraysApp;

import java.util.Scanner;

public class FindFactorialAndCountTraillingZeroes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Find Factorial : ");
        int number = sc.nextInt();


        long factorial = getFactorial(number);
        System.out.println("Factorial of entered Number is : "+factorial);

        int count = countTraillingZeros(factorial);
        System.out.println("Count of Trailling Zeroes from Factorial "+factorial+" is : "+count);

    }

    public static long getFactorial(int n){
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static int countTraillingZeros(long number){
        int count = 0;
        while (number % 10 == 0){
            count++;
            number /= 10;
        }
        return count;
    }
}
