package Alooping_patterns.Fifth;

public class S3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 65));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }
}
