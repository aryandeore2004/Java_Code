public class a9_hollow_patterns {

}

// All hollow patterns (triangle, pyramid, square, diamond, etc.) follow the
// same rule:

// 👉 Rule for hollow patterns

// Print "*" when it’s a border position (first/last row, first/last column, or
// diagonal edges).

// Else print " " (space).

// Let me give you the most common hollow patterns in Java 👇

// ******************************************************************************************************
// */

// 1️⃣ Hollow Right-Angled Triangle
// public class HollowRightTriangle {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// if (j == 1 || j == i || i == n) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// ✅ Output:

// *
// * *
// * *
// * *
// * * * * *

// ******************************************************************************************************
// */

// 2️⃣ Hollow Inverted Triangle
// public class HollowInvertedTriangle {
// public static void main(String[] args) {
// int n = 5;
// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// if (j == 1 || j == i || i == n) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// ✅ Output:

// * * * * *
// * *
// * *
// * *
// *

// ******************************************************************************************************
// */

// 3️⃣ Hollow Square
// public class HollowSquare {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// if (i == 1 || i == n || j == 1 || j == n) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// ✅ Output:

// * * * * *
// * *
// * *
// * *
// * * * * *

// ******************************************************************************************************
// */

// 4️⃣ Hollow Pyramid
// public class HollowPyramid {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// // spaces
// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }
// // stars with hollow inside
// for (int j = 1; j <= 2*i-1; j++) {
// if (j == 1 || j == 2*i-1 || i == n) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// ✅ Output:

// *
// * *
// * *
// * *
// *********

// ******************************************************************************************************
// */

// 5️⃣ Hollow Diamond

// (We already did this earlier 👇)

// public class HollowDiamond {
// public static void main(String[] args) {
// int n = 5;

// // upper half
// for (int i = 1; i <= n; i++) {
// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 1; j <= 2*i-1; j++) {
// if (j == 1 || j == 2*i-1) System.out.print("*");
// else System.out.print(" ");
// }
// System.out.println();
// }

// // lower half
// for (int i = n-1; i >= 1; i--) {
// for (int j = 1; j <= n-i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= 2*i-1; j++) {
// if (j == 1 || j == 2*i-1) System.out.print("*");
// else System.out.print(" ");
// }
// System.out.println();
// }
// }
// }

// ✅ Output:

// *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// *