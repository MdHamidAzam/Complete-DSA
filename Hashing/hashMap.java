package Hashing;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - 0(1)
        hm.put("India", 100);
        hm.put("America", 50);
        hm.put("China", 150);

        System.out.println(hm);

        // Get - 0(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        // ContainsKey - 0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("JAPAN"));

        // Remove -0(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size -0(1)
        System.out.println(hm.size());

        // Is Empty
        hm.clear(); // clear function - 0(1)
        System.out.println(hm.isEmpty());
    }
}
