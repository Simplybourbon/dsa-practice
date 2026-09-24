
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 13, 45, 24, 52, 20, 9 };
        int target=45;
        System.out.println(linearSearch(arr, target));

    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;

            }
        }
        return false;
    }
}
