
// Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

// Examples:

// Example 1:
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number.

import java.io.*;

class b9_automorphic_num {
  // Function to check Automorphic number
  static boolean isAutomorphic(int N) {
    // Store the square
    if (N < 0)
      N = -N;
    int sq = N * N;

    // Start Comparing digits
    while (N > 0) {
      // Return false, if any digit of N doesn't
      // match with its square's digits from last
      if (N % 10 != sq % 10)
        return false;

      // Reduce N and square
      N /= 10;
      sq /= 10;
    }

    return true;
  }

  // Driver method
  public static void main(String[] args) {
    int N = 25;

    System.out.println(isAutomorphic(N) ? "Automorphic" : "Not Automorphic");
  }
}