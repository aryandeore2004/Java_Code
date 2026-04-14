
// 📌 Idea in One Line:
// Convert array into a Max Heap
// Repeatedly take the largest element (root) and place it at the end
// 💻 Java Code (Important for Interview)

public class b6_heap_sort {

  public static void heapify(int[] arr, int n, int i) {
    int largest = i; // root
    int left = 2 * i + 1; // left child
    int right = 2 * i + 2; // right child

    // check left child
    if (left < n && arr[left] > arr[largest]) {
      largest = left;
    }

    // check right child
    if (right < n && arr[right] > arr[largest]) {
      largest = right;
    }

    // if root is not largest
    if (largest != i) {
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;

      // recursively heapify affected subtree
      heapify(arr, n, largest);
    }
  }

  public static void heapSort(int[] arr) {
    int n = arr.length;

    // Step 1: Build Max Heap
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(arr, n, i);
    }

    // Step 2: Extract elements one by one
    for (int i = n - 1; i > 0; i--) {
      // move current root to end
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      // call heapify on reduced heap
      heapify(arr, i, 0);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 3, 8, 4, 2 };

    heapSort(arr);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
// ⚙️ How It Works (Quick Flow)
// Build Max Heap
// Swap first (largest) with last
// Reduce heap size
// Heapify again
// Repeat

// ⏱ Time Complexity
// Best / Avg / Worst: O(n log n) ✅
// Space: O(1) (in-place)

// 🧠 Key Points
// ✔ No extra memory needed
// ✔ Guaranteed performance
// ❌ Not stable
// ❌ Slightly slower than Quick Sort in practice