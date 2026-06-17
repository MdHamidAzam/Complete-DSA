package Assignment_02_conditional;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println(-n);
        }
        else{
            System.out.println(n);
        }

    }

}
