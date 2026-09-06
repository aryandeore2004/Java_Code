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



// Interview Answer (Short)

// Q1. Why do we use mid = low + (high - low) / 2 instead of (low + high) / 2?

// Answer:

// To avoid integer overflow.
// If low and high are very large, low + high may exceed the int limit (2,147,483,647) and produce an incorrect value.
// low + (high - low) / 2 gives the same midpoint without the risk of overflow.

// Example:

// int mid = low + (high - low) / 2;








// Q2. Why do we use long in Binary Search?

// Answer:

// Use long when the search range or values can exceed the int limit.
// long can store much larger values (up to about 9 × 10¹⁸), preventing overflow.

// Example:

// long low = 1;
// long high = 1_000_000_000_000L;
// long mid = low + (high - low) / 2;

// One-line interview answer:

// "We use low + (high - low) / 2 to avoid integer overflow, and long when the search space or calculations can exceed the int range."






// Time Complexity = O(log n).

// Interview Answer (30 seconds)


// | Iteration | Elements Remaining |
// | --------- | ------------------ |
// | 0         | n                  |
// | 1         | n/2                |
// | 2         | n/4                |
// | 3         | n/8                |
// | k         | n/2ᵏ               |

// "In binary search, the search space is reduced to half after every iteration. After k iterations, the remaining elements are n / 2^k. When only one element remains, n / 2^k = 1. Solving this gives 2^k = n, so k = log₂n. Since each iteration takes constant time, the overall time complexity is O(log n)."

// Example

// For n = 16:

// 16 → 8 → 4 → 2 → 1

// Number of iterations = 4

// log
// 2
// 	​

// 16=4

// Hence, Binary Search = O(log n).

