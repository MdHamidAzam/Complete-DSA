package Assignment_05_Array;
import java.util.Scanner;
public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Element: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        int count = 0;
        for(int num :arr){
            if(num>x){
                count++;
            }
        }
        System.out.println("The number strictly greater than "+x+" is "+count);
    }

}
