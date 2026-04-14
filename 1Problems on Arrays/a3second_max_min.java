
import java.io.*;

public class a3second_max_min {

    public static int sec_greater(int arr1[]) {
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > large) {
                sec_large = large;
                large = arr1[i];
            } else if (arr1[i] != large && arr1[i] > sec_large) {
                sec_large = arr1[i];
            }
        }
        return sec_large;

    }

    public static int sec_smaller(int arr1[]) {
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < small) {
                sec_small = small;
                small = arr1[i];
            } else if (arr1[i] != small && arr1[i] < sec_small) {
                sec_small = arr1[i];
            }
        }
        return sec_small;

    }

    public static void main(String args[]) {
        int[] arr1 = { 54, 12, 32, 45, 105 };
        System.out.println(sec_greater(arr1));
        System.out.println(sec_smaller(arr1));
    }
}

// public class SecondMaxMinTwoPassFunctions {

// // Function to find second largest
// public static int secondLargest(int arr[]) {
// int largest = arr[0];
// // First pass: find largest
// for (int num : arr) {
// if (num > largest) largest = num;
// }

// int secondLargest = Integer.MIN_VALUE;
// // Second pass: find second largest
// for (int num : arr) {
// if (num != largest && num > secondLargest) secondLargest = num;
// }
// return secondLargest;
// }

// // Function to find second smallest
// public static int secondSmallest(int arr[]) {
// int smallest = arr[0];
// // First pass: find smallest
// for (int num : arr) {
// if (num < smallest) smallest = num;
// }

// int secondSmallest = Integer.MAX_VALUE;
// // Second pass: find second smallest
// for (int num : arr) {
// if (num != smallest && num < secondSmallest) secondSmallest = num;
// }
// return secondSmallest;
// }

// public static void main(String[] args) {
// int arr[] = {54, 12, 32, 45, 105};

// System.out.println("Second Largest: " + secondLargest(arr));
// System.out.println("Second Smallest: " + secondSmallest(arr));
// }
// }
// Output:
// sql
// Copy code
// Second Largest: 54
// Second Smallest: 32
// Time and Space Complexity:
// Function Time Complexity Space Complexity
// secondLargest O(n) + O(n) = O(n) O(1)
// secondSmallest O(n) + O(n) = O(n) O(1)