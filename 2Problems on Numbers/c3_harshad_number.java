
// Check if the given number is Harshad(Or Niven) Number

// Problem Statement: Check if the number is a Harshad(or Niven) number or not.

// Examples:

// Example 1:
// Input: 378
// Output: Yes it is a Harshad number.
// Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

// Example 2:
// Input: 379
// Output: No
//  it is not a Harshad number.
// Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is not a harshad number.

public class c3_harshad_number {

  static boolean harshad_num(int num) {
    int sum = 0;
    int original = num;
    while (num > 0) {
      int digit = num % 10;
      sum += digit;
      num /= 10;
    }
    return original % sum == 0;
  }

  public static void main(String[] args) {
    int number = 378;
    if (harshad_num(number)) {
      System.out.println(number + " is a Harshad number.");
    } else {
      System.out.println(number + " is NOT a Harshad number.");
    }
  }
}
