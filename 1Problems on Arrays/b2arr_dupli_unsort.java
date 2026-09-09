// Problem Statement

// Title: Remove Duplicates from an Unsorted Array

// Description
// Given an unsorted integer array, remove all duplicate elements and print only the unique elements while preserving the order of their first occurrence.

// Example 1
// Input
// arr = [4, 2, 4, 5, 2, 3, 1]
// Output
// 4 2 5 3 1

// Example 2
// Input
// arr = [10, 20, 10, 30, 20, 40]
// Output
// 10 20 30 40





// Approach 1: Using LinkedHashSet (Optimal)

// A LinkedHashSet:

// Removes duplicates automatically.
// Preserves insertion order.

// Code
import java.util.LinkedHashSet;

public class b2arr_dupli_unsort {
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 5, 2, 3, 1};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.print("Unique Elements: ");

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}

// Output
// Unique Elements: 4 2 5 3 1

// Time Complexity
// O(n)

// Space Complexity
// O(n)








// Approach 2: Using LinkedHashMap
// Code

// import java.util.LinkedHashMap;

// public class RemoveDuplicates {
//     public static void main(String[] args) {

//         int[] arr = {4, 2, 4, 5, 2, 3, 1};

//         LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

//         for (int num : arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         System.out.print("Unique Elements: ");

//         for (int key : map.keySet()) {
//             System.out.print(key + " ");
//         }
//     }
// }

// Output
// Unique Elements: 4 2 5 3 1

// Time Complexity
// O(n)

// Space Complexity
// O(n)






// Approach 3: Brute Force (Without Hashing)
// Idea

// For every element, check whether it has already appeared before.

// Code

// public class RemoveDuplicates {
//     public static void main(String[] args) {

//         int[] arr = {4, 2, 4, 5, 2, 3, 1};

//         for (int i = 0; i < arr.length; i++) {

//             boolean duplicate = false;

//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     duplicate = true;
//                     break;
//                 }
//             }

//             if (!duplicate) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }

// Output
// 4 2 5 3 1

// Time Complexity
// O(n²)

// Space Complexity
// O(1)





// | Approach                       | Time Complexity | Space Complexity | Notes                                                                                                                    |
// | ------------------------------ | --------------- | ---------------- | ------------------------------------------------------------------------------------------------------------------------ |
// | **Brute Force (Nested Loops)** | O(n²)           | O(1)             | Compare each element with all previous elements.                                                                         |
// | **HashSet**                    | O(n)            | O(n)             | Removes duplicates, **does not preserve order**.                                                                         |
// | **LinkedHashSet** ⭐            | O(n)            | O(n)             | Removes duplicates and **preserves insertion order**. (Best for this problem)                                            |
// | **HashMap**                    | O(n)            | O(n)             | Store frequencies using `getOrDefault()`. Order is **not guaranteed**.                                                   |
// | **LinkedHashMap**              | O(n)            | O(n)             | Store frequencies and preserve insertion order.                                                                          |
// | **Sorting + Scan**             | O(n log n)      | O(1) or O(n)*    | Sort the array, then remove adjacent duplicates.       **                                                                        Order changes**, so not suitable if original order   m                                                                          must be preserved. |
