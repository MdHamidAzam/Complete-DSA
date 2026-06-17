package ArraysDSA;

import java.util.Arrays;

public class BuiltinMethod {
    public static void main(String[] args) {
        int[] arr = { 30, 10, 40, 23, 89, 34 };
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }
        // for each loop
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
