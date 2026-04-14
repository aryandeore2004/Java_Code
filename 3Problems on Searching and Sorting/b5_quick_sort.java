// ⏱ Time Complexity
// ✅ Best Case
// O(n log n)
// When pivot divides array into equal halves
// ✅ Average Case
// O(n log n)
// Most practical scenarios
// ❌ Worst Case
// O(n²)
// When array is already sorted OR pivot is bad

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

public class b5_quick_sort {

  // Partition function (your method)
  static int partition(int[] arr, int low, int high) {

    // Step 1: Choose middle element as pivot
    int pivot = arr[(low + high) / 2];

    // Step 2: Loop until pointers cross
    while (low <= high) {

      // Move left pointer until element >= pivot
      while (arr[low] < pivot) {
        low++;
      }

      // Move right pointer until element <= pivot
      while (arr[high] > pivot) {
        high--;
      }

      // Step 3: Swap elements if needed
      if (low <= high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        // Move both pointers
        low++;
        high--;
      }
    }

    // Return partition index
    return low;
  }

  // Quick Sort function
  static void quickSort(int[] arr, int low, int high) {

    // Base condition
    if (low < high) {

      // Get partition index
      int pi = partition(arr, low, high);

      // Sort left part
      quickSort(arr, low, pi - 1);

      // Sort right part
      quickSort(arr, pi, high);
    }
  }

  // Main method
  public static void main(String[] args) {

    int[] arr = { 5, 3, 8, 4, 2 };

    // Call quick sort
    quickSort(arr, 0, arr.length - 1);

    // Print sorted array
    System.out.println("Sorted Array:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}