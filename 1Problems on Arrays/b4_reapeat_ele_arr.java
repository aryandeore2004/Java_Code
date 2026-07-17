// Problem Statement

// Find all repeating (duplicate) elements in an array.

// Input

// {1, 2, 3, 2, 4, 5, 1, 3}

// Output

// 1 2 3





// 1. Brute Force (Nested Loops)

// Code
// public class RepeatingElements {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

//         for (int i = 0; i < arr.length; i++) {

//             boolean printed = false;

//             for (int k = 0; k < i; k++) {
//                 if (arr[i] == arr[k]) {
//                     printed = true;
//                     break;
//                 }
//             }

//             if (printed)
//                 continue;

//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     System.out.print(arr[i] + " ");
//                     break;
//                 }
//             }
//         }
//     }
// }

// Time Complexity
// O(n²)

// Space Complexity
// O(1)





// 2. HashMap

// Code
// import java.util.HashMap;

// public class RepeatingElements {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int num : arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for (int key : map.keySet()) {
//             if (map.get(key) > 1) {
//                 System.out.print(key + " ");
//             }
//         }
//     }
// }

// Time Complexity
// O(n)

// Space Complexity
// O(n)






// 3. LinkedHashMap (Maintains Order)
// Code
import java.util.LinkedHashMap;

public class b4_reapeat_ele_arr {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
}

// Time Complexity
// O(n)

// Space Complexity
// O(n)








// 4. HashSet
// Code
// import java.util.HashSet;

// public class RepeatingElements {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

//         HashSet<Integer> seen = new HashSet<>();
//         HashSet<Integer> duplicate = new HashSet<>();

//         for (int num : arr) {

//             if (!seen.add(num)) {
//                 duplicate.add(num);
//             }
//         }

//         for (int num : duplicate) {
//             System.out.print(num + " ");
//         }
//     }
// }

// Time Complexity
// O(n)

// Space Complexity
// O(n)

// Note: HashSet does not preserve insertion order.







// 5. LinkedHashSet (Maintains Order)
// Code

// import java.util.LinkedHashSet;

// public class RepeatingElements {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

//         LinkedHashSet<Integer> seen = new LinkedHashSet<>();
//         LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();

//         for (int num : arr) {

//             if (!seen.add(num)) {
//                 duplicate.add(num);
//             }
//         }

//         for (int num : duplicate) {
//             System.out.print(num + " ");
//         }
//     }
// }

// Time Complexity
// O(n)

// Space Complexity
// O(n)





// 6. Sorting

// Code
// import java.util.Arrays;

// public class RepeatingElements {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

//         Arrays.sort(arr);

//         for (int i = 0; i < arr.length - 1; i++) {

//             if (arr[i] == arr[i + 1]) {

//                 if (i == 0 || arr[i] != arr[i - 1]) {
//                     System.out.print(arr[i] + " ");
//                 }
//             }
//         }
//     }
// }

// Time Complexity
// O(n log n)

// Space Complexity
// O(1) (ignoring sorting implementation details)

// Note: Sorting changes the original order of the array.

// Comparison Table

// | Approach      | Time Complexity | Space Complexity | Preserves Original Order |
// | ------------- | --------------- | ---------------- | ------------------------ |
// | Brute Force   | O(n²)           | O(1)             | ✅                        |
// | HashMap       | O(n)            | O(n)             | ❌                        |
// | LinkedHashMap | O(n)            | O(n)             | ✅                        |
// | HashSet       | O(n)            | O(n)             | ❌                        |
// | LinkedHashSet | O(n)            | O(n)             | ✅                        |
// | Sorting       | O(n log n)      | O(1)             | ❌                        |

// Interview Preference

// Best Overall: LinkedHashMap or LinkedHashSet (maintains insertion order).
// Fastest without caring about order: HashMap or HashSet.
// No extra space allowed: Brute Force (or Sorting if modifying the array is acceptable).