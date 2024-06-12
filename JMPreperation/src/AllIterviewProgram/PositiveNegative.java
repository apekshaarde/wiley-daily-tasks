package AllIterviewProgram;

public class PositiveNegative {
    public static void main(String[] args) {
        int arr[] = {1,-2,-7,4,-1,5,-2,3,0,9};

        int left = 0;
        int right = 1;

        while (right < arr.length){
            if(arr[left] >= 0 ){
                left++;
                right++;
            }else if (arr[right] < 0 ){
                right++;
            }else{
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }

        System.out.println("Array After Rotating : ");
        for(int result : arr){
            System.out.print(result+" ");
        }
    }
}
