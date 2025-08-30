
import java.util.*;

public class a4_prime_rage {

  public static boolean is_prime(int n) {
    if (n == 1) {
      return false;
    } else {
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          return false;
        }

      }
      return true;

    }
  }

  public static void main(String[] args) {
    int min = 10;
    int max = 40;
    int count = 0;
    for (int i = min; i <= max; i++) {
      if (is_prime(i)) {
        System.out.print(i + " ");
        count++;

      }
    }
    System.out.println();
    System.out.println(count + " is the total number");
  }
}
