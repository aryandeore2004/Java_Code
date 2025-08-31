import java.util.Scanner;

public class a8_remove_brackets {

  public static String remove(String str) {
    // Remove all types of brackets () [] {}
    return str.replaceAll("[()\\[\\]{}]", "");
  }
  // \\[ → literal [

  // \\] → literal ]

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    String result = remove(str);
    System.out.println("String after removing brackets: " + result);
  }
}
// Got it 👍 You’re asking about this line:

// str.replaceAll("[()\\[\\]{}]", "");

// Let me break it down carefully:

// 1. replaceAll(regex, replacement)

// In Java, replaceAll takes:

// A regex (regular expression) string

// A replacement string

// It finds all matches of the regex in the string and replaces them with the
// replacement string.

// Here, replacement is "" (empty string), meaning we delete the matched
// characters.

// 2. [ ... ] (Character Class in Regex)

// Square brackets [ ] define a set of characters.

// Example:

// [abc] → matches a, b, or c.

// So in our case:
// [()\\[\\]{}] means "match any one of these characters":

// (

// )

// [

// ]

// {

// }

// 3. Escaping []

// Problem: [ and ] are special characters in regex (they define a character
// class).

// To use them literally, we must escape them with a backslash: \\[, \\].

// Double backslash (\\) is required in Java strings because:

// First \ escapes for Java string.

// Second \ escapes for regex.

// So:

// \\[ → literal [

// \\] → literal ]

// 4. Putting It Together
// str.replaceAll("[()\\[\\]{}]", "")

// [...] → character class

// Inside it:

// () matches round brackets

// \\[\\] matches square brackets

// {} matches curly brackets

// So the regex matches any bracket character.
// Then "" removes it (replaces with empty string).

// ✅ Example:
// String input = "(Hello [World] {Java})";
// String result = input.replaceAll("[()\\[\\]{}]", "");
// System.out.println(result);

// Output:

// Hello World Java

// import java.io.*;
// import java.util.*;

// class a8_remove_brackets {

// static String solve(String input) {

// StringBuilder answer = new StringBuilder("");
// for (int i = 0; i < input.length(); i++) {
// if (input.charAt(i) != '(' && input.charAt(i) != ')')
// answer.append(input.charAt(i));
// }
// return answer.toString();
// }

// public static void main(String[] args) {

// String input1 = "a+((b-c)+d)";
// String input2 = "(((a-b))+c)";

// System.out.println("Original String: " + input1);
// System.out.println("After removing brackets: " + solve(input1));
// System.out.println("Original String: " + input2);
// System.out.println("After removing brackets: " + solve(input2));

// }
// }

// Output:

// Original String: a+((b-c)+d)
// After removing brackets: a+b-c+d
// Original String: (((a-b))+c)
// After removing brackets: a-b+c

// Time Complexity: O(N)

// Reason: We iterate from 0 to n-1.

// Space Complexity: O(1)

// Reason: We are not using any extra space.