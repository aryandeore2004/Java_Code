// Question:

// Write a Java program to rearrange an array such that the first half of the elements are printed in ascending order and the second half of the elements are printed in descending order.

// Example:
// Input: {54, 2, 32, 54, 94, 11}
// Output: 2 11 32 94 54 54

// 1. Using Sorting + Split Printing (Most Common Approach)
// Idea
// Sort the array.
// Print the first half in ascending order.
// Print the second half in reverse (descending) order.
// Code

import java.util.*;

public class a7arr_incre_decre {

    public static void main(String args[]) {

        int arr[] = {54, 2, 32, 54, 94, 11};

        Arrays.sort(arr);

        int n = arr.length;

        // First half in ascending order
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        // Second half in descending order
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Output
// 2 11 32 94 54 54

// Complexity
// Time: O(n log n)
// Space: O(1)

// Advantages
// Simple to implement.
// Most commonly asked in interviews.
// No extra array required.





// 2. Using Extra Array (Sort + Merge)
// Idea
// Sort the array.
// Store the first half (ascending) in a new array.
// Store the second half (descending) in the same array.
// Print the new array.
// Code

// import java.util.*;

// public class IncreasingDecreasing {

//     public static void main(String args[]) {

//         int arr[] = {54, 2, 32, 54, 94, 11};

//         Arrays.sort(arr);

//         int n = arr.length;
//         int result[] = new int[n];

//         int index = 0;

//         // First half ascending
//         for (int i = 0; i < n / 2; i++) {
//             result[index++] = arr[i];
//         }

//         // Second half descending
//         for (int i = n - 1; i >= n / 2; i--) {
//             result[index++] = arr[i];
//         }

//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }

// Output
// 2 11 32 94 54 54

// Complexity
// Time: O(n log n)
// Space: O(n)

// Advantages
// Original array remains available.
// Useful when the rearranged array is needed later.






// 3. Without Sorting (Brute Force)
// Idea
// Do not sort the array.
// Repeatedly find the smallest unused element for the first half.
// Repeatedly find the largest unused element for the second half.
// Use a boolean array to mark used elements.
// Code

// public class IncreasingDecreasing {

//     public static void main(String args[]) {

//         int arr[] = {54, 2, 32, 54, 94, 11};

//         int n = arr.length;

//         boolean used[] = new boolean[n];

//         // First half ascending
//         for (int i = 0; i < n / 2; i++) {

//             int minIndex = -1;

//             for (int j = 0; j < n; j++) {

//                 if (!used[j] && (minIndex == -1 || arr[j] < arr[minIndex])) {
//                     minIndex = j;
//                 }
//             }

//             System.out.print(arr[minIndex] + " ");
//             used[minIndex] = true;
//         }

//         // Second half descending
//         for (int i = 0; i < n / 2 + n % 2; i++) {

//             int maxIndex = -1;

//             for (int j = 0; j < n; j++) {

//                 if (!used[j] && (maxIndex == -1 || arr[j] > arr[maxIndex])) {
//                     maxIndex = j;
//                 }
//             }

//             System.out.print(arr[maxIndex] + " ");
//             used[maxIndex] = true;
//         }
//     }
// }
// Output
// 2 11 32 94 54 54
// Complexity
// Time: O(n²)
// Space: O(n)
// Advantages
// Does not use sorting.
// Useful when sorting is not allowed.




// // summary

// | Method                            | Time Complexity | Space Complexity | Uses Sorting | Extra Array | Best Use Case                     |
// | --------------------------------- | --------------- | ---------------- | ------------ | ----------- | --------------------------------- |
// | **Sorting + Split Printing**      | **O(n log n)**  | **O(1)**         | ✅ Yes        | ❌ No        | Best and simplest approach        |
// | **Sorting + Extra Array**         | **O(n log n)**  | **O(n)**         | ✅ Yes        | ✅ Yes       | When rearranged array is required |
// | **Without Sorting (Brute Force)** | **O(n²)**       | **O(n)**         | ❌ No         | ❌ No        | When sorting is not allowed       |
