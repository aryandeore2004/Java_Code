// 1. Time_Complexities
// Worst Case Complexity: O(n2)
// Suppose, an array is in ascending order, and you want to sort it in descending order. In this case, worst case complexity occurs.
// Each element has to be compared with each of the other elements so, for every nth element, (n-1) number of comparisons are made.
// Thus, the total number of comparisons = n*(n-1) ~ n2
// Best Case Complexity: O(n)
// When the array is already sorted, the outer loop runs for n number of times whereas the inner loop does not run at all. So, there are only n number of comparisons. Thus, complexity is linear.
// Average Case Complexity: O(n2)
// It occurs when the elements of an array are in jumbled order (neither ascending nor descending).

// 2. Space Complexity
// Space complexity is O(1) because an extra variable key is used.

// 3. Insertion Sort Applications
// The insertion sort is used when:
// the array is has a small number of elements
// there are only a few elements left to be sorted

import java.util.*; // Importing utility package for Arrays.toString()

public class b3_insertion_sort {

  // Function to perform Insertion Sort
  static void insertion_s(int arr[], int n) {
    // Start from the second element (index 1)
    for (int i = 1; i < n; i++) {
      int current = arr[i]; // The element to be inserted in the sorted part
      int j = i - 1;

      // Move elements of arr[0..i-1], that are greater than current, to one position
      // ahead
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j]; // Shift element to the right
        j--; // Move to the previous element
      }

      arr[j + 1] = current; // Place the current in its correct position
    }
  }

  public static void main(String args[]) {
    // Declare and initialize an unsorted array
    int arr[] = { 4, 2, 8, 65, 12 };

    // Calculate the length of the array
    int n = arr.length;

    // Call the insertion sort function
    insertion_s(arr, n);

    // Print the sorted array
    System.out.println(Arrays.toString(arr));
  }
}



// Insertion Sort — Short Dry Run

// Theory:
// Insertion Sort builds the sorted array one element at a time.
// It takes the current element (key) and inserts it into its correct position among the previous sorted elements.

// Example:

// Array: [5, 3, 4, 1, 2]
// Pass	Key	Action	Array
// 1	3	3 < 5 → shift 5	[3, 5, 4, 1, 2]
// | Pass | Key | Action          | Array             |
// | ---- | --: | --------------- | ----------------- |
// | 1    |   3 | 3 < 5 → shift 5 | `[3, 5, 4, 1, 2]` |
// | 2    |   4 | 4 < 5 → shift 5 | `[3, 4, 5, 1, 2]` |
// | 3    |   1 | Shift 5, 4, 3   | `[1, 3, 4, 5, 2]` |
// | 4    |   2 | Shift 5, 4, 3   | `[1, 2, 3, 4, 5]` |

// Basic logic
// Take element → Compare with left elements
//              ↓
//        Bigger? Shift right
//              ↓
//        Insert at correct position

// Time Complexity:

// Best: O(n)
// Average/Worst: O(n²)

// Space: O(1)
// Stable: Yes