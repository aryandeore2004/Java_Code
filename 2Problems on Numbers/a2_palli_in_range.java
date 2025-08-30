public class a2_palli_in_range {

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

  public static void isPalindromerange(int min, int max) {
    for (int i = min; i <= max; i++) {
      if (isPalindrome(i)) {
        System.out.println(i + " ");
      }
      ;
    }
  }

  public static void main(String[] args) {
    int min = 11;
    int max = 44;
    isPalindromerange(min, max);
  }
}