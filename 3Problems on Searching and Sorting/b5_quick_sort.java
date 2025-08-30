
//  * Merge Sort Function (Recursive)
//  * Time Complexity: O(n log n)
//  * Space Complexity: O(n) due to temporary arrays

import java.util.*; // For Arrays.toString()

public class b5_quick_sort {

  // Function to perform Quick Sort
  static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      // Partition the array and get pivot index
      int pivotIndex = partition(arr, low, high);

      // Recursively sort elements before and after partition
      quickSort(arr, low, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, high);
    }
  }

  // Function to partition the array and place pivot in correct position
  static int partition(int arr[], int low, int high) {
    int pivot = arr[high]; // Choose the last element as pivot
    int i = low - 1; // Index of smaller element

    // Traverse through all elements and rearrange based on pivot
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        // Swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // Place pivot at the correct position
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1; // Return the pivot index
  }

  public static void main(String args[]) {
    // Input array
    int arr[] = { 4, 2, 8, 65, 12 };

    // Length of array
    int n = arr.length;

    // Call quick sort
    quickSort(arr, 0, n - 1);

    // Print the sorted array
    System.out.println(Arrays.toString(arr));
  }
}
