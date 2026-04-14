// Problem Statement: Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.

// Examples:

// Example 1:
// Input: string=”abcdefghij google microsoft”
// Output: google
// Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words

// Example 2:
// Input: string = “cameron blue”
// Output: -1
// Explanation: No word has more than 1 letter.

public class c7_str_highest_no_char_str {

    // Function to count maximum frequency of any character in a word
    public static int maxCharFrequency(String word) {
        int[] freq = new int[256]; // ASCII frequency
        int max = 1; // default 1 (since every char appears at least once)

        for (char c : word.toCharArray()) {
            freq[c]++;
            if (freq[c] > max) {
                max = freq[c];
            }
        }
        return max;
    }

    public static String findWord(String str) {
        String[] words = str.trim().split("\\s+");

        String result = "-1"; // default value if no word has repeats
        int highest = 1; // track the maximum repetition count

        for (String word : words) {
            int repeat = maxCharFrequency(word);
            if (repeat > highest) {
                highest = repeat;
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str1 = "abcdefghij google microsoft";
        String str2 = "cameron blue";

        System.out.println("Output: " + findWord(str1)); // google
        System.out.println("Output: " + findWord(str2)); // -1
    }
}
