package ArraysDSA;

import java.util.Scanner;

public class SecMaxinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter array element: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max element is: " + max);
        int secmax = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
        }
        System.out.println("The secmax element is: " + secmax);
    }

}
