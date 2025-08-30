import java.util.*;

public class a5_amstrong {

  public static boolean isArmstrong(int n) {
    int original = n;
    int sum = 0;

    int order = String.valueOf(n).length();

    while (n > 0) {
      int digit = n % 10;
      sum += Math.pow(digit, order);
      n = n / 10;
    }

    return original == sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();

    if (isArmstrong(num)) {
      System.out.println(num + " is an Armstrong number.");
    } else {
      System.out.println(num + " is not an Armstrong number.");
    }
  }
}
