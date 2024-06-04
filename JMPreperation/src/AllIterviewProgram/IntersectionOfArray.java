package AllIterviewProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArray {
    public static void main(String[] args) {

        int arr1[] = {7, 1, 5, 2, 3, 6,3};
        int[] arr2 = {3, 8, 6, 20, 7};

        Map<Integer, Integer> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // Count the elements in arr1
        for (int i = 0; i < arr1.length; i++) {
            if (map1.containsKey(arr1[i])) {
                map1.put(arr1[i], map1.get(arr1[i]) + 1);
            } else {
                map1.put(arr1[i], 1);
            }
        }

        // Find the intersection elements and manage their counts
        for (int i = 0; i < arr2.length; i++) {
            if (map1.containsKey(arr2[i])) {
                list.add(arr2[i]);
                map1.put(arr2[i], map1.get(arr2[i]) - 1);
                if (map1.get(arr2[i]) == 0) {
                    map1.remove(arr2[i]);
                }
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        for (int arr : result) {
            System.out.print(arr + " ");
        }
    }
}
