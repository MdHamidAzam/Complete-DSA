package Hashing;

import java.util.*;

public class LinkedListHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // print all in ordered
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        TreeMap<String, Integer> tm = new TreeMap<>();
        // print all in alphabetical ordered
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 25);

        HashMap<String, Integer> hm = new HashMap<>();
        // print all in unordered
        hm.put("India", 50);
        hm.put("Chian", 150);
        hm.put("US", 50);

        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);
    }
}
