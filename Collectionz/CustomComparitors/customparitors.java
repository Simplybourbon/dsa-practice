package Collectionz.CustomComparitors;

import java.util.*;

import Collectionz.Queue.prioritydq;

public class customparitors {
    public static Comparator<Integer> geComparator() {
        return new Comparator<Integer>() {
            // {n1,n2}
            @Override
            public int compare(Integer n1, Integer n2) {
                if (n1 < n2) {
                    return 1;
                } else if (n1 > n2) {
                    return -1;
                }
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(4);
        Collections.sort(arr, geComparator());

        // Collections.sort(arr,(n1,n2)-> n2-n1);
        System.out.println(arr);
        //max heap
        PriorityQueue<Integer> pd = new PriorityQueue<>(geComparator());
        //PriorityQueue<Integer> pd = new PriorityQueue<>(); returns 1

        pd.add(1);
        pd.add(5);
        pd.add(4);
        System.out.println(pd.poll());
    }
}
