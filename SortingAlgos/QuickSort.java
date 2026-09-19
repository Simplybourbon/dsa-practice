package SortingAlgos;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition_element = partition(arr, low, high);
            quickSort(arr, low, partition_element - 1);
            quickSort(arr, partition_element + 1, high);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2,5,4 };
        quickSort(arr, 0, arr.length - 1);
    }
}
