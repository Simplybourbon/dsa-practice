import java.util.ArrayList;

public class Bruteforcefibo {
    static ArrayList<Integer> f = new ArrayList<>();

    public static int fib(int n) {

        f.add(0);
        f.add(1);
        for (int i = 2; i < n + 1; i++) {
            f.add(i, f.get(i - 1) + f.get(i - 2));
        }

        return f.get(n);
    }

    public static void retrive() {
        for (Integer k : f) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        fib(5);
        for (Integer k : f) {
            System.out.println(k);
        }
    }
}
