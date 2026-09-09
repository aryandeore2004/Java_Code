// Question: Find Equilibrium Index of an Array

// Given an integer array, find the equilibrium index.

// An index i is an equilibrium index if:

// sum of elements on the left = sum of elements on the right

// The current element arr[i] is not included in either sum.

// Example

// Input:

// [2, 3, -1, 8, 4]

// Check index 3:

// Left  = 2 + 3 + (-1) = 4
// Right = 4

// Therefore:

// Output: 3

import java.util.*;

public class b92_arr_eqillibrium {

    public static int equilibrium_arr(int nums[]) {

        int n = nums.length;

        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {

            int leftside = 0;
            if (i > 0) {
                leftside = prefix[i - 1];
            }

            int rightside = prefix[n - 1] - prefix[i];

            if (leftside == rightside) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {2, 3, -1, 8, 4};

        int result = equilibrium_arr(nums);

        System.out.print(result);
    }
}


// 1. Brute Force — O(n²) time, O(1) space

// This is your approach:

// public static int equilibrium(int[] arr) {
//     for (int i = 0; i < arr.length; i++) {
//         int left = 0;
//         int right = 0;

//         for (int j = 0; j < i; j++)
//             left += arr[j];

//         for (int j = i + 1; j < arr.length; j++)
//             right += arr[j];

//         if (left == right)
//             return i;
//     }
//     return -1;
// }

// Idea: For every index, separately calculate left sum and right sum.

// 2. Prefix Sum — O(n) time, O(n) space
// public static int equilibrium(int[] arr) {
//     int n = arr.length;
//     int[] prefix = new int[n];

//     prefix[0] = arr[0];

//     for (int i = 1; i < n; i++)
//         prefix[i] = prefix[i - 1] + arr[i];

//     for (int i = 0; i < n; i++) {
//         int left = (i == 0) ? 0 : prefix[i - 1];
//         int right = prefix[n - 1] - prefix[i];

//         if (left == right)
//             return i;
//     }

//     return -1;
// }

// Idea:

// left = prefix[i-1]
// right = totalSum - prefix[i]
// 3. Total Sum + Left Sum — O(n) time, O(1) space ⭐ Best
// public static int equilibrium(int[] arr) {
//     int total = 0;

//     for (int x : arr)
//         total += x;

//     int left = 0;

//     for (int i = 0; i < arr.length; i++) {
//         int right = total - left - arr[i];

//         if (left == right)
//             return i;

//         left += arr[i];
//     }

//     return -1;
// }