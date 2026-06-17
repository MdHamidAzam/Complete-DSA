package String;
import java.util.Scanner;
public class InputStringBuilder {
    public static void main(String[] args) {
        // Method No. --> 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter String: ");
        // String str = sc.nextLine();
        // StringBuilder sb = new StringBuilder(str);
        // System.out.println(sb);
        // Method No.--> 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'a');
        System.out.println(sb);
    }
}
