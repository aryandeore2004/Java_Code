
public class a3_prime {

  public static boolean is_prime(int n) {

    if (n == 1) {
      return false;
    } else {
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          return false;
        }

      }
      return true;
    }
  }

  public static void main(String[] args) {
    int n = 12;
    System.out.println(is_prime(n));
  }
}

// public class a3_prime {

// public static boolean isPrime(int n) {
// if (n <= 1) {
// return false;
// }

// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }

// return true;
// }

// public static void main(String[] args) {
// int n = 12;
// System.out.println(isPrime(n)); // Output: false
// }
// }
