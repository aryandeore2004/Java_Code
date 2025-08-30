// Find the sum of numbers in the given range

// Mark as Completed

// 11

// Problem Statement: Find the sum of numbers in the given range.

// Examples:

// Example 1:
// Input: l=2, r=7
// Output: 27
// Explanation: 2+3+4+5+6+7=27. Therefore 27 is the answer.

// Example 2:
// Input: l=5, r=9
// Output: 35
// Explanation: 5+6+7+8+9=35. Therefore 35 is the answer.
// Solution 1:Naive approach

// Intuition: Simply add numbers from l to r.

public class c4_sum_of_num_in_range {
  public static void main(String args[]) {
    int l = 2, r = 7;
    int sum = 0;
    for (int i = l; i <= r; i++) {
      sum += i;
    }
    System.out.print("The sum of the numbers in the given range is " + sum);
  }
}