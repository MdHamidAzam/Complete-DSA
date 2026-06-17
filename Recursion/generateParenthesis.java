package Recursion;
import java.util.Scanner;
public class generateParenthesis {
    public static void Parenthesis(int open, int close, int n, String s){
        if(s.length()==2*n){
            System.out.print(s+" ");
            return;
        }
        if(open<n) Parenthesis(open+1,close,n,s+"(");
        if(close<open) Parenthesis(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        Parenthesis(0,0,n,"");
    }
}
