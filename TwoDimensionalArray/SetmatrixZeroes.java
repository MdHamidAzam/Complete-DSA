package TwoDimensionalArray;

public class SetmatrixZeroes {
    public static void print(int[][] arr){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // Method No.1 Using copy of original  array

        // int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        // int m = arr.length, n = arr[0].length;
        // print(arr);
        // int[][] helper = new int[m][n];
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         helper[i][j] = arr[i][j];
        //     }
        // }
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if(helper[i][j]==0){
        //             for(int b =0; b<n;b++)
        //             arr[i][b]=0;
        //             for(int a=0;a<m;a++)
        //             arr[a][j]=0;
        //         }
        //     }
        // }
        // print(arr);

        // Method No. 2 Using less space
        // int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // int m = arr.length, n = arr[0].length;
        // print(arr);
        // boolean[] row = new boolean[m];
        // boolean[] col = new boolean[n];
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if(arr[i][j]==0){
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }
        // for (int i = 0; i < m; i++) {
        //     if(row[i]==true){
        //         for (int j = 0; j < n; j++) {
        //             arr[i][j]=0;
        //         }
        //     }
        // }
        // for (int j = 0; j < n; j++) {
        //     if(col[j]==true){
        //         for (int i = 0; i < m; i++) {
        //             arr[i][j]=0;
        //         }
        //     }
        // }
        // print(arr);

        // Method No.3 Using constant extra space

        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = arr.length, n = arr[0].length;
        print(arr);
        boolean ZeroRow = false;
        boolean ZeroCol = false;
        for (int j = 0; j < n; j++) {
            if(arr[0][j]==0){
                ZeroRow = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if(arr[i][0]==0){
                ZeroCol = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if(arr[0][j]==0){
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if(arr[i][0]==0){
                for (int j = 1; j < n; j++) {
                    arr[i][j]=0;
                }
            }
        }
        if(ZeroRow==true){
            for (int j = 0; j < n; j++) {
                arr[0][j]=0;
            }
        }
        if(ZeroCol==true){
            for (int i = 0; i < m; i++) {
                arr[i][0]=0;
            }
        }
        print(arr);
    }

}
