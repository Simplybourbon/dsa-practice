package Alooping_patterns.Fifth;

public class S1 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }
}
