
// LeetCode 75: Sort Colors    ---- Dutch National Flag Algorithm
// Problem Statement

// Given an array nums with n objects colored:

// 0 → Red
// 1 → White
// 2 → Blue

// Sort them in-place so that objects of the same color are adjacent, with the colors in the order:

// 0 → 1 → 2

// You must solve it without using the library sort function.

// Example
// Input:  [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]


// Optimal Approach: Dutch National Flag Algorithm ⭐
// Logic
// low = 0
// mid = 0
// high = n-1

// 0 → swap with low, low++, mid++
// 1 → mid++
// 2 → swap with high, high--




public class leat_75_sort_color {
    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {

            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}

// Output
// 0 0 1 1 2 2




// Dry Run

// Input:

// [2,0,2,1,1,0]


// | Step | nums[mid] | Action          | start | mid | end | Array         |
// | ---- | --------- | --------------- | ----- | --- | --- | ------------- |
// | 1    | 2         | Swap(mid,end)   | 0     | 0   | 4   | [0,0,2,1,1,2] |
// | 2    | 0         | Swap(start,mid) | 1     | 1   | 4   | [0,0,2,1,1,2] |
// | 3    | 0         | Swap(start,mid) | 2     | 2   | 4   | [0,0,2,1,1,2] |
// | 4    | 2         | Swap(mid,end)   | 2     | 2   | 3   | [0,0,1,1,2,2] |
// | 5    | 1         | mid++           | 2     | 3   | 3   | [0,0,1,1,2,2] |
// | 6    | 1         | mid++           | 2     | 4   | 3   | [0,0,1,1,2,2] |




// 1. Dutch National Flag Algorithm ⭐ (Optimal)
// int low = 0, mid = 0, high = nums.length - 1;

// while(mid <= high) {
//     if(nums[mid] == 0) {
//         int temp = nums[low];
//         nums[low] = nums[mid];
//         nums[mid] = temp;
//         low++;
//         mid++;
//     }
//     else if(nums[mid] == 1) {
//         mid++;
//     }
//     else {
//         int temp = nums[mid];
//         nums[mid] = nums[high];
//         nums[high] = temp;
//         high--;
//     }
// }

// Time: O(n)
// Space: O(1)

// 2. Counting Sort
// int zero = 0, one = 0, two = 0;

// for(int num : nums) {
//     if(num == 0) zero++;
//     else if(num == 1) one++;
//     else two++;
// }

// int i = 0;

// while(zero-- > 0) nums[i++] = 0;
// while(one-- > 0) nums[i++] = 1;
// while(two-- > 0) nums[i++] = 2;

// Time: O(n)
// Space: O(1)

// 3. Built-in Sort
// Arrays.sort(nums);

// Time: O(n log n)
// Space: Depends on implementation

// Interview Order
// Brute Force / Arrays.sort()
//           ↓
// Counting Sort
//           ↓
// Dutch National Flag ⭐