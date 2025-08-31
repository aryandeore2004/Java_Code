
public class a9_char_freq_string {
    public static void main(String[] args) {
        String str = "takeuforward";
        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.print((char)(i + 'a') + "" + freq[i] + " ");
            }
        }
    }
}

// Step-by-Step Explanation
// 1. int[] freq = new int[26];

// We create an array of size 26.

// Each index corresponds to a lowercase letter:

// freq[0] → count of 'a'

// freq[1] → count of 'b'

// …

// freq[25] → count of 'z'

// 2. Loop over each character
// for (char c : str.toCharArray()) {
// freq[c - 'a']++;
// }

// c - 'a' converts a character into an index:

// 'a' - 'a' = 0

// 'b' - 'a' = 1

// 'c' - 'a' = 2

// 't' - 'a' = 19

// So when we see 't', we do freq[19]++.

// When we see 'a', we do freq[0]++.

// 👉 Example with "takeuforward":

// 't' → freq[19]++

// 'a' → freq[0]++

// 'k' → freq[10]++

// 'e' → freq[4]++

// …

// 'r' appears twice → freq[17] = 2

// 3. Print results
// for (int i = 0; i < 26; i++) {
// if (freq[i] > 0) {
// System.out.print((char)(i + 'a') + "" + freq[i] + " ");
// }
// }

// i + 'a' converts index back into a character:

// If i=0 → 'a'

// If i=1 → 'b'

// If i=19 → 't'

// Only print if frequency > 0.

import java.util.*;

public class a9_char_freq_string {

  public static void findFrequency(String str) {
    Map<Character, Integer> freqMap = new LinkedHashMap<>();

    for (char c : str.toCharArray()) {
      freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }

    // Print frequencies
    for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
      System.out.print(entry.getKey() + "" + entry.getValue() + " ");
    }
  }

  public static void main(String[] args) {
    String str = "takeuforward";
    findFrequency(str);
  }
}

// Step-by-Step Explanation
// 1. Map<Character, Integer> freqMap = new LinkedHashMap<>();

// We use a map to store characters as keys and their counts as values.

// LinkedHashMap keeps characters in the order they first appear in the string.

// Example: if input is "takeuforward",
// first time we see 't', we store {t=1}.
// When we see 'a', map becomes {t=1, a=1} … and so on.

// 2. Loop through characters
// for (char c : str.toCharArray()) {
// freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
// }

// str.toCharArray() converts string into characters one by one.

// getOrDefault(c, 0) means:

// If c already exists in the map → get its current count.

// If it doesn’t exist → use default value 0.

// Then we add 1 to it and put it back in the map.

// 👉 Example for "takeuforward":

// See t → not in map → 0+1=1 → {t=1}

// See a → not in map → {t=1, a=1}

// See k → {t=1, a=1, k=1}

// See e → {t=1, a=1, k=1, e=1}

// …

// See r second time → already in map with value 1 → now becomes 2.

// Final map:

// {t=1, a=2, k=1, e=1, u=1, f=1, o=1, r=2, w=1, d=1}

// 3. Printing the result
// for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
// System.out.print(entry.getKey() + "" + entry.getValue() + " ");
// }

// entrySet() gives key-value pairs.

// For each entry, entry.getKey() is the character, and entry.getValue() is its
// count.

// Output looks like:

// t1 a2 k1 e1 u1 f1 o1 r2 w1 d1

// ✅ That’s how we calculate character frequency.