
// Time complexity: O(nlogn)

// Reason: At each step, we divide the whole array, for that logn and we assume
// n steps are taken to get a sorted array, so overall time complexity will be
// nlogn

// Space complexity: O(n)

// Reason: We are using a temporary array to store elements in sorted order.

// Auxiliary Space Complexity: O(n)

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

import java.util.*;

class Solution {
  private static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>(); // temporary array
    int left = low; // starting index of left half of arr
    int right = mid + 1; // starting index of right half of arr

    // storing elements in the temporary array in a sorted manner//

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    // if elements on the left half are still left //

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    // if elements on the right half are still left //
    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    // transfering all elements from temporary to arr //
    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  public static void mergeSort(int[] arr, int low, int high) {
    if (low >= high)
      return;
    int mid = (low + high) / 2;
    mergeSort(arr, low, mid); // left half
    mergeSort(arr, mid + 1, high); // right half
    merge(arr, low, mid, high); // merging sorted halves
  }
}

public class b4_merge_sort {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 7;
    int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
    System.out.println("Before sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    Solution.mergeSort(arr, 0, n - 1);
    System.out.println("After sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
// Output:

// Before Sorting Array:
// 9 4 7 6 3 1 5
// After Sorting Array:
// 1 3 4 5 6 7 9
