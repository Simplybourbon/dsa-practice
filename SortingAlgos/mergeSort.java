package SortingAlgos;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        sort(arr,0,arr.length-1);

    }

    static  void sort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
        
        System.out.println(Arrays.toString(arr));

    }

    

    static  void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[low+i] = temp.get(i);
        }
    }
}
