
// write a program to find whether an array is a subset of another array or not.

// Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array.

// Note: Array elements are assumed to be unique.

// Examples:

// Example 1:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [2,4,3,1,7,5,15]
// Output: arr1[] is a subset of arr2[]

// Example 2:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [4,5,2]
// Output: arr1[] is not a subset of arr2[]

// Example 3:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [11,12,13,15,16]
// Output: arr1[] is not a subset of arr2[]
// Disclaimer: Don't jump directly to the solution, try it out yourself first.

// Solution 1: Using two loops

// We can use two nested loops. The outer loop iterates over the elements of arr1[] and the inner loop checks for that element in arr2[] by simple linear search.

// Code:

// C++
// Java
import java.io.*;
import java.util.*;

class b0_sub_arr_another_arr {

  static boolean isSubset(int arr1[], int m, int arr2[], int n) {
    if (m > n)
      return false;
    for (int i = 0; i < m; i++) {
      boolean present = false;
      for (int j = 0; j < n; j++) {
        if (arr2[j] == arr1[i]) {
          present = true;
          break;
        }
      }
      if (present == false)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {

    int arr1[] = { 1, 3, 4, 5, 2 };
    int arr2[] = { 2, 4, 3, 1, 7, 5, 15 };

    int m = arr1.length;
    int n = arr2.length;

    boolean ans = isSubset(arr1, m, arr2, n);

    if (ans == true)
      System.out.print("arr1[] is a subset of arr2[]");
    else
      System.out.print("arr1[] is not a subset of arr2[]");

  }
}
// Output:

// arr1[] is a subset of arr2[]

// Time Complexity: O(M*N)

// Reason: The outer loop runs for M times and for every iteration inner loop
// runs N times.

// Space Complexity: O(1)

// Solution 2: Using Sorting and Binary Search

// We can improve the time complexity by using sorting and binary search. We
// first sort the arr2[] array and then we can use set a loop to traverse the
// elements of arr1[] and search for them in arr2[] using binary search( as
// arr2[] is sorted)

// Code:

// import java.io.*;
// import java.util.*;

// class b0_sub_arr_another_arr {

// static boolean bSearch(int elem, int arr[], int n) {
// int start = 0;
// int end = n - 1;
// while (start <= end) {
// int mid = (start + end) / 2;
// if (arr[mid] == elem)
// return true;
// else if (arr[mid] < elem)
// start = mid + 1;
// else end = mid - 1;
// }
// return false;
// }

// static boolean isSubset(int arr1[], int m, int arr2[], int n) {
// if (m > n) return false;
// Arrays.sort(arr2);
// for (int i = 0; i < m; i++) {
// boolean present = bSearch(arr1[i], arr2, n);
// if (present == false) return false;
// }
// return true;
// }

// public static void main(String[] args) {

// int arr1[]={1,3,4,5,2};
// int arr2[]={2,4,3,1,7,5,15};

// int m = arr1.length;
// int n = arr2.length;

// boolean ans = isSubset(arr1, m, arr2, n);

// if (ans == true)
// System.out.print("arr1[] is a subset of arr2[]");
// else System.out.print("arr1[] is not a subset of arr2[]");

// }
// }

// Output:

// arr1[] is a subset of arr2[]

// Time Complexity: O(NlogN+ MlogN)

// Reason: Time required to sort Array of length N + Searching M elements using
// Binary Search

// Space Complexity: O(1)

// Reason: We are not using any extra space
