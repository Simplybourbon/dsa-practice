package Collectionz.Queue;

import java.util.PriorityQueue;

public class prioritydq {
    public static void main(String[] args) {
        // stores elemets in a tree format(when askedd peek)
        PriorityQueue<Integer> pdq = new PriorityQueue<>();
        pdq.offer(2);
        pdq.offer(0);
        pdq.offer(1);
        pdq.offer(3);
        System.out.println(pdq);
        System.out.println(pdq.poll());
        System.out.println(pdq.peek());
        while(!pdq.isEmpty()){
            System.out.println(pdq.peek());
            pdq.poll();// removes the first comming element
        }

    }
}
