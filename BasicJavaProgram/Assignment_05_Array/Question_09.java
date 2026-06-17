package Assignment_05_Array;
import java.util.Scanner;
public class Question_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sumeven = 0;
        int sumodd = 0;
        for(int i=0;i<n;i++){
            if(i%2==0)
            sumeven += arr[i];
            else 
            sumodd += arr[i];
        }
        int difference = sumeven - sumodd;
        System.out.println("Difference between the even sum indice and odd sum indices is: "+difference);
    }

}
