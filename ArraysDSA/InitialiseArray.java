package ArraysDSA;

import java.util.Scanner;

public class InitialiseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {20,30,40,50,60,70,80,90,11,12,13,14,15};
        int n = arr.length;
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
