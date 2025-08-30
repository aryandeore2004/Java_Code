
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
