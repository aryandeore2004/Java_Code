// Question: Replace Array Elements with Their Rank

// Given an array of distinct integers, replace each element with its rank when the array is sorted in ascending order.

// The smallest element gets rank 1, the second smallest gets rank 2, and so on.

// Example

// Input:

// [20, 15, 26, 2, 98, 6]

// Sorted array:

// [2, 6, 15, 20, 26, 98]

// Therefore:

// 2  → 1
// 6  → 2
// 15 → 3
// 20 → 4
// 26 → 5
// 98 → 6

// Output:

// [4, 3, 5, 1, 6, 2]
// Test Cases
// #	Input	Expected Output
// 1	[20,15,26,2,98,6]	[4,3,5,1,6,2]
// 2	[10,20,30,40]	[1,2,3,4]
// 3	[40,30,20,10]	[4,3,2,1]
// 4	[5]	[1]
// 5	[3,1,2]	[3,1,2]
// 6	[100,50,25,75]	[4,2,1,3]
// Important

// For your current code:

// Input:  20 15 26 2 98 6
// Rank:    4  3  5 1  6 2



// import java.util.*;
// public class b8_replace_rank {
//   public static void main(String args[]) {
//     int n = 6;
//     int arr[] = {20,15,26,2,98,6};
//     for (int i = 0; i < n; i++) {
//       Set < Integer > s = new HashSet < Integer > ();
//       for (int j = 0; j < n; j++) {
//         if (arr[j] < arr[i]) {
//           s.add(arr[j]);
//         }
//       }
//       int rank = s.size() + 1;
//       System.out.print(rank + " ");
//     }
//   }
// }
import java.util.*;
public class b8_replace_rank {

    public static void rank(int arr[]) {

    int temp[] = arr.clone();
    Arrays.sort(temp);

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i = 0; i < temp.length; i++) {
        map.put(temp[i], i + 1);
    }

    for(int x : arr) {
        System.out.print(map.get(x) + " ");
    }
}
    public static void main(String[] args) {

        int arr[] = {20, 15, 26, 2, 98, 6};

        System.out.print("Rank array: ");
        rank(arr);
    }
}


// 1. Brute Force — O(n²) ⭐

// Count how many elements are smaller than the current element.

// public static void rank(int arr[]) {

//     for(int i = 0; i < arr.length; i++) {

//         int r = 1;

//         for(int j = 0; j < arr.length; j++) {
//             if(arr[j] < arr[i])
//                 r++;
//         }

//         System.out.print(r + " ");
//     }
// }
// Logic

// For 20:

// Elements smaller than 20:
// 15, 2, 6 → 3

// Rank = 3 + 1 = 4
// 2. Sorting + Linear Search — O(n²)

// This is similar to your current code.

// public static void rank(int arr[]) {

//     int temp[] = arr.clone();
//     Arrays.sort(temp);

//     for(int i = 0; i < arr.length; i++) {

//         for(int j = 0; j < temp.length; j++) {

//             if(arr[i] == temp[j]) {
//                 System.out.print((j + 1) + " ");
//                 break;
//             }
//         }
//     }
// }
// Sort → [2,6,15,20,26,98]

// 20 → index 3 → rank 4
// 15 → index 2 → rank 3
// 26 → index 4 → rank 5
// 2  → index 0 → rank 1
// 98 → index 5 → rank 6
// 6  → index 1 → rank 2

// Time: O(n²)
// Space: O(n)

// 3. Sorting + HashMap — O(n log n) ⭐⭐⭐

// Better approach.

// public static void rank(int arr[]) {

//     int temp[] = arr.clone();
//     Arrays.sort(temp);

//     HashMap<Integer,Integer> map = new HashMap<>();

//     for(int i = 0; i < temp.length; i++) {
//         map.put(temp[i], i + 1);
//     }

//     for(int x : arr) {
//         System.out.print(map.get(x) + " ");
//     }
// }
// Logic

// Sorted:

// [2, 6, 15, 20, 26, 98]

// Map:

// 2  → 1
// 6  → 2
// 15 → 3
// 20 → 4
// 26 → 5
// 98 → 6

// Then lookup original elements:

// 20 → 4
// 15 → 3
// 26 → 5
// 2  → 1
// 98 → 6
// 6  → 2

// Time: O(n log n)
// Space: O(n)

// 4. TreeMap — O(n log n)

// Another possible approach:

// TreeSet<Integer> set = new TreeSet<>();

// for(int x : arr)
//     set.add(x);

// HashMap<Integer,Integer> map = new HashMap<>();

// int r = 1;

// for(int x : set)
//     map.put(x, r++);

// for(int x : arr)
//     System.out.print(map.get(x) + " ");

// Time: O(n log n)
// Space: O(n)

// Comparison
// Approach	Time	Space	Importance
// Count smaller	O(n²)	O(1)	⭐ Easy
// Sort + Search	O(n²)	O(n)	⭐ Your approach
// Sort + HashMap	O(n log n)	O(n)	⭐⭐⭐ Best
// TreeSet + Map	O(n log n)	O(n)	⭐ Good