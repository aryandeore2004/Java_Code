// Change every letter with next lexicographic alphabet

// Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a)

// Examples:

// Example 1:
// Input: string str = “abcdxyz”

public class b9_change_letter_with_next_lexicographic_alphabate {

  public static String change(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'z') {
        result.append('a');
      } else if (ch == 'Z') {
        result.append('A');
      } else {
        result.append((char) (ch + 1));
      }

    }
    return result.toString();
  }

  public static void main(String[] args) {
    String str = "AryanZ";
    System.out.println(change(str));
  }
}

// Time Complexity: O(n)

// Space Complexity: O(n)