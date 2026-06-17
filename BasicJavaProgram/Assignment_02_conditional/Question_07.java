package Assignment_02_conditional;
import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr 1st No.: ");
        int a = sc.nextInt();
        System.out.println("Enetr 2nd No.: ");
        int b = sc.nextInt();
        System.out.println("Enetr 3rd No.: ");
        int c = sc.nextInt();

        if(a<=b){
            if(a<=c){
                System.out.println(a+" Is least");
            }
            else{
                System.out.println(c+" Is least");
            }
            
        }
        else{
            if(b<=c){
                System.out.println(b+" Is least");
            }
            else{
                System.out.println(c+" Is least");
            }

        }
    }

}
