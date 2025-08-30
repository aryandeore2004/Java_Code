// import java.util.*;
// public class b8_replace_rank {
//   public static void main(String args[]) {
//     int n = 6;
//     int arr[] = {20,15,26,2,98,6};
//     for (int i = 0; i < n; i++) {
//       Set < Integer > s = new HashSet < Integer > ();
//       for (int j = 0; j < n; j++) {
//         if (arr[j] < arr[i]) {
//           s.add(arr[j]);
//         }
//       }
//       int rank = s.size() + 1;
//       System.out.print(rank + " ");
//     }
//   }
// }

import java.util.*;

public class b8_replace_rank {

  public static void replaceWithRank(int[] arr) {
    int n = arr.length;
    int[] temp = arr.clone();
    Arrays.sort(temp);

    // Step 1: Create a rank array
    int[] rank = new int[n];

    // Step 2: Assign rank to each element in original array
    for (int i = 0; i < n; i++) {
      // Find index in sorted array
      for (int j = 0; j < n; j++) {
        if (arr[i] == temp[j]) {
          rank[i] = j + 1; // rank starts from 1
          break;
        }
      }
    }

    // Step 3: Copy rank back to arr
    for (int i = 0; i < n; i++) {
      arr[i] = rank[i];
    }
  }

  public static void main(String[] args) {
    int[] arr = { 20, 15, 26, 2, 98, 6 };
    replaceWithRank(arr);
    System.out.println("Array after replacing with ranks: " + Arrays.toString(arr));
  }
}
