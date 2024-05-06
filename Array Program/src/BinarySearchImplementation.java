import java.util.Scanner;

public class BinarySearchImplementation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []A = {1,4,7,12,34,56,78,80,85};

        System.out.println("Enter value to Search : ");
        int sVal = sc.nextInt();

        int result = binarySearch(A, sVal);
        if(result!=-1){
            System.out.println(sVal +" is present at "+A[result]+" index");
        }else{
            System.out.println("Element is not present");
        }

    }

    public static int binarySearch(int A[], int x){
        int p = 0, r = (A.length-1);

        while (p <= r){
            int q = p + (r - p)/2;

            if(A[q] == x)
                return q;
            else if (A[q] < x)
                p = q+1;
            else
                r = q-1;

        }
        return -1;
    }
}
