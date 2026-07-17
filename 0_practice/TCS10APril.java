public class TCS10APril {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] internal = new int[R][C];
        int[][] external = new int[R][C];

        // Read internal marks
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                internal[i][j] = sc.nextInt();
            }
        }

        // Read external marks
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                external[i][j] = sc.nextInt();
            }
        }

        int i = sc.nextInt();
        int j = sc.nextInt();

        // Validate index
        if (i < 0 || i >= R || j < 0 || j >= C) {
            System.out.println("Invalid Input");
            return;
        }

        int sum = internal[i][j] + external[i][j];

        System.out.println(sum);
    }
}

// 🧾 Problem Statement (TCS Style)

// A professor stores student marks in two separate matrices:

// Internal Marks Matrix
// External Marks Matrix
// 🔹 Input
// Two integers R and C → rows and columns
// Matrix 1 → Internal marks (R × C)
// Matrix 2 → External marks (R × C)
// Two integers i and j → index of student
// 🔹 Task
// Find the sum of internal + external marks at index (i, j)
// If index is invalid → print:
// Invalid Input
// 📥 Example Input
// R = 2, C = 2

// Internal Matrix:
// 12 13
// 12 13

// External Matrix:
// 13 12
// 12 13

// i = 1, j = 1
// 🔍 Explanation

// Internal:

// 12 13
// 12 13

// External:

// 13 12
// 12 13

// 👉 Index (1,1)

// Internal[1][1] = 13
// External[1][1] = 13

// 👉 Sum = 13 + 13 = 26

// 📤 Output
// 26
// ❌ Invalid Case

// If:

// i >= R OR j >= C

// 👉 Output:

// Invalid Input
// 💻 Java Solution (TCS Style)
// import java.util.*;

// public class Main {

// }
// 🧠 Key Points (Important 🔥)
// Two matrices → same size
// Access same index in both
// Add values
// Check bounds carefullyimport java.security.Key;
