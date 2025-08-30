
// Find the ASCII value of a character

// Problem Statement: Given a character, Find the ASCII value of the character.

// Examples:

// Example 1:
// Input: c = ‘A’
// Output: 65
// Explanation: ASCII value of A is 65

// Example 2:
// Input: c = ‘e’
// Output: 101
// Explanation: ASCII value of e is 101

import java.util.*;

class a3_ascii {

    public static void value(char ch) {

        int ascii = ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        value(ch);
    }
}

// import java.util.*;

// public class a3_ascii {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Take character input from user
// System.out.print("Enter a character: ");
// char ch = sc.next().charAt(0); // Read first character of input

// // Find ASCII value by type casting char to int
// int asciiValue = (int) ch;

// // Output result
// System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

// sc.close();
// }
// }

// Output:

// The ASCII value of e is: 101

// Time Complexity: O(1)

// Space Complexity: O(1)