public class b4_power_num {
  public static void main(String[] args) {
    int a = 10;
    int n = 5;
    int pow = 1;
    for (int i = 0; i < n; i++) {
      pow = pow * a;
    }
    System.out.println(pow);
  }
}

// ✅ 1. Using Built-in Method (Math.pow)
// Quick and convenient, but returns a double.

// java
// Copy
// Edit
// public class PowerExample {
// public static void main(String[] args) {
// int a = 10;
// int n = 5;
// double result = Math.pow(a, n);
// System.out.println((int) result); // Cast to int if needed
// }
// }
// Time Complexity: O(1) (internally optimized)

// ⚠️ Returns double, so for large integers or precision-sensitive tasks, use
// with care.

// ✅ 2. Using Recursion
// java
// Copy
// Edit
// public class PowerRecursion {
// public static int power(int a, int n) {
// if (n == 0) return 1;
// return a * power(a, n - 1);
// }

// public static void main(String[] args) {
// int a = 10;
// int n = 5;
// System.out.println(power(a, n)); // Output: 100000
// }
// }
// Time Complexity: O(n)

// Space Complexity: O(n) due to call stack.

// ✅ 3. Exponentiation by Squaring (Recursive – O(log n))
// java
// Copy
// Edit
// public class FastPower {
// public static int power(int a, int n) {
// if (n == 0) return 1;
// int half = power(a, n / 2);
// if (n % 2 == 0) return half * half;
// else return a * half * half;
// }

// public static void main(String[] args) {
// System.out.println(power(10, 5)); // Output: 100000
// }
// }
// Time Complexity: O(log n)

// Space Complexity: O(log n) (recursive stack)

// ✅ 4. Using BigInteger for Very Large Powers
// java
// Copy
// Edit
// import java.math.BigInteger;

// public class BigPower {
// public static void main(String[] args) {
// BigInteger a = new BigInteger("10");
// int n = 100;
// BigInteger result = a.pow(n);
// System.out.println(result);
// }
// }
// Ideal for huge numbers (e.g., 10^100)

// Avoids overflow