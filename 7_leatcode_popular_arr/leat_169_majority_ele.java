

// LeetCode 169: Majority Element

// Problem Statement

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n/2⌋ times.

// You may assume that the majority element always exists.

// Example
// Input: nums = [3,2,3]

// Output: 3
// Input: nums = [2,2,1,1,1,2,2]

// Output: 2
// Method 1: HashMap
// Logic
// Count frequency of each element.

// Return the element whose frequency > n/2.
// Code

import java.util.HashMap;

public class leat_169_majority_ele {
    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums) {
            if(map.get(num) > nums.length / 2) {
                System.out.println(num);
                break;
            }
        }
    }
}
// Complexity
// Time  : O(n)
// Space : O(n)



// Method 2: Sorting
// Logic
// Sort array

// Majority element will be at index n/2
// Code
// Arrays.sort(nums);
// System.out.println(nums[nums.length / 2]);


// Complexity
// Time  : O(n log n)
// Space : O(1)





// Method 3: Moore's Voting Algorithm ⭐********************************************************************************
// Logic
// Maintain:
// candidate
// count

// Same element -> count++

// Different element -> count--

// If count becomes 0
// choose new candidate
// Code
// int count = 0;
// int candidate = 0;

//************************************************************************************************************************** */
// class Solution {
//     public int majorityElement(int[] nums) {

//         int count = 0;
//         int candidate = 0;

//         for(int num : nums) {

//             if(count == 0) {
//                 candidate = num;
//             }

//             if(num == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }

//         return candidate;
//     }
// }

//**************************************************************************************************************************

// Complexity
// Time  : O(n)
// Space : O(1)
// Dry Run

// Input:

// [2,2,1,1,1,2,2]

// | Element | Candidate | Count |
// | ------- | --------- | ----- |
// | 2       | 2         | 1     |
// | 2       | 2         | 2     |
// | 1       | 2         | 1     |
// | 1       | 2         | 0     |
// | 1       | 1         | 1     |
// | 2       | 1         | 0     |
// | 2       | 2         | 1     |


// Output:

// 2
// Interview Preference
// HashMap
//     ↓
// Sorting
//     ↓
// Moore's Voting Algorithm ⭐