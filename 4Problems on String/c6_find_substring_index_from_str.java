// Problem statement: “Given two strings text and pattern find the first occurrence of str1 in str2 if found print it’s index if not found print -1.”

// Examples:

// Example 1:
// Input: str1 = "takeuforward"
//        str2 = “forward”
// Output: 5
// Explanation: "Forward" is present in the 5th index in "takeuforward"

// Example 2:
// Input: str1 = “hello”
//        str2 = “az”
// Output: -1
// Explanation: "az" is not a substring of "hello"

import java.util.*;
import java.lang.*;
import java.io.*;

class c6_find_substring_index_from_str {
  public static void main(String[] args) {
    String text = "takeuforward";
    String pattern = "forward";

    int foundIdx = text.indexOf(pattern);

    System.out.println("The substring starts from the index: " + foundIdx);
  }
}

// public class SubstringSearch {

// public static int findIndex(String str1, String str2) {
// int n = str1.length();
// int m = str2.length();

// // Edge case: empty pattern
// if (m == 0) return 0;

// for (int i = 0; i <= n - m; i++) {
// int j;
// for (j = 0; j < m; j++) {
// if (str1.charAt(i + j) != str2.charAt(j)) {
// break;
// }
// }
// // If full pattern matched
// if (j == m) {
// return i;
// }
// }
// return -1; // Not found
// }

// public static void main(String[] args) {
// System.out.println(findIndex("takeuforward", "forward")); // Output: 5
// System.out.println(findIndex("hello", "az")); // Output: -1
// }
// }
