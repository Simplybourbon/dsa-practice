
public class trial {
    public static void main(String[] args) {
        printNumber(5);
    }

    public static int countDigit(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }

        n = n - 1;
        printNumber(n);
        System.out.println(n);

    }
}
