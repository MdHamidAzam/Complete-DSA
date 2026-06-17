package Recursion;
import java.util.Scanner;
public class MazePath {
    public static int maze(int rows, int col, int m, int n){
        if(rows==m || col==n) return 1;
        int rightways = maze(rows,col+1,m,n);
        int downways = maze(rows+1,col,m,n);
        return rightways + downways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int m = sc.nextInt();
        System.out.println("Enter column: ");
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}
