// A 
// A B
// A B C
// A B C D
// A B C D E

// public class alphabetical_tri {
//   public static void main(String[] args) {
//     int n = 5;
//     for (int i = 1; i <= n; i++) {
//       char ch = 'A';
//       for (int j = 1; j <= i; j++) {
//         System.out.print(ch + " ");
//         ch++;
//       }
//       System.out.println();
//     }
//   }
// }

// A 
// B C
// D E F
// G H I J
// K L M N O

public class a5_different_tri {
  public static void main(String[] args) {
    int n = 5;
    char ch = 'A';
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
        ch++;
      }
      System.out.println();
    }
  }
}

// 🔢 Number Triangle Patterns
// 6️⃣ Number Triangle
// public class NumberTriangle {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// ✅ Output:

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// 7️⃣ Floyd’s Triangle
// public class FloydTriangle {
// public static void main(String[] args) {
// int n = 5, num = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(num++ + " ");
// }
// System.out.println();
// }
// }
// }

// ✅ Output:

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// 🔠 Alphabet Triangle Pattern
// 8️⃣ Alphabet Triangle
// public class AlphabetTriangle {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// char ch = 'A';
// for (int j = 1; j <= i; j++) {
// System.out.print(ch + " ");
// ch++;
// }
// System.out.println();
// }
// }
// }

// ✅ Output:

// A
// A B
// A B C
// A B C D
// A B C D E