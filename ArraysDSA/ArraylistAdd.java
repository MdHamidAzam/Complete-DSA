package ArraysDSA;

import java.util.ArrayList;

public class ArraylistAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        list.add(60);
        System.out.println(list + " " + list.size());
        list.add(20);
        System.out.println(list + " " + list.size());
        list.add(204);
        System.out.println(list + " " + list.size());
        list.add(50);
        System.out.println(list + " " + list.size());
        list.remove(2);
        System.out.println(list + " " + list.size());
    }
}