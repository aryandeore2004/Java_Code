
import java.util.*;

public class TCS10APril2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Step 1: Read number of employees
    int n = sc.nextInt();

    // Validate input for n
    if (n <= 0) {
      System.out.println("Invalid Input");
      return;
    }

    // Step 2: Read efficiency values into array
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // Step 3: Read group size (t)
    int t = sc.nextInt();

    // Validate group size
    if (t <= 0 || t > n) {
      System.out.println("Invalid Input");
      return;
    }

    // Step 4: Sort the array
    // Sorting ensures minimum difference within each group
    Arrays.sort(arr);

    // Variable to store maximum difference among all groups
    int maxDiff = Integer.MIN_VALUE;

    // Step 5: Form groups of size t
    // We increment by t to ensure non-overlapping groups
    // Extra elements (if any) are automatically ignored
    for (int i = 0; i + t - 1 < n; i += t) {

      // Minimum element in current group
      int min = arr[i];

      // Maximum element in current group
      int max = arr[i + t - 1];

      // Calculate difference for the group
      int diff = max - min;

      // Update maximum difference
      maxDiff = Math.max(maxDiff, diff);
    }

    // Step 6: Print the final result
    System.out.println(maxDiff);
  }
}

// The time complexity is O(N log N) due to sorting, and space complexity is
// O(1) since we are not using any extra space apart from variables.”

// 🧾 Question: Group Formation Based on Efficiency

// An organization has n employees, each with a certain efficiency value.

// You are required to form groups of size t such that:

// Each group contains exactly t employees.
// If n is not divisible by t, the extra employees are ignored (removed).
// 📌 Task

// For each group:

// Calculate the difference between the highest and lowest efficiency in that
// group.

// Finally:

// Return the maximum difference among all groups.
// 📥 Input Format
// Integer n → number of employees
// Array of n integers → efficiency values
// Integer t → size of each group
// 📤 Output Format
// Print a single integer → maximum difference among all groups
// If input is invalid, print:
// Invalid Input
// ⚠️ Constraints
// 1 < n ≤ 100000
// 1 ≤ t ≤ n
// 1 ≤ efficiency[i] ≤ 10^9
// 🚫 Invalid Input Conditions
// n ≤ 1
// t ≤ 0 or t > n
// Missing or insufficient efficiency values
// 🧪 Sample Input
// 9
// 12 11 35 32 10 25 24 14 13
// 4
// ✅ Sample Output
// 11
// 💡 Explanation

// After sorting:

// 10 11 12 13 14 24 25 32 35

// Form groups of size 4:

// Group 1: 10 11 12 13 → diff = 3
// Group 2: 14 24 25 32 → diff = 18

// (Last element 35 is ignored)

// 👉 Maximum difference = 18

// ⚠️ But optimal grouping:

// 10 11 12 13 → 3
// 24 25 32 35 → 11

// 👉 Final Answer = 11

// 🧠 Key Points

// ✔ Sort the array
// ✔ Form groups of size t
// ✔ Ignore leftover elements
// ✔ Use greedy grouping (continuous elements)