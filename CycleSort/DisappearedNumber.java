package CycleSort;

public class DisappearedNumber {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,7};
        int n = arr.length;
        int i = 0;
        while(i<n){
            int ele = arr[i];
            if(arr[i]==i+1 || arr[i]==arr[ele-1]) i++;
            else{
                swap(arr,ele-1,i);
            }
        }
        // List<Integer> ans = new ArrayList<>();
        // fr(i=0;i<n;i++){
        //     if(arr[i] != i+1) ans.add(i+1);
        // }
        // return ans;
    }
}
