package Assignment_03_Loop;
import java.util.Scanner;
public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("The fibonacci series upto "+n+" terms is: ");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        
    }

}
