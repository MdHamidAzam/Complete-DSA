package Assignment_02_conditional;
import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd side: ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (a+c)>b){
            if(a==b && c==a){
                System.out.println("Equilateral Triangle");
            }
            else if(a==b || b==c || c==a){
                System.out.println("Isosceles Triangle");
            }
            else{
                System.out.println("Scalene Triangle");
            }
        }
        else{
            System.out.println("Not a valid triangle");
        }
    }

}
