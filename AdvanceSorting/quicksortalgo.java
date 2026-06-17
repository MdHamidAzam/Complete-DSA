package AdvanceSorting;

public class quicksortalgo {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low], pivotIdx = low;
        int smallerCount = 0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = pivotIdx + smallerCount;
        swap(arr,pivotIdx,correctIdx);

        int i = low, j = high;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low>=high) return;
        // pivot arr[low] ko shi jagah rkha
        // & left part me <=pivot
        int Idx = partition(arr,low,high);
        quickSort(arr,low,Idx-1);
        quickSort(arr,Idx+1,high);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        int n = arr.length;
        print(arr);
        quickSort(arr,0,n-1);
        print(arr);
    }
}
// jb bhi problem ho isme phr se ek baar lecture dekh lena