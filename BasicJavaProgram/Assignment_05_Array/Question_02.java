package Assignment_05_Array;
import java.util.Scanner;

import ArraysDSA.sortcolor;
public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Element: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = 0;
        int secmax = 1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest)
            secmax = arr[i];
            break;
        }
        System.out.println(secmax);
    }

}
