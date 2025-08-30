// Check if the number is an abundant number or not

// Problem Statement: Check if the number is an abundant number or not.

// Examples:

// Example 1:
// Input: 18
// Output: Abundant Number
// Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

// Example 2:
// Input: 21
// Output: Not Abundant Number
// Explanation:Divisors of 21 are 1,3,7. 1+3+7=11, Since 11 is smaller than 21, 11 is not an abundant number.
// Definition: If the sum of divisors of a number is greater than the number then it is called abundant number.

public class c2_abundant_number {

  public static void checkAbundant(int num) {
    int sum = 0;

    // Find sum of proper divisors
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }

    // Check if sum is greater than number
    if (sum > num) {
      System.out.println(num + " is an Abundant Number");
    } else {
      System.out.println(num + " is NOT an Abundant Number");
    }
  }

  public static void main(String[] args) {
    checkAbundant(12); // Abundant
    checkAbundant(15); // Not Abundant
  }
}
