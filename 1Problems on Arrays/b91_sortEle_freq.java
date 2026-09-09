// Question: Sort Elements by Frequency

// Given an array of integers, sort the elements according to their frequency.

// Elements with higher frequency come first.
// If two elements have the same frequency, their relative order can be based on the sorting rule given by the problem.
// Example

// Input:

// [2, 3, 2, 4, 5, 4, 2, 3]

// Frequencies:

// 2 → 3 times
// 3 → 2 times
// 4 → 2 times
// 5 → 1 time

// Output:

// 2 3 4 5

// If the question asks to print each element according to its frequency, then:

// 2 2 2 3 3 4 4 5

// | # | Input                 | Frequency Order   |
// | - | --------------------- | ----------------- |
// | 1 | `[2,3,2,4,5,4,2,3]`   | `2, 3, 4, 5`      |
// | 2 | `[1,1,1,2,2,3]`       | `1, 2, 3`         |
// | 3 | `[5,4,3,2,1]`         | All frequency `1` |
// | 4 | `[7,7,7,8,8,9,9,9,9]` | `9, 7, 8`         |
// | 5 | `[1,2,1,2,3,3]`       | `1, 2, 3`         |
// | 6 | `[4,4,4,2,2,1]`       | `4, 2, 1`         |


import java.util.*;

public class b91_sortEle_freq {

    public static void sortByFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Sort array using frequency
        Integer[] temp = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            return map.get(b) - map.get(a);
        });

        // Print result
        for (int x : temp) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 3, 2, 4, 5, 4, 2, 3};

        System.out.print("Sorted by frequency: ");

        sortByFrequency(arr);
    }
}


// 1. Brute Force — O(n²)

// Count frequency for every element, then repeatedly select the highest frequency.

// for(int i = 0; i < n; i++) {
//     int count = 0;

//     for(int j = 0; j < n; j++) {
//         if(arr[i] == arr[j])
//             count++;
//     }

//     System.out.println(arr[i] + " -> " + count);
// }

// To actually sort, you need additional logic.

// Time: O(n²)
// Space: O(1)




// 2. HashMap + Sorting — O(n log n) ⭐

// Most common approach.

// HashMap<Integer,Integer> map = new HashMap<>();

// for(int x : arr)
//     map.put(x, map.getOrDefault(x, 0) + 1);

// Arrays.sort(arr, (a,b) -> {
//     if(map.get(a) != map.get(b))
//         return map.get(b) - map.get(a);
//     return a - b;
// });

// Then:

// for(int x : arr)
//     System.out.print(x + " ");

// Output:

// 2 2 2 3 3 4 4 5

// Time: O(n log n)
// Space: O(n)