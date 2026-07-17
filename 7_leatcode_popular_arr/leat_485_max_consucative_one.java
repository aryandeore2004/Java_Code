
// LeetCode 485: Max Consecutive Ones
// Problem Statement

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example
// Input: nums = [1,1,0,1,1,1]

// Output: 3

// Explanation:

// [1,1] -> 2 ones
// [1,1,1] -> 3 ones

// Maximum = 3


public class leat_485_max_consucative_one {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        int count = 0;    // Current consecutive ones
        int maxCount = 0; // Maximum consecutive ones

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(maxCount);
    }
}

// DRY Run

// [1,1,0,1,1,1]

// | i | nums[i] | count | maxCount |
// | - | ------- | ----- | -------- |
// | 0 | 1       | 1     | 1        |
// | 1 | 1       | 2     | 2        |
// | 2 | 0       | 0     | 2        |
// | 3 | 1       | 1     | 2        |
// | 4 | 1       | 2     | 2        |
// | 5 | 1       | 3     | 3        |


// Output:

// 3
// Pattern to Identify

// Keywords:

// Maximum consecutive
// Continuous count
// Longest streak
// Binary array

// Think:

// Count occurrences
// Reset when condition breaks
// Track maximum

// Time Complexity: O(n)
// Space Complexity: O(1) ✅