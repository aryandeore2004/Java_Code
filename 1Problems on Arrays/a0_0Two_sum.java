
// 🔷 Problem Statement

// 👉 Given an array and a target,
// find two indices such that:

// arr[i] + arr[j] = target
// 🔹 Example
// arr = [2, 7, 11, 15]
// target = 9

// 👉 Output: [0, 1]
// (Because 2 + 7 = 9)

import java.util.*;

public class a0_0Two_sum {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(arr[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        // Direct input (hardcoded)
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}
// 🔷 Problem
// arr = [3, 2, 4]
// target = 6
// 🔷 Logic (Quick Recall)

// 👉 For each element:

// complement = target - arr[i]
// If complement exists in map → return indices
// Else → store current value in map
// 🔷 Dry Run (Step-by-Step)
// 🔹 Initial
// map = {}
// 🔹 Step 1 (i = 0)
// arr[i] = 3
// complement = 6 - 3 = 3

// 👉 Is 3 in map? ❌ No

// 👉 Store:

// map = {3 → 0}
// 🔹 Step 2 (i = 1)
// arr[i] = 2
// complement = 6 - 2 = 4

// 👉 Is 4 in map? ❌ No

// 👉 Store:

// map = {3 → 0, 2 → 1}
// 🔹 Step 3 (i = 2)
// arr[i] = 4
// complement = 6 - 4 = 2

// 👉 Is 2 in map? ✅ Yes

// 👉 Found answer:

// [map.get(2), i] = [1, 2]
// ✅ Final Answer
// [1, 2]
// 🔥 Visualization Table
// i arr[i] complement Map Before Found? Map After
// 0 3 3 {} ❌ {3:0}
// 1 2 4 {3:0} ❌ {3:0, 2:1}
// 2 4 2 {3:0, 2:1} ✅ —

// 🔷 Approach 1: Brute Force (Nested Loop)

// 👉 Check all pairs

// class TwoSum {
// public static int[] twoSum(int[] arr, int target) {
// for(int i = 0; i < arr.length; i++) {
// for(int j = i + 1; j < arr.length; j++) {
// if(arr[i] + arr[j] == target) {
// return new int[]{i, j};
// }
// }
// }
// return new int[]{-1, -1};
// }
// }
// ⏱ Time Complexity:
// O(n²)
// 📦 Space:
// O(1)
// 🔷 Approach 2: HashMap (Most Important 🔥)

// 👉 Store value → index

// import java.util.*;

// class TwoSum {
// public static int[] twoSum(int[] arr, int target) {
// Map<Integer, Integer> map = new HashMap<>();

// for(int i = 0; i < arr.length; i++) {
// int complement = target - arr[i];

// if(map.containsKey(complement)) {
// return new int[]{map.get(complement), i};
// }

// map.put(arr[i], i);
// }
// return new int[]{-1, -1};
// }
// }
// ⏱ Time:
// O(n) ✅
// 📦 Space:
// O(n)

// 👉 Best for interviews

// 🔷 Approach 3: Two Pointer (Sorted Array)

// 👉 Works only if array is sorted

// class TwoSum {
// public static int[] twoSum(int[] arr, int target) {
// int left = 0;
// int right = arr.length - 1;

// while(left < right) {
// int sum = arr[left] + arr[right];

// if(sum == target) {
// return new int[]{left, right};
// } else if(sum < target) {
// left++;
// } else {
// right--;
// }
// }
// return new int[]{-1, -1};
// }
// }
// ⏱ Time:
// O(n)
// 📦 Space:
// O(1)