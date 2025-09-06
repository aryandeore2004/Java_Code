// Problem: Given a String, find the largest word in the string.

// Examples:

// Example 1:
// Input: string s=”Google Doc”
// Output: “Google”

// Explanation: Google is the largest word in the given string.

// Example 2:
// Input: string s=”Microsoft Teams”
// Output: “Microsoft”
// Explanation: Microsoft is the largest word in the given string

public class b8_largest_word_in_str {

  public static String large_str(String str) {
    String[] words = str.split(" ");

    int max_len = 0;
    String lar_str = "";

    for (String word : words) {
      if (max_len < word.length()) {
        max_len = word.length();
        lar_str = word;
      }
    }
    return lar_str;
  }

  public static void main(String[] args) {
    String str = "aryan is god";
    System.out.println("largeest strig is : " + large_str(str));

  }
}

// Time Complexity: O(n)

// Space Complexity: O(1)