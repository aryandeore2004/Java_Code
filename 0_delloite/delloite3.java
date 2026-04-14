
// 🔍 Problem Understanding (in simple words)

// Rahul copies a word but changes the order of letters, while keeping:

// same letters

// same frequency of each letter

// same length

// That means:

// 👉 If Rahul’s word is an anagram of the adjacent student’s word → copied (1)
// 👉 Otherwise → not copied (0)

// All strings are:

// UPPERCASE

// Length can be very large (up to 10⁶) → efficiency matters

// ✅ Example

// Input

// HELLO
// EHLLO

// Both have:

// H → 1

// E → 1

// L → 2

// O → 1

// ✔ Same letters, same count → Copied → Output: 1

// 🧠 Correct Logic

// Two strings are considered copied if and only if:

// Their lengths are equal

// Frequency of each character (A–Z) is the same

// 🚀 Best Approach (Efficient for large input)

// Use frequency counting (26 letters)
// ⚡ Time: O(n)
// ⚡ Space: O(1)

// 💻 Java Solution (Recommended)
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();

//         if (s1.length() != s2.length()) {
//             System.out.println(0);
//             return;
//         }

//         int[] freq = new int[26];

//         for (int i = 0; i < s1.length(); i++) {
//             freq[s1.charAt(i) - 'A']++;
//             freq[s2.charAt(i) - 'A']--;
//         }

//         for (int count : freq) {
//             if (count != 0) {
//                 System.out.println(0);
//                 return;
//             }
//         }

//         System.out.println(1);
//     }
// }

// 🧪 Why NOT sort()?

// Sorting would be:

// Time: O(n log n)

// Too slow for 10^6 characters

// So frequency array is the best choice 💯

// eith seperate frequency arrray
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();

//         if (s1.length() != s2.length()) {
//             System.out.println(0);
//             return;
//         }

//         int[] freq1 = new int[26];
//         int[] freq2 = new int[26];

//         // Count frequency for first string
//         for (int i = 0; i < s1.length(); i++) {
//             freq1[s1.charAt(i) - 'A']++;
//         }

//         // Count frequency for second string
//         for (int i = 0; i < s2.length(); i++) {
//             freq2[s2.charAt(i) - 'A']++;
//         }

//         // Compare frequency arrays
//         for (int i = 0; i < 26; i++) {
//             if (freq1[i] != freq2[i]) {
//                 System.out.println(0);
//                 return;
//             }
//         }

//         System.out.println(1);
//     }
// }

import java.util.*;

public class delloite3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter for adjusent : ");
    String str1 = sc.nextLine();
    sc.nextLine();
    System.out.println("Enter for Rahul : ");
    String str2 = sc.nextLine();

    char strch1[] = str1.toCharArray();
    char strch2[] = str2.toCharArray();
    Arrays.sort(strch1);
    Arrays.sort(strch2);

    String str3 = new String(strch1);
    String str4 = new String(strch2);

    if (str3.equals(str4)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

  }
}
