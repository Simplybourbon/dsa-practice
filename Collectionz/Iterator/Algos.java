package Collectionz.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algos {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(1);
        System.out.println(ar);
        Collections.sort(ar);
        Collections.reverse(ar);
        System.out.println(ar);
        System.out.println(Collections.frequency(ar, 1));

    }
}
