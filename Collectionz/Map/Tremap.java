package Collectionz.Map;

import java.util.Set;
import java.util.TreeMap;

public class Tremap {
    public static void main(String[] args) {
        TreeMap<Integer, String> hm = new TreeMap<>();
        hm.put(1, "rabin");
        hm.put(2, "aditya");
        hm.put(3, "arav");
        System.out.println(hm.get(3));
        System.out.println(hm);
        System.out.println(hm.floorKey(4));
        System.out.println(hm.get(3));
        Set<Integer> sr = hm.keySet();
        System.out.println(sr);

    }
}
