package ArraysApp;

import java.util.Scanner;

public class ArrayExampleOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();

        System.out.println("Enter elements in an Array : ");
        int arr [] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0 , prod = 1;

        for(int i=0;i<size;i++){
            sum += arr[i];
            prod *= arr[i];
        }

        System.out.println("Sum of Array Elements is : "+sum);
        System.out.println("Products of Array Elements is : "+prod);
    }
}
