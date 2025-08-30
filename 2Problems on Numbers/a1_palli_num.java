public class a1_palli_num {

  // Method to check if a number is a palindrome
  public static boolean isPalindrome(int n) {
    int rev = 0;
    int original = n;

    while (n > 0) {
      int digit = n % 10;
      rev = (rev * 10) + digit;
      n = n / 10;
    }

    return original == rev;
  }

  public static void main(String[] args) {
    int n = 45;
    System.out.println(isPalindrome(n)); // Output: false
  }
}
