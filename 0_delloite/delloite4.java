// 🔍 Problem Understanding

// You are given:

// An input string S (ALL UPPERCASE)

// A fixed word: "STRUCTURAL"

// Task:

// 👉 Remove all characters from S that are present in the word "STRUCTURAL"
// 👉 Keep the order of remaining characters same

// 🧠 Key Idea

// Characters present in "STRUCTURAL" are:

// S T R U C T U R A L

// 👉 Unique letters set:

// S, T, R, U, C, A, L

// So, remove any of these letters from the input string.

// ✅ Best Approach (Efficient & Exam-Friendly)

// Store letters of "STRUCTURAL" in a boolean array / set

// Traverse input string

// Append only those characters NOT present in the set

// ⚡ Time: O(n)
// ⚡ Space: O(1) (only 26 letters)

// 💻 Java Solution (Recommended)
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();

//         // Mark characters present in "STRUCTURAL"
//         boolean[] remove = new boolean[26];
//         String word = "STRUCTURAL";

//         for (int i = 0; i < word.length(); i++) {
//             remove[word.charAt(i) - 'A'] = true;
//         }

//         StringBuilder result = new StringBuilder();

//         // Build result string
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (!remove[ch - 'A']) {
//                 result.append(ch);
//             }
//         }

//         System.out.println(result.toString());
//     }
// }

// 🧪 Example
// Input
// PROGRAMMING

// Letters to remove
// S T R U C A L

// Step-by-step

// P ✔

// R ❌

// O ✔

// G ✔

// R ❌

// A ❌

// M ✔

// M ✔

// I ✔

// N ✔

// G ✔

// Output
// POGMMING

// 🚫 Why NOT replace() repeatedly?

// Inefficient

// Messy

// Hard to explain in exams/interviews

// This boolean frequency approach is 💯 correct.

import java.util.*;

public class delloite4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    Set<Character> set = new HashSet<>();

    String given = "STRUCTURAL";

    for (char c : given.toCharArray()) {
      set.add(c);
    }

    StringBuilder ans = new StringBuilder();

    for (char ch : str.toCharArray()) {
      if (!set.contains(ch)) {
        ans.append(ch);
      }
    }

    System.out.println(ans.toString());
  }
}
