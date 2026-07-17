// Frequency of Elements in an Array (Java)

// There are 3 common approaches to find the frequency of elements in an array.

// 1. Using HashMap (Best Approach)
// Idea
// Traverse the array once.
// Store each element as the key.
// Store its frequency as the value.
// If the element already exists, increment its count.
// Code

import java.util.*;

public class a5arr_ele_freque {

    public static void hashm(int arr[], int n) {

        HashMap<Integer, Integer> freq = new LinkedHashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 54, 62, 75, 10, 54};

        hashm(arr, arr.length);
    }
}

// Output
// 10 -> 2
// 54 -> 2
// 62 -> 1
// 75 -> 1

// Complexity
// Time: O(n)
// Space: O(n)

// Advantages
// Fastest approach.
// Preserves insertion order using LinkedHashMap.
// Suitable for large arrays.






// 2. Using Nested Loops (Brute Force)

// Idea
// Compare every element with every other element.
// Use a visited[] array so duplicate elements are not counted again.
// Code

// public class FrequencyNestedLoop {

//     public static void ele_freque(int arr[], int n) {

//         boolean visited[] = new boolean[n];

//         for (int i = 0; i < n; i++) {

//             if (visited[i])
//                 continue;

//             int count = 1;

//             for (int j = i + 1; j < n; j++) {

//                 if (arr[i] == arr[j]) {
//                     visited[j] = true;
//                     count++;
//                 }
//             }

//             System.out.println(arr[i] + " -> " + count);
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = {10, 54, 62, 75, 10, 54};

//         ele_freque(arr, arr.length);
//     }
// }

// Output
// 10 -> 2
// 54 -> 2
// 62 -> 1
// 75 -> 1

// Complexity
// Time: O(n²)
// Space: O(n) (Visited array)

// Advantages
// Does not use HashMap.
// Easy to understand.
// Commonly asked in interviews and exams.







// 3. Using Sorting + Counting
// Idea
// Sort the array first.
// Adjacent duplicate elements become consecutive.
// Count consecutive duplicates.
// Code

// import java.util.*;

// public class FrequencySorting {

//     public static void neur(int arr[], int n) {

//         Arrays.sort(arr);

//         int count = 1;

//         for (int i = 0; i < arr.length - 1; i++) {

//             if (arr[i] == arr[i + 1]) {
//                 count++;
//             } else {
//                 System.out.println(arr[i] + " -> " + count);
//                 count = 1;
//             }
//         }

//         System.out.println(arr[arr.length - 1] + " -> " + count);
//     }

//     public static void main(String[] args) {

//         int arr[] = {10, 54, 62, 75, 10, 54};

//         neur(arr, arr.length);
//     }
// }

// Output
// 10 -> 2
// 54 -> 2
// 62 -> 1
// 75 -> 1

// Complexity
// Time: O(n log n)
// Space: O(1) (Ignoring sorting's internal space)'
// 


// Advantages
// No HashMap required.
// Better than brute force.
// Useful when sorting is acceptable.

//summary
// | Method                 | Time Complexity | Space Complexity         | Preserves Original Order | Best Use Case               |
// | ---------------------- | --------------- | ------------------------ | ------------------------ | --------------------------- |
// | **HashMap**            | **O(n)**        | **O(n)**                 | ✅ Yes (LinkedHashMap)    | Best and most efficient     |
// | **Nested Loops**       | **O(n²)**       | **O(n)** (visited array) | ✅ Yes                    | When HashMap is not allowed |
// | **Sorting + Counting** | **O(n log n)**  | **O(1)**                 | ❌ No (array gets sorted) | When sorting is acceptable  |

// comparision
// | Feature                | HashMap | Nested Loop | Sorting |
// | ---------------------- | ------- | ----------- | ------- |
// | Fastest                | ✅       | ❌           | ❌       |
// | Uses Extra Memory      | ✅       | ✅ (visited) | ❌       |
// | Changes Original Array | ❌       | ❌           | ✅       |
// | Easy to Implement      | ✅       | ✅           | ✅       |
// | Interview Preferred    | ⭐⭐⭐⭐⭐   | ⭐⭐⭐⭐        | ⭐⭐⭐⭐    |
