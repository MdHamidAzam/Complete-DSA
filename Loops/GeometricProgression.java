package Loops;
import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of term: ");
        int n = sc.nextInt();
        int a = 1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a*=2;
        }
    }

}
