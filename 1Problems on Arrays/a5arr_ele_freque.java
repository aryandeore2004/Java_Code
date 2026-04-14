import java.util.*;

public class a5arr_ele_freque {
    public static void main(String args[]) {
        int arr[] = { 10, 54, 62, 75, 10, 54 };
        int n = arr.length;
        neur(arr, n);
    }

    static void neur(int arr[], int n) {

        Arrays.sort(arr);

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " -> " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " -> " + count);
    }

    public static void hashm(int arr[], int n) {
        HashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        }
        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }

    public static void ele_freque(int arr[], int n) {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            int count = 1;

            if (visited[i] == true) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("The Frequency of " + arr[i] + " is " + count);
        }
    }
}

// 1. Using HashMap (Best & Most Efficient)

// ✅ Time: O(n), Space: O(n)

// import java.util.HashMap;

// public class FrequencyHashMap {
// public static void main(String[] args) {
// int arr[] = {1, 2, 2, 3, 4, 3, 2, 1, 5};
// HashMap<Integer, Integer> freq = new HashMap<>();

// for (int num : arr) {
// freq.put(num, freq.getOrDefault(num, 0) + 1);
// }

// for (int key : freq.keySet()) {
// System.out.println(key + " -> " + freq.get(key));
// }
// }
// }

// 2. Using Nested Loops (Brute Force)

// ✅ Time: O(n²), Space: O(1)
// (Useful in exams when HashMap not allowed)

// public class FrequencyNestedLoop {
// public static void main(String[] args) {
// int arr[] = {1, 2, 2, 3, 4, 3, 2, 1, 5};
// boolean visited[] = new boolean[arr.length];

// for (int i = 0; i < arr.length; i++) {
// if (visited[i]) continue; // skip already counted

// int count = 1;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// visited[j] = true;
// count++;
// }
// }
// System.out.println(arr[i] + " -> " + count);
// }
// }
// }

// 3. Using Sorting + Counting

// ✅ Time: O(n log n) (due to sorting), Space: O(1)

// import java.util.Arrays;

// public class FrequencySorting {
// public static void main(String[] args) {
// int arr[] = {1, 2, 2, 3, 4, 3, 2, 1, 5};
// Arrays.sort(arr);

// int count = 1;
// for (int i = 1; i < arr.length; i++) {
// if (arr[i] == arr[i - 1]) {
// count++;
// } else {
// System.out.println(arr[i - 1] + " -> " + count);
// count = 1;
// }
// }
// System.out.println(arr[arr.length - 1] + " -> " + count);
// }
// }