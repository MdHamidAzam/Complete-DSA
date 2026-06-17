package Conditionls;
import java.util.Scanner;
public class Homework_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        int a = l*b;
        System.out.println("The area of rectangle is: "+a);
        int p = 2*(l+b);
        System.out.println("The perimeter of rectangle is: "+p);
        if(a>p){
            System.out.println("Area is greater");
        }
        else{
            System.out.println("Perimeter is greater");
        }
    }

}
