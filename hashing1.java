import java.util.Scanner;

public class hashing1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * System.out.print("enter number size : ");
         * int n = sc.nextInt();
         * sc.nextLine();
         * int[] arr = new int[n];
         * for (int i = 0; i < n; i++) {
         * System.out.print("enter : ");
         * arr[i] = sc.nextInt();
         * sc.nextLine();
         * }
         * int[] hash = new int[13];
         * for (int i = 0; i < n; i++) {
         * hash[arr[i]] += 1;
         * }
         * 
         * System.out.print("enter number of queries : ");
         * int q = sc.nextInt();
         * sc.nextLine();
         * while (q-- > 0) {
         * System.out.println("enter number to check : ");
         * int number = sc.nextInt();
         * sc.nextLine();
         * System.out.println(hash[number]);
         * }
         */
        // for string
        System.out.print("enter a string : ");
        String s = sc.nextLine();
        int n = s.length();
        int[] hash = new int[255];
        for (int i = 0; i < n; i++) {
            hash[s.charAt(i)] += 1;
        }
        System.out.print("enter number of queries :");
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            System.out.println("enter character to check : ");
            int number = sc.next().charAt(0);
            sc.nextLine();
            System.out.println(hash[number]);
        }
    }
}
