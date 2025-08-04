import java.util.*;

public class a7_pos_neg_num {

  public static void main(String[] args) {

    int n = 5;
    check(n);
    n = -6;
    check(n);
  }

  public static void check(int n) {
    if (n > 0) {
      System.out.println(n + " is positive.");
    } else {
      System.out.println(n + " is negative.");
    }
  }
}
// Output:

// 5 is positive.
// -6 is negative.

// Time complexity: O(1)

// Space Complexity: O(1)