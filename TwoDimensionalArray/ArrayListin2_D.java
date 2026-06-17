package TwoDimensionalArray;
import java.util.*;
public class ArrayListin2_D {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10); arr.add(20);arr.add(30);
        List<Integer> brr = new ArrayList<>();
        brr.add(40);brr.add(50);
        List<Integer> crr = new ArrayList<>();
        List<Integer> drr = new ArrayList<>();
        drr.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(arr); l.add(brr); l.add(crr); l.add(drr);
        // for (int i = 0; i < l.size(); i++) {
        //     System.out.println(l.get(i)+" ");
        // }
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j)+" ");
                
            }
            System.out.println();
        }
    }

}
