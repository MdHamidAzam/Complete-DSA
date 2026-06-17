package Assignment_05_Array;
import java.util.Scanner;
public class Question_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>largest)
            i++;
        }
        System.out.println("the largest element is: "+largest);
    }// incomplete

}
