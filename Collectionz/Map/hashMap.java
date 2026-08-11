package Collectionz.Map;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "rabin");
        hm.put(2, "aditya");
        hm.put(3, "arav");
        System.out.println(hm.get(3));
        System.out.println(hm);
    }
}
