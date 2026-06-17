package Assignment_04_SpecialPattern;
import java.util.Scanner;
public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*n-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;i<=n-i+1;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        
    }

}
