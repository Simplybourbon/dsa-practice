package Alooping_patterns.Seventh;

public class S0 {
    public static void main(String[] args) {
        int n=7;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i + j == j || i + j == i || ((i * j) % n) == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
