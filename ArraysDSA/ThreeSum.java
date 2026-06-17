package ArraysDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> main(String[] args) {
        int[] arr = {1,2,3,-1,6,9};
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr); // Sorting the array

        for (int i = 0; i < n; i++) {
            // Skip duplicate elements
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // Found a triplet
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    // Skip duplicate elements
                    while (j < k && arr[j] == arr[j - 1]) j++;
                }
            }
        }
        return ans;
    }
}
