package TwoDimensionalArray;
import java.util.Scanner;
public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrices element : ");
        int[][] arr = new int[3][3];
        int[][] brr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter second matrices element: ");
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] resultant = new int[3][3];
        for (int i = 0; i < resultant.length; i++) {
            for (int j = 0; j < resultant.length; j++) {
                resultant[i][j] = arr[i][j] + brr[i][j];
            }
        }
        for (int i = 0; i < resultant.length; i++) {
            for (int j = 0; j < resultant.length; j++) {
                System.out.print(resultant[i][j]+" ");
            }
            System.out.println();
        }
    }

}
