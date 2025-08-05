
// Program to Add two fractions

// Problem Statement: Adding two fractional numbers.

// Examples:

// Example 1:
// Input: 3/4 + 1/7 
// Output: 25/28
// Explanation: Since 3/4 + 1/7 = 25/28

// Example 2:
// Input: 5/2 +1/2
// Output: 3/1
// Explanation: Since 5/2 + 1/2 = 3/1

public class c9_two_fraction_addition {

  // Function to find GCD (used for simplification)
  public static int findGCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  // Function to add two fractions
  public static void addFractions(int num1, int den1, int num2, int den2) {
    // Common denominator
    int commonDen = den1 * den2;

    // New numerator
    int newNum = num1 * den2 + num2 * den1;

    // Simplify the result
    int gcd = findGCD(newNum, commonDen);
    int simpleNum = newNum / gcd;
    int simpleDen = commonDen / gcd;

    System.out.println("Sum = " + simpleNum + "/" + simpleDen);
  }

  public static void main(String[] args) {
    // Example: 1/2 + 1/3
    int num1 = 1, den1 = 2;
    int num2 = 1, den2 = 3;

    addFractions(num1, den1, num2, den2); // Output: 5/6
  }
}
