package TwoDimensionalArray;

public class BasicDeclareOf_2_D_Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        // 10  20  30
        // 40  50  60
        // 70  80  90
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;// Agar hum in sabhi ko comment krde to null matril print hogi
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }

}
