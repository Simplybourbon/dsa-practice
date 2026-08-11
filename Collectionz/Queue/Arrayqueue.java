package Collectionz.Queue;

import java.util.ArrayDeque;

public class Arrayqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(1);
        dq.offer(2);
        dq.offer(3);
        dq.offer(0);
        dq.offer(6);
        dq.offer(4);
        System.out.println(dq);
        dq.poll();// taken first element out
        System.out.println(dq.peek());

    }
}
