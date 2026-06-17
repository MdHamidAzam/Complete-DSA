package ArraysDSA;

import java.util.Arrays;

public class CopyOfArray {
    // lecture array list in java
    public static void main(String[] args) {
        int[] arr = { 30, 10, 40, 23, 89, 34 };
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // int[] nums = arr; // shallow copy means shi se copy nhi hua hai
        // nums[0] = 70;
        // System.out.println(arr[0]);

        // deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 70;
        System.out.println(arr[0] + " ");
    }

}
