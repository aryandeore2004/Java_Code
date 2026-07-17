
// write a program to find whether an array is a subset of another array or not.

// Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array.

// Note: Array elements are assumed to be unique.

// Examples:

// Example 1:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [2,4,3,1,7,5,15]
// Output: arr1[] is a subset of arr2[]

// Example 2: 
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [4,5,2]
// Output: arr1[] is not a subset of arr2[]

// Example 3:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [11,12,13,15,16]
// Output: arr1[] is not a subset of arr2[]
// Disclaimer: Don't jump directly to the solution, try it out yourself first.



// Method 1: Using Nested Loops (Brute Force)

// Idea
// For every element of arr1, search it in arr2.
// If any element is not found, it is not a subset.
// Code

public class b0_sub_arr_another_arr {

    public static boolean isSubset(int arr1[], int arr2[]) {

        if (arr1.length > arr2.length) {
            return false;
         }

        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int arr1[] = {2, 4};
        int arr2[] = {1, 2, 3, 4, 5};

        if (isSubset(arr1, arr2))
            System.out.println("Subset");
        else
            System.out.println("Not a Subset");
    }
}

// Output
// Subset


// Complexity
// Time: O(n × m)
// Space: O(1)





// Method 2: Using HashSet (Best Approach)
// Idea
// Store all elements of arr2 in a HashSet.
// Check whether every element of arr1 exists in the set.
// Code


// import java.util.HashSet;

// public class ArraySubset {

//     public static boolean isSubset(int arr1[], int arr2[]) {

//         HashSet<Integer> set = new HashSet<>();

//         for (int num : arr2) {
//             set.add(num);
//         }

//         for (int num : arr1) {

//             if (!set.contains(num))
//                 return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         int arr1[] = {2, 4};
//         int arr2[] = {1, 2, 3, 4, 5};

//         if (isSubset(arr1, arr2))
//             System.out.println("Subset");
//         else
//             System.out.println("Not a Subset");
//     }
// }

// Output
// Subset

// Complexity
// Time: O(n + m)
// Space: O(m)






// Method 3: Using Sorting + Two Pointers

// Idea
// Sort both arrays.
// Compare them using two pointers.
// If every element of arr1 is found in arr2, then it is a subset.
// Code


// import java.util.Arrays;

// public class ArraySubset {

//     public static boolean isSubset(int arr1[], int arr2[]) {

//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         int i = 0, j = 0;

//         while (i < arr1.length && j < arr2.length) {

//             if (arr1[i] == arr2[j]) {
//                 i++;
//                 j++;
//             } else if (arr1[i] > arr2[j]) {
//                 j++;
//             } else {
//                 return false;
//             }
//         }

//         return i == arr1.length;
//     }

//     public static void main(String[] args) {

//         int arr1[] = {2, 4};
//         int arr2[] = {1, 2, 3, 4, 5};

//         if (isSubset(arr1, arr2))
//             System.out.println("Subset");
//         else
//             System.out.println("Not a Subset");
//     }
// }

// Output
// Subset

// Complexity
// Time: O(n log n + m log m)
// Space: O(1)

// Summary Table

// | Method                     | Time Complexity          | Space Complexity | Best Use Case                   |
// | -------------------------- | ------------------------ | ---------------- | ------------------------------- |
// | **Nested Loops**           | **O(n × m)**             | **O(1)**         | Simple and beginner-friendly    |
// | **HashSet**                | **O(n + m)**             | **O(m)**         | Best and most efficient         |
// | **Sorting + Two Pointers** | **O(n log n + m log m)** | **O(1)**         | When extra space is not allowed |

// comparison

// | Feature             | Nested Loops | HashSet | Sorting  |
// | ------------------- | ------------ | ------- | -------- |
// | Fastest             | ❌            | ✅       | ⭐        |
// | Extra Space         | ❌            | ✅       | ❌        |
// | Uses Sorting        | ❌            | ❌       | ✅        |
// | Easy to Understand  | ✅            | ✅       | Moderate |
// | Interview Preferred | ⭐⭐⭐          | ⭐⭐⭐⭐⭐   | ⭐⭐⭐⭐     |


// Final Recommendation
// HashSet → Best overall (O(n + m)).
// Sorting + Two Pointers → Good when extra memory is restricted.
// Nested Loops → Simplest approach but slower (O(n × m)).