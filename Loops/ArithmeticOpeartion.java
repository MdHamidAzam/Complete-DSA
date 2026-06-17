package Loops;
import java.util.Scanner;

public class ArithmeticOpeartion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number of terms: ");
        int n = sc.nextInt();
        // 1,3,5,6,7,9,....
        for(int i=1;i<=2*n-1;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        // 4,7,10,13,16,19,....
        for(int i=4;i<=3*n+1;i+=3){
            System.out.print(i+" ");
        }
        System.out.println();
        // 4,7,10,13,16,19,....
        int a = 4, d = 3;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=d;
        }
    }

}
