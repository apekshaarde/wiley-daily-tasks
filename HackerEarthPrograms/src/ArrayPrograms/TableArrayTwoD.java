package ArrayPrograms;

import java.util.Scanner;

public class TableArrayTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][]arr = new int[2][6];

        System.out.println("Enter Array Elements : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Display Table : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
