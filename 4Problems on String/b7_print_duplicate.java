// Print all the duplicates in the string

// Problem Statement: Given a string of characters from a to z. Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.

// Examples:

// Example 1:
// Input:
//  str= "sinstriiintng"
// Output:
// i - 4
// n - 3
// s - 2
// t - 2
// Explanation:
// In the above example, 's' occurs twice, 'i' occurs four times, 't' occurs twice and 'n' occurs thrice. 'r' and 'g' occur only one time and hence are not considered.

// Example 2:
// Input:
//  str= "abcdefg"
// Output:
// < -- No Output -- >
// Explanation:

// In the above example, every character occurs only once(no duplicates), therefore nothing to print.

import java.util.*;

public class b7_print_duplicate {

  public static void print_dupli(String str) {

    HashMap<Character, Integer> freqMap = new LinkedHashMap<>();
    for (char ch : str.toCharArray()) {
      freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
    }
    boolean isDuplicate = false;

    for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + " - " + entry.getValue());
        isDuplicate = true;
      }
    }
    if (!isDuplicate) {
      System.out.println("< -- No Output -- >");
    }

  }

  public static void main(String[] args) {
    String str = "aryandeooreapy";
    print_dupli(str);
  }
}

// import java.util.*;

// class Solution {
// public static void main(String[] args) {
// String str = "sinstriiintng";

// int[] counts = new int[26];

// for (int i = 0; i < str.length(); i++)
// counts[str.charAt(i) - 'a']++;

// for (int i = 0; i < 26; i++)
// if (counts[i] > 1)
// System.out.println((char)(i + 'a') + " - " + counts[i]);
// }
// }