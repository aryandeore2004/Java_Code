// LeetCode 1752: Check if Array Is Sorted and Rotated
// Problem Statement

// Given an array nums, return true if the array was originally sorted in non-decreasing order and then rotated some number of positions (including zero). Otherwise, return false.

// Example 1
// Input: nums = [3,4,5,1,2]
// Output: true

// Original sorted array:

// [1,2,3,4,5]

// Rotated:

// [3,4,5,1,2]
// Example 2
// Input: nums = [2,1,3,4]
// Output: false

// Not a rotation of a sorted array.

// Logic

// Count how many times the order decreases:

// nums[i] > nums[(i+1)%n]

// For a sorted and rotated array, this can happen at most once.


public class leat_1752_arr_roat_sort {
    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        int count = 0;
        int n = nums.length;

        // Count the number of breaks in sorted order
        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // If breaks are at most 1, array is sorted and rotated
        if(count <= 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}



// Input
// nums = [3,4,5,1,2]
// Output
// true

// Logic (Short)
// 1. Traverse the array.
// 2. Count how many times nums[i] > nums[i+1].
// 3. Use (i+1)%n for circular comparison.
// 4. If count <= 1 → Sorted & Rotated.
// 5. Else → Not Sorted & Rotated

// | i | nums[i] | next | Condition | Count |
// | - | ------- | ---- | --------- | ----- |
// | 0 | 3       | 4    | 3 > 4 ❌   | 0     |
// | 1 | 4       | 5    | 4 > 5 ❌   | 0     |
// | 2 | 5       | 1    | 5 > 1 ✅   | 1     |
// | 3 | 1       | 2    | 1 > 2 ❌   | 1     |
// | 4 | 2       | 3    | 2 > 3 ❌   | 1     |

// count = 1 → true ✅

// Time Complexity: O(n)
// Space Complexity: O(1)