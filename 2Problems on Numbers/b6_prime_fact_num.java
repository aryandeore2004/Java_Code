
public class b6_prime_fact_num {
  public static void primeFactors(int num) {
    System.out.print("Prime factors of " + num + " are: ");

    // Divide by 2 until odd
    while (num % 2 == 0) {
      System.out.print(2 + " ");
      num /= 2;
    }

    // Try odd factors from 3 onwards
    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      while (num % i == 0) {
        System.out.print(i + " ");
        num /= i;
      }
    }

    // If remaining num is prime
    if (num > 2) {
      System.out.print(num);
    }
  }

  public static void main(String[] args) {
    int num = 60;
    primeFactors(num);
  }
}
