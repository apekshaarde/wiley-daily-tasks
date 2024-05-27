package ArraysApp;

public class ArraySumSameAsInput {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int res[] = getNums(arr,9);
        for(int num : res){
            System.out.print(num+" ");
        }

    }

    public static int[] getNums(int[] arr,int sum){

        for(int i=0;i<arr.length;i++){
            for(int j=(i+1);j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return null;
    }
}
