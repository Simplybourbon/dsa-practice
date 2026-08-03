package Alooping_patterns.Fifth;

public class S4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4-i; j < 5; j++) {
                System.out.print((char) (j + 65));
            }
            System.err.println();
        }
    }
}
