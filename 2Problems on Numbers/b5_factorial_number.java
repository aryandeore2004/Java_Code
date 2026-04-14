public class b5_factorial_number {

  public static void main(String[] args) {
    int n = 5;
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println(fact);
  }
}

// public class FactorialRecursive {

// static int fact(int n){
// if(n == 0 || n == 1) {return 1};
// return n * fact(n-1);
// }

// public static void main(String[] args){
// System.out.println(fact(5));
// }
// }

// 📊 Quick Comparison
// Method Time Space Best Use
// Iterative (for loop) O(n) O(1) ⭐ Best
// Recursion O(n) O(n) Conceptual
// While loop O(n) O(1) Simple logic