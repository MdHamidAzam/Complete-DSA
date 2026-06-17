package Hashing;

import java.util.*;

public class LinkedOrTreeHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        // print in unordered
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Bengaluru");

        System.out.println(hs);

        // print in ordered as it is
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Bengaluru");
        lhs.add("Noida");
        System.out.println(lhs);

        // print inalphabetical order
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);
    }
}
