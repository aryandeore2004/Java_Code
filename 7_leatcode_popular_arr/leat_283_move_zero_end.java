
// LeetCode 283: Move Zeroes
// Problem Statement

// Given an integer array nums, move all 0s to the end of the array while maintaining the relative order of the non-zero elements.
// You must do this in-place without making a copy of the array.

// Example 1
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Example 2
// Input: nums = [0]
// Output: [0]

// Constraints
// 1 <= nums.length <= 10^4
// -2^31 <= nums[i] <= 2^31 - 1

// Explanation
// Input:
// [0,1,0,3,12]
// Move all non-zero elements to the front while keeping their order:
// [1,3,12]
// Fill remaining positions with zeros:
// [1,3,12,0,0]

// Approach (Two Pointers)
// Use pointer j to track the position where the next non-zero element should be placed.
// Traverse the array with i.
// When a non-zero element is found, place it at nums[j] and increment j.
// After the traversal, fill the remaining positions with 0.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class leat_283_move_zero_end {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 3, 12 };

    // Position to place next non-zero element
    int j = 0;

    // Move all non-zero elements to front
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[j] = nums[i];
        j++;
      }
    }
    // Fill remaining positions with zeros
    while (j < nums.length) {
      nums[j] = 0;
      j++;
    }
    // Print array
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }
}

// | i | nums[i] | Action     | Array         | j |
// | - | ------- | ---------- | ------------- | - |
// | 0 | 0       | Skip       | [0,1,0,3,12]  | 0 |
// | 1 | 1       | nums[j]=1  | [1,1,0,3,12]  | 1 |
// | 2 | 0       | Skip       | [1,1,0,3,12]  | 1 |
// | 3 | 3       | nums[j]=3  | [1,3,0,3,12]  | 2 |
// | 4 | 12      | nums[j]=12 | [1,3,12,3,12] | 3 |

// | j | Action    | Array         |
// | - | --------- | ------------- |
// | 3 | nums[3]=0 | [1,3,12,0,12] |
// | 4 | nums[4]=0 | [1,3,12,0,0]  |




// public class MoveZeroes {
//     public static void main(String[] args) {
//         int[] nums = {0, 1, 0, 3, 12};

//         // Points to position where next non-zero should be placed
//         int j = 0;

//         for(int i = 0; i < nums.length; i++) {

//             // If current element is non-zero
//             if(nums[i] != 0) {

//                 // Swap nums[i] and nums[j]
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;

//                 // Move j to next position
//                 j++;
//             }
//         }

//         // Print array
//         for(int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }


// | i | nums[i] | Action                   | Array        | j |
// | - | ------- | ------------------------ | ------------ | - |
// | 0 | 0       | Skip                     | [0,1,0,3,12] | 0 |
// | 1 | 1       | Swap nums[1] and nums[0] | [1,0,0,3,12] | 1 |
// | 2 | 0       | Skip                     | [1,0,0,3,12] | 1 |
// | 3 | 3       | Swap nums[3] and nums[1] | [1,3,0,0,12] | 2 |
// | 4 | 12      | Swap nums[4] and nums[2] | [1,3,12,0,0] | 3 |
