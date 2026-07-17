// LeetCode 189: Rotate Array
// Problem Statement

// Given an integer array nums, rotate the array to the right by k steps.

// Example
// Input:
// nums = [1,2,3,4,5,6,7]
// k = 3

// Output:
// [5,6,7,1,2,3,4]


// Logic
// 1. Reverse entire array
// 2. Reverse first k elements
// 3. Reverse remaining elements

// Example:

// [1,2,3,4,5,6,7]

// Reverse all
// [7,6,5,4,3,2,1]

// Reverse first k=3
// [5,6,7,4,3,2,1]

// Reverse remaining
// [5,6,7,1,2,3,4]



public class leat_189_rotate_arr {
    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}

// Output:

// 5 6 7 1 2 3 4

// Time: O(n)
// Space: O(1) ✅




// Rotate Array - Other Methods (Short)


// 1. Brute Force
// Repeat k times:
//     Store last element
//     Shift all elements right
//     Put last element at index 0

// Time: O(n × k)
// Space: O(1)




// 2. Extra Array
// Create temp array

// temp[(i + k) % n] = nums[i]

// Copy temp back to nums

// Time: O(n)
// Space: O(n)




// 3. Reverse Algorithm ⭐
// Reverse entire array

// Reverse first k elements

// Reverse remaining elements

// Time: O(n)
// Space: O(1)