import java.util.*;

public class a6_sum_n_naturalNum {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :");
    int n = sc.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println("Sum of n naturral number till " + n + " is " + sum);
  }
}
