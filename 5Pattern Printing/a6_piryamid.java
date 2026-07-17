// 1. Simple Star Pyramid
//     *
//    ***
//   *****
//  *******
// *********

// public class piryamid {
//   public static void main(String[] args) {
//     int n = 5;
//     for (int i = 1; i <= n; i++) {
//       for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//       }
//       for (int j = 1; j <= (2 * i - 1); j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// *******************************************************************************************
// 🔥 Output (Reverse Pyramid)
// *********
//  *******
//   *****
//    ***
//     *

//   IMPPPPPPP

// 👉 Yes, for this pattern you only need to reverse the i loop
// 👉 No need to change space or star logic

// public class piryamid {
//   public static void main(String[] args) {
//     int n = 5;

//     for (int i = n; i >= 1; i--) {

//       // spaces
//       for (int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//       }

//       // stars
//       for (int j = 1; j <= (2 * i - 1); j++) {
//         System.out.print("*");
//       }

//       System.out.println();
//     }
//   }
// }

//2. Number Pyramid
//     1 
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5

public class a6_piryamid {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();

    }
  }
}

// 3. Right-Aligned Pyramid

// *
// * *
// * * *
// * * * *
// * * * * *

// public class piryamid {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int k = 1; k <= i; k++) {
// System.out.print("* ");
// }
// System.out.println();

// }
// }
// }