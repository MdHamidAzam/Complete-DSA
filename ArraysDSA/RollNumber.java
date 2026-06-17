package ArraysDSA;

import java.util.Scanner;

public class RollNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter marks of n students: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The Roll No. is: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] < 60) {
                System.out.print(i + " and ");
            }
        }
    }

}
