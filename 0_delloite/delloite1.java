import java.util.*;

public class delloite1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); // consume newline

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter " + i);
      String phone = sc.nextLine();

      String odd = "";
      String even = "";
      String encripted = "";

      int p = phone.length();
      for (int j = 0; j < p; j++) {
        if ((j + 1) % 2 == 1) {
          odd = odd + phone.charAt(j);
        } else {
          even = even + phone.charAt(j);
        }
        encripted = odd + even;

      }
      System.out.println(encripted);
    }

  }
}

// 🕵️ Problem Understanding (in simple words)

// Alex encrypts a phone number like this:

// Take digits at odd positions first

// Then take digits at even positions

// Combine them in that order to form the encrypted number

// 📌 Important:
// Positions are 1-based (as humans count):

// Position 1 → odd

// Position 2 → even

// Position 3 → odd …

// 🔍 Example

// Original number:

// 9876543210

// Positions (1-based):

// 1 2 3 4 5 6 7 8 9 10
// 9 8 7 6 5 4 3 2 1 0

// Odd positions → 9 7 5 3 1

// Even positions → 8 6 4 2 0

// ✅ Encrypted number:

// 9753186420

// ✅ Java Program (handles N phone numbers)
// import java.util.*;

// public class a0_java {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter number of phone numbers: ");
// int n = sc.nextInt();
// sc.nextLine(); // consume newline

// for (int i = 0; i < n; i++) {
// System.out.print("Enter phone number: ");
// String phone = sc.nextLine();

// StringBuilder odd = new StringBuilder();
// StringBuilder even = new StringBuilder();

// // index is 0-based, but position is (i+1)
// for (int j = 0; j < phone.length(); j++) {
// if ((j + 1) % 2 != 0) { // odd position
// odd.append(phone.charAt(j));
// } else { // even position
// even.append(phone.charAt(j));
// }
// }

// String encrypted = odd.toString() + even.toString();
// System.out.println("Encrypted number: " + encrypted);
// }

// sc.close();
// }
// }