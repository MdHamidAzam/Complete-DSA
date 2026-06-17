package Assignment_05_Array;
import java.util.Scanner;
public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smallestmissing = 1;
        for(int i=0;i<n;i++){
            if(arr[i]==smallestmissing)
            smallestmissing++;
        }
        System.out.println("The smallestmissing element is: "+smallestmissing);
    }

}
