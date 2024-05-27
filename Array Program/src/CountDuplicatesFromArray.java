import java.util.Scanner;

public class CountDuplicatesFromArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr1[] = {2,5,3,6,7};
        int arr2[] = {4,2,6,9,8};

        int duplicates = countDuplicates(arr1,arr2);
        if(duplicates>0){
            System.out.println("Count of Duplicates : "+duplicates);
        }else {
            System.out.println("No duplicates are present");
        }

    }
    public static int countDuplicates(int arr1[],int arr2[]){
        int count =0;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
