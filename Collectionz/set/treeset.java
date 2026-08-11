package Collectionz.set;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        //sotes unique data  elements in sorted manner 
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);        
        ts.add(2);
        ts.add(3);
        ts.add(6);
        ts.add(0);
        System.out.println(ts);
        ts.remove(-1);
        System.out.println(ts.floor(5));
        System.out.println(ts.ceiling(5));
        for(var n : ts){
            System.out.print(n+" ");
        }

    }
}
