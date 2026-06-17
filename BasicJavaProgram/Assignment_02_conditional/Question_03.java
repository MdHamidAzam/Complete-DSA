package Assignment_02_conditional;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling price: ");
        int sp = sc.nextInt();
        System.out.println("Enter Cost price: ");
        int cp = sc.nextInt();
        if(sp>cp){
            System.out.println("Profit is: "+(sp-cp));
        }
        else if(cp>sp){
            System.out.println("Loss is: "+(cp-sp));
        }
        else{
            System.out.println("Break Even: "+(sp=cp));
        }
    }

}
