package Collections;

import java.util.*;

public class Sttack {
    public static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();
        stck.push(10);
        stck.push(20);
        stck.push(30);
        System.out.println(stck);
        System.out.println(stck.peek());
        System.out.println(stck.pop());
        System.out.println(stck.getLast() );
    }
}
