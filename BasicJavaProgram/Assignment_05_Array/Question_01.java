package Assignment_05_Array;
import java.util.Scanner;
public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int product = 1;
        System.out.print("Enter array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            product *=arr[i];
        }
        System.out.print(product);
    }

}
