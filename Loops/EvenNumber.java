package Loops;
import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=2;i<=n;i+=2){
            System.out.print(" "+i);
        }
        System.out.println();
        // Odd
        for(int i=1;i<=n;i+=2){
            System.out.print(" "+i);
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            // if(i%2==0){
            //     System.out.print(" "+i);
            // }
            if(i%2==1){
                System.out.print(" "+i);
            }
            if(i%3==0 || i%5==0){
                System.out.print(" "+i);
            }
            if(i%3==0 && i%5==0){
                System.out.print(" "+i);
            }
        }
    }

}
