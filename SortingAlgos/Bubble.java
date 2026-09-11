package SortingAlgos;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = { 13, 45, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(bubbleSort(arr, arr.length)));
    }

    static int[] bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int e = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = e;
                }
            }

        }
        return arr;
    }
}
