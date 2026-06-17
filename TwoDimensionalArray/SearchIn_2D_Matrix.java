package TwoDimensionalArray;

public class SearchIn_2D_Matrix {
    public static void print(int[][] arr){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m = arr.length, n = arr[0].length;
        print(arr);
        int i = 0, j = n-1;
        int target = 25;
        boolean found = false;
        while(i<m && j>=0){
            if(arr[i][j]==target){
                System.out.println("Element found: "+target);
                found = true;
                break;
            }
            else if(arr[i][j]>target) j--;
            else i++;
        }
        if(!found)  System.out.println("Element not found");
    
    }
}
