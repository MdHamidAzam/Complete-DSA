package ArraysDSA;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        // int[] arr = {45,65,23,32,44};
        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum +=arr[i];
        // }
        // System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array: ");
        // int n = sc.nextInt();
        int[] arr = new int[4];
        int sum = 0;
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The sum is: ");
        for(int i=0;i<4;i++){
            sum += arr[i];
        }
        System.out.print(sum);

    }

}
