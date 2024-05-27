import java.util.Arrays;

public class QuickSortImplementation
{
    public static void main(String[] args) {
        int[] A = {7, 2, 1, 6, 8, 5, 3, 4};
        System.out.println("Array Before Sorting : ");
        for (int Arr  : A){
            System.out.print(Arr+" ");
        }
        quickSort(A);
        System.out.println("\nArray After Sorting : ");
        for (int Arr  : A){
            System.out.print(Arr+" ");
        }

    }

    public static void quickSort(int []A){
            quickSort(A, 0, A.length-1);
    }

    private static void quickSort(int A[], int p, int r){
        if(p<r){
            int pivot = partition(A, p, r);
            quickSort(A, p, pivot-1);
            quickSort(A, pivot + 1, r);
        }
    }

    private static int partition(int []A,int p, int r){
        int pivot = A[r];
        int i = p - 1;

        for(int j = p; j<r; j++){
            if(A[j] < pivot){
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i+1, r);
        return i+1;
    }
    private static void swap(int A[], int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
