package ArraysDSA;
import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,1,1,1,0,1};
        System.out.println(arr.length);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

}
