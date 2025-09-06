
import java.util.*;

public class b6_remove_duplicate {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 4, 4, 5, 5, 1 };

    Set<Integer> set = new LinkedHashSet<>(); // keeps insertion order
    for (int num : arr) {
      set.add(num);
    }

    System.out.println("After removing duplicates: " + set);
  }
}

// public class b6_remove_duplicate {

// public static String removeDuplicate(String str) {
// boolean[] seen = new boolean[256];
// StringBuilder result = new StringBuilder();
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// if (!seen[ch]) {
// seen[ch] = true;
// result.append(ch);

// }

// }
// return result.toString();
// }

// public static void main(String[] args) {
// String str = "aryan deore";
// System.out.println("After removing duplicate in string " + str + " is " +
// removeDuplicate(str));
// }
// }

// This solution works in O(n) time and uses O(1) extra space (constant size
// boolean[256]).

// class Main {
// public static String removeDuplicateLetters(String s) {

// String ans = "";
// for (int i = 0; i < s.length(); i++) {
// int j = 0;
// for (j = 0; j < i; j++) {
// if (s.charAt(i) == s.charAt(j)) //same character found
// {
// break;
// }
// }
// if (i == j) {
// ans += s.charAt(i);
// }
// }
// return ans;
// }
// public static void main(String[] args) {
// String str = "cbacdcbc";
// System.out.println("Original String: "+str);
// System.out.println("After removing duplicates:
// "+removeDuplicateLetters(str));

// }
// }
// Output:

// Original String: cbacdcbc
// After removing duplicates: cbad

// Time Complexity: O(N^2)

// Space Complexity: O(1)
