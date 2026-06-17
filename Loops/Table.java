package Loops;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The table of: ");
        int n = sc.nextInt();
        int i = 1;
            for(int j=n;j<=n*10;j++){
                if(j%n==0){
                    System.out.println(n+" X "+i+ " = " +j);
                    i++;
                }
             
            }
        }
        // for(int i=19;i<=190;i+=19){
        //     System.out.println(i);
        // }
    }


