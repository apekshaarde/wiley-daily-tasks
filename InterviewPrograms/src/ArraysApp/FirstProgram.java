package ArraysApp;

public class FirstProgram {
    public static void main(String[] args) {

        int[] arr = {1,-1,3,-2,-3,4,-5,6};

        rearrangeArray(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    public static void rearrangeArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left<right){

            while(left<right && arr[left]>=0){
                left++;
            }

            while(left<right && arr[right]<=0){
                right--;
            }

            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}
