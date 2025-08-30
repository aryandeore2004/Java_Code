
// Remove characters from a string except alphabets

// Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.

// Examples:

// Example 1:
// Input: string str = "take12% *&u ^$#forward"
// Output: takeuforward
// Explanation:
// Characters 1,2,%,*,&,^,$,# along with whitespaces are 
// removed but the order of remaining alphabets is preserved.

// Example 2:
// Input: String str = "1.Python & 2.Java"
// Output: PythonJava
// Explanation: 
// Characters 1.&2. along with whitespaces are removed 
// but the order of remaining alphabets is preserved.

// public class a6_remove_special_char_from_String {
//   public static String solve(String str, int n) {
//     StringBuffer ans = new StringBuffer();

//     for (int i = 0; i < n; i++) {
//       int ascii = (int) str.charAt(i); // ascii value

//       if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) // if alphabets
//         ans.append(str.charAt(i));
//     }

//     return ans.toString();
//   }

//   public static void main(String args[]) {
//     String str = "take12% *&u ^$#forward";
//     int n = str.length();

//     System.out.println("Resultant string:");
//     System.out.println(solve(str, n));
//   }
// }

// Time Complexity: O(n)

// Space Complexity: O(n) 

import java.util.Scanner;

public class a6_remove_special_char_from_String {

  // Method to keep only alphabets
  public static String keepOnlyAlphabets(String str) {
    // [^a-zA-Z] = match everything that is NOT an alphabet
    return str.replaceAll("[^a-zA-Z]", "");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    String result = keepOnlyAlphabets(input);
    System.out.println("Output: " + result);
  }
}

// Good catch Aryan 👍 You’re asking about

// [^a-zA-Z]

// This is a regular expression (regex) pattern. Let me explain step by step:

// ✅ Inside Regex:

// [ ] → Character class

// Means: "match any one character from inside the brackets".

// Example:

// [abc] → matches a or b or c.

// a-z → Range of lowercase letters

// Matches any letter from a to z.

// Example: [a-z] → matches a, b, c, … z.

// A-Z → Range of uppercase letters

// Matches any letter from A to Z.

// Example: [A-Z] → matches A, B, C, … Z.

// ^ inside brackets → Negation (NOT)

// When placed at the beginning inside [], it means “anything except these
// characters”.

// Example:

// [^0-9] → matches any character that is not a digit.

// [^a-z] → matches any character that is not a lowercase letter.

// ✅ So, [ ^a-zA-Z ] means:

// Match any character that is NOT an alphabet (neither lowercase a–z nor
// uppercase A–Z).

// In other words:

// Digits 0–9 ❌

// Symbols @, %, *, $, #, ... ❌

// Spaces, tabs, newlines ❌

// Only alphabets survive ✅