package ArraysDSA;

import java.util.ArrayList;

public class BasicofArraylist {
    public static void main(String[] args) {
        // int[] arr = new int[6];
        // double[] brr = {5,6,3,6,8,9};
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);
        System.out.println("Array size is: " + arr.size());
        // System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            arr.set(2, 300);
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.add(90);// piche se aakar chipak jaayega
        System.out.println("Array size is: " + arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        // int[] arr =// new int[5];
        // for(int ele :// arr){
        // System.out//.print(ele+" ");
        // }
    }

}
