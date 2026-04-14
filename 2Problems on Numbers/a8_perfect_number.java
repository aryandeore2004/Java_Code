// A number is a perfect number if it is equal to the sum of its proper divisors, that is, the sum of its positive divisors excluding the number itself. Find whether a given positive integer n is perfect or not.
// Examples: 

// Input: n = 15
// Output: false
// Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.

// Input: n = 6
// Output: true
// Explanation: Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.

import java.util.*;

class a8_perfect_number {

  // Driver code

  static boolean isPerfect(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0)
        sum = sum + i;
    }
    if (sum == n)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {

    boolean ex1 = isPerfect(6);
    boolean ex2 = isPerfect(15);
    boolean ex3 = isPerfect(28);

    if (ex1 == true) {
      System.out.println("6 is a perfect Number");
    } else
      System.out.println("6 is a not aperfect Number");

    if (ex2 == true) {
      System.out.println("15 is a perfect Number");
    } else
      System.out.println("15 is not a perfect Number");

    if (ex3 == true) {
      System.out.println("28 is a perfect Number");
    } else
      System.out.println("28 is not a perfect Number");

  }
}

// Output:

// 6

// is a
// perfect Number

// 15
// is not
// a perfect Number

// 28
// is a
// perfect Number

// Time Complexity:

// O(N)

// Reason: We iterate from 1 to n-1.

// Space Complexity: O(1)

// Reason:

// We are
// not using
// any extra space
