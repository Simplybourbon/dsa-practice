package Collections;

import java.util.LinkedList;

public class Linllist {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(10);
        llist.add(20);
        llist.addFirst(5);
        System.out.println(llist);
        llist.addLast(25);
        System.out.println(llist);
        llist.removeFirst();
        System.out.println(llist);
        System.out.println(llist.getFirst());

    }
}
