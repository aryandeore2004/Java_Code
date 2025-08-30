import java.util.*;

public class b0_leap_year {
  static boolean yyear(int year) {
    if (year % 400 == 0)
      return true;
    if (year % 100 == 0)
      return false;
    if (year % 4 == 0)
      return true;
    return false;
  }

  static boolean leap_year(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      return true;
    }

    return false;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = sc.nextInt();

    if (yyear(year)) {
      System.out.println(year + " is a leap year (using yyear).");
    } else {
      System.out.println(year + " is not a leap year (using yyear).");
    }

    if (leap_year(year)) {
      System.out.println(year + " is a leap year (using leap_year).");
    } else {
      System.out.println(year + " is not a leap year (using leap_year).");
    }
  }
}
