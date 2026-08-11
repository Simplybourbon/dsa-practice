package Collectionz.list;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(15);
        arr.add(25);
        arr.add(13);
        arr.add(19);
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.contains(12));
        //System.out.println(arr.remove(2));
        arr.add(1,35);
        System.out.println(arr);


    }
}
