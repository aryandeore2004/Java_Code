// Problem Statement

// Title: Remove duplicates from an unsorted array

// Description:
// Given an unsorted integer array, remove all duplicates and print only the unique elements. The relative order of the first occurrence of elements should be preserved.

// Input: An unsorted array of integers arr[].
// Output: Array of unique elements in the order of their first appearance.

// Example

// Example 1:

// Input: arr = [51, 1, 1, 24, 12, 51, 24, 1, 12, 51]
// Output: 51 1 24 12 
// Explanation: 
// - 51 appears first → keep it 
// - 1 appears first → keep it, duplicates ignored
// - 24 appears first → keep it, duplicates ignored
// - 12 appears first → keep it, duplicates ignored

// Example 2:

// Input: arr = [5, 3, 5, 2, 3, 2, 1]
// Output: 5 3 2 1

import java.util.*;

public class b2arr_dupli_unsort {

    // Function to remove duplicates from an unsorted array and print unique
    // elements
    public static void dupli(int arr[], int n) {
        // Create a marker array initialized to 1 (1 = keep, 0 = duplicate)
        int mark[] = new int[n];
        for (int m = 0; m < n; m++) {
            mark[m] = 1; // assume all elements are unique initially
        }

        // Outer loop to pick each element
        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) { // only check if not already marked duplicate
                // Inner loop to compare current element with the rest
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        mark[j] = 0; // mark duplicate as 0
                    }
                }
            }
        }

        // Print only those elements which are marked as unique (1)
        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    // Main method to test the above function
    public static void main(String[] args) {
        int arr[] = { 51, 1, 1, 24, 12, 51, 24, 1, 12, 51 };
        int n = arr.length;
        dupli(arr, n);
    }
}

// Method 1: Marker Array (Your Current Code)

// Approach:

// Initialize a mark[] array with 1 for all elements (assume all are unique).

// Use a nested loop:

// Outer loop picks each element arr[i].

// Inner loop checks all subsequent elements arr[j].

// If a duplicate is found, set mark[j] = 0.

// Print all elements with mark[i] == 1.

// Code: (your code already)

// Time Complexity: O(n^2) → due to nested loops.
// Space Complexity: O(n) → for the marker array.

// Method 2: Using HashSet

// Approach:

// Create a LinkedHashSet to store elements (preserves insertion order).

// Traverse the array and add each element to the set.

// Print elements of the set.

// Code:

// import java.util.*;

// public class RemoveDuplicatesHashSet {
// public static void main(String[] args) {
// int arr[] = {51, 1, 1, 24, 12, 51, 24, 1, 12, 51};
// Set<Integer> set = new LinkedHashSet<>();

// for (int num : arr) {
// set.add(num); // duplicates ignored automatically
// }

// for (int num : set) {
// System.out.print(num + " ");
// }
// }
// }

// Time Complexity: O(n) → HashSet insertion and iteration
// Space Complexity: O(n) → for the set

// Method 3: Sorting + Removing Adjacent Duplicates

// Approach:

// Sort the array → duplicates will be adjacent.

// Traverse the array, print element only if it’s different from the previous
// one.

// Code:

// import java.util.*;

// public class RemoveDuplicatesSorted {
// public static void main(String[] args) {
// int arr[] = {51, 1, 1, 24, 12, 51, 24, 1, 12, 51};
// Arrays.sort(arr); // sort the array

// System.out.print(arr[0] + " "); // first element always unique
// for (int i = 1; i < arr.length; i++) {
// if (arr[i] != arr[i - 1]) {
// System.out.print(arr[i] + " ");
// }
// }
// }
// }

// Time Complexity: O(n log n) → due to sorting
// Space Complexity: O(1) → in-place (if no extra array is used)

// Summary Table
// Method Time Complexity Space Complexity Notes
// Marker Array (Nested Loop) O(n²) O(n) Original method, preserves order
// HashSet / LinkedHashSet O(n) O(n) Best for preserving first occurrence order
// Sorting + Adjacent Check O(n log n) O(1) Order of elements changes after
// sorting