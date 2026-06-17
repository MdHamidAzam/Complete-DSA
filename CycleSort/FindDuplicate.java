package CycleSort;

public class FindDuplicate {
    public static void swap(int j, int i, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int duplicate(int[] arr){
        while(true){
            int ele = arr[0];
            if(arr[ele]==ele) return ele;
            swap(0,ele,arr);
    }
}
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int n = arr.length;
        print(arr);
        duplicate(arr);
        print(arr);
        return;
    }
}

