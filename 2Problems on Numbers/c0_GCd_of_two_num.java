// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

// The Greatest Common Divisor of any two integers is the largest number that divides both integers.

// Examples
//                 Example 1:
//                 Input:N1 = 9, N2 = 12

//                 Output:3
//                 Explanation:Factors of 9: 1, 3 and 9
//                 Factors of 12: 1, 2, 3, 4, 6, 12
//                 Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.

//                 Example 2:
//                 Input:N1 = 20, N2 = 15

//                 Output: 5
//                 Explanation:Factors of 20: 1, 2, 4, 5
//                 Factors of 15: 1, 3, 5
//                 Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.

//erative Euclidean Algorithm
public class c0_GCd_of_two_num {

  // using recursion
  static int gcd_recursion(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd_recursion(b, a % b);
  }

  // using normal while loop
  public static int findGCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static void main(String[] args) {
    int n1 = 20, n2 = 15;

    int gcd = findGCD(n1, n2);
    System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
  }
}

// public class c0_GCd_of_two_num {
// // Continue loop as long as both
// // a and b are greater than 0
// public static int findGcd(int a, int b) {
// while(a > 0 && b > 0) {
// // If a is greater than b,
// // subtract b from a and update a
// if(a > b) {
// // Update a to the remainder
// // of a divided by b
// a = a % b;
// }
// // If b is greater than or equal
// // to a, subtract a from b and update b
// else {
// // Update b to the remainder
// // of b divided by a
// b = b % a;
// }
// }
// // Check if a becomes 0,
// // if so, return b as the GCD
// if(a == 0) {
// return b;
// }
// // If a is not 0,
// // return a as the GCD
// return a;
// }

// public static void main(String[] args) {
// int n1 = 20, n2 = 15;

// // Find the GCD of n1 and n2
// int gcd = findGcd(n1, n2);

// System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
// }
// }
