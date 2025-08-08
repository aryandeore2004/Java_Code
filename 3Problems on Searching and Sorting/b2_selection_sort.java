
// Time Complexities:

// Worst Case Complexity: O(n2)
// If we want to sort in ascending order and the array is in descending order
// then, the worst case occurs.
// Best Case Complexity: O(n2)
// It occurs when the array is already sorted
// Average Case Complexity: O(n2)
// It occurs when the elements of the array are in jumbled order (neither
// ascending nor descending).
// The time complexity of the selection sort is the same in all cases. At every
// step, you have to find the minimum element and put it in the right place. The
// minimum element is not known until the end of the array is not reached.

// Space Complexity:

// Space complexity is O(1) because an extra variable min_idx is used.

// Selection Sort Applications
// The selection sort is used when

// a small list is to be sorted
// cost of swapping does not matter
// checking of all the elements is compulsory
// cost of writing to a memory matters like in flash memory (number of
// writes/swaps is O(n) as compared to O(n2) of bubble sort)

import java.util.*;

public class b2_selection_sort {

  public static void selection_s(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String args[]) {
    // Declare and initialize an unsorted array
    int arr[] = { 4, 2, 8, 65, 12 };

    // Calculate the length of the array
    int n = arr.length;

    // Call the bubble sort function
    selection_s(arr, n);

    // Print the sorted array using Arrays.toString()
    System.out.println(Arrays.toString(arr));
  }
}
