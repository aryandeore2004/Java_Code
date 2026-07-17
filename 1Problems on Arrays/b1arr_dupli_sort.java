// problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

// Note: Return k after placing the final result in the first k slots of the array.

// Examples

// Example 1: 

// Input: arr[1,1,2,2,2,3,3]

// Output: arr[1,2,3,_,_,_,_]

// Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

// Example 2: 

// Input: arr[1,1,1,2,2,3,3,3,3,4,4]

// Output: arr[1,2,3,4,_,_,_,_,_,_,_]

// Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.





// Correct Version (Using Adjacent Comparison)
public class b1arr_dupli_sort {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 3};

        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Copy the last element
        arr[j] = arr[arr.length - 1];
        j++;

        System.out.println("Unique Elements:");

        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Output
// Unique Elements:
// 1 2 3


// Time Complexity: O(n)

// One traversal of the array.
// Copying the last element takes constant time O(1).

// Space Complexity: O(1)

// No extra array or data structure is used.









// 2. Two-Pointer Approach (Optimal)

// Time Complexity: O(n)

// The array is traversed only once.

// Space Complexity: O(1)

// Only two pointers (i and j) are used.


// public class b1arr_dupli_sort {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 2, 3, 3, 4, 4};

//         int i = 0;

//         for (int j = 1; j < arr.length; j++) {
//             if (arr[i] != arr[j]) {
//                 i++;
//                 arr[i] = arr[j];
//             }
//         }

//         System.out.println("Number of unique elements = " + (i + 1));

//         for (int k = 0; k <= i; k++) {
//             System.out.print(arr[k] + " ");
//         }
//     }
// }







// 3. HashMap / LinkedHashMap Approach

// Time Complexity: O(n)

// Traverse the array once to build the map.
// Printing the keys takes O(k), where k is the number of unique elements.
// Overall: O(n).

// Space Complexity: O(n)

// Extra space is required for the map.


// import java.util.LinkedHashMap;

// public class RemoveDuplicates {
//     public static void main(String[] args) {

//         int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

//         LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();

//         // Count frequency
//         for (int num : arr) {
//             freq.put(num, freq.getOrDefault(num, 0) + 1);
//         }

//         // Print unique elements
//         System.out.print("Array after removing duplicates: ");
//         for (int key : freq.keySet()) {
//             System.out.print(key + " ");
//         }

//         System.out.println("\nNumber of unique elements = " + freq.size());
//     }
// }

// Output
// Array after removing duplicates: 1 2 3 4 5

// Number of unique elements = 5

// Time Complexity

// Building the LinkedHashMap: O(n)
// Printing the keys: O(k), where k is the number of unique elements.
// Overall: O(n)

// Space Complexity
// O(n)










// 4. Brute Force (Compare with All Previous Elements)

// Time Complexity: O(n²)

// Nested loops.

// Space Complexity: O(1)


// Approach

// For each element:

// Compare it with all previous elements.
// If it is already present, skip it.
// Otherwise, keep it.
// Java Code
// public class RemoveDuplicates {

//     public static void main(String[] args) {

//         int[] arr = {1, 2, 2, 3, 3, 4, 4};

//         int k = 0;

//         for (int i = 0; i < arr.length; i++) {

//             boolean duplicate = false;

//             for (int j = 0; j < k; j++) {
//                 if (arr[i] == arr[j]) {
//                     duplicate = true;
//                     break;
//                 }
//             }

//             if (!duplicate) {
//                 arr[k] = arr[i];
//                 k++;
//             }
//         }

//         System.out.println("Unique elements:");
//         for (int i = 0; i < k; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
// Output
// 1 2 3 4
// Time Complexity
// Outer loop: O(n)
// Inner loop: O(n) (in the worst case)

// Overall: O(n²)

// Space Complexity
// O(1)