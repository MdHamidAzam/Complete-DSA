package BinarySerach;

public class upperbound {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140};
        int n = arr.length;
        int target = 50;
        int ub = n;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>target){
                ub = Math.min(mid,ub);
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(ub);
    }
    
}
