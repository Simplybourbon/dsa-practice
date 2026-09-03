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
        /*
         * int[] arr = { 1, 2, 1 };
         * int n = arr.length;
         * subSequence(0, arr, new ArrayList<>(), 2, 0, n);
         */
        int[] array = { 1, 3, 2 };
        subSequence1(0, array, new ArrayList<>());

    }

    public static void subSequence1(int index, int[] arr, ArrayList<Integer> a) {
        int n = arr.length;
        if (index >= n) {
            System.out.println(a);
            return;
        }
        a.add(arr[index]);
        subSequence1(index + 1, arr, a);
        a.remove(a.size()-1);
        subSequence1(index + 1, arr, a);
    }

    public static void subSequence(int idx, int[] arr, ArrayList<Integer> a, int x, int sum, int n) {

        if (idx >= n) {
            if (sum == x) {
                System.out.println(a);
            }
            return;
        }
        a.add(arr[idx]);
        sum += arr[idx];
        subSequence(idx + 1, arr, a, x, sum, n);
        a.remove(a.size() - 1);
        sum -= arr[idx];
        subSequence(idx + 1, arr, a, x, sum, n);
    }
}
