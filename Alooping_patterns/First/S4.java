package Alooping_patterns.First;

public class S4 {
    public static void main(String[] args) {
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(i);
            }
            System.out.println();
        }
    }
}
