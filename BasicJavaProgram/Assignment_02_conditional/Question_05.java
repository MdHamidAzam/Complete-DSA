package Assignment_02_conditional;
import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No.: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd No.: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd No.: ");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+" Is greater");
        }
        else if(b>=a && b>=c){
            System.out.println(b+" Is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
        
    }

}
