package TwoDimensionalArray;
import java.util.Scanner;

public class InputANDOutputOf_2_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int[][] arr = new int[3][3];

        // Input of 2 - Dimensional Array

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Output of 2 - Dimensional Array

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
