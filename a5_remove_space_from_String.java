// Remove Spaces from a String

// Problem Statement: Given a string, write a program to remove all the whitespaces from the string.

// Examples:

// Example 1:
// Input: str = “Take you forward” 
// Output: Takeyouforward
// Explanation: After removing all the whitespaces Takeyouforward is the result

// Example 2:
// Input: str = “How are you doing”
// Output: Howareyoudoing
// Explanation: After removing all the whitespaces Howareyoudoing is the result

// import java.util.Scanner;

// public class a5_remove_space_from_String {

//   public static String remove_s(String str) {
//     for (int i = 0; i < str.length(); i++) {
//       char ch = str.charAt(i);
//       if (ch == ' ') {
//         str = str.substring(0, i) + str.substring(i + 1, str.length());
//         i--;
//       }
//     }
//     return str;
//   }

//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a string: ");
//     String str = sc.nextLine();

//     String result = remove_s(str);
//     System.out.println("String without Spaces: " + result);
//   }
// }

import java.util.Scanner;

public class a5_remove_space_from_String {

  // Method to remove spaces
  public static String removeSpaces(String str) {
    // Replace all spaces (whitespace) with nothing
    return str.replaceAll("\\s", "");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    String result = removeSpaces(input);

    System.out.println("String without spaces: " + result);
  }
}
