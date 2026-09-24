import java.util.ArrayList;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 13, 45, 24, 52, 20, 9 };
        int ar[]={10,10,10};
        System.out.println(secondLargest(ar));
    }

    // Optimal Approcah
    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        if (arr.length <= 1) {
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];

            }
        }
        if (secondLargest == 1) {
            return -1;
        }
        return secondLargest;
    }

    // BruteForce method
    static int secondlargestElement(int[] arr) {
        int n = arr.length;
        sort(arr, 0, arr.length - 1);
        return arr[n - 2];
    }

    static int[] sort(int arr[], int low, int high) {
        if (low >= high) {
            return null;
        }
        int mid = (low + high) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);

        return arr;

    }

    static void merge(int arr[], int low, int mid, int high) {
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
            arr[low + i] = temp.get(i);
        }
    }//

}
