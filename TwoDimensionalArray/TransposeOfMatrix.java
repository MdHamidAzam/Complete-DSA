package TwoDimensionalArray;
import java.util.Scanner;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        // Lecture program to print
        
        // Example 1 for square matrix

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter matrix element: ");
        // int[][] arr = new int[3][3];
        // int m = arr.length;
        // int n = arr[0].length;
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("The matrix is: ");
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // int[][] brr = new int[3][3];
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         brr[i][j] = arr[j][i];
        //     }
        // }
        // System.out.println("The Transpose of matrix is: ");
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(brr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // Example 2 for rows is unequal to column

        // 1 2
        // 3 4
        // 5 6

        int[][] arr = {{1, 2},{3, 4},{5, 6}};
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
    }

}
