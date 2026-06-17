package Loops;
import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        // while(n!=0){
        //     int l_d = n%10;
        //     sum+=l_d;
        //     n/=10;
        // }
        // System.out.println(sum);
        
    }

}
