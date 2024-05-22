package ArrayPrograms;

public class FindMissingElements {
    public static void main(String[] args) {
        int s=7;
        int []arr = {4,1,2};
        int res[] = getMissingNumber(s,arr);
        for(int val : res){
            System.out.print(val+" ");
        }
    }

    public static int[] getMissingNumber(int n,int arr[]){
        int result = n*(n+1)/2;
        int array_sum = 0;
        for(int i=0;i<n-1;i++){
            array_sum += arr[i];
            result -= array_sum;
        }

        return new int[]{result};
    }
}
