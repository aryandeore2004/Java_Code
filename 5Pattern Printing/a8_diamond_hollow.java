//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *

public class diamond_hollow {
  public static void main(String[] args) {
    int n = 5;

    // Upper half
    for (int i = 1; i <= n; i++) {
      // spaces before stars
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      // stars and spaces in between
      for (int j = 1; j <= (2 * i - 1); j++) {
        if (j == 1 || j == (2 * i - 1)) {
          System.out.print("*"); // border stars
        } else {
          System.out.print(" "); // inner space
        }
      }
      System.out.println();
    }

    // Lower half
    for (int i = n - 1; i >= 1; i--) {
      // spaces before stars
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // stars and spaces in between
      for (int j = 1; j <= (2 * i - 1); j++) {
        if (j == 1 || j == (2 * i - 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
