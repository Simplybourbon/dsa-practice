package Alooping_patterns.Sixth;

public class S0 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("-");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            for (int j = 4; j > k; j--) {
                System.out.print("-");
            }

            for (int j = 4; j > k; j--) {
                System.out.print("-");
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
