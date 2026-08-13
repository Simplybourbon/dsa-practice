public class RecursionPractice {
    public static void reverseArray(int[] arr, int i, int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[(n - 1) - i];
        arr[(n - 1) - i] = temp;
        reverseArray(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        reverseArray(arr, 0, n);
        System.out.print("[ ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");

        }
        System.out.print("]");
    }

}
