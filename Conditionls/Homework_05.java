package Conditionls;
import java.util.Scanner;

public class Homework_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();  
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = sc.nextInt();
        if(a<=b && b<=c){
            System.out.println(a+" Is least");
        }
        else if(b<=a && b<=c){
            System.out.println(b+" Is least");
        }
        else{
            System.out.println(c+" Is least");
        }
    }

}
