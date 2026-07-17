
// Simpler Version (for lowercase letters only with array)
// public class b1_non_reapeating_char {
//     public static void main(String[] args) {
//         String str = "takeuforward";
//         int[] freq = new int[26];

//         // Count frequencies
//         for (char c : str.toCharArray()) {
//             freq[c - 'a']++;
//         }

//         // Print non-repeating
//         System.out.print("Non-repeating characters: ");
//         for (char c : str.toCharArray()) {
//             if (freq[c - 'a'] == 1) {
//                 System.out.print(c + " ");
//             }
//         }
//     }
// }

// ✅ Both work, but:

// HashMap → works for all characters (a-z, A-Z, digits, symbols).

// Array → works only for lowercase English letters.

//*************************************************************************************************** */

import java.util.*;

public class b1_non_reapeating_char {

  public static void findNonRepeating(String str) {
    Map<Character, Integer> freqMap = new LinkedHashMap<>();

    // Step 1: Count frequency
    for (char c : str.toCharArray()) {
      freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }

    // Step 2: Print non-repeating characters
    System.out.print("Non-repeating characters: ");
    for (char c : freqMap.keySet()) {
      if (freqMap.get(c) == 1) {
        System.out.print(c + " ");
      }
      System.out.println(c + "->" + freqMap.get(c));
    }
  }

  public static void main(String[] args) {
    String str = "takeuforward";
    findNonRepeating(str);
  }
}

// Step-by-Step Explanation
// 1. Map<Character, Integer> freqMap = new LinkedHashMap<>();

// We use a map where:

// Key → character (like 't', 'a', 'k', etc.)

// Value → frequency (count of how many times it appears)

// LinkedHashMap is used (instead of HashMap) because it remembers the order in
// which characters appear in the string.

// 2. Counting Frequencies
// for (char c : str.toCharArray()) {
// freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
// }

// str.toCharArray() → converts "takeuforward" into an array of characters:
// ['t','a','k','e','u','f','o','r','w','a','r','d']

// For each character:

// If it already exists in freqMap, increase its count.

// If not, insert it with count 1.

// 👉 After this loop, the map looks like this:

// t → 1
// a → 2
// k → 1
// e → 1
// u → 1
// f → 1
// o → 1
// r → 2
// w → 1
// d → 1

// 3. Printing Only Non-Repeating Characters
// for (char c : str.toCharArray()) {
// if (freqMap.get(c) == 1) {
// System.out.print(c + " ");
// }
// }

// Traverse the string again in original order.

// For each character:

// Check its count in the map → freqMap.get(c).

// If the count is exactly 1, print it (non-repeating).

// This ensures the output preserves the order from the original string.

// 👉 Output for "takeuforward":

// Non-repeating characters: t k e u f o w d
