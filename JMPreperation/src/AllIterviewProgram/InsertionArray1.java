package AllIterviewProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsertionArray1 {
    public static void main(String[] args) {

        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i] , map.get(arr1[i]) + 1);
            }else{
                map.put(arr1[i] , 1);
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                list.add(arr2[i]);
                map.put(arr2[i],map.get(arr2[i])-1);
                if( map.get(arr2[i]) == 0)
                map.remove(arr2[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i] = list.get(i);
        }

        System.out.println("Print Intersection of Array : ");
        for(int arr : result){
            System.out.print(arr+" ");
        }
    }
}
