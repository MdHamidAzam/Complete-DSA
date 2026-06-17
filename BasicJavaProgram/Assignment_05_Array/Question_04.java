package Assignment_05_Array;
import java.util.HashSet;

public class Question_04 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 50, 30}; // Example array with duplicates
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int ele : arr) {
            if (!seen.add(ele)) {
                duplicates.add(ele);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
