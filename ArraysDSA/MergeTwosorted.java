package ArraysDSA;

public class MergeTwosorted {
    public static void main(String[] args) {
        int[] a = { 11, 22, 33, 44, 55, 66 };
        int m = a.length;
        int[] b = { 12, 24, 36, 48, 60, 72 };
        int n = b.length;
        int[] c = new int[m + n];
        // merging
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if(i==m){ // Now take element form b only
            while(j<n){
                c[k] = b[j];
                j++; k++;
            }
        }
        if(j==n){ // Now take element from a only
            while(i<m){
                c[k] = a[i];
                i++; k++;
            }
        }
        for (int ele : c) {
            System.out.print(ele + " ");
        }

    }

}
