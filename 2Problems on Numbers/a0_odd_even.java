// import java.util.*;

// public class a0_odd_even {
//   public static void main(String[] args) {
//     int n = 5;
//     if (n % 2 == 0) {
//       System.out.println(n + " is even.");
//     } else {
//       System.out.println(n + " is odd.");
//     }
//   }
// }
// Output:

// 5 is odd.

// Time complexity: O(1)

// Space Complexity: O(1)

/****************************************************************************************** */

// Solution2: Using the bitwise operator

// Intuition: As we know that bitwise operations are generally faster than
// normal operations so we should prefer it over normal operations.

// Even Number: The last bit of even number is always 0.

// Odd Number: Last bit of the odd number is always 1.

// If we can get the last bit of any number then we can say that it is even or
// odd.

// Approach:

// Take AND of n with 1.
// If it is 0 then print even otherwise odd.

/****************************************************************************************** */

import java.util.*;

public class a0_odd_even {

  public static void main(String[] args) {

    int n = 6;
    if ((n & 1) == 0) {
      System.out.println(n + " is even.");
    } else {
      System.out.println(n + " is odd.");
    }
  }

}

// Output:

// 5 is odd.

// Time complexity: O(1)

// Space Complexity: O(1)
