import java.util.*;

public class d1_addition_two_number_without_using_operator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    while (b != 0) {
      int carry = a & b;
      a = a ^ b;
      b = carry << 1;
    }
    System.out.println(a);

  }
}

// << → Left Shift (×2)
// >> → Right Shift (÷2)

// 👉 Use bitwise operators:

// ^ → gives sum without carry
// & → gives carry
// << → shift carry

// 🧠 Given:
// a = 5 → 101
// b = 3 → 011
// 🔁 Iteration 1
// Step 1: Find sum without carry
// a ^ b = 101 ^ 011 = 110 → 6
// Step 2: Find carry
// a & b = 101 & 011 = 001 → 1
// Step 3: Shift carry
// carry << 1 = 001 << 1 = 010 → 2
// 🔄 Update values:
// a = 6 (110)
// b = 2 (010)
// 🔁 Iteration 2
// Step 1: Sum without carry
// a ^ b = 110 ^ 010 = 100 → 4
// Step 2: Carry
// a & b = 110 & 010 = 010 → 2
// Step 3: Shift carry
// 010 << 1 = 100 → 4
// 🔄 Update:
// a = 4 (100)
// b = 4 (100)
// 🔁 Iteration 3
// Step 1: Sum without carry
// a ^ b = 100 ^ 100 = 000 → 0
// Step 2: Carry
// a & b = 100 & 100 = 100 → 4
// Step 3: Shift carry
// 100 << 1 = 1000 → 8
// 🔄 Update:
// a = 0 (000)
// b = 8 (1000)
// 🔁 Iteration 4
// Step 1: Sum without carry
// a ^ b = 000 ^ 1000 = 1000 → 8
// Step 2: Carry
// a & b = 000 & 1000 = 000 → 0
// Step 3:
// carry = 0 → STOP
// 🎯 Final Answer:
// a = 8 ✅
// 🧠 Key Observation

// 👉 Process continues until:

// carry (b) = 0

// 👉 Final value of a = result
