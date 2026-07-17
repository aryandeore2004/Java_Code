// LeetCode 136: Single Number
// Problem Statement

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with:

// Linear runtime complexity O(n)
// Constant extra space O(1)
// Example
// Input: nums = [2,2,1]

// Output: 1
// Input: nums = [4,1,2,1,2]

// Output: 4


// Optimal Approach (XOR) ⭐
// Logic
// a ^ a = 0
// a ^ 0 = a

// Example:

// 2 ^ 2 ^ 1

// = 0 ^ 1

// = 1

// All duplicate numbers cancel out.


public class leat_136_obaion_single_num {
    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};

        int result = 0;

        // XOR all elements
        for(int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        System.out.println(result);
    }
}


// Dry Run

// Input:

// [4,1,2,1,2]
// Element	Result
// 4	     4
// 1    	5
// 2	    7
// 1	   6
// 2	   4

// Output:

// 4

// Other Methods
// 1. HashMap
// Store frequency

// Return element with frequency 1

// Time: O(n)
// Space: O(n)

// 2. Sorting
// Sort array

// Check adjacent elements

// The unmatched element is the answer

// Time: O(n log n)
// Space: O(1)


// Shorter HashMap Version
// HashMap<Integer, Integer> map = new HashMap<>();

// for(int num : nums) {
//     map.put(num, map.getOrDefault(num, 0) + 1);
// }

// for(int num : nums) {
//     if(map.get(num) == 1) {
//         System.out.println(num);
//         break;
//     }
// }
// Complexity
// Time  : O(n)
// Space : O(n)