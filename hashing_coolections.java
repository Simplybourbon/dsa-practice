import java.util.*;

import Collectionz.Map.hashMap;

public class hashing_coolections {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        System.out.print("enter number size : ");
        int n = sc.nextInt();
        

        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter : ");
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);

        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.print("enter number of queries : ");
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            System.out.println("enter number to check : ");
            int number = sc.nextInt();
            sc.nextLine();
            if (!hm.containsKey(number)) {
                System.out.println("0");
            } else {
                System.out.println(hm.get(number));

            }
        }
    }
}
