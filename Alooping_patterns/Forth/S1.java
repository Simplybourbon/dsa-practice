package Alooping_patterns.Forth;

public class S1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.err.print(" 1 ");
                } else {
                    System.err.print(" 0 ");

                }
            }
            System.out.println();
        }
    }
}
