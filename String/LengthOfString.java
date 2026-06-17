package String;
import java.util.*;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        System.out.println(str);
        System.out.println(str.length());
    }
}
