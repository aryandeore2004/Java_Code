



// Kadane's Algorithm

// Kadane's Algorithm is used to find the maximum sum contiguous subarray.

// Problem (LeetCode 53)
// Given an integer array nums,
// find the contiguous subarray with the largest sum
// and return its sum.

// Example

// Input:
// [-2,1,-3,4,-1,2,1,-5,4]

// Output:
// 6

// Subarray:

// [4,-1,2,1]

// Sum:

// 4 + (-1) + 2 + 1 = 6
// Kadane's Logic
// currentSum = currentSum + nums[i]

// If currentSum becomes smaller than nums[i],
// start a new subarray from nums[i].

// Keep track of maximum sum.

public class kadanes {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            // Add current element
            curSum += nums[i];

            // Update maximum sum
            if(maxSum<curSum) {
                maxSum = curSum;
            }

            // Reset if sum becomes negative
            if(curSum < 0) {
                curSum = 0;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}

// Complexity
// Time  : O(n)
// Space : O(1)


// Dry Run for Array
// [3, -4, 5, 4, -1, 7, -8]

// | Element | curSum | maxSum | Action                  |
// | ------- | ------ | ------ | ----------------------- |
// | 3       | 3      | 3      | Update max              |
// | -4      | -1     | 3      | curSum < 0 → reset to 0 |
// | 5       | 5      | 5      | Update max              |
// | 4       | 9      | 9      | Update max              |
// | -1      | 8      | 9      | Continue                |
// | 7       | 15     | 15     | Update max              |
// | -8      | 7      | 15     | Continue                |


// Identification
// Maximum Sum
// Largest Sum
// Contiguous Subarray

// Think:
// Kadane's Algorithm



//other similar kadens alog

// int currentSum = nums[0];
// int maxSum = nums[0];

// for(int i = 1; i < nums.length; i++) {

//     currentSum = Math.max(nums[i],currentSum + nums[i]);

//     maxSum = Math.max(maxSum, currentSum);
// }

// return maxSum;




// 1. Brute Force

// Logic
// Generate every possible subarray

// Calculate sum of each subarray

// Keep track of maximum sum
// Code
// int maxSum = Integer.MIN_VALUE;

// for(int i = 0; i < nums.length; i++) {
//     for(int j = i; j < nums.length; j++) {

//         int sum = 0;

//         for(int k = i; k <= j; k++) {
//             sum += nums[k];
//         }

//         if(sum > maxSum) {
//             maxSum = sum;
//         }
//     }
// }

// Complexity
// Time  : O(n³)
// Space : O(1)






// 2. Better Approach
// Logic
// Fix starting index

// Keep adding elements

// Avoid recalculating sums
// Code
// int maxSum = Integer.MIN_VALUE;

// for(int i = 0; i < nums.length; i++) {

//     int sum = 0;

//     for(int j = i; j < nums.length; j++) {

//         sum += nums[j];

//         if(sum > maxSum) {
//             maxSum = sum;
//         }
//     }
// }
// Complexity
// Time  : O(n²)
// Space : O(1)