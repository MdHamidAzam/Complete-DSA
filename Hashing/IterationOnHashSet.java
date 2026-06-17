package Hashing;

import java.util.*;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noide");
        cities.add("Bengluru");

        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // from advance for loop
        for(String city: cities) {
            System.out.println(city);
        }
    }
}
