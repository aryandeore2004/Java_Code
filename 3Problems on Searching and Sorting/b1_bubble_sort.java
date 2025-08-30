// 1. Time Complexities
// Worst Case Complexity: O(n2)
// If we want to sort in ascending order and the array is in descending order
// then the worst case occurs.
// Best Case Complexity: O(n)
// If the array is already sorted, then there is no need for sorting.
// Average Case Complexity: O(n2)
// It occurs when the elements of the array are in jumbled order (neither
// ascending nor descending).

// 2. Space Complexity
// Space complexity is O(1) because an extra variable is used for swapping.
// In the optimized bubble sort algorithm, two extra variables are used. Hence,
// the space complexity will be O(2).

// 3. Bubble Sort Applications
// Bubble sort is used if
// complexity does not matter
// short and simple code is preferred

// 4. Total iterations = N-1

import java.util.*; // Importing utility package for Arrays.toString()

public class b1_bubble_sort {

  // Function to perform Bubble Sort
  static void bubble_s(int arr[], int n) {
    // Outer loop for number of passes (n-1 passes needed)
    for (int i = 0; i < n - 1; i++) {

      // Inner loop for comparing adjacent elements
      for (int j = 0; j < n - i - 1; j++) {

        // Swap if the current element is greater than the next element
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String args[]) {
    // Declare and initialize an unsorted array
    int arr[] = { 4, 2, 8, 65, 12 };

    // Calculate the length of the array
    int n = arr.length;

    // Call the bubble sort function
    bubble_s(arr, n);

    // Print the sorted array using Arrays.toString()
    System.out.println(Arrays.toString(arr));
  }
}
