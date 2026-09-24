package SortingAlgos;

import java.util.Arrays;

/**
 * Selection
 */
public class Selection {

    public static void main(String[] args) {
        int arr[] = { 3, 3, 0, 99, -40};
        
        System.out.println(Arrays.toString(selectionSort(arr, arr.length))) ;
    }

    static int[] selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    
    static int[] selectionSor(int arr[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i ; j <= n-1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}