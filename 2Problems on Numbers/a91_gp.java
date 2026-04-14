// 👉 GP Formula:

// an = a * r^(n-1)

// a = first term

// r = common ratio

// n = number of terms

import java.util.Scanner;

public class a91_gp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // first term
    int r = sc.nextInt(); // ratio
    int n = sc.nextInt(); // terms

    int term = a;
    for (int i = 0; i < n; i++) {
      System.out.print(term + " ");
      term = term * r;
    }

    // for (int i = 0; i < n; i++) {
    // int term = (int) (a * Math.pow(r, i));
    // System.out.print(term + " ");
    // }
  }
}
