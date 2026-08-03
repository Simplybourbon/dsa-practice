package Alooping_patterns.Third;

public class S2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = (5*2)+1; j >= i * 2 + 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
