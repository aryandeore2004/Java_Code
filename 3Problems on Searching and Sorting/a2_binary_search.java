// Time Complexity:
//       - Best Case: O(1) → when the middle element is the target
//       - Average & Worst Case: O(log n)
//     
// Space Complexity:
//       - O(1) → Iterative approach uses constant space

import java.util.*; // For Scanner

public class a2_binary_search {

  // Function to perform Binary Search
  static int binarySearch(int arr[], int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target)
        return mid;
      else if (arr[mid] > target)
        high = mid - 1;
      else
        low = mid + 1;
    }

    return -1; // Target not found
  }

  // Function to print the array
  static void printArr(int arr[]) {
    System.out.print("Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1)
        System.out.print(", ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Sorted array for binary search
    int arr[] = { 2, 4, 8, 12, 65 };

    // Print array using custom function
    printArr(arr);

    // Input target element
    System.out.print("Enter number to search: ");
    int target = sc.nextInt();

    // Perform binary search
    int result = binarySearch(arr, target);

    // Show result
    if (result == -1)
      System.out.println("Element not found.");
    else
      System.out.println("Element found at index: " + result);
  }
}
