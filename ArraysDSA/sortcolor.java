package ArraysDSA;

public class sortcolor {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 2, 0, 2, 1, 0 };
        int n = arr.length;
        // int NoOfZero = 0, NoOfone = 0;
        // for(int i = 0;i<n;i++){
        // if(arr[i]==0) NoOfZero++;
        // if(arr[i]==1) NoOfone++;
        // }
        // for(int i=0;i<n;i++){
        // if(i<NoOfZero) arr[i] =0;
        // else if(i<NoOfZero+NoOfone) arr[i]=1;
        // else arr[i]=2;
        // }
        // for(int ele : arr){
        // System.out.print(ele+" ");
        // }
        // Method 2 (dutch flag algorithm)
        int low = 0, mid = 0, high = n - 1;
        while (mid < high)
        if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } 
            else if (arr[mid] == 1)
                mid++;
            else { // arr[mid]==2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

}
