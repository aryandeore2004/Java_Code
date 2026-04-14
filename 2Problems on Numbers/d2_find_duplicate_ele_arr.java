
// Find duplicate elements in an array.

// 📥 Input:
// 6
// 1 2 3 2 4 1
// 📤 Output:
// 2 1
// 💻 ✅ Method 1: Using HashSet (BEST & EASY)
import java.util.*;

public class d2_find_duplicate_ele_arr {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    // **********HashSet************************
    // HashSet<Integer> seen = new HashSet<>();
    // HashSet<Integer> duplicate = new HashSet<>();

    // for (int i = 0; i < n; i++) {
    // if (!seen.add(arr[i])) {
    // duplicate.add(arr[i]);
    // }
    // }

    // for (int x : duplicate) {
    // System.out.print(x + " ");
    // }

    // **********HashMap************************
    HashMap<Integer, Integer> map1 = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map1.put(arr[i], map1.getOrDefault(arr[i], 0) + 1);
    }

    for (int key : map1.keySet()) {
      if (map1.get(key) > 1) {
        System.err.println(key + " ");
      }
    }
  }
}