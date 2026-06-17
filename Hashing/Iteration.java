package Hashing;

import java.util.*;

public class Iteration {
    public static void main(String arg[]) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India",150);
        map.put("America", 200);
        map.put("China",150);
        map.put("Pakistan",50);
        map.put("Russia",175);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String str : keys) {
            System.out.println("key: "+str+",value: "+map.get(str));
        }
    }
}
