package Conditionls;
import java.util.Scanner;
public class Homework_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(n>9999 && n<100000){
            System.out.println("It is five digit N0.");
        }
        else{
            System.out.println("It is not five digit N0.");
        }
    }

}
