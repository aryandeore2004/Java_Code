
// Permutations in which N people can occupy R seats

// Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

// Examples:

// Example 1:
// Input: N = 5, r = 3
// Output: 60
// Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

// Example 2:
// Input: N=6,r = 4.
// Output: 360

public class c6_Permutations_N_R {
  static int fact(int n) {
    int ans = 1;
    for (int i = 1; i <= n; i++) {
      ans *= i;
    }
    return ans;
  }

  public static void main(String args[]) {
    int n = 6, r = 4;
    int num = fact(n);
    int den = fact(n - r);
    System.out.print(num / den);
  }
}