
// Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

// Note : 

// When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
// Strong number is also known as Krishnamurthi number/Peterson Number.
// Examples
// Examples 1:
// Input: N = 145
// Output: Yes
// Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

// Example 2:
// Input:  26
// Output: No
// Explanation: 2! + 6! = 722. Hence 26 is not a strong number.

public class b8_strong_number {

  public static int fact(int num) {

    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static void strong_num(int num) {
    int original = num;
    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      sum = sum + fact(digit);
      num = num / 10;

    }
    if (original == sum) {
      System.out.println("Hence " + original + " is a strong number");
    } else {
      System.out.println("Hence " + original + " is not a strong number");
    }

  }

  public static void main(String[] args) {
    strong_num(145);

  }
}
