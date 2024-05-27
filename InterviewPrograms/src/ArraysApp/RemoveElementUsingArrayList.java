package ArraysApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElementUsingArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>(size);
        System.out.println("Enter elements in an Array : ");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter index of an element : ");
        int didx = sc.nextInt();

        list.remove(didx);

        for(int i=0;i<size-1;i++){
            System.out.println(list.get(i));
        }

    }
}
