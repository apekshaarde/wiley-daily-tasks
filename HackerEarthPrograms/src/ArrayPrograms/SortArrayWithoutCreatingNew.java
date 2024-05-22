package ArrayPrograms;

import java.util.Scanner;

public class SortArrayWithoutCreatingNew {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size of an Array : ");
        int size = scanner.nextInt();

        int []arr = {2,0,1,0,2,1,2};

        int res[] = sortArray(size,arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    public static int[] sortArray(int n,int arr[]){

        int left = 0;
        int right = n-1;

        int i=0;

        while(i<=right){
            if (arr[i] == 2) {
                arr[i] = arr[right];
                arr[right] = 2;
                right--;
            }
            else if(arr[i] == 1){
                i++;
            }
            else {
                arr[i] =arr[left];
                arr[left] = 0;
                left++;
                i++;
            }
        }
        return arr;
    }
}
