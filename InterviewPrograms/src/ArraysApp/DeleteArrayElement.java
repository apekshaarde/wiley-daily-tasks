package ArraysApp;

import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of an Array : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter index of an Element to delete : ");
        int dIdx = scanner.nextInt();

        for(int i = dIdx;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;

        System.out.println("Array elements after Deletion : ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
