import java.util.*;

class a0_java_practice {
  static void bubble_s(int arr[], int n) {
    HashSet<Integer> dup = new HashSet<>();
    for (int i = 0; i < n; i++) {
      dup.add(arr[i]);
    }
    System.out.println(dup);
    HashMap<Integer, Integer> mapp = new HashMap<>();
    for (int num : arr) {
      mapp.put(num, mapp.getOrDefault(num, 0) + 1);
    }
  }

  public static void main(String args[]) {
    // Declare and initialize an unsorted array
    int arr[] = { 4, 2, 8, 65, 12, 5, 2, 4 };

    // Calculate the length of the array
    int n = arr.length;

    // Call the bubble sort function
    bubble_s(arr, n);

  }
}