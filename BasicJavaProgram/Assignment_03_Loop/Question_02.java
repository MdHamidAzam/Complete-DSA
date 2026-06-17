package Assignment_03_Loop;
import java.util.Scanner;
public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The table of: ");
        int n = sc.nextInt();
        int i = 1;
        for(int j=n;j<=n*10;j++){
            if(j%n==0){
                System.out.println(n+" X "+i+" = "+j);
                i++;
            }
        }
    }
    // jyada variable lene se behtr hai ye
    // for (int i = 1; i <= 10; i++) {
    //     System.out.println(n + " X " + i + " = " + (n * i));
    // }

}
