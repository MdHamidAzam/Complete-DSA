package Loops;
import java.util.Scanner;
public class Compositenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // int x = 0;
        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0){
        //         System.out.println("Composite No.");
        //         x = 1;
        //         break;
        //     }
            
        // }
        // if(n==1){
        //     System.out.println("Not composite nor Prime");
        // }
        // if(x==0){
        //     System.out.println("Prime No.");
        // }
        int x = 0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("Composite No.");
                x = 1;
                break;
            }
        }
        if(n==1){
            System.out.println("Not composite nor prime");
        }
        if(x==0){
            System.out.println("Prime no.");
        }
    }

}
