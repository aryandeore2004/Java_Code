
// Question: Non-Repeating Elements in an Array

// Given an integer array, print all the elements that appear exactly once in the array.

// Example

// Input:

// arr = [1, 1, 2, 5, 12, 8, 2, 8, 17]

// Output:

// 5 12 17
// Test Cases
// #	Input	Expected Output
// 1	[1, 1, 2, 5, 12, 8, 2, 8, 17]	5 12 17
// 2	[1, 2, 3, 4, 5]	1 2 3 4 5
// 3	[1, 1, 2, 2, 3, 3]	No non-repeating element
// 4	[5]	5
// 5	[2, 2, 2, 3, 3, 4]	4
// 6	[-1, -2, -1, 3, 4, 3]	-2 4
// 7	[10, 20, 10, 30, 40, 30]	20 40
// 8	[7, 7, 8, 9, 8]	9
// Important

// Non-repeating means frequency is exactly 1.

// [1, 2, 2, 3]

// 1 → appears 1 time ✅
// 2 → appears 2 times ❌
// 3 → appears 1 time ✅

// Answer: 1 3

import java.util.*;

public class b5_non_repeat_ele_arr {

    public static void nonRepeat_ele(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {1, 1, 2, 5, 12, 8, 2, 8, 17};

        System.out.print("Non-repeating elements: ");
        nonRepeat_ele(arr);
    }
}

// | Method          |         Time |   Space | When to use                |
// | --------------- | -----------: | ------: | -------------------------- |
// | Nested Loop     |      `O(n²)` |  `O(1)` | Basic DSA / beginner       |
// | HashMap         |       `O(n)` |  `O(n)` | ⭐ Best general method      |
// | HashSet         |       `O(n)` |  `O(n)` | When using sets            |
// | Sorting         | `O(n log n)` | Depends | When sorting is acceptable |
// | Frequency Array |       `O(n)` |  `O(k)` | Small integer range        |

// 1. Brute Force — O(n²)
// for(int i = 0; i < n; i++){
//     boolean duplicate = false;

//     for(int j = 0; j < n; j++){
//         if(i != j && arr[i] == arr[j]){
//             duplicate = true;
//             break;
//         }
//     }

//     if(!duplicate)
//         System.out.print(arr[i] + " ");
// }
// 2. HashMap — O(n) ⭐
// HashMap<Integer,Integer> map = new HashMap<>();

// for(int x : arr)
//     map.put(x, map.getOrDefault(x, 0) + 1);

// for(int x : arr)
//     if(map.get(x) == 1)
//         System.out.print(x + " ");
// 3. Sorting — O(n log n)
// Arrays.sort(arr);

// for(int i = 0; i < n; i++){
//     if((i == 0 || arr[i] != arr[i-1]) &&
//        (i == n-1 || arr[i] != arr[i+1]))
//         System.out.print(arr[i] + " ");
// }
// 4. Frequency Array — O(n)
// int freq[] = new int[101];

// for(int x : arr)
//     freq[x]++;

// for(int x : arr)
//     if(freq[x] == 1)
//         System.out.print(x + " ");