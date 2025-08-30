// Remove all vowels from the String

// Problem Statement: Given a String, write a program to remove vowels from a given String.

// Examples:

// Example 1:
// Input: Str = “take u forward”
// Output: tk  frwrd
// Explanation: All vowels are removed from the given String.

// Example 2:
// Input: Str = “I am very happy today”
// Output:  m vry happy tdy
// Explanation: All vowels are removed from the given String.
// Solution

// Time Complexity: O(n) since the total number of iterations required is the number of characters in a string

// Space Complexity: O(1)
import java.util.*;

import java.util.Scanner;

public class a4_remove_vowel_from_String {

  public static String remove_v(String str) {
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

        // Remove vowel
        str = str.substring(0, i) + str.substring(i + 1);
        i--; // step back so we don’t skip characters
      }
    }
    return str;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    String result = remove_v(str);
    System.out.println("String without vowels: " + result);
  }
}

// import java.util.Scanner;

// public class RemoveVowels {

// // Method to remove vowels
// public static String removeVowels(String str) {
// // Replace all vowels (a, e, i, o, u) using regex
// return str.replaceAll("[AEIOUaeiou]", "");
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter a string: ");
// String input = sc.nextLine();

// String result = removeVowels(input);

// System.out.println("String without vowels: " + result);
// }
// }

// import java.util.Scanner;

// public class a4_remove_vowel_from_String {

// public static void remove_v(String str) {
// StringBuilder result = new StringBuilder();

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// // If NOT a vowel, add it to result
// if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
// ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
// result.append(ch);
// }
// }

// System.out.println("String without vowels: " + result.toString());
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a string: ");
// String str = sc.nextLine();
// remove_v(str);
// }
// }
