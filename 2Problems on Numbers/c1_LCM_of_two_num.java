
// ✅ What is LCM?
// The LCM of two numbers is the smallest positive number that is divisible by both.

// This formula is simple and efficient!

// ✅ Java Code (Using Euclidean Algorithm):

public class c1_LCM_of_two_num {

  // GCD using Euclidean Algorithm
  public static int findGCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  // static int gcd_recursion(int a, int b) {
  // if (b == 0) {
  // return a;
  // }
  // return gcd_recursion(b, a % b);
  // }

  // LCM using GCD
  public static int findLCM(int a, int b) {
    return (a * b) / findGCD(a, b);
  }

  public static void main(String[] args) {
    int num1 = 20, num2 = 15;

    int lcm = findLCM(num1, num2);
    System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
  }
}

// Find LCM of two numbers

// Mark as Completed

// 11

// Problem Statement: Find lcm of two numbers.

// Examples:

// Example 1:
// Input: num1 = 4,num2 = 8
// Output: 8

// Example 2:
// Input: num1 = 3,num2 = 6
// Output: 6