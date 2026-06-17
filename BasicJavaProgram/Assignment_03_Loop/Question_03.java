package Assignment_03_Loop;
import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        int gcd = 1;
        for (int i=1;i<=b;i++) {
            if (a%i==0 && b%i==0) {
                gcd = i;
            }
        }
        System.out.println("The GCD of " +a+ " and " +b+ " is: " +gcd);
        sc.close();
    }
}

