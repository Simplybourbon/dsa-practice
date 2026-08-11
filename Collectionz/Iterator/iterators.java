package Collectionz.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * iterators
 */
public class iterators {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(1);
        Iterator<Integer> ir = ar.iterator();
        while (ir.hasNext()) {
            Integer n = ir.next();

            System.out.println(n);
        }

    }

}