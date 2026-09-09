// Yes. Maximum Product Subarray is a very famous DSA/interview question. The important part is understanding why it is different from Maximum Sum Subarray.

// Question

// Given an integer array nums, find the maximum product of any contiguous subarray.

// Example
// Input:
// [1, 2, -3, 0, -4, -5]

// Output:
// 20

// Because:

// (-4) × (-5) = 20

import java.util.*;

public class b7_max_pro_subarray {

 public static int maxProductSubArray(int arr[]) {

    int max = Integer.MIN_VALUE;

    for(int i = 0; i < arr.length; i++) {

        int product = 1;

        for(int j = i; j < arr.length; j++) {

            product *= arr[j];

            max = Math.max(max, product);
        }
    }

    return max;
}

  public static void main(String[] args) {
    int nums[] = { 1, 2, -3, 0, -4, -5 };
    int answer = maxProductSubArray(nums);
    System.out.print("The maximum product subarray is: " + answer);
  }
}



// Approach 2: Brute Force Improved — O(n²)

// Instead of calculating the product again, keep multiplying as j moves.

// public static int maxProduct(int arr[]) {

//     int max = Integer.MIN_VALUE;

//     for(int i = 0; i < arr.length; i++) {

//         int product = 1;

//         for(int j = i; j < arr.length; j++) {

//             product *= arr[j];

//             max = Math.max(max, product);
//         }
//     }

//     return max;
// }

// Example:

// i = 0

// 1
// 1 × 2 = 2
// 1 × 2 × -3 = -6
// 1 × 2 × -3 × 0 = 0

// No need for the third k loop.

// Time: O(n²)
// Space: O(1)

// Approach 3: Optimal — O(n) ⭐⭐⭐

// This is the most important approach for interviews.

// public static int maxProduct(int arr[]) {

//     int max = arr[0];
//     int min = arr[0];
//     int result = arr[0];

//     for(int i = 1; i < arr.length; i++) {

//         int x = arr[i];

//         if(x < 0) {
//             int temp = max;
//             max = min;
//             min = temp;
//         }

//         max = Math.max(x, max * x);
//         min = Math.min(x, min * x);

//         result = Math.max(result, max);
//     }

//     return result;
// }
// Why max AND min?

// This is the key concept.

// Suppose:

// max = 6
// min = -4

// Next number:

// -5

// Then:

// max × -5 = -30
// min × -5 = 20

// The minimum negative number becomes the maximum when multiplied by another negative.

// That's why we maintain both:

// max → maximum product ending here
// min → minimum product ending here