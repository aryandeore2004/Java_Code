// ⏱ Time Complexity
// ✅ Best Case
// O(n log n)
// When pivot divides array into equal halves

// ✅ Average Case
// O(n log n)
// Most practical scenarios

// ❌ Worst Case
// O(n²)
// When array is already sorted OR pivot is highest or lowest element

// 👉 Example:

// [1, 2, 3, 4, 5]
// 💾 Space Complexity
// 🔹 Auxiliary Space (Recursion Stack)
// O(log n) → Best & Average
// O(n) → Worst case                                 //due to temporary array

// 👉 Because Quick Sort uses recursion

//**************************************************************************************************
// *********************** */

// ⚔️ Merge Sort vs Quick Sort (When to Use)
// 📊 Quick Comparison
// Feature	Quick Sort	Merge Sort
// Time (Avg)	O(n log n)	O(n log n)
// Time (Worst)	❌ O(n²)	✅ O(n log n)
// Space	✅ O(log n)	❌ O(n)
// Stability	❌ Not stable	✅ Stable
// Speed (practical)	🔥 Faster	Slightly slower
// ⚡ When to Use Quick Sort

// 👉 Use Quick Sort when:

// You want fast performance
// Memory is limited
// Data is in array (in-place sorting)
// 🧠 Example:
// Competitive coding
// General-purpose sorting
// Internal sorting in arrays
// ⚖️ When to Use Merge Sort

// 👉 Use Merge Sort when:

// You need stable sorting
// Working with linked list
// Need guaranteed O(n log n)
// 🧠 Example:
// Sorting objects (like students by marks + name)
// External sorting (large files)
// Databases
// 🔥 Simple Decision Rule

// 👉 Ask yourself:

// Need speed + less memory → Quick Sort
// Need stability + guaranteed time → Merge Sort
/***************************************************************************************************************
 * 
 */



import java.util.*;

class b5_quick_sort {

    // This function places the pivot at its correct position
    // and puts smaller elements on the left
    // and larger elements on the right
    static int partition(int[] arr, int low, int high) {

        // Choose the last element as pivot
        int pivot = arr[high];

        // i keeps track of the position
        // where the smaller element should be placed
        int i = low - 1;

        // Traverse from low to high - 1
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {

                // Move i forward
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the position of pivot
        return i + 1;
    }

    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {

        // Continue only if there are at least 2 elements
        if (low < high) {

            // Partition the array
            int pivotIndex = partition(arr, low, high);

            // Sort the left part
            quickSort(arr, low, pivotIndex - 1);

            // Sort the right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {7, 2, 9, 4, 3};

        // Call Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }
}