package Alooping_patterns.Fifth;

public class S2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (i + 65));
            }
            System.err.println();
        }
    }
}
