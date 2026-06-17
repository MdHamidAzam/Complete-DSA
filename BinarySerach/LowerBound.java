package BinarySerach;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,89,91,97,97,140};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int lb = n;
        int target = 40;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb, mid);
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(lb);
    }
    
}
