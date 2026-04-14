// Question:

// Write a Java program to rearrange an array such that the first half of the elements are printed in ascending order and the second half of the elements are printed in descending order.

// Example:
// Input: {54, 2, 32, 54, 94, 11}
// Output: 2 11 32 94 54 54

import java.util.*;

public class a7arr_incre_decre {
    public static void main(String arg[]) {
        int arr[] = { 54, 2, 32, 54, 94, 11 };
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + "  ");
        }

        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + "  ");
        }
    }
}

// 1. Using Sorting + Split Printing (Your Current Approach)
// import java.util.Arrays;

// int arr[] = {54, 2, 32, 54, 94, 11};
// Arrays.sort(arr);
// int n = arr.length;

// // First half ascending
// for (int i = 0; i < n / 2; i++)
// System.out.print(arr[i] + " ");

// // Second half descending
// for (int i = n - 1; i >= n / 2; i--)
// System.out.print(arr[i] + " ");

// Output: 2 11 32 94 54 54

// Time Complexity: O(n log n) → sorting dominates

// Space Complexity: O(1) → in-place

// ✅ Simple and most common approach.

// 2. Using Extra Array (Sort + Merge)

// Instead of printing directly, store in a new array:

// import java.util.Arrays;

// int arr[] = {54, 2, 32, 54, 94, 11};
// Arrays.sort(arr);
// int n = arr.length;
// int result[] = new int[n];

// int index = 0;
// // Fill first half ascending
// for (int i = 0; i < n / 2; i++)
// result[index++] = arr[i];

// // Fill second half descending
// for (int i = n - 1; i >= n / 2; i--)
// result[index++] = arr[i];

// // Print result
// for (int num : result)
// System.out.print(num + " ");

// Time Complexity: O(n log n)

// Space Complexity: O(n) → extra array

// ✅ Useful if you need the rearranged array for later use.

// 3. Without Sorting (Brute Force)

// If sorting not allowed, repeatedly find min for first half and max for second
// half:

// int arr[] = {54, 2, 32, 54, 94, 11};
// int n = arr.length;
// boolean used[] = new boolean[n];

// // First half ascending
// for (int i = 0; i < n / 2; i++) {
// int minIndex = -1;
// for (int j = 0; j < n; j++) {
// if (!used[j] && (minIndex == -1 || arr[j] < arr[minIndex])) {
// minIndex = j;
// }
// }
// System.out.print(arr[minIndex] + " ");
// used[minIndex] = true;
// }

// // Second half descending
// for (int i = 0; i < n / 2 + n % 2; i++) {
// int maxIndex = -1;
// for (int j = 0; j < n; j++) {
// if (!used[j] && (maxIndex == -1 || arr[j] > arr[maxIndex])) {
// maxIndex = j;
// }
// }
// System.out.print(arr[maxIndex] + " ");
// used[maxIndex] = true;
// }

// Time Complexity: O(n²) → two nested loops for min/max selection

// Space Complexity: O(n) → boolean array for marking used elements

// ✅ Works without sorting, but slow for large arrays.