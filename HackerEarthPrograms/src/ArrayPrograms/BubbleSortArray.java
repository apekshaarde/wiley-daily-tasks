package ArrayPrograms;

public class BubbleSortArray {
    public static void main(String[] args) {

        int[] arr = {5,1,7,2,3,8,11,22};

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Display Array : ");
        for (int val : arr){
            System.out.print(val+" ");
        }
    }
}
