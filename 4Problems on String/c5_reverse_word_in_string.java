
// Problem Statement: Given a string s, reverse the words of the string.

// Examples:

// Example 1:
// Input: s=”this is an amazing program”
// Output: “program amazing an is this”

// Example 2:
// Input: s=”This is decent”
// Output: “decent is This”

import java.util.*;

public class c5_reverse_word_in_string {
    public static String reverseWords(String s) {
        // Split by spaces
        List<String> words = Arrays.asList(s.trim().split("\\s+"));

        // Reverse list
        Collections.reverse(words);

        // Join back into a string
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println("Reversed: " + reverseWords(str));
    }
}

// Time Complexity: O(n)

// Space Complexity: O(n)

// import java.util.*;

// public class ReverseWordsStack {
// public static String reverseWords(String s) {
// String[] words = s.trim().split("\\s+");
// Stack<String> stack = new Stack<>();

// for (String word : words) {
// stack.push(word);
// }

// StringBuilder result = new StringBuilder();
// while (!stack.isEmpty()) {
// result.append(stack.pop());
// if (!stack.isEmpty()) result.append(" ");
// }

// return result.toString();
// }

// public static void main(String[] args) {
// String str = "the sky is blue";
// System.out.println("Reversed: " + reverseWords(str));
// }
// }

// Time Complexity: O(n)

// Space Complexity: O(n)