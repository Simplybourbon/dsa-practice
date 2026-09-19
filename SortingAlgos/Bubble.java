package SortingAlgos;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = { 13, 45, 24, 52, 20, 9 };
        int ar[] = { 9, 13, 20, 24, 45, 52 };
        optimizedBubbleSort(ar, ar.length);
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

    static void optimizedBubbleSort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            int isSwaped = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int e = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = e;
                    isSwaped = 1;
                }
            }
            if (isSwaped == 0) {
                System.out.println("array is already sorted");
                System.out.print("after swap : " + (i + 1) + " ");
                System.out.println(Arrays.toString(arr));
                break;
            } else {
                System.out.print("after swap : " + (i + 1) + " ");
                System.out.println(Arrays.toString(arr));

            }
        }

    }
}
