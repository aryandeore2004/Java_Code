// Problem Statement:  Write a program to sort characters (numbers and punctuation symbols are not included) in a given string.

// Examples:

// Example 1:
// Input: String str = “zxcbg”
// Output: bcgxz
// Explanation: After sorting we get string as bcgxz

// Example 2:
// Input: String str = “edcba”
// Output: abcde
// Explanation: After sorting we get string as abcde

import java.util.Arrays;

// public class c1_char_sort {
//     public static String sortString(String str) {
//         // Convert string to char array
//         char[] arr = str.toCharArray();

//         // Sort the array
//         Arrays.sort(arr);

//         // Build back into a string
//         return new String(arr);
//     }

//     public static void main(String[] args) {
//         String str1 = "zxcbg";
//         String str2 = "edcba";

//         System.out.println("Input: " + str1);
//         System.out.println("Output: " + sortString(str1));

//         System.out.println("\nInput: " + str2);
//         System.out.println("Output: " + sortString(str2));
//     }
// }

public class c1_char_sort {
  public static String sort(String str) {
    char[] arr = str.toCharArray();
    for (int i = 0; i < str.length() - 1; i++) {
      for (int j = 0; j < str.length() - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          char temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

        }
      }
    }

    String ans = new String(arr);
    return ans;
  }

  public static void main(String[] args) {
    String str = "aryan";
    System.out.println(sort(str));

  }
}
