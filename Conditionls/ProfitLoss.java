package Conditionls;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cp: ");
        int cp = sc.nextInt();
        System.out.println("Enter sp: ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Profit is: "+(sp-cp));
        }
        else{
            System.out.println("Loss is: "+(cp-sp));
        }
    }

}
