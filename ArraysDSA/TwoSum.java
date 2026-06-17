package ArraysDSA;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 10, 34, 67, 35, 54, 40, 0, 50 };
        int x = 50;
        int n = arr.length;
        // solution
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

}
