package SortingAlgos;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 13, 45, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(InsertionSort(arr, arr.length)));
    }

    static int[] InsertionSort(int arr[], int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int e = arr[j];
                arr[j] = arr[j -1];
                arr[j - 1] = e;
                j--;
            }
        }
        return arr;
    }
}
