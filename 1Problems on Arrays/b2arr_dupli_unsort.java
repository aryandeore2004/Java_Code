import java.util.*;

public class b2arr_dupli_unsort {

    // Function to remove duplicates from an unsorted array and print unique elements
    public static void dupli(int arr[], int n) {
        // Create a marker array initialized to 1 (1 = keep, 0 = duplicate)
        int mark[] = new int[n];
        for (int m = 0; m < n; m++) {
            mark[m] = 1; // assume all elements are unique initially
        }

        // Outer loop to pick each element
        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) { // only check if not already marked duplicate
                // Inner loop to compare current element with the rest
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        mark[j] = 0; // mark duplicate as 0
                    }
                }
            }
        }

        // Print only those elements which are marked as unique (1)
        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    // Main method to test the above function
    public static void main(String[] args) {
        int arr[] = {51, 1, 1, 24, 12, 51, 24, 1, 12, 51};
        int n = arr.length;
        dupli(arr, n);
    }
}
