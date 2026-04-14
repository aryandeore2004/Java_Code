// 👉 Formula: an = a + (n-1)d

// a = first term

// d = common difference

// n = number of terms

import java.util.Scanner;

public class a9_ap {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first term (a): ");
    int a = sc.nextInt();

    System.out.print("Enter common difference (d): ");
    int d = sc.nextInt();

    System.out.print("Enter number of terms (n): ");
    int n = sc.nextInt();

    System.out.println("Arithmetic Progression:");

    int term = a;
    for (int i = 0; i < n; i++) {
      System.out.print(term + " ");
      term = term + d;
    }

    // for(int i = 0; i < n; i++){
    // int term = a + (i * d); // AP formula
    // System.out.print(term + " ");
    // }
  }
}
