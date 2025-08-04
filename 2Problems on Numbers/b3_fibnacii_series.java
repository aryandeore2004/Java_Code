
public class b3_fibnacii_series {
  public static void main(String args[]) {
    int n = 5;
    if (n == 0) {
      System.out.println(0);
    } else {
      int fib[] = new int[n + 1];
      fib[0] = 0;
      fib[1] = 1;
      for (int i = 2; i <= n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
      }
      System.out.println("The Fibonacci Series up to " + n + "th term:");
      for (int i = 0; i <= n; i++) {
        System.out.print(fib[i] + " ");
      }
    }
  }
}

// import java.util.*;

// public class FibonacciRecursive {

// // Recursive function to return nth Fibonacci number
// static int fib(int n) {
// if (n == 0) return 0;
// if (n == 1) return 1;
// return fib(n - 1) + fib(n - 2);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number of terms: ");
// int n = sc.nextInt();

// System.out.println("Fibonacci Series up to " + n + " terms:");
// for (int i = 0; i < n; i++) {
// System.out.print(fib(i) + " ");
// }
// }
// }
