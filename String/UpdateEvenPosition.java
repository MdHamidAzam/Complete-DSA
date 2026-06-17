package String;

import java.util.*;

public class UpdateEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String str1 = "";
        // System.out.println(str1);
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                str1 += 'a';
            }
            else {
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
