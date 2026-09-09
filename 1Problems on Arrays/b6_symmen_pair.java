// Question: Find Symmetric Pairs in an Array

// Given an array of pairs (a, b), find and print all symmetric pairs.

// A pair (a, b) is symmetric if another pair (b, a) exists in the array.

// Example

// Input:

// arr = {{1,2}, {2,1}, {3,4}, {4,5}, {5,4}}

// Output:

// Symmetric pairs:
// (2,1) (5,4)
// Test Cases
// #	Input	Expected Output
// 1	{{1,2},{2,1},{3,4},{4,5},{5,4}}	(2,1) (5,4)
// 2	{{1,2},{2,1}}	(2,1)
// 3	{{1,2},{3,4},{5,6}}	No symmetric pair
// 4	{{1,1},{2,2}}	(1,1) (2,2)
// 5	{{1,2},{2,1},{2,3},{3,2}}	(2,1) (3,2)
// 6	{{5,6},{6,5},{7,8}}	(6,5)


import java.util.*;

public class b6_symmen_pair {

    public static void main(String args[]) {

        int arr[][] = {
            {1, 2},
            {2, 1},
            {3, 4},
            {4, 5},
            {5, 4}
        };

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Symmetric pairs:");

        for (int i = 0; i < arr.length; i++) {

            int a = arr[i][0];
            int b = arr[i][1];

            if (map.containsKey(b) && map.get(b) == a) {
                System.out.print("(" + a + "," + b + ") ");
            }

            map.put(a, b);
        }
    }
}

// 1. Brute Force — O(n²)
// for(int i = 0; i < n; i++){
//     for(int j = i + 1; j < n; j++){

//         if(arr[i][0] == arr[j][1] &&
//            arr[i][1] == arr[j][0]){

//             System.out.print("(" + arr[j][0] + "," + arr[j][1] + ") ");
//         }
//     }
// }

// Idea: For every pair, search the entire array for its reverse.

// 2. HashMap — O(n) ⭐
// HashMap<Integer,Integer> map = new HashMap<>();

// for(int i = 0; i < n; i++){

//     int a = arr[i][0];
//     int b = arr[i][1];

//     if(map.containsKey(b) && map.get(b) == a){
//         System.out.print("(" + a + "," + b + ") ");
//     }

//     map.put(a, b);
// }

// Idea:

// (1,2) → store 1 → 2

// (2,1) → check 2 → 1
//           found → symmetric
// 3. HashSet — O(n) ⭐

// Store each pair as a string/key.

// HashSet<String> set = new HashSet<>();

// for(int i = 0; i < n; i++){

//     int a = arr[i][0];
//     int b = arr[i][1];

//     if(set.contains(b + "," + a)){
//         System.out.print("(" + a + "," + b + ") ");
//     }

//     set.add(a + "," + b);
// }

// Idea:

// Current:  (2,1)
// Check:    (1,2)
//            ↑
//          exists

// | Approach    |    Time |  Space | Important |
// | ----------- | ------: | -----: | --------- |
// | Brute Force | `O(n²)` | `O(1)` | ⭐ Easy    |
// | HashMap     |  `O(n)` | `O(n)` | ⭐ Best    |
// | HashSet     |  `O(n)` | `O(n)` | Good      |
